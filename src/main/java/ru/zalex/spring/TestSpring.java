//  https://www.youtube.com/playlist?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ
//  https://www.youtube.com/watch?v=BgE5DoIN6Bs&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=15

package ru.zalex.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zalex.spring.config.SpringConfig;
import ru.zalex.spring.genres.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}