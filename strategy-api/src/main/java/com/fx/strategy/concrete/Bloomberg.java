package com.fx.strategy.concrete;

import com.fx.strategy.abstractions.Provider;
import com.fx.strategy.abstractions.ProviderStrategy;
import org.springframework.stereotype.Component;

@Component
public class Bloomberg implements ProviderStrategy {

    @Override
    public Provider getStrategy() {
        return Provider.BLOOMBERG;
    }

    @Override
    public Long process(Long fx) {
        return fx * 3000L;
    }
}
