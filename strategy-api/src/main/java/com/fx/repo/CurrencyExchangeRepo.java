package com.fx.repo;

import com.fx.model.CurrencyExchange;
import com.fx.strategy.abstractions.Provider;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CurrencyExchangeRepo {

    private List<CurrencyExchange> list = new ArrayList<CurrencyExchange>();

    public List<CurrencyExchange> listCurrencies() {
        list = List.of(
                new CurrencyExchange(1, "USD", "COP", Provider.ABOKI, 1L),
                new CurrencyExchange(2, "USD", "COP", Provider.API_LAYER, 2L),
                new CurrencyExchange(3, "USD", "COP", Provider.BLOOMBERG, 3L));
        return list;
    }

    public List<CurrencyExchange> search(String provider, String base, String quote) {
        return list.stream().filter(x -> x.getProvider().toString().equals(provider)
                        && x.getBase().equals(base)
                        && x.getQuote().equals(quote))
                .collect(Collectors.toList());
    }

}
