package com.fx.service;

import com.fx.model.CurrencyExchange;

import java.util.List;

public interface ICurrencyService {

    List<CurrencyExchange> listCurrencies();

    CurrencyExchange search(String provider, String base, String quote);

}
