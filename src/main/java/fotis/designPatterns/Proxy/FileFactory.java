package fotis.designPatterns.Proxy;

import java.lang.reflect.Proxy;

/**
 * Factory to create Files.
 */
class FileFactory {

	/**
	 * Where the magic happens.
	 * 
	 * @return a File
	 */
	static File getFile() {
		return (File) Proxy.newProxyInstance(FileFactory.class.getClassLoader(), new Class[] { File.class },
				new FileInvocationHandler());
	}

}
