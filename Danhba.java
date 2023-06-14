import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Danhba{
    private String hoten;
    private String ten_th_goi;
    private String diachi;
    private String email;
    private ArrayList<String> sdt;

    public Danhba(){

    }

    public Danhba(String hoten, String ten_th_goi, String diachi, String email, String sdt){
        this.hoten = hoten;
        this.ten_th_goi = ten_th_goi;
        this.diachi = diachi;
        this.email = email;
        this.sdt = new ArrayList<>();
    }

    
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTen_th_goi() {
        return ten_th_goi;
    }

    public void setTen_th_goi(String ten_th_goi) {
        this.ten_th_goi = ten_th_goi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getSdt() {
        return sdt;
    }

    public void setSdt(ArrayList<String> sdt) {
        this.sdt = sdt;
    }

    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        for(int i=0; i<n; i++){
            System.out.println("Nhap ho ten: ");
            hoten = sc.nextLine();
            System.out.println("Nhap ten thuong goi: ");
            ten_th_goi = sc.nextLine();
            System.out.println("Nhap dia chi: ");
            diachi = sc.nextLine();
            System.out.println("Nhap email: ");
            email = sc.nextLine();
            System.out.println("Nhap so dien thoai: ");
            ArrayList<String> list_sdt = new ArrayList<String>(4);
        }
    }

    public void in(){
        int n = 3;
        for(int i=0; i<n; i++){
            System.out.println("Ho ten: " + hoten);
            System.out.println("Ten thuong goi: " + ten_th_goi);
            System.out.println("Dia chi: " + diachi);
            System.out.println("Email: " + email);
            System.out.println("SDT: " + sdt);
        }
    }

    public void add(Danhba danhba){
        ArrayList<Danhba> danhbas = new ArrayList<Danhba>(4);
        danhbas.add(danhba);
    }

    // public void find(Danhba danhba){
    //     ArrayList<String> sdt = new ArrayList<String>();
    //     for(int i=0; i<sdt.size(); i++){
    //         if(sdt.)
    //     }
    // }

    public void sap_xep(Danhba danhba){
        
    }




    public static void main(String[] args){

    }   
}