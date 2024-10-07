package StudentDatabaseapp;
import java.util.Scanner;
public class StudentDbapp {
    public static void main(String[] args) {
        //Ask how many new student needed to be added



        System.out.println("Enter the number of new Students to enrol: ");
        Scanner sc=new Scanner(System.in);

        int numOfSTu=Integer.valueOf(sc.nextLine());
        Student[] students=new Student[numOfSTu];

        for(int i=0;i<numOfSTu;i++){
            students[i]=new Student();
            students[i].Enroll();
            students[i].payFees();
            System.out.println(students[i].toString());
        }
    }
}
