package Martyrs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Martyrs implements Comparable<Martyrs> {

	private String name;
	private int age;
	private Date dateOfDeath;
	private char gender;
	private String personalStatus;

	public Martyrs() {
		super();

	}

	public Martyrs(String name) {
		super();
		this.name = name;
	}

	public Martyrs(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Martyrs(String name, int age, Date dateOfDeath, char gender, String personalStatus) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfDeath = dateOfDeath;
		this.gender = gender;
		this.personalStatus = personalStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPersonalStatus() {
		return personalStatus;
	}

	public void setPersonalStatus(String personalStatus) {
		this.personalStatus = personalStatus;
	}

	@Override
	public String toString() {
		DateFormat format = new SimpleDateFormat("M/d/yyyy");
		return "Martyrs [name=" + name + ", age=" + age + ", dateOfDeath=" + format.format(dateOfDeath) + ", gender="
				+ gender + ", personalStatus=" + personalStatus + "]";
	}

	@Override
	public int compareTo(Martyrs o) {  
		return this.getDateOfDeath().compareTo(o.getDateOfDeath());
	}

	@Override
	public boolean equals(Object obj) {//by age and name
		return this.getName().equalsIgnoreCase(((Martyrs) obj).getName()) && this.getAge() == ((Martyrs) obj).getAge();
	}

}
