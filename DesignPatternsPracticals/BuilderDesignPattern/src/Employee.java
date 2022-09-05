public class Employee {

    private final int id;
    private final String name;
    private final String email;
    private final int mobile;

    public Employee(Builder builder){

        this.id=builder.id;
        this.email=builder.email;
        this.name=builder.name;
        this.mobile=builder.mobile;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    static class Builder{

        private int id;
        private String name;
        private String email;
        private int mobile;

        public Employee build(){
            Employee employee=new Employee(this);
            return employee;

        }

        public Builder(int id,String email){

            this.id=id;
            this.email=email;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setMobile(int mobile) {
            this.mobile = mobile;
        }
    }

}
