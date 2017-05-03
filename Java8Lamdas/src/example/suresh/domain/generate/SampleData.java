package example.suresh.domain.generate;

import java.util.Arrays;
import java.util.List;

import example.suresh.domain.Case;
import example.suresh.domain.Program;
import example.suresh.domain.type.ProgramType;

public class SampleData {

	public List<Case> getSampleCases() {

		PersonData personData = new PersonData();

		Case caseObj1 = getCase1(personData);

		Case caseObj2 = getCase2(personData, caseObj1);

		Case caseObj3 = getCase3(personData, caseObj1);

		return Arrays.asList(caseObj1, caseObj2, caseObj3);

	}

	private Case getCase1(PersonData personData) {
		Case caseObj1 = new Case("0024574", Long.valueOf(400L));
		Program program1 = new Program(caseObj1.getCaseId(), Long.valueOf(501L), ProgramType.MEDICAID);
		personData.getPersonJohnSmith().getPrograms().add(program1);
		personData.getPersonJohnSmith().getCases().add(caseObj1);
		program1.setPersons(Arrays.asList(personData.getPersonJohnSmith()));
		caseObj1.setPrograms(Arrays.asList(program1));
		caseObj1.setCasePersons(Arrays.asList(personData.getPersonJohnSmith()));
		return caseObj1;
	}

	private Case getCase2(PersonData personData, Case caseObj1) {
		Case caseObj2 = new Case("0020004", Long.valueOf(401L));
		Program program2 = new Program(caseObj1.getCaseId(), Long.valueOf(501L), ProgramType.FOOD_STAMPS);

		personData.getPersonJohnSmith().getPrograms().add(program2);
		personData.getPersonJohnSmith().getCases().add(caseObj2);

		personData.getPersonMathina().getPrograms().add(program2);
		personData.getPersonMathina().getCases().add(caseObj2);

		program2.setPersons(Arrays.asList(personData.getPersonJohnSmith(), personData.getPersonMathina()));
		caseObj2.setPrograms(Arrays.asList(program2));
		caseObj2.setCasePersons(Arrays.asList(personData.getPersonJohnSmith(), personData.getPersonMathina()));
		return caseObj2;
	}

	private Case getCase3(PersonData personData, Case caseObj1) {
		Case caseObj3 = new Case("0054004", Long.valueOf(402L));
		Program program3 = new Program(caseObj1.getCaseId(), Long.valueOf(502L), ProgramType.AABD_CASH);

		personData.getPersonJohnSmith().getPrograms().add(program3);
		personData.getPersonJohnSmith().getCases().add(caseObj3);

		personData.getPersonMathina().getPrograms().add(program3);
		personData.getPersonMathina().getCases().add(caseObj3);

		personData.getPersonTimMcain().getPrograms().add(program3);
		personData.getPersonTimMcain().getCases().add(caseObj3);

		program3.setPersons(Arrays.asList(personData.getPersonJohnSmith(), personData.getPersonMathina(),
				personData.getPersonTimMcain()));
		caseObj3.setPrograms(Arrays.asList(program3));
		caseObj3.setCasePersons(Arrays.asList(personData.getPersonJohnSmith(), personData.getPersonMathina(),
				personData.getPersonTimMcain()));
		return caseObj3;
	}

}
