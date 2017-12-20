package fwj.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class User {
	@NotBlank
	@Length(min = 5)
	private String name;

	@Range(max = 30, min = 3)
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
}