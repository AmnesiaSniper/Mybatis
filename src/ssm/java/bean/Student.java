package ssm.java.bean;

import java.util.Date;

public class Student {

	private int id;
	private String name;
	private String sex;
	private int age;
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", date=" + date + "]";
	}

	public Student(int id, String name, String sex, int age, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.date = date;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
