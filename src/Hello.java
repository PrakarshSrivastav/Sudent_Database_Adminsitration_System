import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Test> list=new ArrayList<>();

        while(scan.hasNextLine()){
            String line=scan.nextLine();
            if(line.isEmpty()){
                break;
            }
            String[] tokens = line.split(";");
            Test rollercoaster = new Test(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
            list.add(rollercoaster);
        }
    }
}
