public class CanBo extends Nguoi {
    private String cap_ham;
    private String chucvu;

    public CanBo(String hoten, int ngaysinh, String gioi_tinh, String que, String cap_ham, String chucvu){
        super(hoten, ngaysinh, gioi_tinh, que);
        this.cap_ham = cap_ham;
        this.chucvu = chucvu;
    }

    public CanBo(){

    }

    // public CanBo(String cap_ham, String chucvu){
    //     this.cap_ham = cap_ham;
    //     this.chucvu = chucvu;
    // }

    public String getCap_ham() {
        return cap_ham;
    }

    public void setCap_ham(String cap_ham) {
        this.cap_ham = cap_ham;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void inthongtin(){
        this.Xuat();
        System.out.println("Cap ham: " + cap_ham);
        System.out.println("Chuc vu: " + chucvu);
    }

    public static void main(String[] args){
        CanBo cb = new CanBo("Thuy Linh", 17, "nu", "HA NOI", "Thuong ta", "Cap cao");
        cb.inthongtin();
    }
    
}
