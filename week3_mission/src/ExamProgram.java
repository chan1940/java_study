import java.util.Scanner;

public class ExamProgram {
    Scanner sc = new Scanner(System.in);
    private int level;
    private int hscore;
    private int cscore;
    private int jscore;
    private double avg;
    public ExamProgram(){

    }
    public void execute() {
        inputScore();
        isSuccess();
        searchMax();
        searchMin();
        printAvg();
    }

    public void isSuccess(){
        int sum = hscore + cscore + jscore;
        avg = (double) sum / 3;
        int sum1 = hscore + cscore;
        int sum2 = cscore + jscore;
        int sum3 = hscore + jscore;
        if(level == 1 || level == 2){
            if (avg >= 60 || sum1 == 200 || sum2 == 200 || sum3 == 200) {
                System.out.println("합격.");
            } else {
                System.out.println("불합격.");
            }
        }
        else {
            if (avg >= 70 || sum1 == 200 || sum2 == 200 || sum3 == 200) {
                System.out.println("합격.");
            } else {
                System.out.println("불합격.");
            }
        }
    }
    public void printAvg(){
        System.out.println("전체 과목 평균은 "+avg);
    }
    public void searchMax() {
        int max = hscore;
        //질문 : 얘는 private으로 안해줬는데 클래스에서
        //사용하는 모든 변수들을 private으로 선언하는 게 좋은가?
        //지역 변수라서 여기서만 써도 되는 경우는 이렇게 써도 될까?
        if (max < cscore)
            max = cscore;
        if (max < jscore)
            max = jscore;
        System.out.println("전체 과목 중 최고점은 "+max);
    }

    public void searchMin() {
        int min = hscore;
        if (min > cscore)
            min = cscore;
        if (min > jscore)
            min = jscore;
        System.out.println("전체 과목 중 최저점은 "+min);
    }
    public void inputScore() {
        System.out.println("몇 기인지 입력.");
        level = sc.nextInt();
        System.out.println("HTML 점수.");
        hscore = sc.nextInt();
        System.out.println("CSS 점수.");
        cscore = sc.nextInt();
        System.out.println("Javascript 점수.");
        jscore = sc.nextInt();
    }
}

