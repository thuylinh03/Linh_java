import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXEE=5;
        int countNV=0;
       
     /*  Manager a = new Manager();
       Manager b = new Manager();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Quan ly a: ");
       a.nhap(sc);
      
       for (int i = 0; i <2; i++) {
           System.out.printf("Nhan vien thu %d:", i+1);
           l[i] = new Employee();
           nhap(sc, l[i]);
           a.addEmployee(l[i]);
       }
       System.out.println("Quan ly b: ");
       b.nhap(sc);
       for (int i =2; i < 4; i++) {
           System.out.printf("Nhan vien thu %d:", i+1);
           l[i] = new Employee();
           nhap(sc, l[i]);
           b.addEmployee(l[i]);
       }
       */
       System.out.println("Nhap thong tin nhan vien TEAM c:");
      // Employee[] tmp= new Employee[MAXEE];
      // int j=0;
        Employeee[] l = new Employeee[MAXEE];
        /*Nhap nhan vien team A*/
        int countNVA=0;
        /*Nhap nhan vien team B*/
        int countNVB=0;
        /*Nhap nv team C*/
        int countNVC=0;
       System.out.println("So nv TEAM c:");
       countNVC=Integer.parseInt(sc.nextLine());
       for (int i =countNVA+countNVB; i < countNVC; i++) {
           System.out.printf("Nhan vien thu %d:", i+1);
           l[i] = new Employeee();
           nhap(sc, l[i]);
       }
       countNV = countNVA+countNVB+countNVC;
       System.out.println("In ds nv C:");
         for (int i =countNVA+countNVB; i < countNVC; i++) {
           System.out.printf("NV %d:", i+1);
           System.out.println(l[i].toString());
       }
       Employeee[] teamC = new Employeee[countNVC];
       for(int i=0; i<countNVC;i++){
           teamC[i]=l[countNVA+countNVB+i];
       }
       System.out.println("Quan ly c: ");
       Manager c= new Manager("Nguyen Van","A",1000,10,teamC);
        System.out.println("So NV c ql:"+c.getnumNV());
       System.out.println("Thong tin quan ly cs:");
       System.out.println(c.toString());
       c.printEE();

   }
   public static void nhap(Scanner sc, Employeee e){
      // System.out.print("ID: ");
       System.out.print("First Name: ");
       e.setFName(sc.nextLine());
       System.out.print("Last Name: ");
       e.setLName(sc.nextLine());
       System.out.print("Salary: ");
       e.setSalary(Integer.parseInt(sc.nextLine()));
       System.out.print("Exp(year): ");
       e.setYearExp(Integer.parseInt(sc.nextLine()));
   }
}
