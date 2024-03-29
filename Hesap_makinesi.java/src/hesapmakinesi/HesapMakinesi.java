/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hesapmakinesi;

/**
 *
 * @author azizn
 */
public class HesapMakinesi extends javax.swing.JFrame {

    /**
     * Creates new form HesapMakinesii
     */
    public HesapMakinesi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toplama = new javax.swing.JButton();
        cikarma = new javax.swing.JButton();
        carpma = new javax.swing.JButton();
        bolme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        birinci_sayi = new javax.swing.JTextField();
        sonuc = new javax.swing.JTextField();
        ikinci_sayi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toplama.setText("+");
        toplama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamaActionPerformed(evt);
            }
        });

        cikarma.setText("-");
        cikarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarmaActionPerformed(evt);
            }
        });

        carpma.setText("*");
        carpma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpmaActionPerformed(evt);
            }
        });

        bolme.setText("/");
        bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolmeActionPerformed(evt);
            }
        });

        jLabel1.setText("Birinci Sayi :");

        jLabel2.setText("Ikinci Sayi : ");

        jLabel3.setText("Sonuc : ");

        sonuc.setEditable(false);
        sonuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonucActionPerformed(evt);
            }
        });

        jLabel4.setText("Sayilari Girin ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sonuc)
                            .addComponent(ikinci_sayi)
                            .addComponent(birinci_sayi)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toplama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cikarma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carpma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(birinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ikinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplama)
                    .addComponent(cikarma)
                    .addComponent(carpma)
                    .addComponent(bolme))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sonucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonucActionPerformed

    private void toplamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamaActionPerformed
        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi+ikinci_sayi));
        
    }//GEN-LAST:event_toplamaActionPerformed

    private void cikarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarmaActionPerformed

        
        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi-ikinci_sayi));
    }//GEN-LAST:event_cikarmaActionPerformed

    private void carpmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpmaActionPerformed

        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi*ikinci_sayi));


    }//GEN-LAST:event_carpmaActionPerformed

    private void bolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolmeActionPerformed

        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf((double)birinci_sayi/ikinci_sayi));

    }//GEN-LAST:event_bolmeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birinci_sayi;
    private javax.swing.JButton bolme;
    private javax.swing.JButton carpma;
    private javax.swing.JButton cikarma;
    private javax.swing.JTextField ikinci_sayi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton toplama;
    // End of variables declaration//GEN-END:variables
}
