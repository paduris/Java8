package example.suresh.java8.collections;

import java.util.List;
import java.util.Optional;

import example.suresh.domain.Case;
import example.suresh.domain.generate.SampleData;

public class Java8Collections {

	// get List of cases

	public static void main(String[] a) {

		Java8Collections examples = new Java8Collections();

		/**
		 * Print case numbers
		 */
		examples.printCaseNumbers();

		/**
		 * Get all person in the case and print names
		 */

		examples.getCaseByCaseNumber("0020004");

	}

	/**
	 * Get case by case number
	 * 
	 * @param caseNumber
	 */
	private void getCaseByCaseNumber(String caseNumber) {

		SampleData sampleData = new SampleData();

		System.out.println("Using Lamdas");

		// using optional
		// filter and predicate
		Optional<Case> caseObj = sampleData.getSampleCases().stream().filter(p -> p.getCaseNumber().equals(caseNumber))
				.findFirst();

		System.out.println(caseObj.get().getCaseNumber());

		Case caseObj1 = sampleData.getSampleCases().stream().filter(p -> p.getCaseNumber().equals(caseNumber))
				.findFirst().get();

		System.out.println(caseObj1.getCaseNumber());

		// or else - return a bare bone case
		Case bareBoneCaseObj = sampleData.getSampleCases().stream().filter(p -> p.getCaseNumber().equals(caseNumber))
				.findFirst().orElse(new Case("0001221", 405));

		System.out.println(bareBoneCaseObj.getCaseNumber());

	}

	/**
	 * Print Case Numbers
	 */
	private void printCaseNumbers() {

		SampleData sampleData = new SampleData();

		System.out.println("Using Lamdas");

		sampleData.getSampleCases().stream().forEach(obj -> System.out.println(obj.getCaseNumber()));

		System.out.println("Old way");

		List<Case> cases = sampleData.getSampleCases();

		for (Case case1 : cases) {
			System.out.println(case1.getCaseNumber());
		}

	}

}
