public class HinhChuNhat extends Hinh {
    private int a;
    private int b;

    public HinhChuNhat(){

    }

    public HinhChuNhat(double p, double s, int a, int b){
        super(p,s);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void tinhchuvi(){
        this.setP((this.getA()+this.getB())*2);
    }

    public void tinhdientich(){
        this.setS(this.getA()*this.getB());
    }

    public void in_HinhCN(){
        this.hienthi_Hinh();
        // System.out.println("Chu vi hinh chu nhat la: " + this.getP());
        // System.out.println("Dien tich hinh chu nhat la: " + this.getS());
    }

    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setA(2);
        hcn.setB(3);
        System.out.println("Hinh chu nhat !!!");
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.in_HinhCN();
    }
}
