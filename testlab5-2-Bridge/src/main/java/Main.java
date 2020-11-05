public class Main {

    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new KotlinDeveloper())
        };

        for(Program program: programs){
            program.developProgram();
        }
    }
}
