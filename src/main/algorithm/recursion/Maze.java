package main.algorithm.recursion;

/**
 * 미로찾기.(Recursion으로 하기)
 * 현재 위치에서 출구까지 가는 경로가 있으려면
 * 1. 현재 위치가 출구이거나 혹은
 * 2. 이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있거나.
 *
 * 현재 위치가 출구면 return true
 * 현재 위치가 출구가 아니면 이웃한 셀들로 이동
 *  - 이미 방문한 곳은 pass
 *  - 벽은 pass
 *
 */
public class Maze {

    private static int N=8;
    private static int [][] maze = {
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };

    private static final int PATHWAY_COLOUR = 0; // white. 출구로 가는 경로가 될 가능성이 있는 cell.
    private static final int WALL_COLOUR = 1;   // blue. 출구까지의 경로상 있지 않음이 밝혀진 cell.
    private static final int BLOCKED_COLOUR = 2;//red. 방문해봤지만 이쪽으로 가는 길이 없는 cell.
    private static final int PATH_COLOUR = 3;   //green. 방문해봤지만 아직까지 이쪽으로 가면 출구가 있을지 없을지 알 수 없는 cell.

    public boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N)
            return false;
        else if (maze[x][y] != PATHWAY_COLOUR)
            return false;
        else if (x == N-1 && y == N-1) {
            maze[x][y] = PATHWAY_COLOUR;
            return true;
        } else {
            maze[x][y] = PATH_COLOUR;
            if (findMazePath(x - 1, y) || findMazePath(x, y + 1)
                  || findMazePath(x + 1, y) || findMazePath(x, y - 1))
                return true;
        }
        maze[x][y] = BLOCKED_COLOUR;    // dead end
        return false;
    }

    public static void main(String[] args){


    }

//    public void printMaze() {
//
//    }
}



