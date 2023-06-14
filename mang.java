import java.util.Scanner;

public class mang {

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
            if(n<0){
                System.out.println("Vui long nhap lai!");
            }
        }while(n<0);
        int[] arr;
        arr = new int[n];

        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i=0; i<n; i++){
            System.out.println("Phan tu thu " + i + " : "  );
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap la: ");
        for (int i=0; i<n; i++){
            System.out.println(arr[i] + "  ");
        }

        for (int i=0; i<n; i++){
            arr[i] = i++;
        }
        System.out.println("Trong mang co: " + arr.length + " phan tu");

        System.out.println("Nhap so nguyen x can tim kiem: ");
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                System.out.println("So nguyen " + x + " co trong mang");
            }
        }


        System.out.println("Mang truoc khi xoa la: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println("Nhap so nguyen y can xoa: ");
        int y = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == y){
                arr[i] = arr[i+1];
                i--;
            }
        }


        System.out.println("Mang sau khi xoa la: ");
        for (int i=0; i<n; i++){
            System.out.println(arr[i] + "  ");
        }

    }
}
