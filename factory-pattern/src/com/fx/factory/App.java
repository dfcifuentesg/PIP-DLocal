package com.fx.factory;

import com.fx.factory.abstractions.Provider;
import com.fx.factory.concrete.Bloomberg;
import com.fx.factory.concrete.ApiLayer;
import com.fx.factory.concrete.Aboki;

public class App {

    public static void main(String[] args) {
        new Provider(new Bloomberg()).printProviderDescription();
        new Provider(new ApiLayer()).printProviderDescription();
        new Provider(new Aboki()).printProviderDescription();
    }

}
