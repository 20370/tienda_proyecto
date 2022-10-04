/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana_logycreacioncuenta;

import clases.Cliente;
import clases.Localidad;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.dsig.dom.DOMValidateContext;



/**
 *
 * @author user
 */
public class Loguser extends javax.swing.JFrame {
public static int contcli;
    DefaultTableModel tablacli;
    
    /**
     * Creates new form Loguser
     */
    public Loguser() {
        initComponents();
        
        
         ImageIcon usu = new ImageIcon(getClass().getResource("/imagen/user.png"));
        Icon fondo1 = new ImageIcon(usu.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_DEFAULT));
        label1.setIcon(fondo1);
 this.repaint();
 
         ImageIcon guard = new ImageIcon(getClass().getResource("/imagen/guardar.png.png"));
        Icon fondo2 = new ImageIcon(guard.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_DEFAULT));
        jButton1.setIcon(fondo2);
 this.repaint();
 
        
        contcli=0;
         jButton1.setEnabled(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        luser = new javax.swing.JLabel();
        llpas = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        bacep = new javax.swing.JButton();
        bcancel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de usuario");

        jLabel3.setText("Nombre");

        jLabel4.setText("Contrasena");

        jLabel5.setText("Tarjeta de credito ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Crear cuenta cliente");

        jLabel8.setText("Apellido");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("llista de registro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Verificar nombre usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(76, 76, 76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(58, 58, 58)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(73, 73, 73)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Login usuario", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        luser.setText("User name");

        llpas.setText("Password");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        bacep.setText("Aceptar");
        bacep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacepActionPerformed(evt);
            }
        });

        bcancel.setText("cambiar de contrasena ");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bacep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcancel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(llpas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(luser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luser)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llpas)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bacep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Login cliente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        // TODO add your handling code here:
        
     Cambiarcontra_cliente co=new Cambiarcontra_cliente();
     co.setVisible(true);
 


        
        
    }//GEN-LAST:event_bcancelActionPerformed

    private void bacepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacepActionPerformed
        // TODO add your handling code here:
for (int i = 0; i < contcli; i++) {
    
    if (jTextField1.getText().equals(Cliente.cli[i].getNombreuser()) && jTextField2.getText().equals(Cliente.cli[i].getContrasena())) {
        
        System.out.println("el usuario esta registrado");
        System.out.println("usuer name "+Cliente.cli[i].getNombreuser()+" contrasena "+Cliente.cli[i].getContrasena());
        jTextField1.setText("");
        jTextField2.setText("");
        Crear_reservacion re=new Crear_reservacion();
        re.setVisible(true);
        
    }else{
        System.out.println("el usuario no esta registrado ");
    }
      
    
        }

       
        dispose();
    }//GEN-LAST:event_bacepActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//      String anterior;
//      anterior="";
//        System.out.println("paso por for");
        
//        for (int i = 0; i < contcli; i++) {
//          
//            if (Cliente.cli[i].getNombreuser().equals(anterior)  ) {
//                System.out.println("paso dentro de if");
//              anterior=Cliente.cli[i].getNombreuser();
//                System.out.println("anterior "+anterior);
//              JOptionPane.showMessageDialog(null, "nombre de usuario igual vuelva a ingrese otro");
//              
//              jTextField5.getText();
//              
//            }else{
//                anterior=Cliente.cli[i].getNombre();
//                
//            }
//        }
      
        System.out.println("guardo nombre de user "+Cliente.cli[contcli].getNombreuser());
     
       Loguser.contcli++;
        
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jButton1.setEnabled(false);
//      System.out.println("contcli "+contcli);  
//        System.out.println("nombre del usuario -----------------------");
//      System.out.println(Cliente.cli[contcli].getNombreuser());
//       
//       Loguser.contcli++;
//        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < contcli; i++) {
            System.out.println("username "+Cliente.cli[i].getNombreuser()+" contrasena "+Cliente.cli[i].getContrasena());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String anterior="";
        
        Cliente.cli[contcli]=new Cliente(jTextField5.getText(), jTextField4.getText(), jTextField7.getText(),jTextField6.getText(), jTextField8.getText(),"");
      System.out.println(Cliente.cli[contcli].getNombreuser());
       
       
        for (int i = 0; i <=contcli; i++) {
      
            
            if (Cliente.cli[i].getNombreuser().equals(anterior)  ) {
                System.out.println("Nobre de usuario igual");
                
              anterior=Cliente.cli[i].getNombreuser();
              
                
              JOptionPane.showMessageDialog(null, "nombre de usuario igual vuelva a ingrese otro");
              Loguser.jTextField5.setText("");
              Loguser.jTextField5.getText();
              Cliente.cli[i].getNombreuser();
              
            }else
            anterior=Cliente.cli[i].getNombreuser();
                   
        }
        jButton1.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loguser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                
                 System.out.println("paso ");
                new Loguser().setVisible(true);
       
                
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bacep;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel llpas;
    private javax.swing.JLabel luser;
    // End of variables declaration//GEN-END:variables
}
