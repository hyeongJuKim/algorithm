package test.algorithm.recurision;

import main.algorithm.recursion.NQueensProblem;
import org.junit.Before;
import org.junit.Test;

public class NQueensProblemTest {

    private NQueensProblem nQueens = new NQueensProblem();


    @Before
    public void create_queens(){
        nQueens = new NQueensProblem();
    }

    @Test
    public void run_nQueens(){
        nQueens.queens(0);
    }

}
