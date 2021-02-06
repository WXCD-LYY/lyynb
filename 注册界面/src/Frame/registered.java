package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registered extends JFrame {
    public registered() {
        super();
        this.setTitle("注册");
        //创建容器
        Container cont = getContentPane();
        //设置为自由布局
        this.setLayout(null);
        //各组件的创建
        JLabel jl1 = new JLabel("请输入昵称：");                    //标签框
        JTextField jtf1 = new JTextField();                        //文本框
        JLabel jl2 = new JLabel("请输入登录密码：");
        JPasswordField jpf1 = new JPasswordField();                //密码框
        jpf1.setEchoChar('*');                                    //设置密码字符为*
        JLabel jl3 = new JLabel("再次输入登录密码：");
        JPasswordField jpf2 = new JPasswordField();
        jpf2.setEchoChar('*');
        JLabel jl4 = new JLabel("请选择性别：");                    //单选框
        JRadioButton jrb1 = new JRadioButton("男");
        JRadioButton jrb2 = new JRadioButton("女");
        ButtonGroup bg = new ButtonGroup();                        //一定将单选框加入进去，不然男女能同时选择
        bg.add(jrb1);
        bg.add(jrb2);
        jrb1.setSelected(true);                                    //设置默认为男
        JLabel jl5 = new JLabel("请选择城市：");                    //下拉框
        JComboBox jcb = new JComboBox();
        jcb.addItem("北京");
        jcb.addItem("天津");
        jcb.addItem("武汉");
        jcb.addItem("南京");
        jcb.addItem("上海");
        jcb.addItem("哈尔滨");
        jcb.addItem("苏州");
        jcb.addItem("杭州");
        jcb.addItem("西安");
        jcb.addItem("重庆");
        jcb.addItem("云南");
        jcb.addItem("鞍山");
        jcb.addItem("齐齐哈尔");
        jcb.addItem("香港");
        jcb.addItem("澳门");
        jcb.addItem("台湾");
        jcb.setSelectedIndex(0);
        JLabel jl6 = new JLabel("个性签名：");
        JTextArea  jta2 = new JTextArea();
        jta2.setLineWrap(true);                                    //设置文本框为自动换行
        JScrollPane jsp = new JScrollPane(jta2);                //设置文本框有滚动条
        JButton jb1 = new JButton("申请账号");                    //按钮
        JButton jb2 = new JButton("重置信息");
        //申请账号
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //判断两次密码是否一致，一致时弹出成功，不一致时提示不一致并情况两次填写的密码框
                String str1 = new String(jpf1.getPassword());    //先将密码转换为String类型，然后再比较
                String str2 = new String(jpf2.getPassword());
                if(str1.equals(str2)){
                    JOptionPane.showMessageDialog(null, "申请成功！您的账号是："+12323+"；密码是："+jpf1.getText());
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"两次输入的密码不一致，请重新输入！");
                    jpf1.setText("");
                    jpf2.setText("");
                }
                //JOptionPane.showMessageDialog(null, "申请成功！您的账号是："+12323+"；密码是："+jpf1.getText());
            }
        });

        // 重置信息
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //清空
                jtf1.setText("");
                jpf1.setText("");
                jpf2.setText("");
                jrb1.setSelected(true);
                jcb.setSelectedIndex(0);
                jta2.setText("");
            }
        });
        //将空间加入到Container容器里面
        cont.add(jl1);
        cont.add(jtf1);
        cont.add(jl2);
        cont.add(jpf1);
        cont.add(jl3);
        cont.add(jpf2);
        cont.add(jl4);
        cont.add(jrb1);
        cont.add(jrb2);
        cont.add(jl5);
        cont.add(jcb);
        cont.add(jl6);
        cont.add(jsp);
        cont.add(jb1);
        cont.add(jb2);
        //控制各组件的位置及大小
        jl1.setBounds(30, 20, 120, 20);
        jtf1.setBounds(150, 20, 200, 20);
        jl2.setBounds(30, 50, 120, 20);
        jpf1.setBounds(150, 50, 200, 20);
        jl3.setBounds(30, 80, 120, 20);
        jpf2.setBounds(150, 80, 200, 20);
        jl4.setBounds(30, 110, 120, 20);
        jrb1.setBounds(190, 110, 50, 20);
        jrb2.setBounds(260, 110, 50, 20);
        jl5.setBounds(30, 140, 120, 20);
        jcb.setBounds(150, 140, 200, 20);
        jl6.setBounds(30, 170, 120, 20);
        jsp.setBounds(150, 170, 200, 80);
        jb1.setBounds(80, 280, 100, 20);
        jb2.setBounds(200, 280, 100, 20);
        //设置窗体大小、位置、关闭方式、不允许拉伸及显示
        this.setBounds(500, 260, 400, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //调用构造方法
        new registered();
    }

}
















