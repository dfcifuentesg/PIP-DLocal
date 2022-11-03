package com.fx.strategy.concrete;

import com.fx.strategy.abstractions.Provider;
import com.fx.strategy.abstractions.ProviderStrategy;
import org.springframework.stereotype.Component;

@Component
public class ApiLayer implements ProviderStrategy {

    @Override
    public Provider getStrategy() {
        return Provider.API_LAYER;
    }

    @Override
    public Long process(Long fx) {
        return fx * 2000L;
    }
}