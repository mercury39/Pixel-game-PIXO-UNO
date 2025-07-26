/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uno;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundManager {
    private static boolean isMuted = false;

    // Метод для відтворення звуку
    public static void playSound(String soundFilePath) {
        if (isMuted) return; // Якщо звук вимкнено, нічого не виконується

        try {
            File soundFile = new File(soundFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Увімкнути/вимкнути звуки
    public static void toggleMute() {
        isMuted = !isMuted;
    }

    // Метод для перевірки стану
    public static boolean isMuted() {
        return isMuted;
    }
}

