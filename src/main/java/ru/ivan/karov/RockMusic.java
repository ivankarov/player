package ru.ivan.karov;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("doing init");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doing destroy");
    }

    public RockMusic(){
    }
    @Override
    public String getSong() {
        return "playing rock music";
    }
}
