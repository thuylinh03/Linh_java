import java.util.Scanner;
public class Employee {
    private String ten;
    private String diachi;
    private String phoneNumber;

    public Employee(){

    }

    public Employee(String ten, String diachi, String phoneNumber){
        this.ten = ten;
        this.diachi = diachi;
        this.phoneNumber = phoneNumber;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diachi = sc.nextLine();
        System.out.print("Nhap phoneNumber: ");
        this.phoneNumber = sc.nextLine();
    }

    public String toString(){
        //String info = "Ho ten: " + this.getTen() + "\tDia chi: " + this.getDiachi() + "\tSo dien thoai: " + this.getPhoneNumber();
        String info = "Ho ten: " + ten + "\nDia chi: " + diachi + "\nSo dien thoai: " + phoneNumber;
        return info;
    }

    public static void main(String[] args){
        Employee e = new Employee();
        e.nhap();
        System.out.println("**********************");
        System.out.println("Thong tin vua nhap la: ");
        System.out.println("**********************");
        System.out.println(e.toString());
        e.toString();
    }
}
