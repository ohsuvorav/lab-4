public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        System.out.println(developer.writeCode());
    }}
