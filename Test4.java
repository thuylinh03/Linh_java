import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
    private ArrayList<String> list = new ArrayList<>();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ho ten: ");
            String ten = sc.nextLine();

            if(ten.isEmpty()){
                break;
            }
            list.add(ten);
        } while(true);
    }

    public void hien_thi(){
        for (String item : list) {
            System.out.println(item);
        }
    }



    

    public static void main(String[] args){
        Test4 t = new Test4();
        t.nhap();
        t.hien_thi();

    }
}
