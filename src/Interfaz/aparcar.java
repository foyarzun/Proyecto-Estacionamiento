
package Interfaz;

import Clases.Cajones;
import Clases.Clientes;
import java.awt.Font;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import java.util.Calendar;


public class aparcar extends javax.swing.JFrame {
DefaultComboBoxModel modelo =new DefaultComboBoxModel (); //creamos el modelo del combobox
int L;   //variables y objeto calendar.
boolean f=true;
private Reloj.Hora hora;
Calendar re=Calendar.getInstance();
//Cajones cajon = new Cajones();
    /**
     * Creates new form aparcar
     */
    public aparcar() {  //establecemos propiedades a la ventana, quitamos decoración...
        this.setUndecorated(true);
        this.setLocation(400, 100);
        initComponents();
        L=1;
        this.combocajon.setModel(modelo);   //aplicamos el modelo al combobox
        hora= new Reloj.Hora();             //pintamos un nuevo reloj que con ayuda del jclock creamos.
        hora.setBounds(50, 50, 150, 30);/*(Ubicacion en eje x, Ubicacion en eje y, Ancho, Alto)*/
        hora.setFont(new Font("Trebuchet MS",java.awt.Font.BOLD, 20));/*Cambiamos la fuente, estilo y tamaño*/
        this.panel.add(hora);
       System.out.println(re.get(Calendar.HOUR)+": "+re.get(Calendar.MINUTE)+": "+re.get(Calendar.SECOND));
        while (L<12){           //llenamos el combobox con los cajones disponibles.
            Cajones cajon= new Cajones(L);
          if(cajon.getEstado()==1){
          Object caj= cajon.getNumero();
          modelo.addElement(caj);
          L++;
        }
          else{
              L++;
          }         
        }  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmpPlaca = new javax.swing.JTextField();
        cmpCliente = new javax.swing.JTextField();
        cmpMarca_modelo = new javax.swing.JTextField();
        combocajon = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmpCorreo = new javax.swing.JTextField();
        btnlisto = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Placa de vehículo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setText("Propietario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel3.setText("Marca y modelo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel4.setText("Cajón autilizar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        getContentPane().add(cmpPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 157, -1));
        getContentPane().add(cmpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 157, -1));
        getContentPane().add(cmpMarca_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 156, -1));

        combocajon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocajonActionPerformed(evt);
            }
        });
        getContentPane().add(combocajon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 156, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        getContentPane().add(cmpCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 156, -1));

        btnlisto.setText("Listo");
        btnlisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistoActionPerformed(evt);
            }
        });
        getContentPane().add(btnlisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Reloj");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 230, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/flat/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/flat/template_ventana_login_2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 470, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double tiempo(){//retornamos el tiempo actual.
        int hora=re.get(Calendar.HOUR);
        double minuto=re.get(Calendar.MINUTE)/100.000;
        double tiempo= hora+minuto;
        System.out.println("Hora: "+hora+"     minuto: "+minuto+"      tiempo: "+tiempo);
        return tiempo;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new menu().setVisible(true);
            this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnlistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistoActionPerformed
            Clientes cliente= new Clientes(this.cmpPlaca.getText(),this.cmpCliente.getText(),this.cmpCorreo.getText(), this.cmpMarca_modelo.getText(),Integer.parseInt(this.combocajon.getSelectedItem().toString()),tiempo());  
            Cajones cajon= new Cajones(Integer.parseInt(this.combocajon.getSelectedItem().toString()));
            cliente.Guardar();
            cajon.actualizar();  //creamos cliente y actualizamos cajones
    }//GEN-LAST:event_btnlistoActionPerformed

    private void combocajonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocajonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocajonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(aparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aparcar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlisto;
    private javax.swing.JTextField cmpCliente;
    private javax.swing.JTextField cmpCorreo;
    private javax.swing.JTextField cmpMarca_modelo;
    private javax.swing.JTextField cmpPlaca;
    private javax.swing.JComboBox combocajon;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
