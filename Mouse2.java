public class Mouse2 extends Animal2{
    public float cannang;
    public Mouse2(){

    }

    public Mouse2(String name, float cannang){
        super(name);
        this.cannang = cannang;
    }

    public void talk(){
        super.talk();
        System.out.println("chit chit");
    }

    public static void main(String[] args){
        
    }
}
