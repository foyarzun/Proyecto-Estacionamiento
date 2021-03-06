
package Interfaz;

import Clases.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class data extends javax.swing.JFrame {
    DB base= new DB(); //instanciamos la clase de conexión  
    public static Connection conexion;  //obtenemos conexión con ayuda de la clase.
    
    public data() {
        this.setUndecorated(true); //quitamos la decoración de la ventana
        this.setOpacity(0.75f); //decimos que sea 75% opaco / 25% transparente.
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ET_Placa = new javax.swing.JLabel();
        ET_Propietario = new javax.swing.JLabel();
        ET_Vehiculo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos Generales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Placa:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Propietario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vehículo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/animacion.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 76));

        ET_Placa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ET_Placa.setForeground(new java.awt.Color(0, 255, 0));
        ET_Placa.setText("PLACA");
        getContentPane().add(ET_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, -1));

        ET_Propietario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ET_Propietario.setForeground(new java.awt.Color(102, 255, 0));
        ET_Propietario.setText("DUEÑO");
        getContentPane().add(ET_Propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, 140, -1));

        ET_Vehiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ET_Vehiculo.setForeground(new java.awt.Color(102, 255, 0));
        ET_Vehiculo.setText("CARRO");
        getContentPane().add(ET_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 150, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/fondo_data.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 240, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizar_datos(int Cajon_Numero){  //actualiamos los datos que vamos a mostrar dependiendo el cajón
        conexion = base.GetConnection();
        PreparedStatement select;
        try {
            select = conexion.prepareStatement("select * from cliente where Cajon_Numero= '"+Cajon_Numero+"'");
            //select.setInt(5,Cajon_Numero);
            boolean consulta = select.execute();
            if(consulta){
                ResultSet resultado =  select.executeQuery();
                if(resultado.next()){
                    this.ET_Placa.setText( resultado.getString(1));
                    this.ET_Propietario.setText(resultado.getString(2));
                    this.ET_Vehiculo.setText(resultado.getString(4));
                   
                }
                resultado.close();
            }
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Ocurrió un error: "+ex.getMessage().toString());
        }
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
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               data data=new data();
                        data.setVisible(true);
                        
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ET_Placa;
    private javax.swing.JLabel ET_Propietario;
    private javax.swing.JLabel ET_Vehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
