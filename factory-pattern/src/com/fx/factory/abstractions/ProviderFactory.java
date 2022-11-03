package com.fx.factory.abstractions;

public abstract class ProviderFactory {

    private String name;

    public ProviderFactory(String name) {
        this.name = name;
    }

    public abstract String description();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}