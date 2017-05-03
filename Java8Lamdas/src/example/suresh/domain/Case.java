package example.suresh.domain;

import java.util.List;

public class Case {

	private String caseNumber;
	private long caseId;
	private List<Program> programs;
	private List<Person> casePersons;
	private String caseName;


	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public long getCaseId() {
		return caseId;
	}

	public Case(String caseNumber, long caseId) {
		super();
		this.caseNumber = caseNumber;
		this.caseId = caseId;
	}

	public void setCaseId(long caseId) {
		this.caseId = caseId;
	}

	public List<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public List<Person> getCasePersons() {
		return casePersons;
	}

	public void setCasePersons(List<Person> casePersons) {
		this.casePersons = casePersons;
	}

}
