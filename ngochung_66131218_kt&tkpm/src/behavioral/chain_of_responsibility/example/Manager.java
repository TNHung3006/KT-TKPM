package behavioral.chain_of_responsibility.example;

public class Manager extends Approver{
    @Override
    public void processRequest(double amount) {
        if (amount > 10000 && amount <= 50000){
            System.out.println("Manager da duyet chi tieu: "+amount+"$");
        } else if (nextApprover != null) {
            System.out.println("Manager khong du quyen, " + "chuyen len giam doc...");
            nextApprover.processRequest(amount);
        }
    }
}
