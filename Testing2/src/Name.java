import java.util.*;
public class Name {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	printName();
	printGender();
	printBDAY();
	printAge();
	printMarital();
	printCitizen();
	printWork();
	printLanguage();
	printGrade();
	printGpa();
	printSkills();
	printAward();
	
	input.close();
	}
	public static void printName() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name=input.nextLine();
		System.out.println("Name: " + name);
		
	}
	public static void printGender() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your gender: ");
		char gender=input.next().charAt(0);
		System.out.println("Gender: " + gender);
	}
	
	public static void printBDAY() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your birthday: ");
		String birthday=input.nextLine();
		System.out.println("Birthday: " + birthday);
	}
		
	public static void printAge() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your age:");
		int age=input.nextInt();
		System.out.println("Age: " + age);
		
	}
	public static void printMarital() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your marital:");
		String marital=input.next();
		System.out.println("Marital: " + marital);
	}
	public static void printCitizen() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your citizen:");
		String citizen=input.next();
		System.out.println("Citizen: " + citizen);
	}
	public static void printWork() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your work experience:");
		String work=input.next();
		System.out.println("Work experience: " + work);
	}
	public static void printLanguage() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your language 1:");
		String language1=input.next();
		System.out.print("Enter your language 2:");
		String language2=input.next();
		System.out.print("Enter your language 3:");
		String language3=input.next();
		String language=language1 + "\n\t  " + language2 + "\n\t  " + language3;
		System.out.println("Language: " + language);
	}
	public static void printGrade() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Grade STIA1113: ");
		String str=input.next();
		char grade=str.charAt(1);
		System.out.println("Grade: " + grade);
	}
	public static void printGpa() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter GPA Semester 1: ");
		double num1=input.nextDouble();
		System.out.print("Enter GPA Semester 2: ");
		double num2=input.nextDouble();
		
		double sum = num1+num2;
		double totalgpa = sum/2;
		System.out.println("CGPA for current semester is " + totalgpa);
	}
	public static void printSkills() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your skills:");
		String skills=input.next();
		System.out.println("Skills: " + skills);
	}
	public static void printAward() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your awards:");
		String award=input.next();
		System.out.println("Award: " + award);
	}

}
