package emailapp;
import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int malboxCapacity=500;
    private String alternateEmail;
    private String email;
    private String customSuffix="companyABC.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department=setDepartment();

        this.password=randoPassword(8);
        System.out.println("Your password is : "+this.password);
        email=firstName.toLowerCase()+lastName.toLowerCase()+randoPassword(2)+"@"+customSuffix;

        alternateEmail=firstName.charAt(0)+"."+lastName.charAt(0)+"@"+customSuffix;
    }
    private String setDepartment(){
        System.out.println("Press the number in respect to the employee's departement:" +
                "\n1-IT\n2-Accounts\n3-Finance\n4-Sales\n5-Development\n0-quit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter department code: ");
        int dep=sc.nextInt();
        if(dep==1){return "IT";}
        else if(dep==2){return "Accounts";}
        else if(dep==3){return "Finance";}
        else if(dep==4){return "Sales";}
        else if(dep==1){return "Development";}
        else{return "";}

    }

    //Random password generation
    private String randoPassword(int length){
        String passwordSetCases="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] passwd=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random() * passwordSetCases.length());
            passwd[i]=passwordSetCases.charAt(rand);
        }
        return new String(passwd);
    }
    public void setMainboxCapacity(int capacity){
        this.malboxCapacity=capacity;
    }

    public void setAleternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    public void changePassword(String password){
        this.password=password;
    }

    public int getMalboxCapacity(){return malboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DisplayName: "+firstName+" "+lastName+
                "\nCompany Email: "+ email+
                "\nMailbox Capacity: "+malboxCapacity+"mb";
    }

}
