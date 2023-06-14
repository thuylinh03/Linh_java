import java.util.Scanner;

public class SoPhuc {
    private double pt;
    private double pa;

    public SoPhuc(){
        pt = 0;
        pa = 0;
    }

    public SoPhuc(double pt, double pa){
        this.pt = pt;
        this.pa = pa;
    }

    public void nhapSoPhuc(Scanner sc){
        double a;
        double b;
        System.out.println("Nhap phan thuc a: ");
        a = sc.nextDouble();

        System.out.println("Nhap phan ao b: ");
        b = sc.nextDouble();
    }                         

    public void xuatSoPhuc(){
        if (pa < 0){
            System.out.println(pt + " - " + Math.abs(pa) + "*i");
        } else{
            System.out.println(pt + " + " + pa + "*i");
        }
    }

    public SoPhuc congSoPhuc(SoPhuc sp1){
        double thuc = pt + sp1.pt;
        double ao = pa + sp1.pa;
        return new SoPhuc(thuc, ao);
    }

    public SoPhuc truSoPhuc(SoPhuc sp1){
        double thuc = pt - sp1.pt;
        double ao = pa - sp1.pa;
        return new SoPhuc(thuc, ao);
    }

    public SoPhuc nhanSoPhuc(SoPhuc sp1){
        double thuc = pt * sp1.pt - pa * sp1.pa;
        double ao = pt * sp1.pa + sp1.pt * pa;
        return new SoPhuc(thuc, ao);
    }

    public SoPhuc chiaSoPhuc(SoPhuc sp1){
        double thuc = (pt * sp1.pt + pa * sp1.pt) * (1/(sp1.pt * sp1.pt + sp1.pa * sp1.pa));
        double ao = (sp1.pt * pa - pt * sp1.pa) * (1/(sp1.pt * sp1.pt + sp1.pa * sp1.pa));
        return new SoPhuc(thuc, ao);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        SoPhuc spTong = new SoPhuc();
        SoPhuc spHieu = new SoPhuc();
        SoPhuc spTich = new SoPhuc();
        SoPhuc spThuong = new SoPhuc();

        System.out.println("Nhap phan thuc: ");
        sp1.nhapSoPhuc(sc);

        System.out.println("Nhap phan ao: ");
        sp2.nhapSoPhuc(sc);

        spTong = sp1.congSoPhuc(sp2);
        spHieu = sp1.truSoPhuc(sp2);
        spTich = sp1.nhanSoPhuc(sp2);
        spThuong = sp1.chiaSoPhuc(sp2);

        System.out.println("So phuc thu nhat la: ");
        sp1.xuatSoPhuc();

        System.out.println("So phuc thu hai la: ");
        sp2.xuatSoPhuc();


        System.out.println("Tong cua hai so phuc la: ");
        spTong.xuatSoPhuc();
        System.out.println("Hieu cua hai so phucla: ");
        spHieu.xuatSoPhuc();
        System.out.println("Tich cua hai so phuc la: ");
        spTich.xuatSoPhuc();
        System.out.println("Thuong cua hai so phuc la: ");
        spThuong.xuatSoPhuc();
    }
}
