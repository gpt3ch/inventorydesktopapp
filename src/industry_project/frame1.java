/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package industry_project;

/**
 *
 * @author sharma1
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelly = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Industry_SoftMania");
        getContentPane().setLayout(null);

        labelly.setFont(new java.awt.Font("Times New Roman", 1, 68));
        labelly.setText("                WELCOME ");
        labelly.setBounds(290, 170, 910, 140);
        jDesktopPane1.add(labelly, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Signout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(10, 10, 80, 23);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jButton2.setText("View Items");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(720, 40, 150, 35);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1570, 830);

        jMenu1.setText("Employee");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/new.png"))); // NOI18N
        jMenuItem1.setText("Add Employee");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/edit.png"))); // NOI18N
        jMenuItem2.setText("Update/Delete Employee");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/veiw.png"))); // NOI18N
        jMenuItem13.setText("View By Category");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Products");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/new.png"))); // NOI18N
        jMenuItem10.setText("Add Products");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/veiw.png"))); // NOI18N
        jMenuItem12.setText("View by Category");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/edit.png"))); // NOI18N
        jMenuItem9.setText("Update Products");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Misc");

        jMenuItem14.setText("Add Company");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem11.setText("Add Product Type");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Manager");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/new.png"))); // NOI18N
        jMenuItem4.setText("Add Manager");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/edit.png"))); // NOI18N
        jMenuItem5.setText("Edit/Delete Manager");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Bill");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/new.png"))); // NOI18N
        jMenuItem15.setText("New Bill");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/veiw.png"))); // NOI18N
        jMenuItem16.setText("View Bill");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/industry_project/veiw.png"))); // NOI18N
        jMenuItem18.setText("View Bill by Date");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1585, 888);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        menu obj1 = new menu();
        jDesktopPane1.add(obj1);
        obj1.setVisible(true);
        labelly.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        editpage obj1 = new editpage();
        jDesktopPane1.add(obj1);
        obj1.setVisible(true);

        labelly.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        manager1 obj1 = new manager1();
        jDesktopPane1.add(obj1);
        obj1.setVisible(true);
        labelly.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        editmanager obj1 = new editmanager();
        jDesktopPane1.add(obj1);
        obj1.setVisible(true);
        labelly.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        updateproducts obj = new updateproducts();
        jDesktopPane1.add(obj);
        obj.setVisible(true);

        labelly.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        productsrate obj = new productsrate();
        jDesktopPane1.add(obj);
        obj.setVisible(true);

        labelly.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        subcategory obj = new subcategory();
        jDesktopPane1.add(obj);
        obj.setVisible(true);

        labelly.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        viewproducts1 obj = new viewproducts1();
        jDesktopPane1.add(obj);
        obj.setVisible(true);

        labelly.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        viewemployee1 obj = new viewemployee1();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        labelly.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Company obj = new Company();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        labelly.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        billing obj = new billing();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        labelly.setVisible(false);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login obj = new login();
        obj.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        viewbill obj = new viewbill();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        labelly.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        viewbill1 obj = new viewbill1();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        labelly.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        items obj = new items();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        labelly.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frame1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel labelly;
    // End of variables declaration//GEN-END:variables
}
