package com.kebba.clientloadbalancershowcase.controller;

import com.kebba.clientloadbalancershowcase.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashier")
public class CashierController {
    @Autowired
    private CashierService cashierService;

    @GetMapping("/get-served")
    public ResponseEntity<String> getServed(){
        return ResponseEntity.ok(cashierService.serve());
    }

}
