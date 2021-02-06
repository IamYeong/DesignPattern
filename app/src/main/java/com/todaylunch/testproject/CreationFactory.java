package com.todaylunch.testproject;

public class CreationFactory {

    public static Factory BuildFactory(FactoryType type) {

        Factory factory = null;

        switch (type) {

            case Type1 :
                factory = new FactoryOne();
                break;

            case Type2 :
                factory = new FactoryTwo();
                break;

            case Type3 :
                factory = new FactoryThree();
                break;

        }

        return factory;

    }

}
