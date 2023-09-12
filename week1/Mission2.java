import java.io.*;
import java.util.*;

public class Mission2 {
    //hashmap 을 이용해서 선수 번호와 달리기 기록을 엮으면 되겠다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Map<Integer, Double> map = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Double> run = new ArrayList<>();

        int count = 0;
        while (true) {

            bw.write("선수의 번호를 입력하세요." + "\n");
            bw.flush();

            String input = br.readLine();
            if (input.equals("print")) {
                break;
            }

            int number = Integer.parseInt(input);

            bw.write("이 선수의 100m 달리기 기록은 몇 초?" + "\n");
            bw.flush();
            double runtime = Double.parseDouble(br.readLine());

            if (!map.containsKey(number)) {
                map.put(number, runtime);
            }

            count++;
        }

        map.forEach((key, value) -> {
            num.add(key);
            run.add(value);
        });

        double min = run.get(0);
        //최소값은 내장함수 활용해도 됨.
        int score = 0;
        for (int i = 0; i < run.size(); i++) {
            if (min > run.get(i)) {
                min = run.get(i);
                score = num.get(i);
            }
        }

        bw.write("1등 : " + score + "번 선수 / " + Math.round(min * 100) / 100.0 + "초");
        bw.write(" (참가인원 : " + count + "명)");

        bw.flush();
        bw.close();
    }
}
