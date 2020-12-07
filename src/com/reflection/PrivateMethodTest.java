/**
 * 
 */
package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.reflection.model.Person;

/**
 * @author Suresh Sadanala to invoke private methods from another class using
 *         reflection
 */
public class PrivateMethodTest {

	public static void main(String[] args) {

		try {
			Class<?> cls = Class.forName("com.reflection.model.Person");
			Method mthd = cls.getDeclaredMethod("greet", String.class);
			mthd.setAccessible(Boolean.TRUE);
			String greet = (String) mthd.invoke(new Person(), "SS");
			System.out.println(greet);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
