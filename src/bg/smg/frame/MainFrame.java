package bg.smg.frame;

import bg.smg.model.Account;
import bg.smg.model.User;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;


public class MainFrame extends JFrame implements ItemListener, ActionListener {
    private User currentUser;
    private JLabel bannerLbl;
    private ImageIcon bannerIcn;
    private JLabel screenTitle;

    static JFrame mainFr;
    static JComboBox menuAccounts;


    public MainFrame(User currentUser){
        this.currentUser = currentUser;

        mainFr = new JFrame();
        mainFr.setSize(600,500);
        mainFr.setTitle("Bank App");
        mainFr.setLayout(new FlowLayout());

        //bannerIcn = new ImageIcon("resources/bankBanner.png");
        Image image = new ImageIcon("resources/bankBanner.png").getImage();
        Image scaledInstance = image.getScaledInstance(300, 75, Image.SCALE_SMOOTH);
        bannerIcn = new ImageIcon(scaledInstance);
        bannerLbl = new JLabel(bannerIcn);

        JPanel bannerPanel = new JPanel();
        bannerPanel.add(bannerLbl);
        bannerPanel.setSize(600,100);
        bannerPanel.setBorder(new LineBorder(Color.BLUE));
        mainFr.add(bannerPanel);


        List<Account> currentUserAccounts = currentUser.getBankAccounts();
        List<String> currentUserIbans = new ArrayList<>();
        for(Account account : currentUserAccounts) {
            currentUserIbans.add(account.getIBAN());
        }
        menuAccounts = new JComboBox(currentUserIbans.toArray());
        menuAccounts.setBounds(0, 100, 200, 50);
        menuAccounts.addItemListener(this);

        menuAccounts.addItemListener(this);
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(new LineBorder(Color.RED));
        menuPanel.add(menuAccounts);
        mainFr.add(menuPanel);

        mainFr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFr.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * Invoked when an item has been selected or deselected by the user.
     * The code written for this method performs the operations
     * that need to occur when an item is selected (or deselected).
     *
     * @param e the event to be processed
     */
    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}

/* public class MainFrame extends {
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
} */