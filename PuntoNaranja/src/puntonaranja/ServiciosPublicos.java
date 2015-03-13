/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntonaranja;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.json.JSONObject;
import org.w3c.dom.Document;
import utils.ComboItem;
import utils.Message;
import utils.Static;
import utils.TextPrinter;
import utils.Utilities;
import utils.auth;
import utils.httpCall;

/**
 *
 * @author rlobo
 */
public class ServiciosPublicos extends javax.swing.JFrame {

    /**
     * Creates new form ServiciosPublicos
     */
    public ServiciosPublicos() {
        initComponents();
        ImageIcon img = new ImageIcon("src/puntonaranja/resurces/naranja.png");
        setIconImage(img.getImage());
        loadCombo();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbOperadora = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Servicios Públicos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Servicios Publicos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Servicio");

        cmbOperadora.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmbOperadora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOperadoraItemStateChanged(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntonaranja/resurces/publicos.jpg"))); // NOI18N
        lblImg.setText("jLabel2");
        lblImg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Imprimir último");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Identificador");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Ejecutar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addComponent(lblImg))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyListeners(){
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton5MouseClicked(null);
                }             
            }
         });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton3ActionPerformed(null);
                }             
            }
         });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton3ActionPerformed(null);
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
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   jButton4MouseClicked(null);
                }             
            }
         });
    }
    
    private void cmbOperadoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOperadoraItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperadoraItemStateChanged
    
 void cambioOperadora(String operadora){
            cmbOperadora.setSelectedIndex(0);       
     for(int i=0;i<cmbOperadora.getItemCount()-1;i++){
         if(!cmbOperadora.getSelectedItem().toString().equals(operadora)){
            cmbOperadora.setSelectedIndex(i+1);              
         }   
     }
    }
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
//            ComboItem selected = (ComboItem) cmbOperadora.getSelectedItem();
//            String identificador = txtNumero.getText();
//            if(!identificador.equals("")){
//            Utilities util = new Utilities();
//            Message msg = new Message();
//            msg.consultaServiciosPublicos(selected.getValue(), identificador, "", "");
//            Map<String, String> response = util.SendToServer(msg.buildString());
//            msg.setMap(response);
//            
//            String resp = msg.getMsgResponse();
//             if(resp != null){
//                if(resp.equals("Transacción aprobada en forma exitosa")){
//                    new ConfirmaRecarga(response.get("4") ,identificador,selected.getLabel(),"Servicios",response.get("62"),"",response.get("63")).setVisible(true);
//                }else {
//                                    JOptionPane.showMessageDialog(null, resp+", intente de nuevo");
//                                    txtNumero.setText("");
//                                }
//            }else{
//                this.setVisible(false);
//                JOptionPane.showMessageDialog(null, "Codigo de respuesta erronea: "+response.get("39")+", consulte con su proveedor");
//            }
            new ConfirmaRecarga("2000" ,"10201","ICE","Servicios","1111","","Numero recibo : 034411410126032034 |Vencimiento : 09/04/2014|Moneda : COL|Monto : 6,330.00;").setVisible(true);
            //txtNumero.setText("");
            //}else  JOptionPane.showMessageDialog(null, "Digite un valor para continuar");

            
        } catch (Exception ex) {
            Logger.getLogger(Recargas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //txtMonto.setText("");
        txtNumero.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        //new home().setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
         BufferedReader br;
        File Bitacora;
        if(Static.isWindows())Bitacora = new File(System.getProperty("user.home")+"\\Documents\\Puntos Naranja\\Files\\Bitacora");
        else Bitacora = new File(System.getProperty("user.home")+"/Documents/Puntos Naranja/Files/Bitacora");
        String[] lista=Bitacora.list();
        if(lista.length>0){
        int total=-1;
        try {
            int cual=lista.length-3;
            while(cual>=0){
                if(Static.isWindows()) br = new BufferedReader(new FileReader(System.getProperty("user.home")+"\\Documents\\Puntos Naranja\\Files\\Bitacora\\"+lista[cual]));            
                else br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/Documents/Puntos Naranja/Files/Bitacora/"+lista[cual]));    
                String line;
                int cuenta=0;
                String tipo="";
                try {
                while((line = br.readLine()) != null) {   
                    if(cuenta==3){tipo=line;
                    switch (tipo) {
                        case "Servicios":
                            total= cual;
                            cual=-1;
                        break;
                    }
                    }
                   cuenta++;
                }
                br.close();
                } catch (IOException ex) {
                    Logger.getLogger(TextPrinter.class.getName()).log(Level.SEVERE, null, ex);
                }
               cual--;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventanaReporte reporte=new ventanaReporte();
        if(total>=0){
            reporte.printSelected(total);
            reporte.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No hay recibos para imprimir", "Atención!", JOptionPane.WARNING_MESSAGE );
        }
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ServiciosPublicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiciosPublicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiciosPublicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiciosPublicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiciosPublicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperadora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    private void loadCombo() {
        ArrayList<ComboItem> items = new ArrayList<ComboItem>();
        //Message mg = new Message();
       // mg.pupulateServiciosMap();
       // JSONObject json = mg.getServiciosMap();
        JSONObject json =new JSONObject("{\n" +
"    \"004103\": \"Telecable - Cobro de servicios de cable\",\n" +
"    \"004003\": \"Cablevision - Cobro de servicios de cable\",\n" +
"    \"024047\": \"SKY - Cobro de servicios de cable\",\n" +
"    \"021003\": \"Cabletica - Cobro de servicio de cable\",\n" +
"    \"003003\": \"Amnet - Cobro de servicio de Cable - TIGO\",\n" +
"    \"004008\": \"ICE - Cobro de servicios telefÃ³nicos\",\n" +
"    \"006001\": \"CNFL - Cobro de servicios de electricidad\",\n" +
"    \"004001\": \"ICE - Cobro de servicios de electricidad\",\n" +
"    \"002002\": \"AyA - Cobro de servicios de agua\",\n" +
"    \"030052\": \"RACSA - Cobro de servicios telemÃ¡ticos\",\n" +
"    \"005001\": \"ESPH - Electricidad\",\n" +
"    \"005002\": \"ESPH - Agua\",\n" +
"    \"124137\": \"Recargas Kolbi - PTN\"\n" +
"}");
        Set keys = json.keySet();
        Object[] array = keys.toArray();
        String key = "";
        for(int i=0; i<array.length; i++){
            key = (String) array[i];
            items.add(new ComboItem(key, (String) json.get(key)));
        }
        ComboItem[] ComboItem = new ComboItem[items.size()];
        ComboItem = items.toArray(ComboItem);
        final DefaultComboBoxModel model = new DefaultComboBoxModel(ComboItem);
        cmbOperadora.setModel(model);
    }
}
