public class CheckingAccount extends Account implements Taxable {

    //constructor
    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void depositCash(double value) {
        super.balance += value;
    }
}