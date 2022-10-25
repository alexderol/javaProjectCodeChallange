package day01;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("erol", 20000,41,2020);
        System.out.println("employee.name = " + employee.name);
        System.out.println("employee.salary = " + employee.salary);

        System.out.println("Odeneceke vergi = " + employee.tax()+" TL");
        System.out.println("employee.bonus() = " + employee.bonus()+" TL");
        System.out.println("employee.raisSalary() = " + employee.raisSalary()+" TL");

        System.out.println("employee.salary+employee.raisSalary() = " + ((employee.salary) + (employee.raisSalary())));


        System.out.println("employee.toString() = " + employee.toString());// en son toString methodu ile yazdırdık yukarıdaki gibi de olur ama task böyle istedi



    }
}
