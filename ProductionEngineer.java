import java.util.Scanner;

public class ProductionEngineer extends ProductionWorker{
    private String chuyen_mon;

    public ProductionEngineer(){

    }

    public ProductionEngineer(String ten, String diachi, String phoneNumber, double muc_luong, double gio_lam, String chuyen_mon){
        super(ten, diachi, phoneNumber, muc_luong, gio_lam);
        this.chuyen_mon = chuyen_mon;
    }

    public String getChuyen_mon() {
        return chuyen_mon;
    }

    public void setChuyen_mon(String chuyen_mon) {
        this.chuyen_mon = chuyen_mon;
    }

    public void nhap_Engineer(){
        this.nhap_Worker();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyen_mon = sc.nextLine();
    }

    public String toString_3(){
        String info = this.toString_2() + "\nChuyen mon: " + chuyen_mon;
        return info;
    }

    public static void main(String[] args){
        // ProductionEngineer pe = new ProductionEngineer();
        // pe.nhap_Engineer();
        // System.out.println("**********************");
        // System.out.println("Thong tin vua nhap la: ");
        // System.out.println("**********************");
        // System.out.println(pe.toString_3());
    }
    
}
