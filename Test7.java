import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String s = " Ha Noi dep qua ";

        String s = "Hello World";
        //System.out.println(" Ha Noi dep qua ".trim());
        //System.out.println("Nhap mot so bat ki: ");
        //int x = Integer.valueOf(sc.nextInt());

        System.out.println("Tu cuoi cung o cuoi chuoi ki tu co do dai la: " + (s.lastIndexOf(' ')));

    }
}
