import java.util.Arrays;
import java.util.Scanner;

public class ontap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Nhap phan tu vao mang: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap la: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i] + "  ");
        }

        Arrays.sort(A);

        System.out.println();

        System.out.println("Sap xep tang dan:");
        for(int x : A){
            System.out.print(x + "  ");
        }









        //// BAI 1:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap so luong phan tu trong mang: ");
        // int n = sc.nextInt();
        // int[] A = new int[n];

        // System.out.println("Nhap phan tu vao mang: ");
        // for(int i=0; i<n; i++){
        //     A[i] = sc.nextInt();
        // }

        // System.out.println("Mang vua nhap la: ");
        // for(int i=0; i<n; i++){
        //     System.out.print(A[i] + "  ");
        // }

        // System.out.println();

        // int max = 0;
        // for(int i=0; i<n; i++){
        //     if(A[i] > max){
        //         max = A[i];
        //     }
        // }
        // System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);

        // int min = 99;
        // for(int i=0; i<n; i++){
        //     if(A[i] < min){
        //         min = A[i];
        //     }
        // }
        // System.out.println("Phan tu co gia tri nho nhat trong mang la: " + min);
    }
}
