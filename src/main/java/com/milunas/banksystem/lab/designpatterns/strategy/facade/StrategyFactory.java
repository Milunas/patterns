package com.milunas.banksystem.lab.designpatterns.strategy.facade;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

import static java.util.Map.of;

@Configuration
class StrategyFactory {

    @Bean
    FirstStrategy firstStrategy(){
        return new FirstStrategy();
    }

    @Bean
    SecondStrategy secondStrategy(){
        return new SecondStrategy();
    }

    @Bean(name = "strategies")
    Map strategies(FirstStrategy firstStrategy, SecondStrategy secondStrategy) {
        return of(
                "FIRST", firstStrategy,
                "SECOND", secondStrategy
        );
    }

    @Bean
    StrategyFacade strategyFacade(Map strategies){
        return new StrategyFacade(strategies);
    }
}
