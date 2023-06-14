import java.util.Scanner;;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang va so cot cua ma tran: ");
        int sh, sc;
        sh = input.nextInt();
        sc = input.nextInt();
        int [][]A;
        int [][]B;
        int [][]C;
        A = new int[sh][sc];
        B = new int[sh][sc];
        C = new int[sh][sc];
        System.out.println("Nhap vao gia tri cho ma tran 1: ");
        for(int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.println("Phan tu thu A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Nhap vao gia tri cho ma tran 2: ");
        for(int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.println("Phan tu thu B[" + i + "][" + j + "]: ");
                B[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Tong cua hai ma tran la: ");
        for (int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print((A[i][j] + B[i][j]) + "\t");
            }
            System.out.println();
        }


        System.out.println("Hieu cua hai ma tran la: ");
        for (int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print((A[i][j] - B[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("Doi dau cua ma tran 1 la: ");
        for (int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print((A[i][j] = -A[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("Doi dau cua ma tran 2 la: ");
        for (int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print((B[i][j] = -B[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("Ma tran 1 chuyen vi la: ");
        for (int i=0; i<sh; i++){
            for(int j=0; j<sc; j++){
                System.out.print((A[i][j] = C[j][i]) + "\t");
            }
            System.out.println();
        }
    }
}   
    













        //// Kiem tra so nguyen to:

    //     System.out.println("Nhap mot so n: ");
    //     int n;
    //     n = input.nextInt();
    //     if(kt_SNT(n)){
    //         System.out.println(n + " la so nguyen to");
    //     } else{
    //         System.out.println(n + " khong la so nguyen to");
    //     }
    // }

    // public static boolean kt_SNT(int n){
    //     if (n <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }













        // System.out.println("Nhap 2 so vao: ");
        // int a, b;
        // a = input.nextInt();
        // b = input.nextInt();
        // System.out.println("Phep cong cua hai so la: " + (a+b));
        // System.out.println("Phep tru cua hai so la: " + (a-b));
        // System.out.println("Phep nhan cua hai so la: " + (a*b));
        // System.out.println("Phep chia cua hai so la: " + (a/b));
        // if(a-b < 0){
        //     System.out.println(a + " nho hon " + b);
        // } else if (a-b > 0){
        //     System.out.println(a + " lon hon " + b);
        // } else{
        //     System.out.println(a + " bang " + b);
        // }











        //// Giai he phuong trinh bac nhat 2 an:
        
        // System.out.print("Giai va bien luan he phuong trinh bac nhat 2 an");
        // float a1, b1, c1, a2, b2, c2;
        // float D, Dx, Dy, x, y;
        // System.out.print("a1*x + b1*y = c1\n");
        // System.out.print("a2*x + b2*y = c2\n");
        // System.out.print("Nhap a1: ");
        // a1 = sc.nextFloat();
        // System.out.print("Nhap b1: ");
        // b1 = sc.nextFloat();
        // System.out.print("Nhap c1: ");
        // c1 = sc.nextFloat();
        // System.out.print("Nhap a2: ");
        // a2 = sc.nextFloat();
        // System.out.print("Nhap b2: ");
        // b2 = sc.nextFloat();
        // System.out.print("Nhap c2: ");
        // c2 = sc.nextFloat();
        // D = a1*b2 - a2*b1;
        // Dx = c1*b2 - c2*b1;
        // Dy = a1*c2 - a2*c1;
        // if (D == 0){
        //     if (Dx == 0 && Dy == 0)
        //         System.out.print("He phuong trinh co vo só nghiem");
        //     else
        //         System.out.print("He phuong trinh vo nghiem");    
        // }
        // else{
        //     x = Dx / D;
        //     y = Dy / D;
        //     System.out.print("He phuong trinh co nghiem (x, y) = (" + x + "," + y +")");
        // }
    

