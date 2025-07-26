package com.mycompany.uno;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
    public static Clip clip;
    private static boolean isPlaying = false; // Булева змінна для відстеження стану музики

    public static void playMusic(String filepath) {
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                System.out.println("Файл не знайдено: " + filepath);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Музика грає у циклі
            clip.start();
            isPlaying = true; // Оновлення стану
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Помилка відтворення музики: " + e.getMessage());
        }
    }

    public static void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            isPlaying = false; // Оновлення стану
        }
    }

    public static boolean isMusicPlaying() {
        return isPlaying;
    }
}
