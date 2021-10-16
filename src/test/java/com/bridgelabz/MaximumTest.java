package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since :16/10/2021
 */

public class MaximumTest {
    @Test
    public void floatMax_AtFirstPosition() {
        float actualResult = Maximum.findMaximum(9.1f, 3.1f, 7.1f);
        Assert.assertEquals(9.1f, actualResult, 0.0);
    }

    @Test
    public void floatMax_AtSecondPosition() {
        float actualResult = Maximum.findMaximum(3.1f, 9.1f, 7.1f);
        Assert.assertEquals(9.1f, actualResult, 0.0);
    }

    @Test
    public void floatMax_AtThirdPosition() {
        float actualResult = Maximum.findMaximum(3.1f,7.1f,9.1f);
        Assert.assertEquals(9.1f,actualResult,0.0);
    }
}