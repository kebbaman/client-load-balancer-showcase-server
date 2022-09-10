package com.kebba.clientloadbalancershowcase.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CashierService {
    @Value("${cashier.name}")
    private static String cashierName;

    public String serve(){
        return "You are being served by: "+cashierName;
    }

}
