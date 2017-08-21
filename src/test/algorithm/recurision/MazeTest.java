package test.algorithm.recurision;

import main.algorithm.recursion.Maze;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MazeTest {

    private Maze maze;
    @Before
    public void create_Maze_class(){
    maze = new Maze();

    }


    @Test
    public void maze_0_0_true(){
        Assert.assertTrue(maze.findMazePath(0,0));
    }

    @Test
    public void maze_8_0_true(){
        Assert.assertFalse(maze.findMazePath(8,0));
    }

    @Test
    public void find_maze(){
//        maze.printMaze();
        maze.findMazePath(0,0);
//        maze.printMaze();
    }



}
