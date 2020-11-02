package ru.zalex.spring.genres;

import ru.zalex.spring.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}