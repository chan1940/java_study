import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Oracle();
        db.select();
        db.insert();
        db.delete();
        db.update();
    }
}
