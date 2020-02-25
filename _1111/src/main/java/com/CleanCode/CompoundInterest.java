package com.CleanCode;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest extends Interest {
    private static final Logger LOGGER= LogManager.getLogger(App.class);
    public CompoundInterest(float principle, float ratePerAnnum, float timeInYears) {
        super(principle, ratePerAnnum, timeInYears);
    }
    public float calculateCompoundInterestYearly()
    {
        LOGGER.debug("Entered calculateCompoundInterestYearly() method");
        return (float)(principle*(Math.pow((1+ratePerAnnum/100),timeInYears)-1));
    }
    public float calculateCompoundInterestHalfYearly()
    {
        LOGGER.debug("Entered calculateCompoundInterestHalfYearly() method");
        return (float)(principle*(Math.pow((1+ratePerAnnum/200),2*timeInYears)-1));
    }
    public float calculateCompoundInterestQuaterly()
    {
        LOGGER.debug("Entered calculateCompoundInterestQuaterly() method");
        return (float)(principle*(Math.pow((1+ratePerAnnum/400),4*timeInYears)-1));
    }
}
