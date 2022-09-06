package model;

public class BankCustomer implements Runnable{

    private BankAccount account;

    public BankCustomer(BankAccount account){
        this.account = account;
    }

    @Override
    public void run(){
        for(int x=1; x<10; x++){
            withdraw(5000);

            if(account.getBalance()>=0){
                System.out.println("Out of cash.");
            }
        }
    }

    public void withdraw(int amount){

        if(account.getBalance()>=amount){

            System.out.println(Thread.currentThread().getName()+amount);

            try{
              Thread.sleep(2000);
              account.setBalance(amount);
              System.out.println(Thread.currentThread().getName()+amount+", Remain : "+account.getBalance());

            }catch (InterruptedException e){
                System.out.println("Server error, Thank you.");
            }
        }else{
            System.out.println("Your balance is less than your request.");
        }
    }
}
