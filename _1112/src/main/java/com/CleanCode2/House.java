package com.CleanCode2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class House {
    String materialStandard;
    float totalAreaOfHouse;
    private static final Logger LOGGER= LogManager.getLogger(App.class);

    public House(String materialStandard, float totalAreaOfHouse) {
        this.materialStandard = materialStandard;
        this.totalAreaOfHouse = totalAreaOfHouse;
    }

    public int constructionCostPerSquareFeet()
    {
        LOGGER.debug("Entered constructionCostPerSquareFeet() method");
        switch(materialStandard)
        {
            case "standard":
                return 1200;
            case "above standard":
                return 1500;
            case "high standard":
                return 1800;
            case "high standard and fully automated":
                return 2500;
            default:
                return -1;
        }
    }
    public float estimateHouseConstructionCost()
    {
        LOGGER.debug("Entered estimateHouseConstructionCost() method");
        return constructionCostPerSquareFeet()*totalAreaOfHouse;
    }
}
