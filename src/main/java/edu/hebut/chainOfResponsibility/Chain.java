package edu.hebut.chainOfResponsibility;

import java.util.List;

public class Chain {

    private List<ChainHandler> handlers;
    private int index;

    public Chain(List<ChainHandler> handlers) {
        this.handlers = handlers;
    }

    public void Process() {
        if (index >= handlers.size()) {
            return;
        }
        handlers.get(index++).execute(this);

    }
}
