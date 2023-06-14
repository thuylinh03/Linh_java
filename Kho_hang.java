import java.util.List;
import java.util.Scanner;
public class Kho_hang extends SanPham{
    private int soluong_thucpham;
    private int soluong_dientu;
    private  List<String> danhsach_spTP;
    private List<String> danhsach_spDT;

    public Kho_hang(){

    }

    public Kho_hang(String ma_hang, String ten, String mota, double gia, String donvi, int ton_kho, int soluong_thucpham, int soluong_dientu, List<String> danhsach_spTP, List<String> danhsach_spDT){
        super(ma_hang,ten,mota,gia,donvi,ton_kho);
        this.soluong_thucpham = soluong_thucpham;
        this.soluong_dientu = soluong_dientu;
        this.danhsach_spTP = danhsach_spTP;
        this.danhsach_spDT = danhsach_spDT;
    }

    public int getSoluong_thucpham() {
        return soluong_thucpham;
    }

    public void setSoluong_thucpham(int soluong_thucpham) {
        this.soluong_thucpham = soluong_thucpham;
    }

    public int getSoluong_dientu() {
        return soluong_dientu;
    }

    public void setSoluong_dientu(int soluong_dientu) {
        this.soluong_dientu = soluong_dientu;
    }

    public List<String> getDanhsach_spTP() {
        return danhsach_spTP;
    }

    public void setDanhsach_spTP(List<String> danhsach_spTP) {
        this.danhsach_spTP = danhsach_spTP;
    }

    public List<String> getDanhsach_spDT() {
        return danhsach_spDT;
    }

    public void setDanhsach_spDT(List<String> danhsach_spDT) {
        this.danhsach_spDT = danhsach_spDT;
    }

    public void in(){
        this.inthongtin();
    }

    public void nhap_kho(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Nhap so luong san pham thuc pham vao kho: ");
        int n = s1.nextInt();
        for(int i=0; i<n; i++){
            this.nhap();
        }
        this.in();
        System.out.println("Nhap so luong san pham dien tu vao kho: ");
        int m = s1.nextInt();
        for(int i=0; i<m; i++){
            this.nhap();
        }
        this.in();
    }

    public static void main(String[] args){
        Kho_hang kh = new Kho_hang();
        kh.nhap_kho();
        kh.in();
    }

    
}
