import java.util.Scanner;
public class Test{
    private String name;
    private String city;
    private int runways;
    private int time;

    public Test(String name, String city, int runways, int time) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.time = time;
    }

    @Override
    public String toString(){
        return name+" ("+city+"): "+time;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] tokens=line.split(";");
            Test nefe=new Test(tokens[0],tokens[1],Integer.parseInt(tokens[2]),Integer.valueOf(tokens[3]));
            System.out.println(nefe);
        }
    }

}