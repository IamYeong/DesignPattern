package com.todaylunch.testproject;

public class StrategyManager {

    private AnyStrategy mAnyStrategy;

    public void setAnyStrategy(AnyStrategy anyStrategy) {

        this.mAnyStrategy = anyStrategy;

    }

    public String getStrategy() {

        return mAnyStrategy.doSomething();
    }


}
