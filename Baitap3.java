

import java.util.Scanner;



class Baitap3{
    public static void main(String[] arge) {
        System.out.println("Giai va bien luan he phuong trinh bac nhat 2 an");
        float a1, b1, c1, a2, b2, c2;
        float D, Dx, Dy;
        Scanner sc = new Scanner(System.in);
        System.out.println("a1*x + b1*y = c1\n");
        System.out.println("a2*x + b2*y = c2\n");
        System.out.println("Nhap a1: ");
        a1 = sc.nextFloat();
        System.out.println("Nhap b1: ");
        b1 = sc.nextFloat();
        System.out.println("Nhap c1: ");
        c1 = sc.nextFloat();
        System.out.println("Nhap a2: ");
        a2 = sc.nextFloat();
        System.out.println("Nhap b2: ");
        b2 = sc.nextFloat();
        System.out.println("Nhap c2: ");
        c2 = sc.nextFloat();
        D = a1*b2 - a2*b1;
        Dx = c1*b2 - c2*b1;
        Dy = a1*c2 - a2*c1;
        if (D == Dx && Dx == Dy && Dy == 0){
            System.out.println("He co vo so nghiem!");
        }
        else if(D == 0 && Dx != 0){
            System.out.println("He phuong trinh vo nghiem!");
        }
        else if(D != 0){
            System.out.println("He phuong trinh co nghiem (x, y) = (" + (Dx / D) + "," + (Dy / D) +")");
        }
    }
}
