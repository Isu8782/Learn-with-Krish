package model;

public class Test {

    public static void main(String args[]){
        Employee emp1=new Employee("Emp001","EC001","Isuri","967456785V","Horana");
        Employee emp2=new Employee("Emp002","EC002","Kasuni","977456785V","Udawalawa");

        boolean result1=emp1.equals(emp2);
        System.out.println("Employee1 equals Employee2 : "+result1);

        System.out.println("***************************************");

        System.out.println("First Employee : "+emp1);
        System.out.println("Second Employee : "+emp2);

        System.out.println("***************************************");

        emp2.setEmpId("Emp001");
        emp2.setEmpCode("EC001");
        boolean result2 = emp1.equals(emp2);
        System.out.println("Employee1 equals Employee2 : "+result2);

        System.out.println("***************************************");

        System.out.println("First Employee : "+emp1);
        System.out.println("Second Employee : "+emp2);
    }
}
