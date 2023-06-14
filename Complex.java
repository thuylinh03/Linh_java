import java.util.Scanner;


public class Complex {
    private double a;
    private double b;

  
    public Complex() {
        a = 0;
        b = 0;
    }

    
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    
    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        a = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        b = sc.nextDouble();
    }

    
    public void hienThi() {
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "*i");
        } else {
            System.out.println(a + " + " + b + "*i");
        }
    }

    
    public Complex congSP(Complex sp2) {
        double thuc = a + sp2.a;
        double ao = b + sp2.b;
        return new Complex(thuc, ao);
    }

    
    public Complex truSP(Complex sp2) {
        double thuc = a - sp2.a;
        double ao = b - sp2.b;
        return new Complex(thuc, ao);
    }

    
    public Complex nhanSP(Complex sp2) {
        double thuc = a * sp2.a - b * sp2.b;
        double ao = a * sp2.b + sp2.a * b;
        return new Complex(thuc, ao);
    }

    
    public Complex chiaSP(Complex sp2) {
        double thuc = (a * sp2.a + b * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        double ao = (sp2.a * b - a * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return new Complex(thuc, ao);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spCong = new Complex();
        Complex spTru = new Complex();
        Complex spNhan = new Complex();
        Complex spThuong = new Complex();
        
        
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);


        System.out.println("So phuc 1 la:");
        sp1.hienThi();
        System.out.println("So phuc 2 la:");
        sp2.hienThi();

        
        spCong = sp1.congSP(sp2);
        spTru = sp1.truSP(sp2);
        spNhan = sp1.nhanSP(sp2);
        spThuong = sp1.chiaSP(sp2);

       
        System.out.println("Ket qua cua phep cong sp1 cho sp2 la:");
        spCong.hienThi();
        System.out.println("Ket qua cua phep tru sp1 cho sp2 la:");
        spTru.hienThi();
        System.out.println("Ket qua cua phep nhan sp1 cho sp2 la:");
        spNhan.hienThi();
        System.out.println("Ket qua cua phep chia sp1 cho sp2 la:");
        spThuong.hienThi();
    }
}