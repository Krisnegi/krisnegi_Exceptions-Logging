package com.CleanCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompoundInterestTest {
    @Test
    public void testCalculateSimpleInterestYearly()
    {
        CompoundInterest sampleCompoundInterest= new CompoundInterest(100,3,4);
        assertEquals(12.550868,sampleCompoundInterest.calculateCompoundInterestYearly(),0.0000009);
    }
    @Test
    public void testCalculateSimpleInterestHalfYearly()
    {
        CompoundInterest sampleCompoundInterest= new CompoundInterest(100,3,4);
        assertEquals(12.649246,sampleCompoundInterest.calculateCompoundInterestHalfYearly(),0.0000009);
    }
    @Test
    public void testCalculateSimpleInterestQuaterly()
    {
        CompoundInterest sampleCompoundInterest= new CompoundInterest(100,3,4);
        assertEquals(12.699306,sampleCompoundInterest.calculateCompoundInterestQuaterly(),0.0000009);
    }
}
