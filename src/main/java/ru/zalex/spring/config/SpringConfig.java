package ru.zalex.spring.config;

import org.springframework.context.annotation.*;
import ru.zalex.spring.*;
import ru.zalex.spring.genres.ClassicalMusic;
import ru.zalex.spring.genres.JazzMusic;
import ru.zalex.spring.genres.RockMusic;

import java.util.Arrays;
import java.util.List;


@Configuration
@ComponentScan("ru.zalex.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
//    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}