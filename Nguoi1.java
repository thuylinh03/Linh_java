import java.util.Scanner;

public class Nguoi1 {
    private String ht, gt, qq;
    public Nguoi1(){
        System.out.println("Khoi tao khong tham so cua Nguoi!");
    }
    public Nguoi1(String _ht, String _gt, String _qq){
        this.ht = _ht;
        this.gt = _gt;
        this.qq = _qq;
        System.out.println("Khoi tao co tham so cua Nguoi!");
    }
    public void nhapTen(String _ht){this.ht = _ht;}
    public void nhapGioitinh( String _gt){this.gt = _gt;}
    public void nhapQuequan(String _qq){ this.qq = _qq;}


    public void hienthi_ten(){
        
    }

//public class Main {
    public static void main(String[] args){
        Nguoi1 n2 = new Nguoi1();
    }
}

