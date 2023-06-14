public class Hinhcn {
    private final float length = 1.0f;
    private final float width = 1.0f;
    private double cv;
    private double dt;

    public void setC(){
        cv = (this.length + this.width) * 2;
    }

    public void setS(){
        dt = this.length * this.width;
    }

    public float getC(){
        
    }
}
