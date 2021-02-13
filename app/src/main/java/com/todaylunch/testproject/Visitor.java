package com.todaylunch.testproject;

public interface Visitor {

    void visit(VisitorLinkA link);
    void visit(VisitorLinkB link);
    void visit(VisitorLinkC lnk);

}
