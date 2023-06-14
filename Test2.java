abstract class Shape1{
    public abstract double Area();
    public abstract double Perimeter();
    protected String color;
    protected boolean filled;

    public Shape1(){

    }

    public Shape1(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "Dien tich cua hinh la: " + Area();
    }

    public String toString1(){
        return "Chu vi cua hinh la: " + Perimeter();
    }
}

class Circle1 extends Shape1{
    public double radius;

    public Circle1(){

    }

    public Circle1(double radius){
        this.radius = radius;
    }

    public Circle1(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    

    @Override
    public double Area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Area'");
    }

    @Override
    public double Perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Perimeter'");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    public String toString2(){
        return this.toString() + " \n " + this.toString1();
    }
}

class Rectangle1 extends Shape1{
    public double width;
    public double length;

    public Rectangle1(){

    }

    public Rectangle1(String color, boolean filled){
        super(color, filled);
    }

    public Rectangle1(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle1(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    

    @Override
    public double Area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Area'");
    }

    @Override
    public double Perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Perimeter'");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    public String toString(){
        return this.toString() + " \n " + this.toString1();
    }
}

class Square1 extends Rectangle1{
    public double side;
    public Square1(){
    
    }

    public Square1(double side){
        this.side = side;
    }

    public Square1(String color, boolean filled, double side){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4*side;
    }

    public String toString(){
        return this.toString() + " \n " + this.toString1();
    }

}


public class Test2{
    public static void main(String[] args){

    }
}

