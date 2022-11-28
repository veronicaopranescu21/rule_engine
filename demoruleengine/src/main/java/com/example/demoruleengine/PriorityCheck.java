package com.example.demoruleengine;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriorityCheck {
    @Autowired
    private KieSession session;

    @PostMapping("/client")
    public Client checkPrioritynow(@RequestBody Client client) {
        session.insert(client);
        session.fireAllRules();
        return client;
    }

}
