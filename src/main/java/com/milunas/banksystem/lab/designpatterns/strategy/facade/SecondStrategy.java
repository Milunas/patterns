package com.milunas.banksystem.lab.designpatterns.strategy.facade;

class SecondStrategy implements Strategy {

    @Override
    public String action() {
        return "SECOND";
    }
}
