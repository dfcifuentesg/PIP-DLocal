package com.fx.factory.concrete;

import com.fx.factory.abstractions.ProviderFactory;

public class Bloomberg extends ProviderFactory {

    public Bloomberg() {
        super("Bloomberg");
    }

    public String description() {
        return "Current exchange rates of major world currencies.";
    }

}
