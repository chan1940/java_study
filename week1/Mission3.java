import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Mission3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("클린코드(Clean Code)"));
        books.add(new Book("객체지향의 사실과 오해"));
        books.add(new Book("테스트 주도 개발(TDD)"));

//        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
//                new Book("클린코드(Clean Code)"),
//                new Book("객체지향의 사실과 오해"),
//                new Book("테스트 주도 개발(TDD)")
//        ));

        while (true) {
            for (int i = 0; i < books.size(); i++) {
                System.out.print((i + 1) + ". " + books.get(i).getBookname() + " - ");
                books.get(i).print();
            }
            System.out.println("대여할 책 번호 입력.");

            int num = Integer.parseInt(br.readLine()) - 1;

            if (num < 0 || num > 2) {
                System.out.println("종료!!");
                break;
            }
            books.get(num).borrow();
        }
    }
}