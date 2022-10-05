package com.halconbit.service.implement;

import com.halconbit.model.Price;
import com.halconbit.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PriceServiceImpl implements PriceService{

    private final PriceRepository priceRepository;

    @Override
    public Price savePrice(Price price) {
        return this.priceRepository.save(price);
    }

    @Override
    public Optional<Price> getPrice(Long reference) {
        return null;
    }

    public Price _getPrice(Long reference) {
        return this.priceRepository.findById(reference).orElseThrow(() -> {
            throw new RuntimeException();
        });
    }

    @Override
    public Price updatePrice(Long reference, Price price) {
        Price priceSearch = this.priceRepository.findById(reference).get();
        priceSearch.setBrand_id(price.getBrand_id());
        priceSearch.setProduct_id(price.getProduct_id());
        priceSearch.setStart_date(price.getStart_date());
        priceSearch.setPriority(price.getPriority());
        priceSearch.setPrice(price.getPrice());
        priceSearch.setCurr(price.getCurr());
        priceSearch.setEnd_date(price.getEnd_date());
        priceSearch.setPrice_list(price.getPrice_list());
        return this.priceRepository.save(priceSearch);
    }

    @Override
    public boolean deletePrice(Long reference) {
        try {
            this.priceRepository.deleteById(reference);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
