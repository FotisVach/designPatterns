package fotis.designPatterns.composite;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Client Test code for Composite Pattern.
 */
@SuppressWarnings({ "javadoc", "nls" })
class TestComposite {

	@Test
	void test() {
		File root1 = createTree1();
		String ls = root1.ls();
		assertTrue(ls.contains("dir2"));
		assertTrue(ls.contains("file2\t2000"));
		assertTrue(ls.contains("file3\t150"));
		assertTrue(ls.contains("dir1"));
		assertTrue(ls.contains("File1\t1000"));
		
		File root2 = createTree2();
		ls = root2.ls();
		assertTrue(ls.contains("Leaf file\t200"));
	}

	/**
	 * Builds and returns a composite.
	 * 
	 * @return Composite
	 */
	static File createTree1() {
		File file1 = new BinaryFile("File1", 1000);
		Directory dir1 = new Directory("dir1");
		dir1.addFile(file1);
		
		File file2 = new BinaryFile("file2", 2000);
		File file3 = new BinaryFile("file3", 150);
		Directory dir2 = new Directory("dir2");
		dir2.addFile(file2);
		dir2.addFile(file3);
		dir2.addFile(dir1);
		return dir2;
	}

	/**
	 * Builds and returns a leaf.
	 * 
	 * @return a leaf
	 */
	static File createTree2() {
		return new BinaryFile("Leaf file", 200);
	}

}
