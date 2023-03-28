package io.pragra.learning.springSession23.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lekers implements ITeam{
    private  String teamName;
    private String teamCity;

    @Override
    public String detTeamName() {
        return teamName;
    }

    @Override
    public void init() {
        System.out.println("initializing....Lekers");
    }
}
