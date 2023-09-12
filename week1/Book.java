public class Book {
    private String bookname;
    private boolean isBorrowed;

    public Book(String name) {
        this.bookname = name;
        this.isBorrowed = false;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (!isBorrowed()) {
            System.out.println("정상적으로 대여 완료");
            setBorrowed(true);
        } else {
            System.out.println("대여 불가능");
        }
    }

    public void print() {
        if (!isBorrowed()) {
            System.out.println("대여 가능");
        } else {
            System.out.println("대여 중");
        }
    }
}
