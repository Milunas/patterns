package com.milunas.banksystem.lab.designpatterns.strategy.facade;

class FirstStrategy implements Strategy {

    @Override
    public String action() {
        return "FIRST";
    }
}
