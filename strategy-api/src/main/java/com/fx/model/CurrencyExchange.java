package com.fx.model;

import com.fx.strategy.abstractions.Provider;

public class CurrencyExchange {

    private int id;
    private String base;
    private String quote;
    private Provider provider;
    private Long fx;

    public CurrencyExchange() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Long getFx() {
        return fx;
    }

    public void setFx(Long fx) {
        this.fx = fx;
    }

    public CurrencyExchange(int id, String base, String quote, Provider provider, Long fx) {
        this.id = id;
        this.base = base;
        this.quote = quote;
        this.provider = provider;
        this.fx = fx;
    }

}	