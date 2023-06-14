public class SpThucPham extends SanPham {
    private int ngay_sx;
    private int ngay_hh;

    public SpThucPham(){

    }

    public SpThucPham(String ma_hang, String ten, String mota, double gia, String donvi, int ton_kho, int ngay_sx, int ngay_hh){
        super(ma_hang,ten,mota,gia,donvi,ton_kho);
        this.ngay_sx = ngay_sx;
        this.ngay_hh = ngay_hh;
    }

    public int getNgay_sx() {
        return ngay_sx;
    }

    public void setNgay_sx(int ngay_sx) {
        this.ngay_sx = ngay_sx;
    }

    public int getNgay_hh() {
        return ngay_hh;
    }

    public void setNgay_hh(int ngay_hh) {
        this.ngay_hh = ngay_hh;
    }

    public void in_thongtin1(){
        this.inthongtin();
        System.out.println("Ngay san xuat: " + ngay_sx);
        System.out.println("Ngay het han: " + ngay_hh);
    }

    public static void main(String[] args){

    }
}
