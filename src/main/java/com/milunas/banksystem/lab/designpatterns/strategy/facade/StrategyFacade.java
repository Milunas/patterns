package com.milunas.banksystem.lab.designpatterns.strategy.facade;

import com.milunas.banksystem.lab.designpatterns.strategy.exception.NoStrategyException;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

public class StrategyFacade {

    @Resource(name="strategies")
    private final Map<String, Strategy> strategies;

    StrategyFacade(Map<String, Strategy> strategies) {
        this.strategies = strategies;
    }

    public String getStrategy(String strategyType) {
        return Optional.ofNullable(strategies.get(strategyType))
                .orElseThrow(NoStrategyException::new)
                .action();
    }

}
