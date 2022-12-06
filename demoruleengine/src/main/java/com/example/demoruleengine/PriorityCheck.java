package com.example.demoruleengine;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;


@RestController
public class PriorityCheck {
    @Autowired
    private KieSession session;

    @PostMapping("/client")
    public Transaction checkPrioritynow(@RequestBody Transaction transaction) {
        session.insert(transaction);
        session.fireAllRules();
        return transaction;

    }

}
