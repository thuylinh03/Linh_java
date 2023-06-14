import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<Employee>();
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            Department d = new Department();
            
            d.addEmployee(d);
        }
    }
}
