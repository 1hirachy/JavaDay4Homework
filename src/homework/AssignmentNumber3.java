package homework;

public class AssignmentNumber3 {
		public static void main(String []args) {
			
			double salary = 100000;
			boolean bonus = true;
			
			if (salary >= 100000 && bonus == true) { // added if condition to check if salary is greater than 100000 & bonus value is true
				System.out.println("That is great, you have a good salary and bonus");
				
			}else {
				System.out.println("Put more effort in SDET training"); // when the condition does  not met hence else statement will appear
				
						
			}
		}
}
