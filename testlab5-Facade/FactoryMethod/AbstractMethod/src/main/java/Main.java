import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello there!\n What restaraunt do you prefer?\n1 for Dodo\n2 for Domino");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();

        ProductsOrderingdViaMobile.orderProduct(answer);
    }
}
