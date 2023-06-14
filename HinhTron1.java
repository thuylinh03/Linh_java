public class HinhTron1 {
    private final float PI = 3.14f;
    private float banKinh;
    private float chuVi;
    private float dienTich;
    // Constructor
    public HinhTron1(float banKinh) {
        this.banKinh = banKinh;
    }
    public float getChuVi() {
        return chuVi;
    }
    public float getDienTich() {
        return dienTich;
    }
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }


    public static void main(String[] args) {
        HinhTron1 hinhTron = new HinhTron1(20);
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        float chuVi = hinhTron.getChuVi();
        float dienTich = hinhTron.getDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; Va dien tich la: " + dienTich) ;
    }
}
