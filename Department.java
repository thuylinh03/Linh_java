import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Department extends Employee {
    private String ten_phong;
    private ArrayList<Employee> employees;
, 
    public Department(){

    }

    public Department(String ten, String diachi, String phoneNumber, String ten_phong, String employees){
        super(ten, diachi, phoneNumber);
        this.ten_phong = ten_phong;
        this.employees = new ArrayList<>();
    }

    public String getTen_phong() {
        return ten_phong;
    }

    public void setTen_phong(String ten_phong) {
        this.ten_phong = ten_phong;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    

    public static void main(String[] args){

    }



}
