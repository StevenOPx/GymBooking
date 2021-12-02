package Project;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GymApp extends JFrame implements ActionListener {

        JMenu membershipMenu;
        JMenu bookingMenu;
        JMenu classMenu;
        JLabel message;
        JPanel mainPanel;
        JPanel buttonShort;
        JButton membershipButton;
        JButton bookingButton;
        JButton classButton;


        TitledBorder titledBorder;
        ArrayList<Membership> memberships = new ArrayList<>();
        private Membership membership;

        public GymApp() {

            setTitle("Gym Booking System");
            setSize(400,250);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            setLayout(new GridBagLayout());

            createMembershipMenu();
            createBookingMenu();
            createClassMenu();

            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);
            menuBar.setBackground(Color.DARK_GRAY);

            /**
             * Addition of file menu
             */
            menuBar.add(membershipMenu);
            menuBar.add(bookingMenu);
            menuBar.add(classMenu);

            mainPanel = new JPanel();
            mainPanel.add(Box.createVerticalStrut(15));
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

            buttonShort = new JPanel();

            titledBorder = new TitledBorder("Shortcut Menu");
            titledBorder.setTitlePosition(TitledBorder.CENTER);
            titledBorder.setTitleColor(Color.BLACK);

            buttonShort.setPreferredSize(new Dimension(400,50));
            buttonShort.setLayout(new GridLayout(1,2));
            buttonShort.setBorder(titledBorder);

            membershipButton = new JButton("Register Staff");
            membershipButton.addActionListener(this);
            buttonShort.add(membershipButton);

            bookingButton = new JButton("Make Booking");
            bookingButton.addActionListener(this);
            buttonShort.add(bookingButton);

            classButton = new JButton("Class Type");
            classButton.addActionListener(this);
            buttonShort.add(classButton);

            add(mainPanel);
            add(buttonShort);

            //open();
        }

    /*public void addMembership() {

        final String[] membershipList = {""}
    }*/

        public void createMembershipMenu() {
            JMenuItem item;

            membershipMenu = new JMenu("Membership");
            membershipMenu.setMnemonic(KeyEvent.VK_M);

            item = new JMenuItem("Register Member");
            item.setMnemonic(KeyEvent.VK_R);
            item.addActionListener(this);
            membershipMenu.add(item);

            item = new JMenuItem("View Member");
            item.setMnemonic(KeyEvent.VK_V);
            item.addActionListener(this);
            membershipMenu.add(item);

            item = new JMenuItem("Delete Member");
            item.addActionListener(this);
            item.setMnemonic(KeyEvent.VK_D);
            membershipMenu.add(item);

            membershipMenu.addSeparator();

            item = new JMenuItem("Quit");
            item.addActionListener(this);
            membershipMenu.add(item);
        }

        public void createBookingMenu() {
            JMenuItem item;

            bookingMenu = new JMenu("Booking");
            bookingMenu.setMnemonic(KeyEvent.VK_B);

            item = new JMenuItem("Make Booking");
            item.setMnemonic(KeyEvent.VK_M);
            item.addActionListener(this);
            bookingMenu.add(item);

            item = new JMenuItem("Modify Booking");
            item.setMnemonic(KeyEvent.VK_M);
            item.addActionListener(this);
            bookingMenu.add(item);

            item = new JMenuItem("Cancel Booking");
            item.setMnemonic(KeyEvent.VK_C);
            item.addActionListener(this);
            bookingMenu.add(item);
        }

        public void createClassMenu() {
            JMenuItem item;

            classMenu = new JMenu("Class");
            classMenu.setMnemonic(KeyEvent.VK_C);

            item = new JMenuItem("Location");
            item.setMnemonic(KeyEvent.VK_L);
            item.addActionListener(this);
            classMenu.add(item);

            item = new JMenuItem("Duration");
            item.setMnemonic(KeyEvent.VK_D);
            item.addActionListener(this);
            classMenu.add(item);

            item = new JMenuItem("Class Type");
            item.setMnemonic(KeyEvent.VK_T);
            item.addActionListener(this);
            classMenu.add(item);
        }


        @Override
        public void actionPerformed(ActionEvent e) {

            String menuName = e.getActionCommanmd();

            if(menuName == "Register Member" || e.getSource() == )

/*        if(menuName.equals(""))
            System.exit(0);
        else
            message.setText("Menu Item " + menuName + " is selected");*/
        }
    }
