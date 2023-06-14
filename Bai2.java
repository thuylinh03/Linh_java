import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        System.out.println("Nhap hai so: ");
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int r;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("UCLN la: " + a );
    }
    
}
