package fotis.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite in the Composite Pattern.
 */
@SuppressWarnings("javadoc")
class Directory extends File {

	private List<File> children = new ArrayList<>();

	/**
	 * Creates a new Directory object.
	 *
	 * @param name
	 */
	public Directory(String name) {
		super(name);
	}

	@SuppressWarnings("nls")
	@Override
	String ls() {
		StringBuilder builder = new StringBuilder();
		builder.append(getName() + "\n");
		children.forEach(f -> builder.append(f.ls() + "\n"));
		return builder.toString();
	}

	@Override
	void addFile(File file) {
		children.add(file);
	}

	@Override
	File[] getFiles() {
		return children.toArray(new File[children.size()]);
	}

	@Override
	boolean removeFile(File file) {
		return children.remove(file);
	}

}
