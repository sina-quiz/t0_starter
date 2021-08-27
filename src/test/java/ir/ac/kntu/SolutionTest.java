package ir.ac.kntu;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Mathematics mathematics;

    @Before
    public void construct(){
        mathematics=new Mathematics();
    }

    @Test
    public void Check(){
        assertEquals(3,mathematics.sum(1,2));
    }

    @Ignore
    @Test
    public void Check2(){
        assertEquals(4,mathematics.sum(1,2));
    }

}
