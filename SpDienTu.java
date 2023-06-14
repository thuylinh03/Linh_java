public class SpDienTu extends SanPham {
    private String nha_sx;
    private double bao_hanh;

    public SpDienTu(){

    }

    public SpDienTu(String ma_hang, String ten, String mota, double gia, String donvi, int ton_kho, String nha_sx, double bao_hanh){
        super(ma_hang,ten,mota,gia,donvi,ton_kho);
        this.nha_sx = nha_sx;
        this.bao_hanh = bao_hanh;
    }
    
    public String getNha_sx() {
        return nha_sx;
    }

    public void setNha_sx(String nha_sx) {
        this.nha_sx = nha_sx;
    }

    public double getBao_hanh() {
        return bao_hanh;
    }

    public void setBao_hanh(double bao_hanh) {
        this.bao_hanh = bao_hanh;
    }

    public void in_thongtin2(){
        this.inthongtin();
        System.out.println("Nha san xuat: " + nha_sx);
        System.out.println("Bao hanh: " + bao_hanh);
    }

    public static void main(String[] args){

    }

    


}
