package behavioral.chain_of_responsibility.example;

public class Director extends Approver{
    @Override
    public void processRequest(double amount) {
        if(amount > 50000 && amount <= 200000){
            System.out.println("Director da duyet chi tieu: "+ amount + "$");
        }else {
            System.out.println("So tien qua lon, khong duyet...");
        }
    }
}
