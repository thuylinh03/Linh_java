import java.util.Scanner;

public class Vehicle {
    protected String ten;
    protected int nam_sx;
    protected int gia;

    public Vehicle(String ten, int nam_sx, int gia){
        this.ten = ten;
        this.nam_sx = nam_sx;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNam_sx() {
        return nam_sx;
    }

    public void setNam_sx(int nam_sx) {
        this.nam_sx = nam_sx;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public static void main(String[] args){
        
    }
}
