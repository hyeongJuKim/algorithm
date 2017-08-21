package main.algorithm.recursion;

/**
 * Recursion Example
 */
public class NQueensProblem {
    private static int N = 4;
    int [] cols = new int [N+1];

    public boolean queens(int level) {
        if (!isPossible(level))
            return false;
        else if (level == N) {
            for (int i=1; i<=N; i++)
                System.out.println("(" + i + "," + cols[i] + ")");
            return true;
        }
        for (int i=1;i<=N; i++){
            cols[level+1] = i;
            if (queens(level+1))
                return true;
        }
        return false;
    }

    private boolean isPossible(int level) {
        for (int i=1; i<level; i++){
            if (cols[i]==cols[level]) // 같은 열인지 검사
                return false;
            else if(level-i == Math.abs(cols[level] - cols[i]))  // 대각선 열인지 검사
                return false;
        }
        return true;
    }
}
