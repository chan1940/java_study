import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Mission1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. ");
        System.out.println("학생들을 다 입력했다면, print라고 입력.");

        ArrayList<String> str = new ArrayList<>();

        for (; ; ) {
            String name = sc.nextLine();

            if (name.equals("print")) {
                break;
            }

            if (Pattern.matches("^[a-zA-z]*$", name)) {
                System.out.println("학생의 이름은 한글로만 입력.");
            } else {
                str.add(name);

            }
        }

        Collections.sort(str);

        for (String s : str) {
            System.out.println(s);
        }
    }
}