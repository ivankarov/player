package ru.ivan.karov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer mp = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(mp.getVolume());
        System.out.println(mp.getName());

        System.out.println(mp.playMusic());
        
        context.close();
    }
}
    