package com.CleanCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest extends Interest {
    private static final Logger LOGGER= LogManager.getLogger(App.class);
    public SimpleInterest(float principle, float ratePerAnnum, float timeInYears) {
        super(principle, ratePerAnnum, timeInYears);
    }
    public float calculateSimpleInterest()
    {
        LOGGER.debug("Entered calculateSimpleInterest() method");
        return (principle*ratePerAnnum*timeInYears)/100;
    }
}
