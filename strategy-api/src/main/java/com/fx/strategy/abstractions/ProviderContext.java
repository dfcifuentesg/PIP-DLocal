package com.fx.strategy.abstractions;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProviderContext implements InitializingBean {

    private List<ProviderStrategy> providerStrategies;
    private Map<Provider, ProviderStrategy> map;

    public ProviderContext(List<ProviderStrategy> providerStrategies) {
        this.providerStrategies = providerStrategies;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.map = new HashMap<>();
        providerStrategies.forEach(providerStrategy -> map.put(providerStrategy.getStrategy(), providerStrategy));
    }

    public ProviderStrategy getProvider(Provider provider) {
        return this.map.get(provider);
    }
}
