public class Detail {

    public static void main(String[] args) {
        Employee.Builder builder=new Employee.Builder(1,"isuriamasarani@gmail.com");
        builder.setName("Isuri Amasarani"); builder.setMobile(772345382);
        Employee employee= builder.build();
        System.out.println(employee);
    }
}
