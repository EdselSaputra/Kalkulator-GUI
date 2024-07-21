package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textAngka2;
    private JTextField txtAngka1;
    private JLabel lblHasil;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    kalkulator frame = new kalkulator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public kalkulator() {
        setTitle("Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1013, 529);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textAngka2 = new JTextField();
        textAngka2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        textAngka2.setBounds(351, 173, 163, 42);
        contentPane.add(textAngka2);
        textAngka2.setColumns(10);

        txtAngka1 = new JTextField();
        txtAngka1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        txtAngka1.setColumns(10);
        txtAngka1.setBounds(102, 173, 163, 42);
        contentPane.add(txtAngka1);

        JButton btnTambah = new JButton("+");
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(txtAngka1.getText());
                    double angka2 = Double.parseDouble(textAngka2.getText());
                    double hasil = angka1 + angka2;
                    lblHasil.setText("Hasil: " + hasil);
                    System.out.println("Hasil Tambah: " + hasil);
                } catch (NumberFormatException ex) {
                    lblHasil.setText("Input tidak valid");
                    System.out.println("Input tidak valid");
                }
            }
        });
        btnTambah.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnTambah.setBounds(119, 270, 90, 42);
        contentPane.add(btnTambah);

        JButton btnKurang = new JButton("-");
        btnKurang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(txtAngka1.getText());
                    double angka2 = Double.parseDouble(textAngka2.getText());
                    double hasil = angka1 - angka2;
                    lblHasil.setText("Hasil: " + hasil);
                    System.out.println("Hasil Kurang: " + hasil);
                } catch (NumberFormatException ex) {
                    lblHasil.setText("Input tidak valid");
                    System.out.println("Input tidak valid");
                }
            }
        });
        btnKurang.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnKurang.setBounds(119, 334, 90, 42);
        contentPane.add(btnKurang);

        JButton btnBagi = new JButton("/");
        btnBagi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(txtAngka1.getText());
                    double angka2 = Double.parseDouble(textAngka2.getText());
                    if (angka2 != 0) {
                        double hasil = angka1 / angka2;
                        lblHasil.setText("Hasil: " + hasil);
                        System.out.println("Hasil Bagi: " + hasil);
                    } else {
                        lblHasil.setText("Tidak bisa bagi 0");
                        System.out.println("Tidak bisa bagi 0");
                    }
                } catch (NumberFormatException ex) {
                    lblHasil.setText("Input tidak valid");
                    System.out.println("Input tidak valid");
                }
            }
        });
        btnBagi.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnBagi.setBounds(119, 392, 90, 42);
        contentPane.add(btnBagi);

        JButton btnKali = new JButton("x");
        btnKali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(txtAngka1.getText());
                    double angka2 = Double.parseDouble(textAngka2.getText());
                    double hasil = angka1 * angka2;
                    lblHasil.setText("Hasil: " + hasil);
                    System.out.println("Hasil Kali: " + hasil);
                } catch (NumberFormatException ex) {
                    lblHasil.setText("Input tidak valid");
                    System.out.println("Input tidak valid");
                }
            }
        });
        btnKali.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnKali.setBounds(242, 270, 90, 42);
        contentPane.add(btnKali);

        JButton btnModulus = new JButton("%");
        btnModulus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(txtAngka1.getText());
                    double angka2 = Double.parseDouble(textAngka2.getText());
                    double hasil = angka1 % angka2;
                    lblHasil.setText("Hasil: " + hasil);
                    System.out.println("Hasil Modulus: " + hasil);
                } catch (NumberFormatException ex) {
                    lblHasil.setText("Input tidak valid");
                    System.out.println("Input tidak valid");
                }
            }
        });
        btnModulus.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnModulus.setBounds(242, 334, 90, 42);
        contentPane.add(btnModulus);

        JLabel lblAngka1 = new JLabel("Masukan Angka1");
        lblAngka1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblAngka1.setBounds(104, 93, 204, 34);
        contentPane.add(lblAngka1);

        JLabel lblAngka2 = new JLabel("Masukan Angka2");
        lblAngka2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblAngka2.setBounds(351, 93, 204, 34);
        contentPane.add(lblAngka2);

        lblHasil = new JLabel("");
        lblHasil.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblHasil.setBounds(709, 132, 204, 125);
        contentPane.add(lblHasil);
    }
}
