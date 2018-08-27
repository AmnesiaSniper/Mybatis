package ssm.java.bean;

import java.util.Date;

public class Student {

	private int stu_id;
	private String stu_name;
	private String stu_sex;
	private int stu_age;
	
//	@DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
//	@JSONField(format="yyyy-MM-dd")//数据库导出页面时json格式化
	
	
	
	private Date stu_birthday;

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_sex() {
		return stu_sex;
	}

	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}

	public int getStu_age() {
		return stu_age;
	}

	public void setStu_age(int stu_age) {
		this.stu_age = stu_age;
	}

	public Date getStu_birthday() {
		return stu_birthday;
	}

	public void setStu_birthday(Date stu_birthday) {
		this.stu_birthday = stu_birthday;
	}

	public Student(int stu_id, String stu_name, String stu_sex, int stu_age, Date stu_birthday) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_age = stu_age;
		this.stu_birthday = stu_birthday;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_sex=" + stu_sex + ", stu_age=" + stu_age
				+ ", stu_birthday=" + stu_birthday + "]";
	}

}
