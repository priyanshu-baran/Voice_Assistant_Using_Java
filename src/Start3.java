import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.*;
import java.util.concurrent.*;

public class Start3 extends JFrame{
    Start3(){
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> setVisible(false);
        scheduler.schedule(task,13200,TimeUnit.MILLISECONDS);
        scheduler.shutdown();
        URL url = Start3.class.getResource("Items/2.gif");
        assert url!=null;
        ImageIcon icon = new ImageIcon(url);
        Image i2=icon.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        audio();
        add(label);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
    }
    public static void audio(){
        try {
            String filePath="D:\\Priyanshu\\Intellij Idea Projects\\Voice Assistant\\src\\Items\\2.wav";
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()));
            clip.start();
        } catch (Exception e) {
            System.err.println("Error in playing or finding the .wav file...!!!");
        }
    }
}