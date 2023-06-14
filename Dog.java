import java.util.Scanner;

public class Dog extends Animal{
    private int can_nang;

    public Dog(int can_nang){
        this.can_nang = can_nang;
    }

    public int getCan_nang() {
        return can_nang;
    }

    public void setCan_nang(int can_nang) {
        this.can_nang = can_nang;
    }
    
}
