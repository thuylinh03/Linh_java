import java.util.*;
abstract class Phone{
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name, String phone);
    abstract void updatePhone(String name, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();
}

class PhoneBook extends Phone{
    List<String> PhoneList = new ArrayList<String>();

    void insertPhone(String name, String phone){
        for( int i=0; i<PhoneList.size(); i++){
            if(PhoneList.get(i).split(":")[0].equalsIgnoreCase(name)){
                if(!PhoneList.get(i).split(":")[1].equalsIgnoreCase(phone)){
                    PhoneList.set(i, PhoneList.get(i) + ":" + phone);
                }
                return;
            }
        }
        PhoneList.add(name + ":" + phone);
    }

    void removePhone(String name){
        for(int i=0; i<PhoneList.size(); i++){
            if(PhoneList.get(i).split(":")[0].equalsIgnoreCase(name)){
                PhoneList.remove(i);
            }
        }
    }

    void updatePhone(String name, String newPhone){
        for(int i=0; i<PhoneList.size(); i++){
            if(PhoneList.get(i).split(":")[0].equalsIgnoreCase(name)){
                PhoneList.set(i, name + ":" + newPhone);
                return;
            }
        }
    }

    void searchPhone(String name){
        for(int i=0; i<PhoneList.size(); i++){
            if(PhoneList.get(i).split(":")[0].equalsIgnoreCase(name)){
                System.out.println(PhoneList.get(i));
                return;
            }
        }
        System.out.println("Ten khong duoc tim thay");
    }

    void sort(){
        Collections.sort(PhoneList);
        for(int i=0; i<PhoneList.size(); i++){
            System.out.println(PhoneList.get(i));
        }
    }

    @Override
    void removePhone(String name, String phone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePhone'");
    }
}


public class ManagePhoneBook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();
        
        int a;
        do{
            a = sc.nextInt();
        
            switch(a){
            case 1:
                System.out.println("Nhap ten: ");
                String name = sc.next();
                System.out.println("Nhap so dien thoai: ");
                String phone = sc.next();
                pb.insertPhone(name,phone);
                break;
            
            case 2:
                System.out.println("Nhap ten: ");
                String name1 = sc.next();
                pb.removePhone(name1);
                break;

            case 3:
                System.out.println("Nhap ten: ");
                String name3 = sc.next();
                System.out.println("Nhap so dien thoai moi: ");
                String  newphone = sc.next();
                pb.updatePhone(name3, newphone);
                break;
            
            case 4:
                System.out.println("Nhap ten: ");
                String name4 = sc.next();
                pb.searchPhone(name4);
                break;

            case 5:
                System.out.println("Nhap ten: ");
                String name5 = sc.next();
                pb.searchPhone(name5);
                break;

            case 6:
                pb.sort();
                break;
                
            case 7:
                System.out.println("Chuong trinh ket thuc!");
                break;

            default:
                System.out.println("Gia tri khong dung. Vui long nhap lai!");
                break;
            }
        } while(a != 7);
    }
}
        
