package io.w1ldy0uth.codeforces.Team;

import java.util.*;
import java.util.regex.*;

public class TeamTask {
    // Auxiliary method for running on codeforces.com. Use solve() method for testing
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int tasksNumber = Integer.valueOf(sc.nextLine());
        
        int totalSolvedTasks = 0;
        List<Integer> agreeFlags = new ArrayList<Integer>();
        for (int i = 0; i < tasksNumber; i++) {
            String taskAgreeFlags = sc.nextLine();
            Matcher matcher = Pattern.compile("\\d+").matcher(taskAgreeFlags);
            while (matcher.find()) 
                agreeFlags.add(Integer.valueOf(matcher.group()));
            int agreementScore = sum(agreeFlags);
            if (agreementScore >= 2)
                totalSolvedTasks++;
            agreeFlags.clear();
        }

        sc.close();
        System.out.println(totalSolvedTasks);
    }

    private static int sum(List<Integer> array) {
        int totalSum = 0;;
        for (int element : array) {
            totalSum += element;
        }
        return totalSum;
    }
}
