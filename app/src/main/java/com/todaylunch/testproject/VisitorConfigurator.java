package com.todaylunch.testproject;

public class VisitorConfigurator implements Visitor {

    @Override
    public void visit(VisitorLinkA link) {

        System.out.println("LinkA configuration for Visitor complete");
    }

    @Override
    public void visit(VisitorLinkB link) {
        System.out.println("LinkB configuration for Visitor complete");

    }

    @Override
    public void visit(VisitorLinkC lnk) {
        System.out.println("LinkC configuration for Visitor complete");

    }
}
