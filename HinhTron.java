public class HinhTron extends Hinh {
    private final double PI = 3.14;
    private double r;

    public HinhTron(){

    }

    public HinhTron(int x, int y, double p, double s, double r){
        super(x,y,p,s);
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void tinhchuvi(){
        this.setP(this.getPI()*2*getR());
    }

    public void tinhdientich(){
        this.setS(this.getPI()*this.getR()*this.getR());
    }

    public void in_HinhTron(){
        this.hienthi_Hinh();
        // System.out.println("Chu vi hinh tron la: " + this.getP());
        // System.out.println("Dien tich hinh tron la: " + this.getS());
    }

    public static void main(String[] args){
        HinhTron tron = new HinhTron();
        tron.setR(3);
        System.out.println("Hinh tron !!!");
        tron.tinhchuvi();
        tron.tinhdientich();
        tron.in_HinhTron();
    }
}
