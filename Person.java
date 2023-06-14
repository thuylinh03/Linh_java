import java.util.Scanner;

public class Person{
    private String ten;
    private int nam_sinh;
    private String gt;
    private double chieu_cao;
    private double can_nang;

    public Person(){

    }

    public Person(String _ten, int _ns, String _gt, double chieucao, double cannang){
        this.ten = _ten;
        this.nam_sinh = _ns;
        this.gt = _gt;
        this.chieu_cao = chieucao;
        this.can_nang = cannang;
    }

    public void setTen(String ten){
        this.ten = ten;
    }


    public void setYear(int nam_sinh){
        this.nam_sinh = nam_sinh;
    }

    public void setGt(String gt){
        this.gt = gt;
    }

    public void setHight(double chieucao){
        this.chieu_cao = chieucao;
    }

    public void setHeavy(double cannang){
        this.can_nang = cannang;
    }

    public String getTen(){
        return ten;
    }

    public int getYear(){
        return nam_sinh;
    }

    public String getGt(){
        return gt;
    }

    public double getHight(){
        return chieu_cao;
    }

    public double getHeavy(){
        return can_nang;
    }

    public int tinh_tuoi(){
        return 2023 - this.nam_sinh;
    }


    public void print_info(){
        System.out.println("Toi la: " + ten + ", nam nay toi: " + tinh_tuoi() + " tuoi. " + "Gioi tinh la: " + gt + " .Chieu cao cua toi la: " + chieu_cao);
    }


public class Family{
    Person papa;
    Person mama;
    Person sis;
    Person me;
    Person ybr;
    int num;

    public Family(){

    }

    public Family(Person _papa, Person _mama, Person _sis, Person _me, Person _ybr, int _num){
        this.papa = _papa;
        this.mama = _mama;
        this.sis = _sis;
        this.me = _me;
        this.ybr = _ybr;
        this.num = _num;
    }

    public void setPapa(Person papa){
        this.papa = papa;
    }

    public void setMama(Person mama){
        this.mama = mama;
    }

    public void setSis(Person sis){
        this.sis = sis;
    }

    public void setMe(Person me){
        this.me = me;
    }

    public void setYbr(Person ybr){
        this.ybr = ybr;
    }


}
    public static void main(String[] args){
        Person papa = new Person("PAPA", 1976, "nam", 155, 70);
        Person mama = new Person("MAMA", 1980, "nu", 150, 47);
        Person sis = new Person("Phuong", 1999, "nu", 160, 48);
        Person me = new Person("Thuy Linh", 2003, "nu", 155, 45);
        Person ybr = new Person("Tuan Anh" , 2009, "nam", 156, 45);
        papa.print_info();
        mama.print_info();
        sis.print_info();
        me.print_info();
        ybr.print_info();
 
    }
}



