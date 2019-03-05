package com.milunas.banksystem.lab.designpatterns.strategy;

import com.milunas.banksystem.lab.designpatterns.strategy.facade.StrategyFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SuppressWarnings("all")
public class StrategyController {

    private final StrategyFacade facade;

    public StrategyController(StrategyFacade facade) {
        this.facade = facade;
    }

    @GetMapping("/strategy")
    String getStrategy(@PathVariable String strategy){
        return facade.getStrategy(strategy);
    }

}
