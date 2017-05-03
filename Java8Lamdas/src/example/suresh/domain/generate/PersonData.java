package example.suresh.domain.generate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import example.suresh.domain.Address;
import example.suresh.domain.Income;
import example.suresh.domain.MedicalCondition;
import example.suresh.domain.Person;
import example.suresh.domain.type.AddressType;
import example.suresh.domain.type.GenderType;
import example.suresh.domain.type.IncomeFrequency;
import example.suresh.domain.type.IncomeType;
import example.suresh.domain.type.MedicalConditionType;

public class PersonData {

	public Person getPersonJohnSmith() {

		Person person = new Person();

		person.setPersId(1000001);
		person.setFirstName("John");
		person.setLastName("Smith");
		person.setMiddleName("N");
		person.setGender(GenderType.MALE);
		person.setDateOfBirth(LocalDate.of(1982, 1, 12));

		int age = calculateAge(person.getDateOfBirth(), LocalDate.now());
		person.setAge(age);

		Address pAddress = new Address(9000001, "2401 S Apple st", "83706", "Boise", "Idaho", "Ada",
				AddressType.PHYSICAL);
		Address mAddress = new Address(9000002, "2401 S Apple st", "83706", "Boise", "Idaho", "Ada",
				AddressType.MAILING);

		person.getAddress().add(pAddress);
		person.getAddress().add(mAddress);

		Income wages = new Income(IncomeType.WAGES_AND_SALARIES, person.getPersId(), BigDecimal.valueOf(41000.25),
				"Walmart", IncomeFrequency.MONTHLY);
		wages.setIncomeId(100004);

		Income interests = new Income(IncomeType.INTEREST_RECEIVED, person.getPersId(), BigDecimal.valueOf(900.25),
				"WellsFargo", IncomeFrequency.MONTHLY);
		interests.setIncomeId(100005);

		Income rentalExpenses = new Income(IncomeType.RENTAL_INCOME_AND_EXPENSES, person.getPersId(),
				BigDecimal.valueOf(15000.25), "Boise Town Mall ", IncomeFrequency.MONTHLY);

		rentalExpenses.setIncomeId(100006);

		Income dividends = new Income(IncomeType.DIVIDENDS, person.getPersId(), BigDecimal.valueOf(1000.25),
				"Bank of Cascade", IncomeFrequency.YEARLY);
		dividends.setIncomeId(100007);

		person.setIncome(Arrays.asList(wages, interests, rentalExpenses, dividends));

		MedicalCondition neuroCondition = new MedicalCondition(MedicalConditionType.NEUROLOGICAL_DISORDERS,
				LocalDate.of(2014, 01, 21), LocalDate.of(9999, 12, 31), person.getPersId());
		MedicalCondition digestiveCondition = new MedicalCondition(MedicalConditionType.DIGESTIVE_SYSTEM,
				LocalDate.of(2011, 01, 21), LocalDate.of(9999, 12, 31), person.getPersId());

		person.setMedicalCondition(Arrays.asList(neuroCondition, digestiveCondition));

		return person;

	}

	public Person getPersonTimMcain() {

		Person person = new Person();

		person.setPersId(1000002);
		person.setFirstName("Tim");
		person.setLastName("Mcain");
		person.setMiddleName("D");
		person.setGender(GenderType.MALE);
		person.setDateOfBirth(LocalDate.of(1942, 11, 24));

		int age = calculateAge(person.getDateOfBirth(), LocalDate.now());
		person.setAge(age);

		Address pAddress = new Address(9000003, "3432 S Gekeler ln", "83706", "Boise", "Idaho", "Ada",
				AddressType.PHYSICAL);
		Address mAddress = new Address(9000004, "3432 S Gekeler ln", "83706", "Boise", "Idaho", "Ada",
				AddressType.MAILING);

		person.getAddress().add(pAddress);
		person.getAddress().add(mAddress);

		Income interests = new Income(IncomeType.INTEREST_RECEIVED, person.getPersId(), BigDecimal.valueOf(900.25),
				"WellsFargo", IncomeFrequency.MONTHLY);

		Income rentalExpenses = new Income(IncomeType.PENSIONS_AND_ANNUITIES, person.getPersId(),
				BigDecimal.valueOf(15000.25), "Idaho Pensions Dept", IncomeFrequency.MONTHLY);
		rentalExpenses.setIncomeId(100011);

		Income scholarships = new Income(IncomeType.SCHOLARSHIPS, person.getPersId(), BigDecimal.valueOf(1000.25),
				"Boise State", IncomeFrequency.YEARLY);
		scholarships.setIncomeId(100012);

		person.setIncome(Arrays.asList(interests, rentalExpenses, scholarships));

		MedicalCondition disabled = new MedicalCondition(MedicalConditionType.DISABLED, LocalDate.of(2004, 01, 21),
				LocalDate.of(9999, 12, 31), person.getPersId());
		MedicalCondition digestiveCondition = new MedicalCondition(MedicalConditionType.CARDIOVASCULAR_SYSTEM,
				LocalDate.of(2011, 01, 21), LocalDate.of(9999, 12, 31), person.getPersId());

		person.setMedicalCondition(Arrays.asList(disabled, digestiveCondition));

		return person;

	}

	public Person getPersonMathina() {

		Person person = new Person();

		person.setPersId(1000003);
		person.setFirstName("Mathina");
		person.setLastName("Calvin");
		person.setMiddleName("B");
		person.setGender(GenderType.FEMALE);
		person.setDateOfBirth(LocalDate.of(1955, 8, 24));

		int age = calculateAge(person.getDateOfBirth(), LocalDate.now());
		person.setAge(age);

		Address pAddress = new Address(9000010, "95645 S Fairview", "83702", "Boise", "Idaho", "Ada",
				AddressType.PHYSICAL);
		Address mAddress = new Address(9000011, "95645 S Fairview", "83702", "Boise", "Idaho", "Ada",
				AddressType.MAILING);

		person.getAddress().add(pAddress);
		person.getAddress().add(mAddress);

		Income wages = new Income(IncomeType.FARMING_AND_FISHING_INCOME, person.getPersId(),
				BigDecimal.valueOf(41000.25), "Boise Lakes and Rivers", IncomeFrequency.HALF_YEARLY);

		wages.setIncomeId(100021);

		Income interests = new Income(IncomeType.INTEREST_RECEIVED, person.getPersId(), BigDecimal.valueOf(900.25),
				"WellsFargo", IncomeFrequency.MONTHLY);
		interests.setIncomeId(100022);

		Income rentalExpenses = new Income(IncomeType.RENTAL_INCOME_AND_EXPENSES, person.getPersId(),
				BigDecimal.valueOf(15000.25), "Boise Golf properties ", IncomeFrequency.MONTHLY);

		rentalExpenses.setIncomeId(100023);

		Income dividends = new Income(IncomeType.DIVIDENDS, person.getPersId(), BigDecimal.valueOf(1000.25),
				"Idaho State Insurance Fund", IncomeFrequency.YEARLY);

		dividends.setIncomeId(100024);

		person.setIncome(Arrays.asList(wages, interests, rentalExpenses, dividends));

		MedicalCondition neuroCondition = new MedicalCondition(MedicalConditionType.MUSCULOSKELETAL_SYSTEM,
				LocalDate.of(2000, 01, 21), LocalDate.of(9999, 12, 31), person.getPersId());
		MedicalCondition digestiveCondition = new MedicalCondition(MedicalConditionType.DIGESTIVE_SYSTEM,
				LocalDate.of(2011, 01, 21), LocalDate.of(9999, 12, 31), person.getPersId());

		person.setMedicalCondition(Arrays.asList(neuroCondition, digestiveCondition));

		return person;

	}

	private int calculateAge(LocalDate dateOfBirth, LocalDate now) {

		return Period.between(dateOfBirth, now).getYears();

	}

}
