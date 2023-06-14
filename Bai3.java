import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap mot so n: ");
        int n;
        n = input.nextInt();
        if(kt_SNT(n)){
            System.out.println(n + " la so nguyen to");
        } else{
            System.out.println(n + " khong la so nguyen to");
        }
    }

    public static boolean kt_SNT(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    

