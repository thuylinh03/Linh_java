import java.util.Scanner;

public class Salesperson extends Employee{
    private int so_sp;
    private double tien_hoahong;

    public Salesperson(){

    }

    public Salesperson(String ten, String diachi, String phoneNumber, int so_sp, double tien_hoahong){
        super(ten, diachi, phoneNumber);
        this.so_sp = so_sp;
        this.tien_hoahong = tien_hoahong;
    }

    public int getSo_sp() {
        return so_sp;
    }

    public void setSo_sp(int so_sp) {
        this.so_sp = so_sp;
    }

    public double getTien_hoahong() {
        return tien_hoahong;
    }

    public void setTien_hoahong(double tien_hoahong) {
        this.tien_hoahong = tien_hoahong;
    }

    public void nhap_Sale(){
        this.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so san pham lam: ");
        this.so_sp = sc.nextInt();
        System.out.print("Nhap so tien hoa hong duoc nhan: ");
        this.tien_hoahong = sc.nextDouble();
    }

    public String toString_1(){
        String info = this.toString() + "\nSo san pham la: " + so_sp + "\nSo tien hoa hong: " + tien_hoahong;
        return info;
    }

    public static void main(String[] args){
        Salesperson sl = new Salesperson();
        sl.nhap_Sale();
        System.out.println("**********************");
        System.out.println("Thong tin vua nhap la: ");
        System.out.println("**********************");
        System.out.println(sl.toString_1());
    }
}
