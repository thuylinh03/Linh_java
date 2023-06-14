public class Cat2 extends Animal2{
    public int tuoi;
    public String maulong;
    public float chieucao;
    public Cat2(){

    }

    public Cat2(String name, float cannang, int tuoi, String maulong, float chieucao){
        super(name);
        this.tuoi = tuoi;
        this.maulong = maulong;
        this.chieucao = chieucao;
        
    }

    public void talk(){
        super.talk();
        System.out.println("meo meo");
    }

    public static void main(String[] args){
        
    }
}
