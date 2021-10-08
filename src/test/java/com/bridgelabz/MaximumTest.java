package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since  :08/10/2021
 */

public class MaximumTest {
    @Test
    public void integerMax_AtFirstPosition() {
        int actualResult = Maximum.findMaximum(9,3,7);
        Assert.assertEquals(9,actualResult);
    }
    @Test
    public void integerMax_AtSecondPosition() {
        int actualResult = Maximum.findMaximum(3,9,7);
        Assert.assertEquals(9,actualResult);
    }
    @Test
    public void integerMax_AtThirdPosition() {
        int actualResult = Maximum.findMaximum(3,7,9);
        Assert.assertEquals(9,actualResult);
    }

}