/**
 * 
 */
package com.reflection;

import java.util.Arrays;

/**
 * @author Suresh Sadanala
 *
 */
public class AllTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.reflection.model.Person");
		System.out.println("-----constructors-------");
		System.out.println(Arrays.toString(c.getConstructors()));
		System.out.println("----------------------");

		System.out.println("-----declared fields-------");
		System.out.println(Arrays.toString(c.getDeclaredFields()));
		System.out.println("----------------------");

		System.out.println("-----declared methods-------");
		System.out.println(Arrays.toString(c.getDeclaredMethods()));
		System.out.println("----------------------");

		System.out.println("-----methods-------");
		System.out.println(Arrays.toString(c.getMethods()));
		System.out.println("----------------------");
	}

}
