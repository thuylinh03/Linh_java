public class Duck2 extends Animal2 {
    public float cannang;
    public Duck2(){

    }

    public Duck2(String name, float cannang){
        super(name);
        this.cannang = cannang;
    }

    public void talk(){
        super.talk();
        System.out.println("vit vit");
    }

    public static void main(String[] args){
        
    }
}
