package com.fx.controller;

import com.fx.model.CurrencyExchange;
import com.fx.service.ICurrencyService;
import com.fx.strategy.abstractions.ProviderContext;
import com.fx.strategy.abstractions.ProviderStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/fx")
public class FXController {

    @Autowired
    private ICurrencyService currencyService;

    private ProviderContext providerContext;

    public FXController(ProviderContext providerContext) {
        this.providerContext = providerContext;
    }

    @RequestMapping(path = "/currencies")
    public ResponseEntity<List<CurrencyExchange>> currencies() {
        List<CurrencyExchange> list = currencyService.listCurrencies();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(path = "/search/{provider}/{base}/{quote}")
    public ResponseEntity<CurrencyExchange> search(
            @PathVariable(name = "provider", required = true) String provider,
            @PathVariable(name = "base", required = true) String base,
            @PathVariable(name = "quote", required = true) String quote) {
        CurrencyExchange currency = currencyService.search(provider, base, quote);
        return new ResponseEntity<>(currency, HttpStatus.OK);
    }

    @GetMapping(path = "/process/{provider}/{base}/{quote}")
    public ResponseEntity<Long> exchange(
            @PathVariable(name = "provider", required = true) String provider,
            @PathVariable(name = "base", required = true) String base,
            @PathVariable(name = "quote", required = true) String quote) {
        CurrencyExchange currency = currencyService.search(provider, base, quote);
        ProviderStrategy providerStrategy = providerContext.getProvider(currency.getProvider());
        Long exchange = providerStrategy.process(currency.getFx());
        return new ResponseEntity<>(exchange, HttpStatus.OK);
    }
}
