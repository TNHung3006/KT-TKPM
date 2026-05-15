package behavioral.statepattern.CF2;

public interface ATMState {
    //hanh vi rut tien
    void withdraw(ATMMaChine context, int amount);
}
