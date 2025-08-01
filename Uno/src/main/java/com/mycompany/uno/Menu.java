/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uno;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author syndu
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        if (!MusicPlayer.isMusicPlaying()) {       
        onMusicButton.setVisible(true);
        offMusicButton.setVisible(false);
    } else {
        
        onMusicButton.setVisible(false);
        offMusicButton.setVisible(true);
    }
        if (SoundManager.isMuted()) {
        // Якщо звук вимкнений, показуємо кнопку для увімкнення звуку
        onSoundsButton.setVisible(true);
        offSoundsButton.setVisible(false);
    } else {
        // Якщо звук увімкнений, показуємо кнопку для вимкнення звуку
        onSoundsButton.setVisible(false);
        offSoundsButton.setVisible(true);
    }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        startGameButton = new javax.swing.JButton();
        multiplayerButton = new javax.swing.JButton();
        vsBotModeButton = new javax.swing.JButton();
        offMusicButton = new javax.swing.JButton();
        offSoundsButton = new javax.swing.JButton();
        onSoundsButton = new javax.swing.JButton();
        onMusicButton = new javax.swing.JButton();
        guideButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Головне меню");
        setAutoRequestFocus(false);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(616, 639));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\button EXIT.png")); // NOI18N
        exitButton.setContentAreaFilled(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 455, 97, 48));

        startGameButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        startGameButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\player_vs_player.png")); // NOI18N
        startGameButton.setContentAreaFilled(false);
        startGameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startGameButton.setRolloverEnabled(false);
        startGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startGameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startGameButtonMouseExited(evt);
            }
        });
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 272, 97, 48));

        multiplayerButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        multiplayerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\player_vs_player_online.png")); // NOI18N
        multiplayerButton.setContentAreaFilled(false);
        multiplayerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplayerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplayerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplayerButtonMouseExited(evt);
            }
        });
        multiplayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(multiplayerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 394, 97, 48));

        vsBotModeButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        vsBotModeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\player_vs_bot.png")); // NOI18N
        vsBotModeButton.setContentAreaFilled(false);
        vsBotModeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vsBotModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vsBotModeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vsBotModeButtonMouseExited(evt);
            }
        });
        vsBotModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsBotModeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vsBotModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 333, 97, 48));

        offMusicButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\music_off.png")); // NOI18N
        offMusicButton.setContentAreaFilled(false);
        offMusicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offMusicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offMusicButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offMusicButtonMouseExited(evt);
            }
        });
        offMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offMusicButtonActionPerformed(evt);
            }
        });
        getContentPane().add(offMusicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 404, 51, 51));

        offSoundsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\volume_off.png")); // NOI18N
        offSoundsButton.setContentAreaFilled(false);
        offSoundsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offSoundsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offSoundsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offSoundsButtonMouseExited(evt);
            }
        });
        offSoundsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offSoundsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(offSoundsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 464, 51, 51));

        onSoundsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\volume_on.png")); // NOI18N
        onSoundsButton.setContentAreaFilled(false);
        onSoundsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onSoundsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onSoundsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onSoundsButtonMouseExited(evt);
            }
        });
        onSoundsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSoundsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(onSoundsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 464, 51, 51));

        onMusicButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\music_on.png")); // NOI18N
        onMusicButton.setContentAreaFilled(false);
        onMusicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onMusicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMusicButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onMusicButtonMouseExited(evt);
            }
        });
        onMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMusicButtonActionPerformed(evt);
            }
        });
        getContentPane().add(onMusicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 404, 51, 51));

        guideButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\button_guid.png")); // NOI18N
        guideButton.setContentAreaFilled(false);
        guideButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guideButtonMouseExited(evt);
            }
        });
        guideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideButtonActionPerformed(evt);
            }
        });
        getContentPane().add(guideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 464, 51, 51));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\syndu\\Desktop\\Menu_Background new.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        new AddPlayerNames().setVisible(true);
        SoundManager.playSound("C:\\Users\\syndu\\Downloads\\game-start-6104.wav");
        this.dispose();
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void multiplayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplayerButtonActionPerformed

    private void vsBotModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsBotModeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsBotModeButtonActionPerformed

    private void guideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideButtonActionPerformed
        new CardGuide().setVisible(true);
        SoundManager.playSound("C:\\Users\\syndu\\Downloads\\game-start-6104.wav");
        this.dispose();
    }//GEN-LAST:event_guideButtonActionPerformed

    private void startGameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameButtonMouseEntered
       startGameButton.setLocation(233, startGameButton.getY());
    }//GEN-LAST:event_startGameButtonMouseEntered

    private void startGameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameButtonMouseExited
        startGameButton.setLocation(253, startGameButton.getY());
    }//GEN-LAST:event_startGameButtonMouseExited

    private void vsBotModeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vsBotModeButtonMouseEntered
       vsBotModeButton.setLocation(233, vsBotModeButton.getY());
    }//GEN-LAST:event_vsBotModeButtonMouseEntered

    private void vsBotModeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vsBotModeButtonMouseExited
          vsBotModeButton.setLocation(253, vsBotModeButton.getY());
    }//GEN-LAST:event_vsBotModeButtonMouseExited

    private void multiplayerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplayerButtonMouseEntered
          multiplayerButton.setLocation(233, multiplayerButton.getY());
    }//GEN-LAST:event_multiplayerButtonMouseEntered

    private void multiplayerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplayerButtonMouseExited
          multiplayerButton.setLocation(253, multiplayerButton.getY());
    }//GEN-LAST:event_multiplayerButtonMouseExited

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
         exitButton.setLocation(233, exitButton.getY());
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
         exitButton.setLocation(253, exitButton.getY());
    }//GEN-LAST:event_exitButtonMouseExited

    private void guideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideButtonMouseEntered
        guideButton.setLocation(80, guideButton.getY());
    }//GEN-LAST:event_guideButtonMouseEntered

    private void guideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideButtonMouseExited
        guideButton.setLocation(90, guideButton.getY());
    }//GEN-LAST:event_guideButtonMouseExited

    private void onMusicButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMusicButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_onMusicButtonMouseEntered

    private void onMusicButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMusicButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_onMusicButtonMouseExited

    private void onSoundsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSoundsButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_onSoundsButtonMouseEntered

    private void onSoundsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSoundsButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_onSoundsButtonMouseExited

    private void offMusicButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offMusicButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_offMusicButtonMouseEntered

    private void offMusicButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offMusicButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_offMusicButtonMouseExited

    private void offMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offMusicButtonActionPerformed
        offMusicButton.setVisible(false);
        onMusicButton.setVisible(true);
        MusicPlayer.stopMusic();
    }//GEN-LAST:event_offMusicButtonActionPerformed

    private void onMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMusicButtonActionPerformed
        offMusicButton.setVisible(true);
        onMusicButton.setVisible(false);
        MusicPlayer.playMusic("C:\\Users\\syndu\\Downloads\\gamemusic-6082.wav");
    }//GEN-LAST:event_onMusicButtonActionPerformed

    private void offSoundsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offSoundsButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_offSoundsButtonMouseEntered

    private void offSoundsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offSoundsButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_offSoundsButtonMouseExited

    private void offSoundsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offSoundsButtonActionPerformed
        SoundManager.toggleMute(); // Змінюємо стан звуку
        offSoundsButton.setVisible(false); // Приховуємо кнопку "Вимкнути звук"
        onSoundsButton.setVisible(true); // Показуємо кнопку "Увімкнути звук"
    }//GEN-LAST:event_offSoundsButtonActionPerformed

    private void onSoundsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSoundsButtonActionPerformed
        SoundManager.toggleMute(); // Змінюємо стан звуку
        onSoundsButton.setVisible(false); // Приховуємо кнопку "Увімкнути звук"
        offSoundsButton.setVisible(true); // Показуємо кнопку "Вимкнути звук"
    }//GEN-LAST:event_onSoundsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton guideButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiplayerButton;
    private javax.swing.JButton offMusicButton;
    private javax.swing.JButton offSoundsButton;
    private javax.swing.JButton onMusicButton;
    private javax.swing.JButton onSoundsButton;
    private javax.swing.JButton startGameButton;
    private javax.swing.JButton vsBotModeButton;
    // End of variables declaration//GEN-END:variables
}
