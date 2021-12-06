package fotis.designPatterns.decorator;

/**
 * Concrete component, Object to be decorated.
 */
@SuppressWarnings("javadoc")
class BasicWebPage implements WebPage {

	String url;

	/**
	 * Creates a new BasicWebPage object.
	 *
	 * @param url
	 */
	BasicWebPage(String url) {
		this.url = url;
	}

	@Override
	public String getUrl() {
		return url;
	}

}
