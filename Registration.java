import javax.swing.*;

public class Registration extends JFrame {

    private JButton jButton1;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1, jTextField2, jTextField3, jTextField4;

    public Registration() {
        initComponents();
    }

    private void initComponents() {
        // Set the layout to null for manual positioning
        setLayout(null);

        // Labels
        jLabel1 = new JLabel("Username:");
        jLabel2 = new JLabel("Email:");
        jLabel3 = new JLabel("Password:");
        jLabel4 = new JLabel("Phone number:");
        jLabel5 = new JLabel("DOB:");

        // Text Fields
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jTextField4 = new JTextField();
        jTextField3 = new JTextField();

        // Button
        jButton1 = new JButton("Register");

        // Set bounds (x, y, width, height)
        jLabel1.setBounds(30, 20, 100, 25);
        jTextField1.setBounds(140, 20, 200, 25);

        jLabel2.setBounds(30, 60, 100, 25);
        jTextField2.setBounds(140, 60, 200, 25);

        jLabel3.setBounds(30, 100, 100, 25);
        jPasswordField1.setBounds(140, 100, 200, 25);

        jLabel4.setBounds(30, 140, 100, 25);
        jTextField4.setBounds(140, 140, 200, 25);

        jLabel5.setBounds(30, 180, 100, 25);
        jTextField3.setBounds(140, 180, 200, 25);

        jButton1.setBounds(30, 230, 310, 30);

        // Add to frame
        add(jLabel1); add(jTextField1);
        add(jLabel2); add(jTextField2);
        add(jLabel3); add(jPasswordField1);
        add(jLabel4); add(jTextField4);
        add(jLabel5); add(jTextField3);
        add(jButton1);

        // Button action
        jButton1.addActionListener(e -> {
            String username = jTextField1.getText();
            String email = jTextField2.getText();
            String password = new String(jPasswordField1.getPassword());
            String phone = jTextField4.getText();
            String dob = jTextField3.getText();

            JOptionPane.showMessageDialog(this,
                    "Registered:\nUsername: " + username +
                            "\nEmail: " + email +
                            "\nPhone: " + phone +
                            "\nDOB: " + dob);
        });

        // Frame settings
        setTitle("Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Registration().setVisible(true));
    }
}
