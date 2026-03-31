public class BankAccount implements Runnable{
    private  String accountHolder;
    private  String accountType;

    public BankAccount(String accountHolder,String accountType){
        this.accountHolder=accountHolder;
        this.accountType=accountType;
    }

    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println("User:"+Thread.currentThread().getName()+ " Type:"+accountType+ " Priority:"+Thread.currentThread().getPriority()+ " Checking balance:" +i);

            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
