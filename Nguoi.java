public class Nguoi {
    private String hoten;
    private int ngaysinh;
    private String gioi_tinh;
    private String que;

    public Nguoi(){

    } 

    public Nguoi(String hoten, int ngaysinh, String gioi_tinh, String que){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioi_tinh = gioi_tinh;
        this.que = que;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }
    
    public void Xuat(){
        System.out.println("Ho ten: " + hoten);
        System.out.println("Ngay sinh: " + ngaysinh);
        System.out.println("Gioi tinh: " + gioi_tinh);
        System.out.println("Que: " + que);
    }

    public static void main(String[] args){
        
    }
}
