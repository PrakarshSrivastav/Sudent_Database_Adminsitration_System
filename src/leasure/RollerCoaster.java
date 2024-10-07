package leasure;
import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public class RollerCoaster implements Comparable<RollerCoaster>{
    private final String name;
    private final String world;
    private int height;
    private int time;

    public RollerCoaster(String name,String world,int time){
        this.name=name;
        this.world=world;
        this.time=time;
        height=120;
    }
    public RollerCoaster(String line){
        String[] token=line.split(";");
        name=token[0];
        world=token[1];
        height=Integer.parseInt(token[2]);
        time=Integer.parseInt(token[3]);
    }

    public String getName() {
        return name;
    }

    public String getWorld() {
        return world;
    }

    public int getHeight() {
        return height;
    }

    public int getTime() {
        return time;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public String toString(){
        return name+" ("+world+"): "+time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RollerCoaster that = (RollerCoaster) o;
        return Objects.equals(name, that.name) && Objects.equals(world, that.world);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, world);
    }
    public int compareTo(RollerCoaster o){
        if(this.time != o.time){
            return Integer.compare(this.time,o.time);
        }
        if(this.height != o.height){
            return -Integer.compare(this.height,o.height);
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        RollerCoaster[] coaster=new RollerCoaster[20];
        int length=0;

        while(sc.hasNextLine()){
            String line=sc.nextLine();
            if(Objects.equals(line,"")){
                break;
            }
            coaster[length]=new RollerCoaster(line);
            length++;
        }
        Arrays.sort(coaster,0,length);
        for(int i=0;i<length;i++){
            System.out.println(coaster[i]);
        }
    }
}