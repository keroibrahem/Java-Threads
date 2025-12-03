import Task1.*;
public class App {
    public static void main(String[] args) throws Exception {
        //frist task
        BankAccount account = new BankAccount(1000);
        Thread depositThread =new Thread( ()->{
            for(int i=0 ; i<=200 ; i++){
                account.deposit(3000);
                System.out.println("Deposited: 3000");
                System.out.println("Current Balance: " + account.getBalance());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread withdrawThread =new Thread( ()->{
            for(int i=0 ; i<=200 ; i++){
                try {
                    account.withdraw(2000);
                    System.out.println("Withdrew: 2000");   
                    System.out.println("Current Balance: " + account.getBalance());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        depositThread.start();
        withdrawThread.start();
        try{
            depositThread.join();
            withdrawThread.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Balance: " + account.getBalance());
        System.out.println("----------------end task1------------------");
    }
}
