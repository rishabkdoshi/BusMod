//Admin functions
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;
import java.awt.GridBagConstraints;

class admin {

    JFrame frame = new JFrame("ADMIN");
    JPanel windowContent = new JPanel();
    int X, Y;
    JLabel name = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField username = new JTextField(20);
    JPasswordField passwd = new JPasswordField(20);
    JButton login = new JButton("Login");
    ButtonHandler listener = new ButtonHandler();
    JButton backbut = new JButton("Back");
    ButtonHandler1 butlistener = new ButtonHandler1();

    admin() {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize =
                toolKit.getScreenSize();
        X = screenSize.height;
        Y = screenSize.width;
        frame.setVisible(true);
          frame.setBounds(0,0,2*X,Y);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         frame.setIconImage(new ImageIcon("C:\\Rohit\\Java Stuff\\NetBeans\\busmodfinal\\bus.jpg").getImage());

        login.addActionListener(listener);
        backbut.addActionListener(butlistener);

        windowContent.setLayout(new FlowLayout());


        windowContent.add(name);
        windowContent.add(username);
        windowContent.add(password);
        windowContent.add(passwd);
        windowContent.add(login);
        windowContent.add(backbut);

        frame.setContentPane(windowContent);
        frame.setVisible(true);
       frame.setBounds(0,0,2*X,Y);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private class ButtonHandler implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (username.getText().equalsIgnoreCase("VRL")) {
                if (passwd.getText().equals("vrl1234")) {
                    adminMenu ob = new adminMenu("VRL");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(windowContent, "Incorrect Password", "PASSWORD ERROR", JOptionPane.PLAIN_MESSAGE);
                }
            } else if (username.getText().equalsIgnoreCase("DURGAMBA")) {
                if (passwd.getText().equals("durgamba1234")) {
                    adminMenu ob = new adminMenu("DURGAMBA");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(windowContent, "Incorrect Password", "PASSWORD ERROR", JOptionPane.PLAIN_MESSAGE);
                }
            } else if (username.getText().equalsIgnoreCase("SUGAMA")) {
                if (passwd.getText().equals("sugama1234")) {
                    adminMenu ob = new adminMenu("SUGAMA");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(windowContent, "Incorrect Password", "PASSWORD ERROR", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(windowContent, "Incorrect Username or Password", "ERROR", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
     private class ButtonHandler1 implements ActionListener
    {
       // String newSelection;
        @Override
        public void actionPerformed(ActionEvent e) 
        {
           Main ob=new Main();
          frame.dispose();
         
        }
        
      
    }  
    
}
