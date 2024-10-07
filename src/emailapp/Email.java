package emailapp;
import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String malboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: "+this.firstName+" "+this.lastName);
        this.department=setDepartment();
        System.out.println("Department: "+this.department);
    }
    public String setDepartment(){
        System.out.println("Press the number in respect to the employee's departement:" +
                "\n1-IT\n2-Accounts\n3-Finance\n4-Sales\n5-Development\n0-quit");
        Scanner sc=new Scanner(System.in);
        int dep=sc.nextInt();
        if(dep==1){return "IT";}
        else if(dep==2){return "Accounts";}
        else if(dep==3){return "Finance";}
        else if(dep==4){return "Sales";}
        else if(dep==1){return "Development";}
        else{return "";}
    }


}
