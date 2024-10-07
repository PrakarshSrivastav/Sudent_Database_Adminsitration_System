package StudentDatabaseapp;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String courses;
    private int tuitionBal;
    private static int cotOfCourse=1000;
    private static int id=1000;
    private String StudentId;
    //Constructor:prompt to enter name and year
    public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        this.firstName=sc.nextLine();

        System.out.println("Enter the Last Name: ");
        this.lastName=sc.nextLine();

        System.out.println("1-Grade 10\n2-Grade 11\n3-Grade 12\nEnter number(1,2,3) according to the grade that the student will get enrolled: ");
        this.year=sc.nextInt();
        setStuId();




    }
    //Generate a student ID
    private void setStuId(){
        //Grade level+static
        id++;
        this.StudentId=year+""+id;
    }
    //Course Name
    public void Enroll(){
        do {
            System.out.println("Enter Course Name(Enter 0 to quit):");
            Scanner sc1 = new Scanner(System.in);
            String course = sc1.nextLine();
            if (!course.equals("0")) {
                courses = courses + "\n " + course;
                tuitionBal = tuitionBal + cotOfCourse;
            }
            else{break;}
        }while(1!=0);

    }
    //balance and tution
    public void balance(){
        System.out.println("Balance is: $"+tuitionBal);
    }
    public void payFees(){
        balance();
        System.out.print("Enter amount of money you want to tranfer: $");
        Scanner sc2=new Scanner(System.in);
        int payment=sc2.nextInt();
        tuitionBal=tuitionBal-payment;
        System.out.println("Thank You for paying: $"+payment);
        balance();
    }
    //Show Student Status
    public String toString(){
      return "Name: "+firstName+" "+lastName+
              "\nGrade Level: "+year+
              "\nStudent Id: "+StudentId+
      "\nCourses: "+courses+
      "\nBalance: $"+tuitionBal;
    }

}
