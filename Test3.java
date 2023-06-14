import java.util.ArrayList;
import java.util.Scanner;

abstract class Thesach_bao{
    protected String ma;
    protected String ten;
    protected String tac_gia;
    protected int namXB;
    protected double gia_tien;
    protected int tap_so; //1

    public Thesach_bao(){

    }

    public Thesach_bao(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so) {
        this.ma = ma;
        this.ten = ten;
        this.tac_gia = tac_gia;
        this.namXB = namXB;
        this.gia_tien = gia_tien;
        this.tap_so = tap_so;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTac_gia() {
        return tac_gia;
    }

    public void setTac_gia(String tac_gia) {
        this.tac_gia = tac_gia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public double getGia_tien() {
        return gia_tien;
    }

    public void setGia_tien(double gia_tien) {
        this.gia_tien = gia_tien;
    }

    public int getTap_so() {
        return tap_so;
    }

    public void setTap_so(int tap_so) {
        this.tap_so = tap_so;
    }


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        ten = sc.next();
        System.out.println("Nhap tac gia: ");
        tac_gia = sc.next();
        System.out.println("Nam xuat ban: ");
        namXB = sc.nextInt();
        System.out.println("Gia tien: ");
        gia_tien = sc.nextDouble();
        System.out.println("Nhap tap so: ");
        tap_so = sc.nextInt();
    }


    public void inthongtin(){
        System.out.println("Ma la: " + ma);
        System.out.println("Ten la: " + ten);
        System.out.println("Tac gia la: " + tac_gia);
        System.out.println("Nam xuat ban la: " + tac_gia);
        System.out.println("Tap so: " + tap_so);
    }
    // @Override
    // public String toString() {
    //     return "Thesach_bao [ma=" + ma + ", ten=" + ten + ", tac_gia=" + tac_gia + ", namXB=" + namXB + ", gia_tien="
    //             + gia_tien + ", tap_so=" + tap_so + "]";
    // }  
    
    

}

class Ke_sach extends Thesach_bao{
    //public static final String Ke_sach = null;
    private ArrayList<Thesach_bao> sach;
    private String ma_kesach;
    private String ten_kesach;

    public Ke_sach(){

    }

    

    public Ke_sach(ArrayList<Thesach_bao> sach, String ma_kesach, String ten_kesach) {
        this.sach = sach;
        this.ma_kesach = ma_kesach;
        this.ten_kesach = ten_kesach;
    }



    public Ke_sach(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so,
            ArrayList<Thesach_bao> sach, String ma_kesach, String ten_kesach) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so);
        this.sach = sach;
        this.ma_kesach = ma_kesach;
        this.ten_kesach = ten_kesach;
    }


    public ArrayList<Thesach_bao> getSach() {
        return sach;
    }



    public void setSach(ArrayList<Thesach_bao> sach) {
        this.sach = sach;
    }



    public String getMa_kesach() {
        return ma_kesach;
    }



    public void setMa_kesach(String ma_kesach) {
        this.ma_kesach = ma_kesach;
    }



    public String getTen_kesach() {
        return ten_kesach;
    }



    public void setTen_kesach(String ten_kesach) {
        this.ten_kesach = ten_kesach;
    }

    
    public void in(){
        for (Thesach_bao thesach_bao : sach) {
            System.out.println(thesach_bao);
        }
    }    

    
}


class Ke_bao extends Thesach_bao{
    public Ke_bao(){

    }

    public Ke_bao(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so);
    }

    
}

class Dau_muc extends Ke_bao{
    public String ma_dauMuc;
    public String ten_dauMuc;
    public ArrayList<Ke_bao> danhsachbaiviet;

    public Dau_muc(){
        
    }
    
    public Dau_muc(String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet) {
        this.ma_dauMuc = ma_dauMuc;
        this.ten_dauMuc = ten_dauMuc;
        this.danhsachbaiviet = danhsachbaiviet;
    }
    public Dau_muc(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so, String ma_dauMuc,
            String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so);
        this.ma_dauMuc = ma_dauMuc;
        this.ten_dauMuc = ten_dauMuc;
        this.danhsachbaiviet = danhsachbaiviet;
    }

    public String getMa_dauMuc() {
        return ma_dauMuc;
    }

    public void setMa_dauMuc(String ma_dauMuc) {
        this.ma_dauMuc = ma_dauMuc;
    }

    public String getTen_dauMuc() {
        return ten_dauMuc;
    }

    public void setTen_dauMuc(String ten_dauMuc) {
        this.ten_dauMuc = ten_dauMuc;
    }

    public ArrayList<Ke_bao> getDanhsachbaiviet() {
        return danhsachbaiviet;
    }

    public void setDanhsachbaiviet(ArrayList<Ke_bao> danhsachbaiviet) {
        this.danhsachbaiviet = danhsachbaiviet;
    }
}



class tapChikhoaHoc extends Dau_muc{
    private ArrayList<Dau_muc> danhsachdaumucKhoaHoc;

    public tapChikhoaHoc(ArrayList<Dau_muc> danhsachdaumucKhoaHoc) {
        this.danhsachdaumucKhoaHoc = danhsachdaumucKhoaHoc;
    }

    public tapChikhoaHoc(String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet,
            ArrayList<Dau_muc> danhsachdaumucKhoaHoc) {
        super(ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucKhoaHoc = danhsachdaumucKhoaHoc;
    }

    public tapChikhoaHoc(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so,
            String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet,
            ArrayList<Dau_muc> danhsachdaumucKhoaHoc) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so, ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucKhoaHoc = danhsachdaumucKhoaHoc;
    }

    public ArrayList<Dau_muc> getDanhsachdaumucKhoaHoc() {
        return danhsachdaumucKhoaHoc;
    }

    public void setDanhsachdaumucKhoaHoc(ArrayList<Dau_muc> danhsachdaumucKhoaHoc) {
        this.danhsachdaumucKhoaHoc = danhsachdaumucKhoaHoc;
    }
}



class tapChigiaoDuc extends Dau_muc{
    private ArrayList<Dau_muc> danhsachdaumucGiaoDuc;

    public tapChigiaoDuc(ArrayList<Dau_muc> danhsachdaumucGiaoDuc) {
        this.danhsachdaumucGiaoDuc = danhsachdaumucGiaoDuc;
    }

    public tapChigiaoDuc(String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet,
            ArrayList<Dau_muc> danhsachdaumucGiaoDuc) {
        super(ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucGiaoDuc = danhsachdaumucGiaoDuc;
    }

    public tapChigiaoDuc(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so,
            String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet,
            ArrayList<Dau_muc> danhsachdaumucGiaoDuc) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so, ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucGiaoDuc = danhsachdaumucGiaoDuc;
    }
}


class ChuyenSan extends Dau_muc{
    private ArrayList<Dau_muc> danhsachdaumucChuyenSan;

    public ChuyenSan(ArrayList<Dau_muc> danhsachdaumucChuyenSan) {
        this.danhsachdaumucChuyenSan = danhsachdaumucChuyenSan;
    }

    public ChuyenSan(String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet,
            ArrayList<Dau_muc> danhsachdaumucChuyenSan) {
        super(ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucChuyenSan = danhsachdaumucChuyenSan;
    }

    public ChuyenSan(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so, String ma_dauMuc,
            String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet, ArrayList<Dau_muc> danhsachdaumucChuyenSan) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so, ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucChuyenSan = danhsachdaumucChuyenSan;
    }

    public ArrayList<Dau_muc> getDanhsachdaumucChuyenSan() {
        return danhsachdaumucChuyenSan;
    }

    public void setDanhsachdaumucChuyenSan(ArrayList<Dau_muc> danhsachdaumucChuyenSan) {
        this.danhsachdaumucChuyenSan = danhsachdaumucChuyenSan;
    }
}

class NhatSan extends Dau_muc{
    private ArrayList<Dau_muc> danhsachdaumucNhatSan;

    public NhatSan(ArrayList<Dau_muc> danhsachdaumucNhatSan) {
        this.danhsachdaumucNhatSan = danhsachdaumucNhatSan;
    }

    public NhatSan(String ma_dauMuc, String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet,
            ArrayList<Dau_muc> danhsachdaumucNhatSan) {
        super(ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucNhatSan = danhsachdaumucNhatSan;
    }

    public NhatSan(String ma, String ten, String tac_gia, int namXB, double gia_tien, int tap_so, String ma_dauMuc,
            String ten_dauMuc, ArrayList<Ke_bao> danhsachbaiviet, ArrayList<Dau_muc> danhsachdaumucNhatSan) {
        super(ma, ten, tac_gia, namXB, gia_tien, tap_so, ma_dauMuc, ten_dauMuc, danhsachbaiviet);
        this.danhsachdaumucNhatSan = danhsachdaumucNhatSan;
    }

    public ArrayList<Dau_muc> getDanhsachdaumucNhatSan() {
        return danhsachdaumucNhatSan;
    }

    public void setDanhsachdaumucNhatSan(ArrayList<Dau_muc> danhsachdaumucNhatSan) {
        this.danhsachdaumucNhatSan = danhsachdaumucNhatSan;
    }
}



public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ke_sach ks = new Ke_sach();

        System.out.println("Nhap so luong sach: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            ks.nhap();
        }

        for (int i=0; i<n; i++) {
            ks.inthongtin();
        }
        //ks.nhap();
        //ks.inthongtin();


        // for(int i=0; i<n; i++){
        //     System.out.println("Nhap ma sach: ");
        //     String masach = sc.next();
        //     System.out.println("Nhap ten sach: ");
        //     String ten = sc.next();
        //     System.out.println("Nhap tac gia sach: ");
        //     String tg = sc.next();
        //     System.out.println("Nhap nam xuat ban: ");
        //     int nam = sc.nextInt();
        //     System.out.println("Nhap gia tien: ");
        //     double m = sc.nextDouble();
        //     System.out.println("Nhap tap so: ");
        //     int x = sc.nextInt();
        // }

        // do{
        //     System.out.println("Nhap ten sach hoac bao: ");
            
        // }while(true);
    }
}
