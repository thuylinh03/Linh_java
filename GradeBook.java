import java.util.Scanner;
// public class GradeBook {
//     static void displayMessage(){
//         System.out.println("Welcome to GradeBook");
//     }


//     public static void main(String[ ] args){
//     displayMessage();
//     }
// }                


public class GradeBook {
    static void displayMessage(String name){
        System.out.println("Welcome to GradeBook");
        System.out.println("Chao ban den voi khoa hoc " + name);
    }


    public static void main(String[ ] args){
    // displayMessage();
    displayMessage("Java");
    }
}



public class GradeBook{
    private String Cn;
    private String name;
    public GradeBook(){}
    public GradeBook(String _Cn){
        this.Cn = _Cn;
    }
    public void setCn(String name){
        this.name = name;
    }
    public String getCn(){
        return name;
    } 

    static void displayMessage(String name){
        System.out.println("Welcome to GradeBook");
        System.out.println("Chao ban den voi khoa hoc " + name);
    }

    public static void main(String[ ] args){

    displayMessage("Java");
    }
}


