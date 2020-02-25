package com.CleanCode;

public class Interest {
    protected float principle;
    protected float ratePerAnnum;
    protected float timeInYears;

    public Interest(float principle, float ratePerAnnum, float timeInYears) {
        this.principle = principle;
        this.ratePerAnnum = ratePerAnnum;
        this.timeInYears = timeInYears;
    }
}
