public class Hinh extends Point1 {
    private double p;
    private double s;

    public Hinh(){

    }

    public Hinh(int x, int y, double p, double s){
        super(x,y);
        this.p = p;
        this.s = s;
    }

    public Hinh(double p, double s){
        this.p = p;
        this.s = s;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void tinhdientich(){

    }

    public void tinhchuvi(){

    }

    public void hienthi_Hinh(){
        this.in_Point1();
        System.out.println("Chu vi cua hinh la: " + p);
        System.out.println("Dien tich cua hinh la: " + s);
    }

    public static void main(String[] args){
        
    }
    
}
