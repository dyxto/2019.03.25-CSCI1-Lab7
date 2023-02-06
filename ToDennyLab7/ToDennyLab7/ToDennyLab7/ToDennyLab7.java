 //Denny To
 //CSCI 1301
 //Lab 7
package ToDennyLab7;
import java.util.Scanner;
public class ToDennyLab7 {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		
		System.out.print("Enter your course: ");
		String course = scnr.nextLine();
		
		System.out.println();
		
		//Method One for student greeting
		studentGreeting(name, course);
		
		System.out.println();
		
		System.out.print("Enter the number of assignments: ");
		int numAssignments = scnr.nextInt();
		
		//executing and printing result of Method Two
		System.out.print("\n" + "Total points obtained: " + assignmentTotal(numAssignments));
		
		scnr.close();
	}
	
	private static void studentGreeting(String name, String course) {
		
		System.out.println("Welcome, " + name + "!!!");
		System.out.println("I'm sure you will like this course " + course + "!");
		
	}
	
	private static double assignmentTotal(int numAssignments) {

		double assignmentScores = 0;
		Scanner sc = new Scanner(System.in);
		
		//for loop that asks user for each score and then adds scores
		for (int i = 1; i <= numAssignments; i++) {
			System.out.print("Enter Assignment " + i + " score: ");
			double singleScore = sc.nextDouble();
			assignmentScores += singleScore;
		}
		
		//returns total of all scores added together
		sc.close();
		return assignmentScores;
		
	}
	
}
