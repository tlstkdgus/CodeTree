import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isStart = true;
            if (words[i].length() < t.length()) {
                isStart = false;
            } else {
                for (int j = 0; j < t.length(); j++) {
                    if (words[i].charAt(j) != t.charAt(j)) {
                        isStart = false;
                        break;
                    }
                }
            }

            if (isStart) {
                answer.add(words[i]);
            }
        }

        String[] result = answer.toArray(new String[0]);
        Arrays.sort(result);

        System.out.println(result[k - 1]);
    }
}