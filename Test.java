import java.util.Scanner;


class Tugiac{
    protected Diem d1, d2, d3, d4;
    public void setD1(Diem _d1){
        d1 = _d1;
    }
    public Diem getD1(){
        return d1;
    }
    public void printTuGiac(){
        System.out.println(d1);
    }

class Hinhcn extends Tugiac{
        public void Hinhcn(){
            d1 = new Diem(0,0);
            d2 = new Diem(0,1);
            d3 = new Diem(1,0);
            d4 = new Diem(1,1);
        }
    }
}

public class Test{
    public static void main(String args[]){
        Hinhcn cn = new Hinhcn();
        cn.
    }
}




