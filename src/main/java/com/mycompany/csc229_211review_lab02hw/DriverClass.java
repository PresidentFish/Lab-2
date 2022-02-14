package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;
public class DriverClass {
	
	public static void main(String[] args) {
            
            int x = 0;
            int y = 0;
            Scanner myObj = new Scanner(System.in);
            
		Student std1= new Student("Kevin", 20);
                System.out.println("What is the students GPA?");
                     x = myObj.nextInt();
                std1.setGpa(x);{
                    
        }
                std1.getGpa();{
        }
          System.out.println("The GPA of the student is" + std1.gpa);      
		
		
		
		//System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}