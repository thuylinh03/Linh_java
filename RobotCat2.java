public class RobotCat2 extends Cat2 {
    public RobotCat2(){

    }

    public RobotCat2(String name, float cannang, int tuoi, String maulong, float chieucao ){
        super(name, cannang, tuoi, maulong, chieucao);
    }

    public void talk(){
        super.talk();
        System.out.println("xin chao");
    }

    public void batery(){
        
    }

    public static void main(String[] args){
        
    }
}
