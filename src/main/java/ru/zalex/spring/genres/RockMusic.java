package ru.zalex.spring.genres;

import org.springframework.stereotype.Component;
import ru.zalex.spring.Music;

//@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Рок музыка";
    }
}