package com.CleanCode2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HouseTest {
    @Test
    public void testConstructionCostPerSquareFeet()
    {
        House houseConstructionCost=new House("above standard",1230);
        assertEquals(1500,houseConstructionCost.constructionCostPerSquareFeet());
    }
    @Test
    public void testEstimateHouseConstructionCost()
    {
        House houseConstructionCost=new House("above standard",1230);
        assertEquals(1845000.000000,houseConstructionCost.estimateHouseConstructionCost(),0.0f);
    }
}
