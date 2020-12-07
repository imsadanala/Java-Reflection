/**
 * 
 */
package com.reflection.model;

/**
 * @author Suresh Sadanala
 *
 */
public class Person {
	
	private String name;
	private Boolean gender;
	private Integer salary = 6000;

	public Person() {
	}

	public Person(String name, Boolean gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	private String greet(String name) {
		return "Hello " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

}
