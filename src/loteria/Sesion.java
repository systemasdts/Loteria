
package loteria;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ana Karina
 */
public class Sesion extends javax.swing.JFrame {


    public Sesion() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loterias Random");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Clave:");

        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormInicio inicio= new FormInicio();
        inicio.setSize(1230,705);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        FormInicio inicio= new FormInicio();
        inicio.setSize(1230,705);
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
            inicio.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void inicio_sesion(){
        if(!jTextField1.getText().equals("") || !jTextField2.getText().equals("")){
            Conectar Con= new Conectar();
            String consulta="SELECT * FROM usuarios,agencia WHERE usuarios.id_agencia=agencia.id_agencia and nombre_usuario='"+jTextField1.getText()+"' and contrasena='"+jTextField2.getText()+"'";
            ConsultasBD buscar;
            buscar = new ConsultasBD(Con.conexion(),consulta);
            if(buscar.ObtenerError()==null){
                ResultSet resultado=buscar.ObtenerResultado();
                try {
                    if(resultado!=null && !resultado.next()){
                        JOptionPane.showMessageDialog(null,"Usuario no Registrado");
                    }else{
                        resultado.last();
                        String usuario=(String)resultado.getObject("nombre_usuario");
                        String agencia=(String)resultado.getObject("nombre_agencia");
                        int codUsuario= resultado.getInt("id_usuario");
                        int codAgencia= resultado.getInt("id_agencia");
                        int codBanca= resultado.getInt("id_banca");
                        FormInicio inicio= new FormInicio();
                        inicio.setTitle("Loterias Random -----"+agencia.toUpperCase()+" -- "+usuario.toUpperCase());
                        //inicio.agencia=codAgencia;
                        //inicio.usuario=codUsuario;
                        inicio.setSize(1230,705);
                        inicio.setVisible(true);
                        inicio.setLocationRelativeTo(null);
                        inicio.setVisible(true);
                        this.setVisible(false);
                    }
                } catch (SQLException ex) {
                    
                }
            }
        }else{
            jLabel1.setForeground(Color.red);
            jLabel2.setForeground(Color.red);
            jLabel3.setText("Debe completar los campos.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
