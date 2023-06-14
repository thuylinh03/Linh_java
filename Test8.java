import java.util.ArrayList;
import java.util.Comparator;

class Worker {
    private String name;
    private double salaryPerday;
    private int workday;

    public Worker(){
        
    }

    public Worker(String name, double salaryPerday, int workday) {
        this.name = name;
        this.salaryPerday = salaryPerday;
        this.workday = workday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerday() {
        return salaryPerday;
    }

    public void setSalaryPerday(double salaryPerday) {
        this.salaryPerday = salaryPerday;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public String toString(){
        return "Ten: " + name + "   .Luong: " + salaryPerday*workday;
    }

    public void inthongtin(){
        System.out.println("Ten: " + name);
        System.out.println("Luong: " + salaryPerday*workday);
    }
}

class DoWork extends Worker{
    public void display(ArrayList<Worker> arrList){
        for (Worker worker : arrList) {
            System.out.println(worker);
            // C2: System.out.println(worker.getName() + "\n" + worker.getSalaryPerday()*worker.getWorkday());
            // C3: worker.inthongtin();
        }
    }

    public void add(ArrayList<Worker> arrList){
        Worker w6 = new Worker("Minh Chau", 10.0, 10);
        arrList.add(w6);

        // for (Worker worker : arrList) {
        //     System.out.println(worker);
        // }

        double min = arrList.get(0).getSalaryPerday();
        for(int i=0; i<arrList.size(); i++){
            if(arrList.get(i).getSalaryPerday()<min){
                min = arrList.get(i).getSalaryPerday();
            }
        }

        int index = 0;
        for(int i=0; i<arrList.size(); i++){
            if(arrList.get(i).getSalaryPerday()==min){
                index = i;
            }
        }
        arrList.add(index+1, w6);

        for (Worker worker : arrList) {
            System.out.println(worker);
        }
    }

    public void update(ArrayList<Worker> arrList, int index){

    }

    public void delete(ArrayList<Worker> arrList, int index){
        Worker w = new Worker("Thuy Linh", 20, 7);
        arrList.remove(w);

        for (Worker worker : arrList) {
            System.out.println(worker);
        }
    }

    public ArrayList<Worker> list5 (ArrayList<Worker> arrList){
        Collections.sort(arrList, new Comparator<Worker>() {

            @Override
            public int compare(Worker o1, Worker o2) {
                // TODO Auto-generated method stub
                double tong1 = o1.getSalaryPerday() * o1.getWorkday();
                double tong2 = o2.getSalaryPerday() * o2.getWorkday();

                if(tong1 > tong2){
                    return -1;
                }else if(tong1 == tong2){
                    return 0;
                } else{
                    return 1;
                }
            }
            
        });

        ArrayList<Worker> top5 = new ArrayList<>();
        for(int i=0; i<5; i++){
            top5.add(arrList.get(i));
        }
        return top5;
    }
}

public class Test8{
    public static void main(String[] args){
        ArrayList<Worker> arrayList = new ArrayList<>();
        Worker w1 = new Worker("Thuy Linh", 20.0, 7);
        Worker w2 = new Worker("Quynh Anh", 15.0, 12);
        Worker w3 = new Worker("Xuan Mai", 18.0, 8);
        Worker w4 = new Worker("Tuan Anh", 15.0, 9);
        Worker w5 = new Worker("Thanh Phuong", 30.0, 10);
        arrayList.add(w1);
        arrayList.add(w2);
        arrayList.add(w3);
        arrayList.add(w4);
        arrayList.add(w5);
        DoWork d = new DoWork();
        //d.display(arrayList);
        arrayList.add(d);
        d.display(arrayList);
        //d.inthongtin();
    }

    // public interface Worker{
    //     public void display(ArrayList<Worker> arrList);
    //     public void add(ArrayList<Worker> arrList);
    //     public void update(ArrayList<Worker> arrList, int index);
    //     public void delete(ArrayList<Worker> arrList, int index);
    //     public ArrayList<Worker> list5 (ArrayList<Worker> arrList); tra ve 5 worker co luong cao nhat
    // }
}
    