public class Motorbike extends Vehicle{
    private String loai;

    public Motorbike(String ten, int nam_sx, int gia, String loai){
        super(ten, nam_sx, gia);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static void main(String[] args){

    }
}
