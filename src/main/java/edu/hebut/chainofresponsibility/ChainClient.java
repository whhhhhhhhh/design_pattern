package edu.hebut.chainofresponsibility;

import java.util.Arrays;

public class ChainClient {
    static class ChainHandlerA extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("i am A");
        }
    }
    static class ChainHandlerB extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("i am B");
        }
    }
    static class ChainHandlerC extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("i am C");
        }
    }

    public static void main(String[] args) {
        Chain chain = new Chain(Arrays.asList(
           new ChainHandlerA(),
           new ChainHandlerB(),
           new ChainHandlerC()
        ));
        chain.Process();
    }
}
