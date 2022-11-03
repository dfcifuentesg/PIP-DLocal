package com.fx.service.impl;

import com.fx.model.CurrencyExchange;
import com.fx.repo.CurrencyExchangeRepo;
import com.fx.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService implements ICurrencyService {

    @Autowired
    private CurrencyExchangeRepo currencyExchangeRepo;

    @Override
    public List<CurrencyExchange> listCurrencies() {
        return currencyExchangeRepo.listCurrencies();
    }

    @Override
    public CurrencyExchange search(String provider, String base, String quote) {
        return currencyExchangeRepo.search(provider, base, quote).get(0);
    }

}
