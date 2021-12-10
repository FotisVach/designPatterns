package fotis.designPatterns.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Our Proxy code goes here, this proxy is created at runtime.
 */
@SuppressWarnings({ "javadoc", "nls" })
class FileInvocationHandler implements InvocationHandler {

	String name;
	Float size;
	FileImpl file;
	static Method setNameMethod;
	static Method getNameMethod;
	static Method setSizeMethod;
	static Method getSizeMethod;
	static Method readMethod;
	static Method writeMethod;

	static {
		try {
			getNameMethod = File.class.getMethod("getName", new Class[] {});
			setNameMethod = File.class.getMethod("setName", new Class[] { String.class });
			getSizeMethod = File.class.getMethod("getSize", new Class[] {});
			setSizeMethod = File.class.getMethod("setSize", new Class[] { Float.class });
			readMethod = File.class.getMethod("read", new Class[] {});
			writeMethod = File.class.getMethod("write", new Class[] { String.class });
		} catch (NoSuchMethodException e) {
			throw new NoSuchMethodError(e.getMessage());
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// Implementation of Proxy logic
		if (method.equals(getNameMethod)) {
			return handleGetName();
		} else if (method.equals(setNameMethod)) {
			return handleSetName(args);
		} else if (method.equals(getSizeMethod)) {
			return handleGetSize();
		} else if (method.equals(setSizeMethod)) {
			return handleSetSize(args);
		} else if (method.equals(readMethod)) {
			return handleRead();
		} else if (method.equals(writeMethod)) {
			return handleWrite(args);
		}
		return null;
	}

	private Object handleGetName() {
		if (file != null) {
			return file.getName();
		}
		return name;
	}

	private String handleSetName(Object[] args) {
		if (file != null) {
			file.setName((String) args[0]);
		} else {
			this.name = (String) args[0];
		}
		return null;
	}

	private Object handleGetSize() {
		if (file != null) {
			return file.getSize();
		}
		return size;
	}

	private Float handleSetSize(Object[] args) {
		if (file != null) {
			file.setSize((Float) args[0]);
		} else {
			this.size = (Float) args[0];
		}
		return null;
	}

	private String handleRead() {
		if (file == null) {
			file = new FileImpl(name, size);
		}
		return file.read();
	}

	private Object handleWrite(Object[] args) {
		if (file == null) {
			file = new FileImpl(name, size);
		}
		file.write((String) args[0]);
		return null;
	}

}
