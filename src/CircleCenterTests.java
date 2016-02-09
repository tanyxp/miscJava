package com.company;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Nathaniel on 2/8/2016.
 */
public class CircleCenterTests {

    @Test
    public void testCenterFinderSuccess(){
        int[][] circleBitMap = {
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,1,0,0},
                {0,0,1,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
        String result = CircleCenter.findCircleCenter(circleBitMap);
        assertEquals("The center of the circle is at: (4.5, 6.5)", result);
    }

    @Test
    public void testCenterFinderSuccess2(){
        int[][] circleBitMap = {
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
        String result = CircleCenter.findCircleCenter(circleBitMap);
        assertEquals("The center of the circle is at: (5.0, 4.0)", result);
    }

    @Test
    public void testCenterFinderSuccess3(){
        int[][] circleBitMap = {
                {0,1,1,0,0,0},
                {1,1,1,1,0,0},
                {1,1,1,1,0,0},
                {0,1,1,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}
        };
        String result = CircleCenter.findCircleCenter(circleBitMap);
        assertEquals("The center of the circle is at: (1.5, 1.5)", result);
    }

    @Test
    public void testCenterFinderFail(){
        int[][] circleBitMap = {
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,1,0,0},
                {0,0,1,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
        String result = CircleCenter.findCircleCenter(circleBitMap);
        assertNotEquals("The center of the circle is at: (4.5, 7)", result);
    }
}
