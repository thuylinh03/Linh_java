import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> s = new HashSet<String>();

        System.out.println("Nhap chuoi ki tu: ");
        String input = sc.nextLine();
        while(!input.equals(input)){
            s.add(input);
            input = sc.nextLine();
        }

        System.out.println("Sau khong trung la: ");
        for (String x : s) {
            System.out.println(x);
        }
    }
}