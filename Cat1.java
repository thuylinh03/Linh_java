
public class Cat1{
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyescolor;

    public Cat1(){

    }

    public Cat1(String name, int age, float weight, String color, String eyescolor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.eyescolor = eyescolor;
    }

    public void speak(){

    }

    public void move(){
        System.out.println(name + " is running");
    }

    public void sleep(){
        System.out.println(name + " is sleepping");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public static void main(String[] argv){
        Cat1 tom = new Cat1();
        tom.name = "Tom";
        System.out.println("Cat's name: " + tom.name);
        tom.move();

        Cat1 mew = new Cat1();
        mew.name = "Mimi";
        System.out.println("Cat's name: " + mew.name);
        mew.sleep();
        mew.eat();
    }
}