public class Main {

    public static void main(String[] args) {
        Account account = new Account("1234567891234", "박재성");
        // 2만원 입금
        account.deposit(30000);
        // 1만원 인출
        account.withdraw(10000);
        // 계좌번호 조회하기
        System.out.println("계좌번호 : " + account.getAccountNumber());
        // 잔액 조회하기
        System.out.println("잔액 : " + account.getBalance());
    }
}