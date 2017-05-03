package example.suresh.domain;

import java.math.BigDecimal;

import example.suresh.domain.type.IncomeFrequency;
import example.suresh.domain.type.IncomeType;

public class Income {

	private long incomeId;
	private IncomeType type;
	private long persId;
	private BigDecimal annualIncome;
	private String source;
	private IncomeFrequency frequency;

	public Income(IncomeType type, long persId, BigDecimal annualIncome, String source, IncomeFrequency frequency) {
		super();
		this.type = type;
		this.persId = persId;
		this.annualIncome = annualIncome;
		this.source = source;
		this.frequency = frequency;
	}

	public long getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(long incomeId) {
		this.incomeId = incomeId;
	}

	public IncomeType getType() {
		return type;
	}

	public void setType(IncomeType type) {
		this.type = type;
	}

	public long getPersId() {
		return persId;
	}

	public void setPersId(long persId) {
		this.persId = persId;
	}

	public BigDecimal getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(BigDecimal annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public IncomeFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(IncomeFrequency frequency) {
		this.frequency = frequency;
	}

}
