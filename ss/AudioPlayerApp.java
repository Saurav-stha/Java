import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AudioPlayerApp {
    private Clip audioClip;
    private boolean isPlaying = false;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AudioPlayerApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Audio Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton playButton = new JButton("Play");
        JButton stopButton = new JButton("Stop");
        JButton repeatButton = new JButton("Repeat");

        playButton.addActionListener(e -> playAudio());
        stopButton.addActionListener(e -> stopAudio());
        repeatButton.addActionListener(e -> repeatAudio());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(playButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(repeatButton);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private void playAudio() {
        if (!isPlaying) {
            try {
                File audioFile = new File("zong.wav"); // Replace with your audio file path
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
                audioClip = AudioSystem.getClip();
                audioClip.open(audioInputStream);
                audioClip.start();
                isPlaying = true;
            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void stopAudio() {
        if (isPlaying) {
            audioClip.stop();
            audioClip.close();
            isPlaying = false;
        }
    }

    private void repeatAudio() {
        if (isPlaying) {
            audioClip.stop();
            audioClip.close();
            playAudio();
        }
    }
}
