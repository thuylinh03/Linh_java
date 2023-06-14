public class Car extends Vehicle{
    public String xuat_xu;

    public Car(String ten, int nam_sx, int gia, String xuat_xu){
        super(ten, nam_sx, gia);
        this.xuat_xu = xuat_xu;
    }

    public String getXuat_xu() {
        return xuat_xu;
    }

    public void setXuat_xu(String xuat_xu) {
        this.xuat_xu = xuat_xu;
    }

    public static void main(String[] args){

    }
    

    
}
