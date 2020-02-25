package com.CleanCode2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info("App started");
        Scanner clientInput=new Scanner(System.in);
        LOGGER.info( "Enter material standard between :- standard/above standard/high standard/high standard and fully automated" );
        String materialStandard=clientInput.nextLine();
        LOGGER.info("Enter total area of house: ");
        float totalAreaOfHouse=clientInput.nextFloat();
        House houseConstructionCost=new House(materialStandard,totalAreaOfHouse);
        float totalConstructionCost=houseConstructionCost.estimateHouseConstructionCost();
        if(totalConstructionCost<0)
            LOGGER.error("Invalid material standard input");
        else
            LOGGER.info("Total Construction Cost : "+totalConstructionCost);
        LOGGER.warn("App about to end");
    }
}
