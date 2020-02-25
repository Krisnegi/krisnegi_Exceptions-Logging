package com.CleanCode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleInterestTest {
    @Test
    public void testCalculateSimpleInterest()
    {
        SimpleInterest sampleSimpleInterest= new SimpleInterest(100,3,4);
        assertEquals(12.000000,sampleSimpleInterest.calculateSimpleInterest(),0.0f);
    }
}
