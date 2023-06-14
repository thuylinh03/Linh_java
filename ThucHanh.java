import java.util.Scanner;

public class ThucHanh {

    // int x;
    // float y;

    // public void nhap(){
    //     System.out.println("Nhap vao hai so: ");
    //     Scanner sc = new Scanner(System.in);
    //     x = sc.nextInt();
    //     y = sc.nextFloat();
    // }

    // public void in(){ 
    //     System.out.println("Hai so vua nhap la: " + x + "  \t  "  + y );
    // }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang va so cot cua ma tran: ");
        int sh, sc;
        sh = input.nextInt();
        sc = input.nextInt();
        int [][]A;
        int [][]B;
        //int [][]C;
        //C = new int[sh][sc];
        A = new int[sh][sc];
        B = new int[sh][sc];
        System.out.println("Nhap vao gia tri cho ma tran 1: ");
        for(int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.println("Phan tu thu A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        //// Cach goi ham:
        // ThucHanh th = new ThucHanh();
        // th.nhap();
        // th.in();
        System.out.println("Ma tran 1 chuyen vi la: ");
        for (int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print((A[i][j] = B[j][i]) + "\t");
            }
            System.out.println();
        }
    }
}
