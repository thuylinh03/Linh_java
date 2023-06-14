public class Employeee {
    private int id;
    private static int count=0;
    private String firstName;
    private String lastName;
    private int salary;
    private int yearExp;
    public Employeee(){
        count++;
        this.id=count;
        this.firstName=this.lastName="";
        this.salary=0;
        this.yearExp=0;
    }
    public Employeee(String a, String b, int salary, int yearExp){
        count++;
        this.id =count;
        this.firstName=a;
        this.lastName=b;
        this.salary=salary;
        this.yearExp=yearExp;
    }
    /*
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id=sc.nextInt();
        System.out.print("First Name: ");
        this.firstName=sc.nextLine();
        System.out.print("Last Name: ");
        this.lastName=sc.nextLine();
        System.out.print("Salary: ");
        this.salary=sc.nextInt();
        System.out.print("Exp(year): ");
        this.yearExp=sc.nextInt();
    }
*/

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
     public void setFName(String fname){
        this.firstName=fname;
    }
    public void setLName(String lname){
        this.lastName=lname;
    }
    public String toString(){
        //System.out.printf("Employee[id=%d,name=%s,salary=%d]",this.getID(), this.getName(),this.getSalary());
        String info = "ID:"+Integer.toString(this.getID())+"\t ho ten:"+this.getName()+"\t luong:"+this.getSalary()+"\t nam ct:"+Integer.toString(this.getYearExp());
        return info;
    }

    public static void main(String[] args){

    }

    
}
