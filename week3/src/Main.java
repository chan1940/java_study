import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ScientificCalculator cal = new ScientificCalculator();

        double M = Double.parseDouble(br.readLine());
        double N = Double.parseDouble(br.readLine());
        System.out.println(cal.add(M, N));
        System.out.println(cal.minus(M, N));
        System.out.println(cal.multiply(M, N));
        System.out.println(cal.divide(M, N));


    }
}
