package homework;

public class AssignmentNumber2 {

	public static void main(String[] args) {

		int minAge = 18;
		boolean isQualified = true;

		if (minAge >= 18 && isQualified == false) { // i have added to condition with && logic

			System.out.println("You are eligible to vote");

		} else {
			System.out.println("You are not eligible to vote");// in order to use else statement i have put false boolean variable

		}
	}
}
