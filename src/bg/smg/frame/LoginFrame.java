package bg.smg.frame;

import bg.smg.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    private JButton loginBtn;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxF;
    private JPasswordField passwordPwdF;
    private JButton fpBtn;
    private JButton signUpBtn;



    public LoginFrame(){

        this.setTitle("Login into Bank App");
        this.setLayout(null);
        this.setSize(400,240);

        loginBtn = new JButton("Login");
        usernameLbl = new JLabel("Username:");
        passwordLbl = new JLabel("Password:");
        usernameTxF = new JTextField();
        passwordPwdF = new JPasswordField();
        fpBtn = new JButton("Forgotten Password");
        signUpBtn = new JButton("Sign Up");

        usernameLbl.setBounds(40,20,100,20);
        usernameTxF.setBounds(140,20,160,20);
        passwordLbl.setBounds(40,60,160,20);
        passwordPwdF.setBounds(140, 60, 160, 20);
        loginBtn.setBounds(140,100,100,20);
        signUpBtn.setBounds(40,140,100,20);
        fpBtn.setBounds(180,140,180,20);

        this.add(loginBtn);
        this.add(usernameLbl);
        this.add(passwordLbl);
        this.add(usernameTxF);
        this.add(passwordPwdF);
        this.add(fpBtn);
        this.add(signUpBtn);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameTxF.getText();
        String password = passwordPwdF.getPassword().toString();
        User user = new User();
        if(username.equals("nmborisova") && password.equals("123456")) {
            new MainFrame(user);
            setVisible(false);
        } else {

        }
    }
}