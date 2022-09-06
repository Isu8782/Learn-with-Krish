package model;

public class ATM {

    public static void main(String[] args){

        BankAccount account=new BankAccount();
        BankCustomer customer=new BankCustomer(account);
        Thread cust1=new Thread(customer);
        Thread cust2=new Thread(customer);

        cust1.setName("Sachini");
        cust2.setName("Hashini");

        cust1.start();
        cust2.start();
    }
}
