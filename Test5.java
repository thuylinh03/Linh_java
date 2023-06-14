import java.util.Scanner;

class Employeesss {
    private int id;
    private String fname;
    private String lname;
    private int luong;
    private int nam;
    public Employeesss(){

    }
    public Employeesss(int id, String fname, String lname, int luong, int nam){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.luong = luong;
        this.nam = nam;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public int getId(){
        return id;
    }

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }

    public void setSalary(int luong){
        this.luong = luong;
    }

    public int getSalary(){
        return luong*12;
    } 

    public void setYear(int nam){
        this.nam = nam;
    }

    public int getYear(){
        return nam;
    }

    public String getName(){
        return this.fname + this.lname;
    }

    @Override
    public String toString() {
        return "Employeesss [id=" + id + ", fname=" + fname + ", lname=" + lname + ", luong=" + luong + ", nam=" + nam
                + "]";
    }
    public void print_info(){
        System.out.println("ID: " + id + " .Name=: " + getName() +  " .Luong: " + luong + " .Nam: " + nam);
    }

    public int raiseSalary(int percent){
        this.luong *= percent/100;
        return this.luong;
    }

    public void tang_luong(){
        if(nam == 2){
            System.out.println("Tang them 5% luong: " + raiseSalary(5/100));
        } else if(nam == 5){
            System.out.println("Tang them 10% luong: " + raiseSalary(10/100));
        } else if(nam == 7){
            System.out.println("Tang them 15% luong: " + raiseSalary(15/100));
        } else if(nam >= 10){
            System.out.println("Tang them 20% luong: " + raiseSalary(20/100));
        }
    }
}
class Manager{
    private int id;
    private String fname;
    private String lname;
    private int luong;
    private int nam;

    public Manager(){

    }

    public Manager(int id, String fname, String lname, int luong, int nam){
        this.id = id;
        this.
    }
}
    






