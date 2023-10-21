import java.util.Scanner;

public class Computing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("******* GRADE CALCULATOR *******");
        System.out.println("--------------------------------");
        System.out.println("[**INTRODUCTION TO  COMPUTING**]");

        double q1;
        double q2;
        double q3;
        double a1;
        double a2;
        double a3;
        double e1;

        //written works
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("******** Written  Works ********");
        System.out.println("--------------------------------");
        System.out.print("Quiz#1 (20)= ");
        q1 = scanner.nextInt();
        System.out.print("Quiz#2 (20)= ");
        q2 = scanner.nextInt();
        System.out.print("Quiz#3 (20)= ");
        q3 = scanner.nextInt();

        double quizTotal = q1 + q2 + q3;
        double maximumTotal = 60;

        double percentTotal = (quizTotal / maximumTotal)*0.2;

        //activities
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("********** Activities **********");
        System.out.println("--------------------------------");
        System.out.print("Activity#1 (30)= ");
        a1 = scanner.nextInt();
        System.out.print("Activity#2 (30)= ");
        a2 = scanner.nextInt();
        System.out.print("Activity#3 (30)= ");
        a3 = scanner.nextInt();

        double quizTotal1 = a1 + a2 + a3;
        double maximumTotal1 = 90;

        double percentTotal1 = (quizTotal1 / maximumTotal1)*0.4;

        //exam
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("************* Exam *************");
        System.out.println("--------------------------------");
        System.out.print("Exam (80)= ");
        e1 = scanner.nextInt();

        double examTotal = e1;
        double maximumTotal2 = 80;

        double percentTotal2 = (examTotal / maximumTotal2) *0.4;



        System.out.println();
        System.out.println("--------------------------------");
        double gradeTotal = (percentTotal + percentTotal1+ percentTotal2) *100;
        System.out.println("Total Grade: " + gradeTotal + "%");
        System.out.println("--------------------------------");

        if (gradeTotal>=96){
            System.out.println("Final Grade: " + 4.0);
            System.out.println("--------------------------------");
        }
        else if (gradeTotal>=90){
            System.out.println("Final Grade: " + 3.5);
            System.out.println("--------------------------------");
        }
        else if (gradeTotal>=84){
            System.out.println("Final Grade: " + 3.0);
            System.out.println("--------------------------------");
        }
        else if (gradeTotal>=78){
            System.out.println("Final Grade: " + 2.5);
            System.out.println("--------------------------------");
        }
        else if (gradeTotal>=72){
            System.out.println("Final Grade: " + 2.0);
            System.out.println("--------------------------------");
        }
        else if (gradeTotal>=66){
            System.out.println("Final Grade: " + 1.5);
            System.out.println("--------------------------------");
        }
        else if (gradeTotal>=60){
            System.out.println("Final Grade: " + 1.0);
            System.out.println("--------------------------------");
        }
        else {
            System.out.println("Final Grade: R");
            System.out.println("--------------------------------");
    }
}
}