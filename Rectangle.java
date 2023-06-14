public class Rectangle extends Shape {
    private double dai;
    private double rong;

    public Rectangle(){

    }

    public Rectangle(double chuvi, double dientich, double dai, double rong){
        super(chuvi,dientich);
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public void tinh_chuvi(){
        this.setChuvi((this.getDai() + this.getRong()) * 2);
    }

    public void tinh_dientich(){
        this.setDientich(this.getDai()*this.getRong());
    }

    public void hienthi(){
        this.in_thong_tin();
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setDai(3);
        r.setRong(2);
        r.tinh_chuvi();
        r.tinh_dientich();
        r.hienthi();;
    }
}
