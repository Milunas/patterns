package com.milunas.banksystem.lab.designpatterns.strategy.exception;

public class NoStrategyException extends RuntimeException {

    public NoStrategyException(){
        super("NO SUCH STRATEGY");
    }

}
