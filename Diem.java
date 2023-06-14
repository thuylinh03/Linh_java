import java.util.Scanner;

class Diem{
    private int x, y;
    public Diem(){}
    public Diem(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void set(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void printdiem(){
        System.out.print("("+x+","+y+")");
    }
}
class tugiac{
    private Diem d1, d2;
    private Diem d3, d4;
    public tugiac(Diem p1, Diem p2, Diem p3, Diem p4){
        d1=p1;d2=p2;d3=p3;d4=p4;
    }
    public tugiac(){
        d1 = new Diem();
        d2 = new Diem(0,1);
        d3 = new Diem(1,1);
        d4 = new Diem(1,0);
    }
    public void printtugiac(){
        d1.printdiem();
        d2.printdiem();
        d3.printdiem();
        d4.printdiem();
        System.out.println();
    }

// public class diem{
    public static void main(String[] args){
        Diem d1 = new Diem(2,3);
        Diem d2 = new Diem(4,1);
        Diem d3 = new Diem(5,1);
        Diem d4 = new Diem(8,4);

        tugiac tg1 = new tugiac(d1,d2,d3,d4);
        tugiac tg2 = new tugiac();
        tg1.printtugiac();
        tg2.printtugiac();
    }
 }