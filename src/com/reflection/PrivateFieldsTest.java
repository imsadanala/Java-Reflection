/**
 * 
 */
package com.reflection;

import java.lang.reflect.Field;

import com.reflection.model.Person;

/**
 * @author Suresh Sadanala To invoke private fields from another class using
 *         reflection
 */
public class PrivateFieldsTest {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("com.reflection.model.Person");
			Field fld = cls.getDeclaredField("salary");
			fld.setAccessible(Boolean.TRUE);
			Integer sal= (Integer)fld.get(new Person());
			System.out.println(sal);
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}