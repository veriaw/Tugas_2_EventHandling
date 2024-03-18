/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasframe;

import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
class frameLogin extends JFrame{
    JLabel greet = new JLabel("Selamat Datang!");
    JLabel content = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    JLabel password = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    JLabel kelamin = new JLabel("Jenis Kelamin");
    JRadioButton laki = new JRadioButton("Laki-Laki");
    JRadioButton perempuan = new JRadioButton("Perempuan");
    JButton login = new JButton("Login");
    frameLogin(){
        setVisible(true);
        setSize(720,480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(greet);
        greet.setBounds(20, 20, 400, 24);
        greet.setFont(greet.getFont().deriveFont(20f));
        
        add(content);
        content.setBounds(20, 45, 500, 24);
        content.setFont(content.getFont().deriveFont(14f));
        
        add(username);
        username.setBounds(20, 70, 500, 24);
        username.setFont(username.getFont().deriveFont(14f));
        
        add(inputUsername);
        inputUsername.setBounds(20, 100, 400, 24);
        
        add(password);
        password.setBounds(20, 125, 500, 24);
        password.setFont(password.getFont().deriveFont(14f));
        
        add(inputPassword);
        inputPassword.setBounds(20, 155, 400, 24);
        
        add(kelamin);
        kelamin.setBounds(20, 185, 500, 24);
        kelamin.setFont(kelamin.getFont().deriveFont(14f));
        
        add(laki);
        laki.setBounds(20, 210, 100, 24);
        
        add(perempuan);
        perempuan.setBounds(140, 210, 100, 24);
        
        add(login);
        login.setBounds(20, 240, 400, 24);
    }
}

public class login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1. Login Menu");
        System.out.println("2. Halaman Utama");
        System.out.println("Pilih Menu : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                frameLogin login = new frameLogin();
                break;
            case 2:
                frameMenu menu = new frameMenu();
                break;
            default:
                break;
        }
    }
    
}
