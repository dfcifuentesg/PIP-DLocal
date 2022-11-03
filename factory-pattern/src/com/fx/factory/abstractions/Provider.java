package com.fx.factory.abstractions;

public class Provider {
    private ProviderFactory providerStrategy;

    public Provider(ProviderFactory providerStrategy) {
        this.providerStrategy = providerStrategy;
    }

    public void printProviderDescription() {
        System.out.println(this.providerStrategy.getName() + ": " + this.providerStrategy.description());
    }
}