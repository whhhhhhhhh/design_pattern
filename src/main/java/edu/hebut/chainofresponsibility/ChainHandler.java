package edu.hebut.chainofresponsibility;

public abstract class ChainHandler {

    public void execute(Chain chain) {
        handleProcess();
        chain.Process();
    }

    protected abstract void handleProcess();

}
