package com.fx.strategy.concrete;

import com.fx.strategy.abstractions.Provider;
import com.fx.strategy.abstractions.ProviderStrategy;
import org.springframework.stereotype.Component;

@Component
public class Aboki implements ProviderStrategy {

    @Override
    public Provider getStrategy() {
        return Provider.ABOKI;
    }

    @Override
    public Long process(Long fx) {
        return fx * 1000L;
    }
}
