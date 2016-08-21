/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package industry_project;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sharma1
 */
public class menu extends javax.swing.JInternalFrame {

    /**
     * Creates new form menu
     */
    
    public menu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        postbox = new javax.swing.JComboBox();
        phonebox = new javax.swing.JFormattedTextField();
        box1 = new javax.swing.JRadioButton();
        box2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressbox = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        idbox = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Add Employee");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Address");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 330, 80, 30);

        jLabel3.setText("Phone no.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 200, 80, 30);

        jLabel4.setText("Post");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 150, 80, 30);

        jLabel5.setText("ID No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 70, 80, 30);

        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 110, 80, 30);
        getContentPane().add(namebox);
        namebox.setBounds(250, 110, 200, 30);

        postbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Post", "Manager", "SuperVisor", "Foreman", "Workers", "Helper", "Security Guard" }));
        postbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postboxActionPerformed(evt);
            }
        });
        getContentPane().add(postbox);
        postbox.setBounds(250, 150, 200, 30);

        try {
            phonebox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(phonebox);
        phonebox.setBounds(250, 200, 200, 30);

        buttonGroup1.add(box1);
        box1.setText("Male");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1);
        box1.setBounds(250, 240, 110, 23);

        buttonGroup1.add(box2);
        box2.setText("Female");
        getContentPane().add(box2);
        box2.setBounds(360, 240, 90, 23);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        addressbox.setColumns(20);
        addressbox.setRows(5);
        jScrollPane1.setViewportView(addressbox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 330, 200, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setText("Enter Your Details");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 10, 210, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 460, 110, 25);

        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 240, 80, 30);

        jLabel2.setText("D.O.B");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 280, 80, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(250, 280, 60, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(310, 280, 70, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(380, 280, 70, 30);

        idbox.setEditable(false);
        getContentPane().add(idbox);
        idbox.setBounds(250, 70, 200, 30);

        setBounds(0, 0, 571, 598);
    }// </editor-fold>//GEN-END:initComponents

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box1ActionPerformed
void showid()
{
    String path="jdbc:mysql://localhost/";
       String place="factorydb";
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
           Connection myconnection= DriverManager.getConnection(path+place,"root","");
           PreparedStatement myStatement=null;
           try
           {
               String q="select max(ID) from member";
               myStatement=myconnection.prepareStatement(q);
               ResultSet myresult=myStatement.executeQuery();
               if(myresult.next())
               {
                   int oldID=Integer.parseInt(myresult.getString(01));
                   int newID=oldID+1;
                   idbox.setText(String.valueOf(newID));
               }
           }
           catch(Exception ae)
           {
               JOptionPane.showMessageDialog(rootPane,"Error in Query" + ae.getMessage());
           }
           finally
           {
               myStatement.close();
               myconnection.close();
           }
    }
    catch(Exception ae)
    {
        JOptionPane.showMessageDialog(rootPane,"Error in Query" + ae.getMessage());
    }
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String path="jdbc:mysql://localhost/";
       String place="factorydb";
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection myconnection= DriverManager.getConnection(path+place,"root","");
           try
           {
               String q="insert into member values(?,?,?,?,?,?,?)";
               PreparedStatement mystatement =myconnection.prepareStatement(q);
               
               mystatement.setString(1, idbox.getText());
               mystatement.setString(2, namebox.getText());
               mystatement.setString(3, postbox.getSelectedItem().toString());
               mystatement.setString(4, phonebox.getText());
               if(box1.isSelected())
               {
               mystatement.setString(5, "Male");
               }
               else if(box2.isSelected())
               {
               mystatement.setString(5, "Female");
               }
               mystatement.setString(6, addressbox.getText());
               String dob=jComboBox3.getSelectedItem()+"-"+jComboBox2.getSelectedItem()+"-"+jComboBox1.getSelectedItem();
               mystatement.setString(7, dob);
               
               mystatement.execute();
           //    label.setText("Saved Succesfully");
              JOptionPane.showMessageDialog(rootPane, "Saved Successfully");
              idbox.setText(null);
              namebox.setText(null);
              phonebox.setText(null);
              addressbox.setText(null);
              buttonGroup1.clearSelection();
              postbox.setSelectedIndex(0);
              jComboBox1.setSelectedIndex(0);
              jComboBox2.setSelectedIndex(0);
              jComboBox3.setSelectedIndex(0);
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

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
showid();
        
        for(int a=1;a<=31;a++)
{
    if(a<10)
    {
    jComboBox1.addItem("0"+a);
    }
    else
    {
        jComboBox1.addItem(String.valueOf(a));
    }
        
}
for(int a=1;a<=12;a++)
{if(a<10)
    {
    jComboBox2.addItem("0"+a);
    }
    else
    {
        jComboBox2.addItem(String.valueOf(a));
    }
    
}
for(int a=1975;a<=2013;a++)
{
    jComboBox3.addItem(String.valueOf(a));
}
    }//GEN-LAST:event_formInternalFrameActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressbox;
    private javax.swing.JRadioButton box1;
    private javax.swing.JRadioButton box2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namebox;
    private javax.swing.JFormattedTextField phonebox;
    private javax.swing.JComboBox postbox;
    // End of variables declaration//GEN-END:variables
}
