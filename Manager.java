import java.util.Scanner;
public class Manager {
    private int id;
    private static int count=0;
    private String firstName;
    private String lastName;
    private int salary;
    private int yearExp;
    private final int MAXNV=5;
    private Employeee[] team= new Employeee[MAXNV];
    private int numNV=0;
    public Manager(){
        count++;
        id=count; 
        firstName="not set"; 
        lastName="not set";
        salary =0;
        yearExp=0;
      //  this.team = new Employee[MAXNV];
    }
    public Manager(String a, String b, int salary, int yearExp){
        count++;
        this.id=count;
        this.firstName=a;
        this.lastName=b;
        this.salary=salary;
        this.yearExp=yearExp;
        this.team = new Employeee[20];
    }
    public Manager(String a, String b, int salary, int yearExp, Employeee[] _team){
        count++;
        this.id=count;
        this.firstName=a;
        this.lastName=b;
        this.salary=salary;
        this.yearExp=yearExp;
        this.team = _team;
        this.setNVfromTeam();
    }
    public void setnumNV(int numNV){
        if(numNV + this.getTeam().length >MAXNV){
            System.out.printf("Vuot qua so NV toi da cua mot team, chi duoc them %d NV\n"+(20-this.getTeam().length-1));
        }
        else this.numNV = numNV;
    }
    public int getnumNV(){
        return numNV;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName+' '+this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int a){
        this.salary=a;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    
    public void setTeam(Employeee[] newteam){
        this.team=newteam;
    }
    public Employeee[] getTeam(){
        return this.team;
    }
    
    public int raiseSalary(int a){
        this.salary*=a/100;
        return this.salary;
    }
    public int getYearExp(){
        return this.yearExp;
    }
    public void setYearExp(int a){
        this.yearExp=a;
    }
    
    public String toString(){
        //System.out.printf("Employee[id=%d,name=%s,salary=%d]",this.getID(), this.getName(),this.getSalary());
        return "ID:"+Integer.toString(this.getID())+"\t ho ten:"+this.getName()+"\t luong:"+this.getSalary()+"\t nam ct:"+Integer.toString(this.getYearExp());
    }
    public void addEmployee(Employeee b){
     /*
        for(int i=0;i<10;i++){
            if(this.team[i]==null){
                this.team[i]=b;
                break;
            }
        }
        */
        int len=this.getTeam().length;
        this.team[len] = b;
    }
    public void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim kiem theo:\n1-ID\n2-Ten\n3-Luong");
        int a=sc.nextInt();
        switch (a) {
            case 1: {
                System.out.println("Nhap ID can tim: ");
                int b = sc.nextInt();
                if (this.getID() == b) {
                    System.out.println("Tim thay:"+this.toString());
                }
                for (int i = 0; i < this.team.length; i++) {
                    if (this.team[i] == null) break;
                    else if (this.team[i].getID() == b) {   
                        System.out.println("Tim thay:"+this.team[i].toString());
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Nhap ten can tim: ");
                String s = sc.nextLine();
                if (this.getFirstName().equals(s) || this.getLastName().equals(s) || this.getName().equals(s)) {
                    System.out.println("Tim thay:"+this.toString());
                }
                for (int i = 0; i < this.team.length; i++) {
                    if (this.team[i] == null) break;
                    else if (this.getFirstName().equals(s) || this.getLastName().equals(s) || this.getName().equals(s)) {
                         System.out.println("Tim thay:"+this.team[i].toString());
                    }
                }
            }
            case 3: {
                System.out.println("Nhap so luong can tim: ");
                int c = sc.nextInt();
                if (this.getSalary() == c) {
                    System.out.println("Tim thay:"+this.toString());
                }
                for (int i = 0; i < this.team.length; i++) {
                    if (this.team[i] == null) {
                        break;
                    }
                    else 
                    if (this.team[i].getSalary() == c) {   
                         System.out.println("Tim thay:"+this.team[i].toString());
                    }
                }
            }
        }
    }
    public void setFName(String fname){
        this.firstName=fname;
    }
    public void setLName(String lname){
        this.lastName=lname;
    }
    public void retired(){
        if(this.getYearExp()>=30) System.out.println(this.getName());
        for (int i = 0; i < this.team.length; i++) {
            if(this.team[i]==null){
                break;
            }
            if(this.team[i].getYearExp()>=30){
                System.out.println(this.getName());
            }
        }
    }
    public void printEE(){
    
        System.out.println("Nhom nhan vien duoc quan ly:");
        for(int i=0; i<this.getnumNV();i++)
        {
            System.out.println(this.team[i].toString());
        }
    }
    public void setNVfromTeam(){
        int count=0;
        Employeee[]temp=this.getTeam();
        for(int i=0;i<this.getTeam().length;i++){
            if(temp[i]==null){break;}
            else count++;
        }
        this.setnumNV(count);
    }
    public void nhap(Scanner sc){
       // System.out.print("ID: ");
        System.out.print("First Name: ");
        this.setFName(sc.nextLine());
        System.out.print("Last Name: ");
        this.setLName(sc.nextLine());
        System.out.print("Salary: ");
        this.setSalary(Integer.parseInt(sc.nextLine()));
        System.out.print("Exp(year): ");
        this.setYearExp(Integer.parseInt(sc.nextLine()));
    }

    public static void main(String[] args){

    }
}
