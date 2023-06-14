public class Square extends Shape{
    private double canh;

    public Square(){

    }

    public Square(double chuvi, double dientich, double canh){
        super(chuvi, dientich);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public void tinh_chuvi(){
        this.setChuvi(4*this.getCanh());
    }

    public void tinh_dientich(){
        this.setDientich(this.getCanh()*this.getCanh());
    }

    public void hien_thi(){
        this.in_thong_tin();
    }

    public static void main(String[] args){
        Square sq = new Square();
        sq.setCanh(2);
        sq.tinh_chuvi();
        sq.tinh_dientich();
        sq.hien_thi();
    }
}