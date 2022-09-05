public class Test {

    public static void main(String[] args) {

        Phone phone=new Phone(4,128,"Apple");

        System.out.println(phone.toString());

        Phone cloneObj=phone.clone();
        System.out.println(cloneObj.toString());

        cloneObj.setRam(8);
        System.out.println(cloneObj);

        System.out.println(phone.toString());



    }

}