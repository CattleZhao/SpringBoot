package com.scorpion.demo1.Service.Imple;

import com.scorpion.demo1.Service.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("devdb")
public class DevDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("Devdb");
    }
}
