package io.pragra.learning.springSession23.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Person {
    @Value("${person.name:'Baxita'}")
    private String name;
    @Value("${person.age}")
    private String age;
    @Value("#{'${person.hobbies}'.split(',')}")
    private List<String > hobbies;


}
