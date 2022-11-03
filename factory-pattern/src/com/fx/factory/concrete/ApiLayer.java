package com.fx.factory.concrete;

import com.fx.factory.abstractions.ProviderFactory;

public class ApiLayer extends ProviderFactory {

    public ApiLayer() {
        super("ApiLayer");
    }

    public String description() {
        return "Currency Data API provides a simple REST API with real-time and historical exchange rates for 168 world currencies";
    }

}
