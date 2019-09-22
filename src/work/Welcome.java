package work;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sirat
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("img/logo2.png");
        setIconImage(icon.getImage());
        setTitle("Renowned Global Solution Data Management");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myComboBox = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(140, 240, 230));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Data Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 180, 470, 51);

        myComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Builder", "Bricklayer", "Boiler", "Carpenter", "Construction Manager", "Electrician", "Farmer", "Handyman", "House Extension", "Labourer" , "Loft Conversion", "Painter" , "Plasterer", "Plumber" , "Refurbishment", "Roofer", "Tiller", "Data"  }));
        myComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(myComboBox);
        myComboBox.setBounds(260, 290, 340, 30);

        jLabel2.setText("Please Select Work Type To Entry Data ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 260, 248, 14);

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        getContentPane().add(goButton);
        goButton.setBounds(390, 350, 74, 37);

        iconLabel.setIcon(new javax.swing.ImageIcon("img/back.jpg"));
        getContentPane().add(iconLabel);
        iconLabel.setBounds(-80, -170, 1230, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myComboBoxActionPerformed

    }//GEN-LAST:event_myComboBoxActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        Object Name = myComboBox.getSelectedItem();
        String ss = Name.toString();

        //  new InputForm(ss);
        //  "", "", "", "", "", "", "", "", "", "" , "", "" , "", "" , "", "", "", ""
        if (ss.equalsIgnoreCase("Builder")) {
            ss = "builder";
        } else if (ss.equalsIgnoreCase("Bricklayer")) {
            ss = "bricklayer";
        } else if (ss.equalsIgnoreCase("Boiler")) {
            ss = "boiler";
        } else if (ss.equalsIgnoreCase("Carpenter")) {
            ss = "carpenter";
        } else if (ss.equalsIgnoreCase("Construction Manager")) {
            ss = "construction_manager";
        } else if (ss.equalsIgnoreCase("Electrician")) {
            ss = "electrician";
        } else if (ss.equalsIgnoreCase("Farmer")) {
            ss = "farmer";
        } else if (ss.equalsIgnoreCase("Handyman")) {
            ss = "handyman";
        } else if (ss.equalsIgnoreCase("House Extension")) {
            ss = "house_extension";
        } else if (ss.equalsIgnoreCase("Labourer")) {
            ss = "labourer";
        } else if (ss.equalsIgnoreCase("Loft Conversion")) {
            ss = "loft_conversion";
        } else if (ss.equalsIgnoreCase("Painter")) {
            ss = "painter";
        } else if (ss.equalsIgnoreCase("Plasterer")) {
            ss = "plasterer";
        } else if (ss.equalsIgnoreCase("Plumber")) {
            ss = "plumber";
        } else if (ss.equalsIgnoreCase("Refurbishment")) {
            ss = "refurbishment";
        } else if (ss.equalsIgnoreCase("Roofer")) {
            ss = "roofer";
        } else if (ss.equalsIgnoreCase("Tiller")) {
            ss = "tiller";
        } else if (ss.equalsIgnoreCase("Data")) {
            ss = "data";
        }
        new InputForm(ss);

        dispose();


    }//GEN-LAST:event_goButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goButton;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> myComboBox;
    // End of variables declaration//GEN-END:variables
}