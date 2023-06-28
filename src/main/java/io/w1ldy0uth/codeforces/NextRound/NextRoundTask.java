package io.w1ldy0uth.codeforces.NextRound;

import java.io.*;

public class NextRoundTask {
    // Auxiliary method for running on codeforces.com. Use solve() method for
    // testing
    public static void main(String[] args) {
        try {
            solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] initialConstants = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(initialConstants[0]), k = Integer.parseInt(initialConstants[1]);

        int totalWinners = 0;
        String[] contestantsValues = br.readLine().trim().split("\\s+");
        int kthPlaceScore = Integer.parseInt(contestantsValues[k - 1]);
        for (int i = 0; i < n; i++) {
            int currentScore = Integer.parseInt(contestantsValues[i]);
            if (currentScore >= kthPlaceScore && currentScore > 0)
                totalWinners++;
        }

        System.out.println(totalWinners);
    }
}
