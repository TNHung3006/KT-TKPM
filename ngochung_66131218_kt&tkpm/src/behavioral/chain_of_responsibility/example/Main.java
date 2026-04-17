package behavioral.chain_of_responsibility.example;

public class Main {
    public static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        System.out.println("--Xin mua chuot may tinh--");
        teamLead.processRequest(5000);
        System.out.println("--Xin mua Macbook Pro--");
        teamLead.processRequest(30000);
        System.out.println("--Xin mua Macbook Pro--");
        teamLead.processRequest(100000);
        System.out.println("--Xin mua lai cong ty--");
        teamLead.processRequest(500000);
    }
}
