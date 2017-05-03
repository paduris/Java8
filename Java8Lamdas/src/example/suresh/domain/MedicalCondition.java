package example.suresh.domain;

import java.time.LocalDate;

import example.suresh.domain.type.MedicalConditionType;

public class MedicalCondition {


	public MedicalCondition(MedicalConditionType type, LocalDate startDate, LocalDate endDate, long persId) {
		super();
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
		this.persId = persId;
	}

	private MedicalConditionType type;
	private LocalDate startDate;
	private LocalDate endDate;
	private long persId;

	public MedicalConditionType getType() {
		return type;
	}

	public void setType(MedicalConditionType type) {
		this.type = type;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public long getPersId() {
		return persId;
	}

	public void setPersId(long persId) {
		this.persId = persId;
	}

}
