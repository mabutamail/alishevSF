package ru.zalex.spring.genres;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.zalex.spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component
//@Scope
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Инит метод");
    }

    // Для Prototype бинов не вызывается destroy-метод!
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Дестрой метод");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}