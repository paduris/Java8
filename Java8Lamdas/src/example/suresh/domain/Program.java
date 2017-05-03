package example.suresh.domain;

import java.util.List;

import example.suresh.domain.type.ProgramType;

public class Program {

	private long caseId;
	private long pgmId;
	private ProgramType type;
	private List<Person> persons;

	public Program(long caseId, long pgmId, ProgramType type) {
		super();
		this.caseId = caseId;
		this.pgmId = pgmId;
		this.type = type;

	}

	public long getCaseId() {
		return caseId;
	}

	public void setCaseId(long caseId) {
		this.caseId = caseId;
	}

	public long getPgmId() {
		return pgmId;
	}

	public void setPgmId(long pgmId) {
		this.pgmId = pgmId;
	}

	public ProgramType getType() {
		return type;
	}

	public void setType(ProgramType type) {
		this.type = type;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
