package com.milunas.banksystem.lab.designpatterns.strategy.facade;

import com.milunas.banksystem.lab.designpatterns.strategy.exception.NoStrategyException;
import org.junit.Before;
import org.junit.Test;

import static java.util.Map.of;
import static org.junit.Assert.*;

public class StrategyFacadeTest {

    private StrategyFacade strategyFacade;
    private FirstStrategy firstStrategy = new FirstStrategy();
    private SecondStrategy secondStrategy = new SecondStrategy();
    private static final String FIRST = "FIRST";
    private static final String SECOND = "SECOND";

    @Before
    public void setUp(){
        strategyFacade = new StrategyFacade( of(
                "FIRST", firstStrategy,
                "SECOND", secondStrategy
        ));
    }

    @Test
    public void shouldGetFirstStrategy() {
        //when
        String strategy = strategyFacade.getStrategy(FIRST);
        //then
        assertEquals(FIRST, strategy);
    }

    @Test
    public void shouldGetSecondStrategy() {
        //when
        String strategy = strategyFacade.getStrategy(SECOND);
        //then
        assertEquals(SECOND, strategy);
    }


    @Test(expected = NoStrategyException.class)
    public void shouldThrowNoStrategyException() {
        //given
        String requestedStrategy = "";
        //when
        strategyFacade.getStrategy(requestedStrategy);
    }

}