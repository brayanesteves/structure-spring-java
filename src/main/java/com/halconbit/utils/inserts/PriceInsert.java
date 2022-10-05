package com.halconbit.utils.inserts;

import com.halconbit.model.Price;
import com.halconbit.repository.PriceRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class PriceInsert implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>> Ejecución MyCommandLineRunner");
    }
}
