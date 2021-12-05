package fotis.designPatterns.composite;

/**
 * Leaf node in Composite Pattern.
 */
@SuppressWarnings({"javadoc", "nls"})
class BinaryFile extends File {

	private long size;

	/**
	 * Creates a new BinaryFile object.
	 *
	 * @param name
	 * @param size
	 */
	public BinaryFile(String name, long size) {
		super(name);
		this.size = size;
	}

	@Override
	String ls() {
		return getName() + "\t" + size; //$NON-NLS-1$
	}

	@Override
	void addFile(File file) {
		throw new UnsupportedOperationException("The leaf node does not support add operation");
	}

	@Override
	File[] getFiles() {
		throw new UnsupportedOperationException("The leaf node does not support add operation");
	}

	@Override
	boolean removeFile(File file) {
		throw new UnsupportedOperationException("The leaf node does not support add operation");
	}

}
