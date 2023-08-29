import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MusicPlayer extends Applet implements ActionListener{
	AudioClip music;
	Button playButton, stopButton, resetButton;
	
	public void init(){
		music = getAudioClip(getBaseCode(),"music.wav");
		
		playButton = new Button("Play");
		stopButton = new Button("Stop");
		resetButton = new Button("Reset");
		
		playButton.addActionListener(this);
		stopButton.addActionListener(this);
		resetButton.addActionListener(this);
		
		add(playButton);
		add(stopButton);
		add(resetButton);
	}

	
public void actionPerformed(ActionEvent e){
	if(e.getSource() == playButton){
		music.play();
	}else if(e.getSource() == stopButton){
		music.stop();
	}else if(e.getSource() == resetButton){
		music.stop();
		music = getAudioClip(getBaseCode(),"music.wav");
	}
}
}