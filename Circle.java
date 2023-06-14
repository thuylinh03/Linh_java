// public class Circle{
//     private double radius = 1.0;
//     private final double pi = 3.14;
//     double bk;
//     double cv;
//     double dt;
//     String ms;
//     public double getC(){
//         return this.radius*this.pi;
//     }

//     public void setRad(double _r){
//         this.radius = _r;
//     }

//     public void setCircumference(){
//         cv = radius*2*pi;
//     }

//     public void setArea(){
//         dt = pi*radius*radius;
//     }

//     public double getArea(){
//         return dt;
//     }
    
//     public double getCircumference(){
//         return cv;
//     }

//     Circle(double r, double c, double a, String cl){
//         this.bk = r;
//         this.cv = c;
//         this.dt = a;
//         this.ms = cl;
//     }

//     public String toString(){
//         return bk + " " + cv + " " + dt + " " + ms;  
//     }

    

//     public static void main(String[] args){
//         Circle c = new Circle(1,2,4,"do");
//         c.setCircumference(); 
//         c.setArea();
//         c.getC();
//         c.getCircumference();
//         c.getArea(); 
//         System.out.println(c);
//     }
// }

abstract class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x; 
        this.y = y;
    }
    public void move(int dx, int dy) {
        x += dx; 
        y += dy;
        plot();
    }
    public abstract void plot();
    // phương thức trừu tượng không có
    // phần code thực hiện
    }

abstract class ColoredPoint extends Point {
    int color;
    public ColoredPoint(int x, int y, int color) {
        super(x, y);    
        this.color = color;
    }
}
class SimpleColoredPoint extends ColoredPoint {
    public SimpleColoredPoint(int x, int y, int color) {
        super(x, y, color);
    }
    public void plot() { 

    }
    // code to plot a SimplePoint
}