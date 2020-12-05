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

	public Person(String name, Boolean gender) {
		super();
		this.name = name;
		this.gender = gender;
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
