package com.milunas.banksystem.lab.designpatterns.strategy;

import com.milunas.banksystem.lab.designpatterns.strategy.exception.NoStrategyException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyControllerTest {

    @Autowired
    private StrategyController controller;
    private static final String FIRST = "FIRST";
    private static final String SECOND = "SECOND";


    @Test
    public void shouldGetFirstStrategy() {
        //when
        String strategy = controller.getStrategy(FIRST);
        //then
        assertEquals(FIRST, strategy);
    }

    @Test
    public void shouldGetSecondStrategy() {
        //when
        String strategy = controller.getStrategy(SECOND);
        //then
        assertEquals(SECOND, strategy);
    }


    @Test(expected = NoStrategyException.class)
    public void shouldThrowNoStrategyException() {
        //given
        String requestedStrategy = "";
        //when
       controller.getStrategy(requestedStrategy);
    }
}