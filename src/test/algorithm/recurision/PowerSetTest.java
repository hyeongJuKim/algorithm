package test.algorithm.recurision;

import main.algorithm.recursion.PowerSet;
import org.junit.Before;
import org.junit.Test;

public class PowerSetTest {

    PowerSet powerSet;

    @Before
    public void creat_powerSet(){
        powerSet = new PowerSet();
    }

    @Test

    public void run_powerset(){
        powerSet.powerSet();
    }



}
