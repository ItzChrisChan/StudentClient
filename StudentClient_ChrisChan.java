/****************************************************************
 *  File: StudentClient_ChrisChan
 *  By: Christopher Chan
 *  Date: 10/16/2023
 *  Description: a. prompts users to enter student information.
 *               b. Displays the information of the students created in the last step.
 *               c. Offers to update student information and execute the update.
 *               d. Displays the information of the students again, showing the successful update.
 *               e. Your program must use at least 5 meaningful methods. Discuss why they are meaningful
 *                  in your analysis.
 *               f. Your program’s output must be identical to the output in the sample runs.
 *****************************************************************/
//package asmt05;

import java.util.Scanner;

public class StudentClient_ChrisChan {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    Scanner scan = new Scanner(System.in);
    String name = " ";
    double gpa = 0;
    public StudentClient_ChrisChan(){
        getUserInput();
        display();
        update();
        System.out.println(" ");
        System.out.println("These are the three students updated:");
        display();
    }

    public static void main(String[] args) {
        new StudentClient_ChrisChan();
    }

    public void getUserInput(){



        System.out.print("Enter in a name for student #1: ");
        name  = scan.next();
        System.out.print("Enter a GPA for student #1: ");
        gpa = scan.nextDouble();
        s1 = new Student(name, gpa);
        System.out.println(" ");

        System.out.print("Enter in a name for student #2: ");
        name  = scan.next();
        System.out.print("Enter a GPA for student #2: ");
        gpa = scan.nextDouble();
        s2 = new Student(name, gpa);
        System.out.println(" ");

        System.out.print("Enter in a name for student #3: ");
        name  = scan.next();
        System.out.print("Enter a GPA for student #3: ");
        gpa = scan.nextDouble();
        s3 = new Student(name, gpa);
        System.out.println(" ");

    }

    public void display(){
        System.out.println("The three students created:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public void update(){
        String oldName = " ";
        String newName = " ";
        double newGpa = 0;

        System.out.println(" ");
        System.out.print("Enter a students full name to update the student: ");
        oldName = scan.next();
        System.out.print("Enter new student name: ");
        newName = scan.next();
        System.out.print("Enter new student gpa: ");
        newGpa = scan.nextDouble();

        if(oldName.equals(s1.getName())){
            s1.setName(newName);
            s1.setGpa(newGpa);
        }
        else if (oldName.equals(s2.getName())) {
            s2.setName(newName);
            s2.setGpa(newGpa);
        }
        else if (oldName.equals(s3.getName())) {
            s3.setName(newName);
            s3.setGpa(newGpa);
        }
        else {
            System.out.print("There is no student with that name.");
        }
    }
}