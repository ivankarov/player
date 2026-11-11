package ru.ivan.karov;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicMusic implements Music{
    public ClassicMusic(){
    }
    @Override
    public String getSong() {
        return "playing classic music";
    }
}
