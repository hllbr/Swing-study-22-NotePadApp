
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class anasayfa1 extends javax.swing.JFrame {
    public anasayfa1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazı_alanı = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yazı_alanı.setColumns(20);
        yazı_alanı.setRows(5);
        jScrollPane1.setViewportView(yazı_alanı);

        jMenu3.setText("Dosya");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Dosya Aç");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Dosya Kaydet");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Çıkış");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Düzenle");

        jMenu1.setText("Renk");

        jMenuItem5.setText("Renk Değiştir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenu4.add(jMenu1);

        jMenu2.setText("Yazı Tipi");

        jMenuItem6.setText("Arial");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Times New Roman");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenu4.add(jMenu2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    //Dosya aç basıldığında ne yapılmasını istiyorsak bu alana yazıyorum
    //Dosya aça basıldığında bir adet filechooser açmak istiyorum
        JFileChooser fc = new JFileChooser();//Dosya seçtirme itemim
        int i = fc.showOpenDialog(this);
        if(i == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            //dosyayı seçtik ve bu seçili dosya üzerinde okuma yapıyorum
            
            try(Scanner scn = new Scanner(new BufferedReader(new FileReader(file)))){
                //okuma işlemi için gerekli tanımlama try and resource içerisinde gerçekleştirdim
                String icerik = "";//okuduğum her içeriği bu değişkene ekliyorum ve en son yazı alanına gönderiyorum
                //BufferedReader kullanmamın sebebi \n ile uyumlu çalışması
                while(scn.hasNextLine()){
                    icerik += scn.nextLine()+"\n";//burada \n textarea için alt satıra geçmesi için kullandım
                    
                    
                }
                //Döngüm tamamlandığında gidecek eleman kalmadığında textarea içerisine içerik değerimi atıyorum
                yazı_alanı.setText(icerik);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(anasayfa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    //Dosya Kaydetme işlemlerimi gerçekleştirdiğim alan 
    /*
    bu alan içerisinde filechooser açmam gerekiyor.Bu sefer file chooser üzerinde okuma yapmıyouz okunmuş dosya üzerinde yazma işlemi yapmam gerekiyor
    SHOWOPENDİALOG DEĞİL SHOWSAVEDİALOG KULLANMAM GEREKİYOR.
    
    */
        JFileChooser fc = new JFileChooser();
        int icevap = fc.showSaveDialog(this);
        //bu alanda onaylama yada reddetme durumunu kontrol etmem gerekiyor.
        if(icevap == JFileChooser.APPROVE_OPTION){
            //ONAYLAMA TUŞUNA BASILMIŞSA GERÇEKLEŞTİRİLECEK İŞLEMLER
            //burada bir yere bir dosya kaydetmeye çalışıyoruz 
            //dosyayı kaydettiğim yeri filechooserdan almam gerek
            //bilgisyarda dosyanın yolunu bulmak için ...
            String dosya_yolu = fc.getSelectedFile().getPath();//dosya yolunu bu yapı ile aldım
            //bu yola göre text area içerisindeki içeriği yerleştiriyorum
            //scanner ile işim yok artık bir dosya üzerinde yazma işlemi yapmak istiyorum
            
            try(FileWriter fw = new FileWriter(dosya_yolu)){
               //yazma işleminin hangi lokasyona yapılacağını belirttim
               fw.write(yazı_alanı.getText());//yazı alanı içerisindeki texti aktardım(yazdım)
            } catch (IOException ex) {
                Logger.getLogger(anasayfa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        //Çıkış İşlemini gerçekleştirdiğim alan 
        int iicevap = JOptionPane.showConfirmDialog(this, "çıkış yapmak istiyor musunuz ? ","çıkış",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(iicevap == JOptionPane.YES_OPTION){
          System.exit(0);  
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    //arial yazı tipine geçiş için gerekli işlemlerim
        Font ft = new Font("Arial",Font.PLAIN,20);//burada bir font oluşturmuş oldum
        //be şekilde ifade edildiğinde yazı tipi arial,fontu plain text olacak,boyutu ise 20 olacak
        yazı_alanı.setFont(ft);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    //Yazı renk değişikliklerini gerçekleştirğim alan 
        Color cs = JColorChooser.showDialog(this,"lütfen bir renk seçin..!", Color.DARK_GRAY);
        yazı_alanı.setForeground(cs);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Times new Roman için gerekli işlemlerimi yaptığım alan 
        Font tf = new Font("Times New Roman",Font.PLAIN,18);
        yazı_alanı.setFont(tf);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(anasayfa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anasayfa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anasayfa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anasayfa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anasayfa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea yazı_alanı;
    // End of variables declaration//GEN-END:variables
}
