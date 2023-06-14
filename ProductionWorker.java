import java.util.Scanner;

public class ProductionWorker extends Employee {
    private double muc_luong;
    private double gio_lam;

    public ProductionWorker(){

    }

    public ProductionWorker(String ten, String diachi, String phoneNumber, double muc_luong, double gio_lam){
        super(ten, diachi, phoneNumber);
        this.muc_luong = muc_luong;
        this.gio_lam = gio_lam;
    }

    public double getMuc_luong() {
        return muc_luong;
    }

    public void setMuc_luong(double muc_luong) {
        this.muc_luong = muc_luong;
    }

    public double getGio_lam() {
        return gio_lam;
    }

    public void setGio_lam(double gio_lam) {
        this.gio_lam = gio_lam;
    }

    public void nhap_Worker(){
        this.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap muc luong: ");
        this.muc_luong = sc.nextDouble();
        System.out.print("Nhap so gio lam viec trong 1 ngay: ");
        this.gio_lam = sc.nextDouble();
    }

    public String toString_2(){
        String info = this.toString() + "\nMuc luong: " + muc_luong + "\nSo gio lam viec: " + gio_lam;
        return info;
    }

    public static void main(String[] args){
    //     ProductionWorker pw = new ProductionWorker();
    //     pw.nhap_Worker();
    //     System.out.println("**********************");
    //     System.out.println("Thong tin vua nhap la: ");
    //     System.out.println("**********************");
    //     System.out.println(pw.toString_2());
     }
}
