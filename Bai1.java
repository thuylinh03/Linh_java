import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 2 so vao: ");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Phep cong cua hai so la: " + (a+b));
        System.out.println("Phep tru cua hai so la: " + (a-b));
        System.out.println("Phep nhan cua hai so la: " + (a*b));
        System.out.println("Phep chia cua hai so la: " + (a/b));
        if(a-b < 0){
            System.out.println(a + " nho hon " + b);
        } else if (a-b > 0){
            System.out.println(a + " lon hon " + b);
        } else{
            System.out.println(a + " bang " + b);
        }
    }
}
