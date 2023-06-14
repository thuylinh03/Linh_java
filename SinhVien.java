public class SinhVien extends Nguoi{
    private String lop;
    private String khoa;

    public SinhVien(){

    }

    public SinhVien(String hoten, int ngaysinh, String gioi_tinh, String que, String lop, String khoa){
        super(hoten, ngaysinh, gioi_tinh, que);
        this.lop = lop;
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void in_thong_tin(){
        this.Xuat();
        System.out.println("Lop: " + lop);
        System.out.println("Khoa: " + khoa);
    }

    public static void main(String[] args){
        SinhVien sv = new SinhVien("Thuy Linh", 17, "nu", "HA NOI", "CNTT5", "CNTT");
        sv.in_thong_tin();
    }
}
