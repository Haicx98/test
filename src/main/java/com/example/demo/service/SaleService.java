package com.example.demo.service;

import com.example.demo.entity.Sale;
import com.example.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public Sale storeSale(Sale sale){
        sale.setDateOfSale(Calendar.getInstance().getTimeInMillis());
        return saleRepository.save(sale);
    }
}
