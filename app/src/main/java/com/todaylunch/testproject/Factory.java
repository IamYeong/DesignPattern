package com.todaylunch.testproject;

public abstract class Factory {

    private FactoryType mType = null;

    public Factory(FactoryType type) {

        this.mType = type;

    }

    public void setType(FactoryType type) {

        this.mType = type;

    }

    public FactoryType getType() {
        return mType;
    }

    protected abstract void construct();

}
