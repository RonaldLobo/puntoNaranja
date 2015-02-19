/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntonaranja;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.auth;
/**
 *
 * @author Marlon
 */
public class CambioContraseña extends javax.swing.JFrame {
    auth file;
    boolean firstTime;
    /**
     * Creates new form CambioContraseña
     */
    public CambioContraseña() {
        ImageIcon img = new ImageIcon("src/puntonaranja/resurces/naranja.png");
        setIconImage(img.getImage());
        initComponents();
        file=new auth();
        setLocationRelativeTo(null);
        keyListeners();
    }
    public CambioContraseña(boolean firstTime) {
        ImageIcon img = new ImageIcon("src/puntonaranja/resurces/naranja.png");
        setIconImage(img.getImage());
        initComponents();
        file=new auth();
        //txtOld.setText(file.leerArchivo());
        this.firstTime = firstTime;
        if(firstTime){
            txtOld.setVisible(false);
            txtUser.setVisible(true);
            txtId.setVisible(true);            
            lblOld.setVisible(false);
            lblUser.setVisible(true);
            lblId.setVisible(true);
            lblTitulo.setText("Nuevo Usuario");
        }else{
            txtOld.setVisible(true);
            txtUser.setVisible(false);
            txtId.setVisible(false);            
            lblOld.setVisible(true);
            lblUser.setVisible(false);
            lblId.setVisible(false);            
        }
         setLocationRelativeTo(null);
         keyListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOld = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtOld = new javax.swing.JPasswordField();
        txtNew = new javax.swing.JPasswordField();
        txtAgain = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cambiar Contraseña");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblOld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOld.setText("Contraseña antigua:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Repetir contraseña:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtOld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAgain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUser.setText("Usuario:");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("Num de Terminal:");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("Cambiar Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOld)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lblUser)
                    .addComponent(lblId)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOld)
                    .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyListeners(){
        txtAgain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtOld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton2MouseClicked(null);
                }             
            }
         });
    }
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(firstTime){
            createUser();
        }else{
            changePass();
        }
    }//GEN-LAST:event_jButton1MouseClicked
    
    private void changePass(){
        try {
            // TODO add your handling code here:
                                
            //if((txtNew.getText().isEmpty() || txtAgain.getText().isEmpty()) || txtOld.getText().isEmpty()){
                if(txtNew.getText().equals(txtAgain.getText())){
                    if(txtOld.getText().equals(file.leerArchivo("Sesion\\archivoPassword.txt"))||txtOld.getText().equals(file.leerArchivo("Sesion/archivoPassword.txt"))){
                        if(!txtOld.getText().equals(txtAgain.getText())){
                            //if(txtNew.getText().equals(txtAgain.getText())&&txtOld.getText().equals(file.leerArchivo())&&!txtOld.getText().equals(txtAgain.getText())){
                            file.escribeFichero(txtNew.getText(),"Sesion/archivoPassword.txt");
                            JOptionPane.showMessageDialog(null,"La contraseña ha sido cambiada", "Exito!", JOptionPane.INFORMATION_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtOld.setText("");
                            /*}else{
                            JOptionPane.showMessageDialog(null,"Los datos introducidos son incorrectos", "Error!", JOptionPane.ERROR_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtOld.setText("");
                            }*/
                        }else{
                            JOptionPane.showMessageDialog(null,"La nueva contraseña debe ser diferente a la anterior", "Error!", JOptionPane.ERROR_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"La contraseña introducida es incorrecta", "Error!", JOptionPane.ERROR_MESSAGE );
                        txtOld.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Las nuevas contraseñas no coinciden", "Error!", JOptionPane.ERROR_MESSAGE );
                    txtNew.setText("");
                    txtAgain.setText("");
                }
           /* }else{
                JOptionPane.showMessageDialog(null,"Debe llenar todos los espacios", "Error!", JOptionPane.ERROR_MESSAGE );
                txtNew.setText("");
                txtAgain.setText("");
            }*/
        } catch (IOException ex) {
            Logger.getLogger(CambioContraseña.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void createUser(){
        try {
            // TODO add your handling code here:
                                
            //if((txtNew.getText().isEmpty() || txtAgain.getText().isEmpty()) || txtOld.getText().isEmpty()){
                if(txtNew.getText().equals(txtAgain.getText())){
                    
                            //if(txtNew.getText().equals(txtAgain.getText())&&txtOld.getText().equals(file.leerArchivo())&&!txtOld.getText().equals(txtAgain.getText())){
                            file.escribeFichero(txtUser.getText(),"Sesion/archivoUser.txt");
                            file.escribeFichero(txtId.getText(),"Sesion/archivoId.txt");
                            file.escribeFichero(txtNew.getText(),"Sesion/archivoPassword.txt");
                            this.setVisible(false);
                            JOptionPane.showMessageDialog(null,"Ha ingresado los datos correctamente", "Exito!", JOptionPane.INFORMATION_MESSAGE );
                            
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtUser.setText("");
                            txtId.setText("");
                            /*}else{
                            JOptionPane.showMessageDialog(null,"Los datos introducidos son incorrectos", "Error!", JOptionPane.ERROR_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtOld.setText("");
                            }*/
                        
                }else{
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden", "Error!", JOptionPane.ERROR_MESSAGE );
                    txtNew.setText("");
                    txtAgain.setText("");
                }
           /* }else{
                JOptionPane.showMessageDialog(null,"Debe llenar todos los espacios", "Error!", JOptionPane.ERROR_MESSAGE );
                txtNew.setText("");
                txtAgain.setText("");
            }*/
        } catch (IOException ex) {
            Logger.getLogger(CambioContraseña.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false); 
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false); 
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CambioContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblOld;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtAgain;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtNew;
    private javax.swing.JPasswordField txtOld;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
