package com.fx.factory.concrete;

import com.fx.factory.abstractions.ProviderFactory;

public class Aboki extends ProviderFactory {

    public Aboki() {
        super("Aboki provider");
    }

    public String description() {
        return "The most trusted platform to get the live exchange rates. Convert foreign currencies instantly with the Abokifx calculator.";
    }

}
