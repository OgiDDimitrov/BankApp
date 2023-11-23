package bg.smg.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MainFrame extends JFrame  {
    private JLabel bannerLbl;
    private ImageIcon bannerIcn;
    private JLabel screenTitle;


    public MainFrame(){
        this.setSize(600,500);
        this.setTitle("Bank App");

        //bannerIcn = new ImageIcon("resources/bankBanner.png");
        Image image = new ImageIcon("resources/bankBanner.png").getImage();
        Image scaledInstance = image.getScaledInstance(300, 75, Image.SCALE_SMOOTH);
        bannerIcn = new ImageIcon(scaledInstance);

        bannerLbl = new JLabel(bannerIcn);
        bannerLbl.setVerticalAlignment(SwingConstants.TOP);


        this.add(bannerLbl);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}