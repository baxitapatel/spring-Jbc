package io.pragra.learning.springSession23.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Game {


    private ITeam home;
    private ITeam away;

    public Game(@Qualifier("raptors") ITeam home,@Qualifier("lekers") ITeam away) {
        this.home = home;
        this.away = away;
    }

    public ITeam startGame(){
        return Math.random()>0.5?home:away;
    }
}
