public class Shape {
    private double chuvi;
    private double dientich;

    public Shape(){

    }

    public Shape(double chuvi, double dientich){
        this.chuvi = chuvi;
        this.dientich = dientich;
    }

    public double getChuvi() {
        return chuvi;
    }

    public void setChuvi(double chuvi) {
        this.chuvi = chuvi;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public void tinh_chuvi(){

    }

    public void tinh_dientich(){

    }
    
    public void in_thong_tin(){
        System.out.println("Chu vi cua hinh la:" + chuvi);
        System.out.println("Dien tich cua hinh la: " + dientich);
    }

    public static void main(String[] args){

    }
}
