import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void nhapPhanSo(Scanner sc){
        int a;
        int b;
        do{
            System.out.println("Nhap tu so a: ");
            a = sc.nextInt();

            System.out.println("Nhap mau so b: ");
            b = sc.nextInt();

            if(b==0){
                System.out.println("Mau so phai khac 0. Xin hay nhap lai: ");
            } else{
                tuSo = a;
                mauSo = b;
            }
        } while(b==0);
    }

    public void xuatPhanSo(){
        if (tuSo * mauSo < 0){
            System.out.println("\t-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else{
            System.out.println("\t" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    public PhanSo congPhanSo(PhanSo ps1){
        int a = tuSo * ps1.mauSo + mauSo * ps1.tuSo;
        int b = tuSo * ps1.mauSo;
        
        return new PhanSo(a, b);
    }

    public PhanSo truPhanSo(PhanSo ps1){
        int a = tuSo * ps1.mauSo + mauSo * ps1.tuSo;
        int b = tuSo * ps1.mauSo;

        return new PhanSo(a, b);
    }

    public PhanSo nhanPhanSo(PhanSo ps1){
        int a = tuSo * ps1.tuSo;
        int b = mauSo * ps1.mauSo;

        return new PhanSo(a, b);
    }

    public PhanSo chiaPhanSo(PhanSo ps1){
        int a = tuSo * ps1.mauSo;
        int b = mauSo * ps1.tuSo;

        return new PhanSo(a, b);
    }

    public void so_sanhPS(PhanSo ps1){
        int a = tuSo * ps1.mauSo + mauSo * ps1.tuSo;
        int b = tuSo * ps1.mauSo;
        
        if (a < 0){
            System.out.println("Phan so thu nhat nho hon phan so thu hai");
        } else if (a==0){
            System.out.println("Phan so thu nhat bang phan so thu hai");
        } else{
            System.out.println("Phan so thu nhat lon hon phan so thu hai");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong = new PhanSo();
        PhanSo psHieu = new PhanSo();
        PhanSo psTich = new PhanSo();
        PhanSo psThuong = new PhanSo();

        System.out.println("Nhap phan so thu nhat: ");
        ps1.nhapPhanSo(sc);

        System.out.println("Nhap phan so thu hai: ");
        ps2.nhapPhanSo(sc);

        psTong = ps1.congPhanSo(ps2);
        psHieu = ps1.truPhanSo(ps2);
        psTich = ps1.nhanPhanSo(ps2);
        psThuong = ps1.chiaPhanSo(ps2);

        System.out.println("Phan so thu nhat la: ");
        ps1.xuatPhanSo();

        System.out.println("Phan so thu hai la: ");
        ps2.xuatPhanSo();


        System.out.println("Tong cua hai phan so la: ");
        psTong.xuatPhanSo();
        System.out.println("Hieu cua hai phan so la: ");
        psHieu.xuatPhanSo();
        System.out.println("Tich cua hai phan so la: ");
        psTich.xuatPhanSo();
        System.out.println("Thuong cua hai phan so la: ");
        psThuong.xuatPhanSo();

    }
}
