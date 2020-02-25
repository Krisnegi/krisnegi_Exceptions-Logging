package com.CleanCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class App 
{
    private static final Logger LOGGER= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info("App started");
        Scanner clientInput=new Scanner(System.in);
        LOGGER.info( "Enter principle in Rs:" );
        float principle=clientInput.nextFloat();
        LOGGER.info( "Enter rate per annum:" );
        float ratePerAnnum=clientInput.nextFloat();
        LOGGER.info( "Enter time in years:" );
        float timeInYears=clientInput.nextFloat();
        LOGGER.info( "Enter 'SI' to calculate Sam's Simple Interest or,\nEnter 'CI' to calculate Sam's Compound Interest :" );
        String interestType=clientInput.next();
        if(interestType.equals("SI")) {
            SimpleInterest simpleInterestOfSam = new SimpleInterest(principle, ratePerAnnum, timeInYears);
            LOGGER.info("Simple Interest : "+simpleInterestOfSam.calculateSimpleInterest());
        }
        else if(interestType.equals("CI")) {
           CompoundInterest compoundInterestOfSam = new CompoundInterest(principle, ratePerAnnum, timeInYears);
            LOGGER.info("Enter 1,2 or 3 to calculate Sam's compound interest on yearly/half-yearly/quaterly basis :");
           int compoundInterestPeriod=clientInput.nextInt();
           switch(compoundInterestPeriod)
           {
               case 1:
                   LOGGER.info("Compound Interest : "+compoundInterestOfSam.calculateCompoundInterestYearly());
                   break;
               case 2:
                   LOGGER.info("Compound Interest : "+compoundInterestOfSam.calculateCompoundInterestHalfYearly());
                   break;
               case 3:
                   LOGGER.info("Compound Interest : "+compoundInterestOfSam.calculateCompoundInterestQuaterly());
                   break;
               default:
                   LOGGER.error("Invalid Input");
           }
        }
        else
            LOGGER.error("Invalid Input");
        LOGGER.warn("App about to end");
    }
}
