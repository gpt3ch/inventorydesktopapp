/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package industry_project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sharma1
 */
public class manager1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form manager
     */
    public manager1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernamebox = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        postbox = new javax.swing.JComboBox();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add Manager");
        getContentPane().setLayout(null);

        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 220, 80, 30);

        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 80, 30);

        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 180, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setText("Create Manager Account");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 20, 240, 30);

        usernamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameboxActionPerformed(evt);
            }
        });
        getContentPane().add(usernamebox);
        usernamebox.setBounds(160, 80, 150, 30);

        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });
        getContentPane().add(namebox);
        namebox.setBounds(160, 180, 150, 30);

        passwordbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordboxActionPerformed(evt);
            }
        });
        getContentPane().add(passwordbox);
        passwordbox.setBounds(160, 220, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 270, 150, 30);

        jLabel2.setText("User Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 60, 30);

        postbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Post", "Admin", "Manager" }));
        postbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postboxActionPerformed(evt);
            }
        });
        getContentPane().add(postbox);
        postbox.setBounds(160, 130, 150, 30);

        setBounds(0, 0, 381, 371);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameboxActionPerformed

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void passwordboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path="jdbc:mysql://localhost/";
        String place="factorydb";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection= DriverManager.getConnection(path+place,"root","");
            try
            {
                String q="insert into createuser values(?,?,?,?)";
                PreparedStatement mystatement =myconnection.prepareStatement(q);

                mystatement.setString(1, usernamebox.getText());
                mystatement.setString(2, postbox.getSelectedItem().toString());
                mystatement.setString(3, namebox.getText());
                mystatement.setString(4, passwordbox.getText());

                mystatement.execute();
                JOptionPane.showMessageDialog(rootPane, "Account Created Successfully");
              usernamebox.setText(null);
              namebox.setText(null);
              passwordbox.setText(null);
              postbox.setSelectedIndex(0);
                mystatement.close();
                myconnection.close();
                
            }
            catch(Exception ae)
            {
               JOptionPane.showMessageDialog(rootPane,"Error in Query" + ae.getMessage());
            }
        }
        catch(Exception ae)
        {
             JOptionPane.showMessageDialog(rootPane,"Error in connection" + ae.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void postboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField namebox;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JComboBox postbox;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables
}
