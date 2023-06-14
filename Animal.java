import java.util.Scanner;

public class Animal {
    private String ten;
    private int tuoi;
    private String mau_mat;
    private String mau_long;

    public Animal(){

    }

    public Animal(String ten, int tuoi, String mau_mat, String mau_long){
        this.ten = ten;
        this.tuoi = tuoi;
        this.mau_mat = mau_mat;
        this.mau_long = mau_long;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMau_mat() {
        return mau_mat;
    }

    public void setMau_mat(String mau_mat) {
        this.mau_mat = mau_mat;
    }

    public String getMau_long() {
        return mau_long;
    }

    public void setMau_long(String mau_long) {
        this.mau_long = mau_long;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten: ");
        ten = sc.nextLine();
        System.out.println("Tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Mau mat: ");
        mau_mat = sc.nextLine();
        System.out.println("Mau long: ");
        mau_long = sc.nextLine();
    }

    public String toString(){
        String info = "Ten: " + this.ten + "\nTuoi: " + this.tuoi + "\nMau mat: " + this.mau_mat + "\nMau long: " + this.mau_long;
        return info;
    }


    public static void main(String[] args){
        Animal a = new Animal();
        a.nhap();
        System.out.println(a.toString());
    }
    
}
