package example.suresh.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import example.suresh.domain.type.GenderType;

public class Person {

	@Override
	public String toString() {
		return "Person [persId=" + persId + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", gender=" + gender + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", medicalCondition=" + medicalCondition + ", income=" + income + "]";
	}

	private long persId;
	private String firstName;
	private String lastName;
	private String middleName;
	private GenderType gender;
	private Integer age;
	private LocalDate dateOfBirth;
	private List<Address> address;
	private List<MedicalCondition> medicalCondition;
	private List<Income> income;
	private List<Program> programs;
	private List<Case> cases;

	public List<Program> getPrograms() {
		return programs == null ? new ArrayList<Program>() : programs;
	}

	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}

	public List<Case> getCases() {

		return cases == null ? new ArrayList<Case>() : cases;

	}

	public void setCases(List<Case> cases) {
		this.cases = cases;
	}

	public List<Address> getAddress() {

		return address == null ? new ArrayList<Address>() : address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<MedicalCondition> getMedicalCondition() {

		return medicalCondition == null ? new ArrayList<MedicalCondition>() : medicalCondition;
	}

	public void setMedicalCondition(List<MedicalCondition> medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public long getPersId() {
		return persId;
	}

	public void setPersId(long persId) {
		this.persId = persId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Income> getIncome() {
		return income == null ? new ArrayList<Income>() : income;

	}

	public void setIncome(List<Income> income) {
		this.income = income;
	}

}
