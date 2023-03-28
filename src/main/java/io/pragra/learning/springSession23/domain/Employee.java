package io.pragra.learning.springSession23.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    private Person person;
    private double salary = 20000;

    public Employee(Person person) {
        this.person = person;
    }
}
