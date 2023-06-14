import java.util.Scanner;
package BuildClass;
public class Point {
    private double hd;
    private double td;
    private double cd;

    public Point(){
        hd = 0;
        td = 0;
        cd = 0;
    }

    public Point(double dh, double td, double cd){
        this.hd = hd;
        this.td = td;
        this.cd = cd;
    }

    public double getHD(){
        return hd;
    }

    public void setHD(double hd){
        this.hd = hd;
    }

    public double getTD(){
        return td;
    }

    public void setTD(double td){
        this.td = td;
    }

    public double getCD(){
        return cd;
    }

    public void setCD(double cd){
        this.cd = cd;
    }

    public static void main(String[] args) {
        Point a = new Point();
        Scanner sc = new Scanner(System.in);

    a.setHD(sc.nextDouble());
    a.setTD(sc.nextDouble());
    a.setCD(sc.nextDouble());

    System.out.println("Hoanh do: " + a.getHD());
    System.out.println("Tung do: " + a.getTD());
    System.out.println("Cao do: " + a.getCD());
        
    }
}