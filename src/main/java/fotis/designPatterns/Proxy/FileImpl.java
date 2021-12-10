package fotis.designPatterns.Proxy;

/**
 * Concrete Implementation of {@link File}
 */
@SuppressWarnings({ "javadoc", "nls" })
class FileImpl implements File {

	private String name;

	private Float size;

	private String content;

	/**
	 * Creates a new FileImpl object.
	 *
	 * @param name
	 * @param size
	 */
	FileImpl(String name, Float size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		System.out.println("getName");
		return name;
	}

	@Override
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	@Override
	public Float getSize() {
		System.out.println("getSize");
		return size;
	}

	@Override
	public void setSize(Float size) {
		System.out.println("setSize");
		this.size = size;
	}

	@Override
	public String read() {
		System.out.println("read");
		return content;
	}

	@Override
	public void write(String input) {
		System.out.println("write");
		this.content = input;
	}

}
