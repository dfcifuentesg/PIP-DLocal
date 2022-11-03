package com.fx.strategy.abstractions;

public interface ProviderStrategy {

    Provider getStrategy();

    Long process(Long fx);

}