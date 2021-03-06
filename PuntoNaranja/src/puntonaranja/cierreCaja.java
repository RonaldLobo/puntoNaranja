/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntonaranja;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.Static;
import utils.TextPrinter;
import utils.auth;

/**
 *
 * @author Marlon
 */
public class cierreCaja extends javax.swing.JFrame {

    /**
     * Creates new form cierreCaja
     */
    String fechaSelected;
    KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    public cierreCaja() {
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource("/puntonaranja/resurces/naranja.png"));
        setIconImage(img.getImage());
        jButton1.setVisible(false);
        fechaSelected="";
        txtTotal.setText("0");
        cargaCombos();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRecargas = new javax.swing.JTextField();
        txtPines = new javax.swing.JTextField();
        txtServicios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbDias = new javax.swing.JComboBox();
        cmbMeses = new javax.swing.JComboBox();
        cmbAnos = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cierre de Caja");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cierre de Caja");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Recargas Telefónicas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Venta de Pines:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Serv. Públicos:");

        txtRecargas.setEditable(false);
        txtRecargas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtRecargas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRecargas.setFocusable(false);

        txtPines.setEditable(false);
        txtPines.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPines.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPines.setFocusable(false);

        txtServicios.setEditable(false);
        txtServicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtServicios.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtServicios.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setFocusable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Saldo Final:");

        txtFinal.setEditable(false);
        txtFinal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtFinal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFinal.setText("0");
        txtFinal.setFocusable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Desde:");

        cmbDias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDiasItemStateChanged(evt);
            }
        });

        cmbMeses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbMeses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMesesItemStateChanged(evt);
            }
        });

        cmbAnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbAnos.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Calcular");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAnos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)
                                .addComponent(txtTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(txtRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicios)
                                    .addComponent(txtPines)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void keyListeners(){
    
        cmbDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   manager.focusNextComponent();
                }             
            }
         });
        cmbMeses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton3MouseClicked(null);
                   manager.focusNextComponent(jButton3);
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
        txtFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                    if(jButton1.isVisible()) jButton1MouseClicked(null);
                }             
            }
         });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   manager.focusNextComponent();
                   jButton3MouseClicked(null);
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
        txtPines.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                    if(jButton1.isVisible()) jButton1MouseClicked(null);
                }             
            }
         });
        txtRecargas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                    if(jButton1.isVisible()) jButton1MouseClicked(null);
                }             
            }
         });
        txtServicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                    if(jButton1.isVisible()) jButton1MouseClicked(null);
                }             
            }
         });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                    if(jButton1.isVisible()) jButton1MouseClicked(null);
                }             
            }
         });
    }
    
    
    public void setSaldo(){
        txtFinal.setText(Static.getSaldo());
    }
    public void cargaCombos(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbDias.getModel();
        for(int i=1;i<=31;i++){
            model.addElement(new auth().addCero(Integer.toString(i), 2));
        }
        model = (DefaultComboBoxModel) cmbMeses.getModel();
        model.addElement(new auth().getMesAntes());
        model.addElement(new auth().getMes());
        
        
        model = (DefaultComboBoxModel) cmbAnos.getModel();
        if(new auth().getMes().equals("01"))model.addElement(Integer.toString(Integer.parseInt(new auth().getYear())-1));
        model.addElement(new auth().getYear());
        
        cmbDias.setSelectedItem(new auth().getDia());
        cmbMeses.setSelectedItem(new auth().getMes());
        cmbAnos.setSelectedItem(new auth().getYear());
    }
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void cmbMesesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMesesItemStateChanged
        // TODO add your handling code here:
        if(cmbMeses.getSelectedIndex()==0&&cmbMeses.getSelectedItem().equals("12"))cmbAnos.setSelectedIndex(0);
            jButton1.setVisible(false);
            limpiar();
    }//GEN-LAST:event_cmbMesesItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        calculaCierre();
    }//GEN-LAST:event_jButton3MouseClicked
    private void limpiar(){
        txtPines.setText("0");
        txtRecargas.setText("0");
        txtServicios.setText("0");
        txtTotal.setText("0");
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String cierre="    Cierre de caja \n \n";
        cierre+="Desde: "+fechaSelected+"\n";
        cierre+="Hasta: "+new auth().addCero(Integer.toString(Integer.parseInt(new auth().getDia())),2)+"/"+new auth().getMes()+"/"+new auth().getYear()+"\n \n";
        cierre+="Saldo Final: "+txtFinal.getText()+"\n";
        cierre+="Recargas Telefonicas: "+txtRecargas.getText()+"\n";
        cierre+="Venta Pines: "+txtPines.getText()+"\n";
        cierre+="Servicios Publicos: "+txtServicios.getText()+"\n \n";
        cierre+="Total: "+txtTotal.getText();
        
        ventanaReporte rep=new ventanaReporte();
        rep.cargaCierreCaja(cierre);
        rep.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void cmbDiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDiasItemStateChanged
        // TODO add your handling code here:
            limpiar();
            jButton1.setVisible(false);
    }//GEN-LAST:event_cmbDiasItemStateChanged

    
    private String getDia() {
        Calendar cal = Calendar.getInstance();
        return new auth().addCero(Integer.toString(cal.get(Calendar.DAY_OF_MONTH)),2);
    }
    
    public void calculaCierre(){
        fechaSelected=cmbDias.getSelectedItem().toString()+"/"+cmbMeses.getSelectedItem().toString()+"/"+cmbAnos.getSelectedItem().toString();
        if(isFechaValida(fechaSelected)){
        BufferedReader br;
        File Bitacora;
        if(Static.isWindows())Bitacora = new File(System.getProperty("user.home")+"\\Documents\\Puntos Naranja\\Files\\Bitacora");
        else Bitacora = new File(System.getProperty("user.home")+"/Documents/Puntos Naranja/Files/Bitacora");
        String[] lista=Bitacora.list();
        if(lista.length>0){
        int recargas=0,pines=0,servicios=0,total=0;
        try {
            int cual=lista.length-3;
            String dia=((lista[cual].split("-"))[2]);
            String mes=(lista[cual].split("-"))[1];
            String ano=(lista[cual].split("-"))[0];
            while(compararFechasConDate((cmbDias.getSelectedIndex())+"/"+cmbMeses.getSelectedItem().toString()+"/"+cmbAnos.getSelectedItem().toString(), dia+"/"+mes+"/"+ano) && cual<lista.length-2){
                if(Static.isWindows()) br = new BufferedReader(new FileReader(System.getProperty("user.home")+"\\Documents\\Puntos Naranja\\Files\\Bitacora\\"+lista[cual]));            
                else br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/Documents/Puntos Naranja/Files/Bitacora/"+lista[cual]));    
                String line;
                int cuenta=0;
                String tipo="";
                try {
                while((line = br.readLine()) != null) {   
                    if(cuenta==3)tipo=line;
                    switch (tipo) {
                        case "Recargas":
                            if(cuenta==6)recargas+=Integer.parseInt(line);
                        break;

                        case "Pines":
                            if(cuenta==6)pines+=Integer.parseInt(line);
                        break;

                        case "Servicios":
                            if(cuenta==6)servicios+=Integer.parseInt(line);
                        break;
                    }

                   cuenta++;
                }
                br.close();
                } catch (IOException ex) {
                    Logger.getLogger(TextPrinter.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(cual>0){cual--; dia=((lista[cual].split("-"))[2]);mes=(lista[cual].split("-"))[1];ano=(lista[cual].split("-"))[0];}
                else {cual=lista.length-1; dia="0";}
            }
            total=recargas+pines+servicios;
            txtRecargas.setText(recargas+"");
            txtPines.setText(pines+"");
            txtServicios.setText(servicios+"");
            txtTotal.setText(total+"");
            jButton1.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if(txtTotal.getText().equals("0")){
                JOptionPane.showMessageDialog(null,"No hay datos guardados entre las fechas seleccionadas", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                jButton1.setVisible(false);
            }
        
        }else{
            limpiar();
            JOptionPane.showMessageDialog(null,"No hay datos guardados entre las fechas seleccionadas", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        }else {
            JOptionPane.showMessageDialog(null,"Fecha inválida", "Error", JOptionPane.ERROR_MESSAGE);
            cmbDias.setSelectedItem(new auth().getDia());
            cmbMeses.setSelectedItem(new auth().getMes());
            cmbAnos.setSelectedItem(new auth().getYear());
            limpiar();
        }
    }
    private boolean compararFechasConDate(String fecha1, String fecha2) {  
        
        String resultado="";
        try {
         /**Obtenemos las fechas enviadas en el formato a comparar*/
         SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy"); 
         Date fechaDate1 = formateador.parse(fecha1);
         Date fechaDate2 = formateador.parse(fecha2);
         Date fechaDateActual = formateador.parse(new auth().addCero(Integer.toString(Integer.parseInt(new auth().getDia())+1),2)+"/"+new auth().getMes()+"/"+new auth().getYear());

          if ( fechaDate1.before(fechaDate2) && fechaDate2.before(fechaDateActual) ){
            return true;
          }
        } catch (ParseException e) {
         System.out.println("Se Produjo un Error!!!  "+e.getMessage());
        }  
        return false;
       }
    public  boolean isFechaValida(String fecha) {
        
        try {
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy"); 
            Date fechaDate1 = formateador.parse(fecha);
            Date fechaDateActual = formateador.parse(new auth().addCero(Integer.toString(Integer.parseInt(new auth().getDia())+1),2)+"/"+new auth().getMes()+"/"+new auth().getYear());

            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            if ( !fechaDate1.before(fechaDateActual) ){
            return false;
          }
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
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
            java.util.logging.Logger.getLogger(cierreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cierreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cierreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cierreCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cierreCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAnos;
    private javax.swing.JComboBox cmbDias;
    private javax.swing.JComboBox cmbMeses;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtPines;
    private javax.swing.JTextField txtRecargas;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
