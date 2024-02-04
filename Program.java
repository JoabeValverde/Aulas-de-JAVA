package apllication;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        System.out.print("Name Student: ");
        students.name = sc.nextLine();
        System.out.println("Enter your three notes: ");
        students.note1 = sc.nextDouble();
        students.note2 = sc.nextDouble();
        students.note3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE: %.2f\n", students.finalGrade());

        System.out.println(students.condition());

        System.out.printf("MISSING %.2f POINTS", students.missingPoints());


        sc.close();
    }
}
