package com.mon.config;

import com.mon.GuessCount;
import com.mon.MaxNumber;
import com.mon.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "com.mon")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:10}")
    private int minNumber;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
}
