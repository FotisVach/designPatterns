package fotis.designPatterns.decorator;

/**
 * Concrete Decorator implementation.
 */
@SuppressWarnings("javadoc")
class WannaBeSecureWebPage extends WebPageDecorator {

	String creds;

	/**
	 * Creates a new WannaBeSecureWebPage object.
	 *
	 * @param webPageToBeDecorated
	 */
	WannaBeSecureWebPage(WebPage webPageToBeDecorated) {
		super(webPageToBeDecorated);
	}

	private void authenticateUser() {
		if (creds != null && !creds.isEmpty()) {
			return;
		}
		throw new RuntimeException("User is not authorized to access this page"); //$NON-NLS-1$
	}
	
	

	@Override
	public String getUrl() {
		authenticateUser();
		return super.getUrl();
	}

	/**
	 * Assigns a new value to the creds.
	 *
	 * @param creds
	 *            the creds to set
	 */
	void setCreds(String creds) {
		this.creds = creds;
	}

}
