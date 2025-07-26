/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uno;

import javax.swing.UIManager;

/**
 *
 * @author syndu
 */
public class Uno {

    public static void main(String[] args) throws Exception {
          // Встановлення стилю Nimbus
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // Якщо Nimbus недоступний, встановлюємо стиль ОС за замовчуванням
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    // Відтворення музики
        MusicPlayer.playMusic("C:\\Users\\syndu\\Downloads\\gamemusic-6082.wav");
        // Запуск меню
        new Menu().setVisible(true);
   
    }
}

