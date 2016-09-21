
package loteria;

import java.awt.Color;
import java.io.IOException;
/**
/**
 *
 * @author Andres
 */
public class Herramientas extends javax.swing.JFrame {
    int agencia,usuario;
    
    public Herramientas() {
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_calculadora = new javax.swing.JButton();
        btn_cuadre = new javax.swing.JButton();
        btn_contador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null), "Herramientas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N

        btn_calculadora.setBackground(new java.awt.Color(255, 255, 255));
        btn_calculadora.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btn_calculadora.setForeground(new java.awt.Color(255, 255, 255));
        btn_calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/calculadora.png"))); // NOI18N
        btn_calculadora.setToolTipText("<html><p align=\"center\"><b><u>C</u>alculadorat</b><br></html>    ");
        btn_calculadora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_calculadora.setFocusable(false);
        btn_calculadora.setMaximumSize(new java.awt.Dimension(71, 23));
        btn_calculadora.setMinimumSize(new java.awt.Dimension(71, 23));
        btn_calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculadoraActionPerformed(evt);
            }
        });

        btn_cuadre.setBackground(new java.awt.Color(255, 255, 255));
        btn_cuadre.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btn_cuadre.setForeground(new java.awt.Color(255, 255, 255));
        btn_cuadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/cuadre2.png"))); // NOI18N
        btn_cuadre.setToolTipText("<html><p align=\"center\"><b><u>C</u>uadre y Reportes</b><br> </html>    ");
        btn_cuadre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_cuadre.setFocusable(false);
        btn_cuadre.setMaximumSize(new java.awt.Dimension(71, 23));
        btn_cuadre.setMinimumSize(new java.awt.Dimension(71, 23));
        btn_cuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuadreActionPerformed(evt);
            }
        });

        btn_contador.setBackground(new java.awt.Color(255, 255, 255));
        btn_contador.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btn_contador.setForeground(new java.awt.Color(255, 255, 255));
        btn_contador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/contador.png"))); // NOI18N
        btn_contador.setToolTipText("<html><p align=\"center\"><b><u>C</u>ontador</b><br></html>    ");
        btn_contador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_contador.setFocusable(false);
        btn_contador.setMaximumSize(new java.awt.Dimension(71, 23));
        btn_contador.setMinimumSize(new java.awt.Dimension(71, 23));
        btn_contador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contadorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Calculadora");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cuadre");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Contador");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_cuadre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cuadre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_contadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contadorActionPerformed
        Contador f=new Contador();
        f.setLocationRelativeTo(null);
        f.setTitle("Contador de Billetes");
        f.setVisible(true);       
    }//GEN-LAST:event_btn_contadorActionPerformed
 
    private void btn_calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculadoraActionPerformed
        calculadora f=new calculadora();
        f.setLocationRelativeTo(null);
        f.setTitle("Calculadora");
        f.setVisible(true);  
    }//GEN-LAST:event_btn_calculadoraActionPerformed

    private void btn_cuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuadreActionPerformed
        cuadre c =new cuadre(agencia,usuario);
        c.setLocationRelativeTo(null);
        c.setTitle("Cuadre de Caja");
        c.setVisible(true);
    }//GEN-LAST:event_btn_cuadreActionPerformed

    public static void main(String args[]) {
        new Herramientas().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculadora;
    private javax.swing.JButton btn_contador;
    private javax.swing.JButton btn_cuadre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
