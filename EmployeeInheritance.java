import java.util.Scanner;


public class EmployeeInheritance {
    
    public static void main(String[] args) {
        Officer officer = new Officer();
        Manager manager = new Manager();
        officer.getDetails();
        manager.getDetails();
        officer.printDetails();
        manager.printDetails();
    }
}

class Employee{
    String name, address;
    int age, ph_no;
    float salary;

    void printSalary(){
        System.out.println("Salary:         "+ salary);
    }
}

class Officer extends Employee{
    String specialization, department;

    void getDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----Officer----");
        System.out.print("Enter the name: ");
        name = scan.nextLine();
        System.out.print("Enter the address: ");
        address = scan.nextLine();
        System.out.print("Enter the specialization: ");
        specialization = scan.nextLine();
        System.out.print("Enter the department: ");
        department = scan.nextLine();
        System.out.print("Enter the age: ");
        age = scan.nextInt();
        System.out.print("Enter the ph_no: ");
        ph_no = scan.nextInt();
        System.out.print("Enter the salary: ");
        salary = scan.nextFloat();
    }

    void printDetails(){
        System.out.println("\n----Officer----");
        System.out.println("Name:           "+name);
        System.out.println("Address:        "+address);
        System.out.println("Specialization: "+specialization);
        System.out.println("Department:     "+department);
        System.out.println("Age:            " + age);
        System.out.println("Phone Number:   " + ph_no);
        printSalary();
    }
}

class Manager extends Employee{
    String specialization, department;

    void getDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("----Manager----");
        System.out.print("Enter the name: ");
        name = scan.nextLine();
        System.out.print("Enter the address: ");
        address = scan.nextLine();
        System.out.print("Enter the specialization: ");
        specialization = scan.nextLine();
        System.out.print("Enter the department: ");
        department = scan.nextLine();
        System.out.print("Enter the age: ");
        age = scan.nextInt();
        System.out.print("Enter the ph_no: ");
        ph_no = scan.nextInt();
        System.out.print("Enter the salary: ");
        salary = scan.nextFloat();
    }

    void printDetails(){
        System.out.println("\n----Manager----");
        System.out.println("Name:           "+name);
        System.out.println("Address:        "+address);
        System.out.println("Specialization: "+specialization);
        System.out.println("Department:     "+department);
        System.out.println("Age:            " + age);
        System.out.println("Phone Number:   " + ph_no);
        printSalary();
    }
}
