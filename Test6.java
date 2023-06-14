import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so can chuyen doi: ");
        int n = Integer.valueOf(sc.nextInt());

        System.out.println("Nhap he co so: ");
        int b = Integer.valueOf(sc.nextInt());

        if(b<2 || b>16){
            System.out.println("Khong hop le. Vui long nhap lai");
            return;
        }

        String x = convert(n,b);
        System.out.println("so " + n + " o he co so 10 chuyen sang he co so " + b + " la: " + x);

        
    }

    public static String convert(int n, int b){
        String x = "";

        while(n>0){
            int y = n%b;
            if(y<10){
                x = y + x;
            }else{
                char z = (char) ('A' + y - 10);
                x = z + x;
            }
            n = n/b;
        }
        return x;
    }
}
