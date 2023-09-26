package results;
import java.util.Scanner;
public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String unitCode;
		int total=0;
		String Grade;
		
	int[] score=new int[4];
	int i;
		System.out.print("Enter Unit Code:");
		unitCode=input.next();
		System.out.println("Enter score");
		for(i=0;i<4;i++) {
			score[i]=input.nextInt();
			total=total+score[i];
		}
		double avg=total/4;
		if(avg>=70 && avg<100) {
			Grade="A";
			
			}
		if(avg>=60 && avg<70) {
			Grade="B";
			
			}
		if(avg>=50 && avg<60) {
			Grade="c";
			
			}
		if(avg>=40 && avg<50) {
			Grade="D";
			
			}
		if(avg>=0 && avg<40) {
			Grade="F";
		
			}
			

	
	
		String name="Sharon Naliaka";
		String rollNumber="C026-01-0946/2022";
		int Semester=2;
		System.out.println("\t\t\tDepartment Of Computer Science");
		System.out.println("\t\t\tEnd Semester Results");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("|Name:-"+name);
		System.out.print("\t\t|Roll_No:"+rollNumber);
		System.out.println("\t|Semester:"+Semester);
		System.out.println("______________________________________________________________________________");
		System.out.print("Unit code:");
		System.out.print("\t\t\tUnit Name:");
		System.out.println("\t\t\tScore");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("|"+unitCode);
		System.out.print("\t\t\t|Database\t");
		System.out.println("\t\t"+score[0]);
		System.out.print("|"+unitCode);
		System.out.print("\t\t\t|Systems\t");
		System.out.println("\t\t"+score[1]);
		System.out.print("|"+unitCode);
		System.out.print("\t\t\t|Algorithms\t");
		System.out.println("\t\t"+score[2]);
		System.out.print("|"+unitCode);
		System.out.print("\t\t\t|Statistics\t");
		System.out.println("\t\t"+score[3]);
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("|Total");
		System.out.println("\t\t\t\t\t\t\t\t|"+total);
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("|Average");
		System.out.println("\t\t\t\t\t\t\t|"+avg);
		System.out.print("|Grade");
		System.out.println("\t\t\t\t\t\t\t\t|"+total);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\tReccomendation |");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("Grading criteria");
		System.out.print("\t\t\tOverall Grade(A-D)");
		System.out.println("\tRecommend Pass");
		System.out.println("70-100\tA");
		System.out.println("60-70\tB");
		System.out.println("50-60\tC");
		System.out.println("40-50\tD");
		System.out.println("Below 40F");
		System.out.println("----------------------------------------------------------------------------");
	
		
		
		
		
		
		
		
		
		
		
				

	}

}
