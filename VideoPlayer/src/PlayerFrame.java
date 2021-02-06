import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerFrame {
    public static void main(String[] args) {
        //1.显示主窗体
        JFrame videoFrame = new JFrame("我的视频播放器");
        videoFrame.setSize(1000, 600);
        videoFrame.setLocationRelativeTo(null);
        videoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //2.添加视频播放器
        Container contentPane = videoFrame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        //创建一个播放器对象
        EmbeddedMediaPlayerComponent player = new EmbeddedMediaPlayerComponent();
        contentPane.add(player, BorderLayout.CENTER);

        //3.添加下侧面板和三个按钮
        JButton butPlay = new JButton("播放");
        butPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.getMediaPlayer().play();
            }
        });
        JButton butStop = new JButton("停止");
        butStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.getMediaPlayer().stop();
            }
        });
        JButton butPause = new JButton("暂停");
        butPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.getMediaPlayer().pause();
            }
        });

        JPanel bottomPane = new JPanel();
        bottomPane.add(butPlay);
        bottomPane.add(butStop);
        bottomPane.add(butPause);

        contentPane.add(bottomPane, BorderLayout.SOUTH);

    }
}