/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasframe;
import javax.swing.*;

 class frameMenu extends JFrame{
     JLabel greet = new JLabel("Welcome, [Mr./Mrs.][Username]");
     JLabel content = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
     JLabel panjang = new JLabel("Panjang");
     JLabel lebar = new JLabel("Lebar");
     JLabel tinggi = new JLabel("Tinggi");
     JTextField inputPanjang = new JTextField();
     JTextField inputLebar = new JTextField();
     JTextField inputTinggi = new JTextField();
     JButton hitung = new JButton();
     JButton reset = new JButton();
     JLabel hasil = new JLabel("Hasil");
     JLabel luas = new JLabel("Luas Persegi");
     JLabel keliling = new JLabel("Keliling Persegi");
     JLabel volume = new JLabel("Volume Balok");
     JLabel luasPermukaan = new JLabel("Luas Permukaan Balok");
     JLabel hasil1 = new JLabel("[Hasil berupa Angka]");
     JLabel hasil2 = new JLabel("[Hasil berupa Angka]");
     JLabel hasil3 = new JLabel("[Hasil berupa Angka]");
     JLabel hasil4 = new JLabel("[Hasil berupa Angka]");
     frameMenu(){
         setVisible(true);
         setSize(720,480);
         setTitle("Halaman Utama");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);
         
         add(greet);
         greet.setBounds(20, 20, 400, 24);
         greet.setFont(greet.getFont().deriveFont(20f));
         
         add(content);
         content.setBounds(20, 40, 500, 24);
         content.setFont(content.getFont().deriveFont(14f));
         
         add(panjang);
         panjang.setBounds(20, 75, 100, 24);
         panjang.setFont(panjang.getFont().deriveFont(14f));
         
         add(inputPanjang);
         inputPanjang.setBounds(130, 75, 400, 24);
         
         add(lebar);
         lebar.setBounds(20, 110, 100, 24);
         lebar.setFont(lebar.getFont().deriveFont(14f));
         
         add(inputLebar);
         inputLebar.setBounds(130, 110, 400, 24);
         
         add(tinggi);
         tinggi.setBounds(20, 145, 110, 24);
         tinggi.setFont(tinggi.getFont().deriveFont(14f));
         
         add(inputTinggi);
         inputTinggi.setBounds(130, 145, 400, 24);
         
         add(hitung);
         hitung.setBounds(20, 180, 510, 25);
         hitung.setText("Hitung");
         
         add(reset);
         reset.setBounds(20, 220, 510, 25);
         reset.setText("Reset");
         
         add(hasil);
         hasil.setBounds(260, 250, 50, 24);
         
         add(luas);
         luas.setBounds(20, 270, 100, 24);
         add(hasil1);
         hasil1.setBounds(230, 270, 150, 24);
         
         add(keliling);
         keliling.setBounds(20, 290, 100, 24);
         add(hasil2);
         hasil2.setBounds(230, 290, 150, 24);

         add(volume);
         volume.setBounds(20, 310, 100, 24);
         add(hasil3);
         hasil3.setBounds(230, 310, 150, 24);
         
         add(luasPermukaan);
         luasPermukaan.setBounds(20, 330, 100, 24);
         add(hasil4);
         hasil4.setBounds(230, 330, 150, 24);
     }
 }
/**
 *
 * @author Lenovo
 */
public class menu {
    
}
