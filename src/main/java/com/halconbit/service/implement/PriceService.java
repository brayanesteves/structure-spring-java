package com.halconbit.service.implement;

import com.halconbit.model.Price;

import java.util.Optional;

public interface PriceService {
    Price savePrice(Price price);
    Optional<Price> getPrice(Long reference);
    Price updatePrice(Long reference, Price price);
    boolean deletePrice(Long reference);
}
