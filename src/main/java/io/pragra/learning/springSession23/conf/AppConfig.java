package io.pragra.learning.springSession23.conf;

import io.pragra.learning.springSession23.domain.ITeam;
import io.pragra.learning.springSession23.domain.TorontoRapter;
import io.pragra.learning.springSession23.domain.Lekers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:teams.properties")
@PropertySource("classpath:person.properties")
public class AppConfig {
@Value("${team.name}")
    private String teamName;
@Value("${team.city}")
private String teamCity;

    @Bean(initMethod = "init")
    public ITeam raptors(){
        return new TorontoRapter(teamName,teamCity);
    }

    @Bean
    public ITeam lekers(){
        return new Lekers("Lekers","LosAngeles");
    }

    private String getName(){
        return "Raptors";
    }
}
