package testing;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Name();
		Gender();
		Status();
		Birthday();
		Age();
		Citizenship();
		HA();
		HP();
		Cgpa();
		Grade();
		Total();
		Work();
		Language();
		Certificate();
		
		scan.close();
	
	}
	public static void Name() {

		
			Scanner scan = new Scanner(System.in);
				
			System.out.print("Enter your name \n" );
			String name = scan.next();
			System.out.println();
			System.out.println("Name: " + name +"\n");	
			
			
				
		}
	
	public static void Gender() {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter your gender \n");
		String gender = scan.next();
		System.out.println("Gender: " + gender+"\n");	
	}
	
	public static void Status() {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter your status \n");
		String status = scan.next();
		System.out.println("Marital status: " + status +"\n");	
	}
	
	public static void Birthday() {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter your birthday \n");
		String birthday = scan.next();
		System.out.println("Birthday: " + birthday +"\n");	
	}
	
	public static void Age() {
				
			Scanner scan = new Scanner(System.in);
				
			System.out.print("Enter your age \n");
			int age = scan.nextInt();
			System.out.println("Age: " + age +"\n");
				
		}
	
	public static void Citizenship() {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter your citizenship \n");
		String citizenship = scan.next();
		System.out.println("Citizenship: " + citizenship +"\n");
	}
	
	public static void HA() {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter your home address \n");
		String ha = scan.nextLine();
		System.out.println("Home Address: " + ha +"\n");	
	}
	
	public static void HP() {
				
			Scanner scan = new Scanner(System.in);
				
			System.out.print("Enter your phone number \n");
			String hp = scan.next();
			System.out.println("Phone number: " + hp +"\n");
			
		}
	
	public static void Cgpa( ) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your cgpa \n");
		double cgpa = scan.nextDouble();
		System.out.println("CGPA: " + cgpa +"\n");
		
	}	
	
	public static void Grade() {
				
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter your grade \n");
			char grade = scan.next().charAt(0);
			System.out.println("Grade: " + grade +"\n");		
			
		}
			
	public static void Total() {
				
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter your GPA semester 1 :");
			double no1 = scan.nextDouble();
			System.out.println("Enter your GPA semester 2 :");
			double no2 = scan.nextDouble();
			
			double sum = no1 + no2;
			double total =  sum/2;
			System.out.println("CGPA for current semester is " + total +"\n");		
			}
	
	public static void Work() {

		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter your work experiences \n");
		String work = scan.next();
		System.out.println("Work experiences: " + work +"\n");	
			
	}	
	
	public static void Language() {

		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter the language that you know \n");
		String language = scan.next();
		System.out.println("Language: " + language +"\n");	
			
	}	
	
	public static void Certificate() {

		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter the certificates that you have \n");
		String certificate = scan.next();
		System.out.println("Certificates: " + certificate +"\n");	
			
	}	
	

	}


