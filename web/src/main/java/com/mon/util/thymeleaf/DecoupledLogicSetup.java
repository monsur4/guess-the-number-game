package com.mon.util.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class DecoupledLogicSetup {

    // == fields ==
    private final SpringResourceTemplateResolver  resolver ;

    // == constructor ==

    public DecoupledLogicSetup(SpringResourceTemplateResolver resolver) {
        this.resolver = resolver;
    }

    // == init method ==
    @PostConstruct
    public void init(){
        resolver.setUseDecoupledLogic(true);
        log.info("Decoupled template logic enabled");
    }
}
