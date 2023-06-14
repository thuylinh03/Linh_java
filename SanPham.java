import java.util.Scanner;

public class SanPham {
    private String ma_hang;
    private String ten;
    private String mota;
    private double gia;
    private String donvi;
    private int ton_kho;

    public SanPham(){

    }

    public SanPham(String ma_hang, String ten, String mota, double gia, String donvi, int ton_kho){
        this.ma_hang = ma_hang;
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.donvi = donvi;
        this.ton_kho = ton_kho;
    }

    public String getMa_hang() {
        return ma_hang;
    }

    public void setMa_hang(String ma_hang) {
        this.ma_hang = ma_hang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getTon_kho() {
        return ton_kho;
    }

    public void setTon_kho(int ton_kho) {
        this.ton_kho = ton_kho;
    }

    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Ma hang: ");
        ma_hang = sn.nextLine();
        System.out.println("Nhap ten: ");
        ten = sn.nextLine();
        System.out.println("Mo ta: ");
        mota = sn.nextLine();
        System.out.println("Gia ban: ");
        gia = sn.nextDouble();
        System.out.println("Don vi tinh: ");
        donvi = sn.nextLine();
        System.out.println("So luong ton kho: ");
        ton_kho = sn.nextInt();
    }

    public void inthongtin(){
        System.out.println("Ma hang: " + ma_hang);
        System.out.println("Ten san pham: " + ten);
        System.out.println("Mo ta: " + mota);
        System.out.println("Gia ban: " + gia);
        System.out.println("Don vi tinh: " + donvi);
        System.out.println("So luong ton kho: " + ton_kho);
    }

    public static void main(String[] args){

    }
}
