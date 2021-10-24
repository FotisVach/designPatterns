package fotis.designPatterns.builder;

/**
 * Builder Pattern
 */
class Product {
	/** A required property */
	private String aRequired;
	/** Random property */
	private String b;
	/** Another random property */
	private String c;

	/**
	 * Gets the aRequired.
	 *
	 * @return Returns the aRequired
	 */
	String getaRequired() {
		return aRequired;
	}

	/**
	 * Assigns a new value to the aRequired.
	 *
	 * @param aRequired
	 *            the aRequired to set
	 */
	void setaRequired(String aRequired) {
		this.aRequired = aRequired;
	}

	/**
	 * Gets the b.
	 *
	 * @return Returns the b
	 */
	String getB() {
		return b;
	}

	/**
	 * Assigns a new value to the b.
	 *
	 * @param b
	 *            the b to set
	 */
	void setB(String b) {
		this.b = b;
	}

	/**
	 * Gets the c.
	 *
	 * @return Returns the c
	 */
	String getC() {
		return c;
	}

	/**
	 * Assigns a new value to the c.
	 *
	 * @param c
	 *            the c to set
	 */
	void setC(String c) {
		this.c = c;
	}

	/** Private constructor */
	private Product() {
		// Empty
	}

	/** Builder Pattern magic */
	static class Builder {
		/** The required property */
		private String aRequired;
		/** The random property */
		private String b;
		/** The other random property */
		private String c;
		/** Build instance */
		private Product product;

		/**
		 * Creates a new Product.Builder object.
		 * 
		 * @param theRequired
		 */
		Builder(String theRequired) {
			if (theRequired == null) {
				throw new IllegalArgumentException("theRequired Property can not be null"); //$NON-NLS-1$
			}
			this.aRequired = theRequired;
		}

		/**
		 * Returns the Product instance
		 * 
		 * @return Product
		 */
		Product build() {
			product = new Product();
			product.setaRequired(aRequired);
			product.setB(b);
			product.setC(c);
			return product;
		}

		/**
		 * Assigns a new value to the aRequired.
		 *
		 * @param theRequired
		 *            the aRequired to set
		 * @return Builder
		 */
		Builder aRequired(String theRequired) {
			this.aRequired = theRequired;
			return this;
		}

		/**
		 * Assigns a new value to the b.
		 *
		 * @param theB
		 *            the b to set
		 * @return Builder
		 */
		Builder b(String theB) {
			this.b = theB;
			return this;
		}

		/**
		 * Assigns a new value to the c.
		 *
		 * @param theC
		 *            the c to set
		 * @return Builder
		 */
		Builder c(String theC) {
			this.c = theC;
			return this;
		}

		/**
		 * Gets the product.
		 *
		 * @return Returns the product
		 */
		Product getProduct() {
			return product;
		}

	}

}
