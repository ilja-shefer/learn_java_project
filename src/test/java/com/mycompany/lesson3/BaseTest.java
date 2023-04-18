package com.mycompany.lesson3;

public class BaseTest {

	public BaseTest() {
		super();
	}

	/**
	 * this is a helper method providing the caller method with its fully qualified
	 * name (using format "packageName.className.methodName")
	 * @return a fully qualified name of the calling method
	 */
	public String getFullMethodName() {
	    String unqualifiedMethodName = new Exception().getStackTrace()[1].getMethodName();
	    String className = this.getClass().getName();
	    return className + "." + unqualifiedMethodName;
	}

}