
package loteria;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class cuadre extends javax.swing.JFrame {
    int agencia,usuario;
    String fecha_s;
    Conectar Con= new Conectar();
    
    public cuadre() {
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
    }
    
    public cuadre(int ag,int usu) {
        agencia=ag;
        usuario=usu;
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        Calendar cal1 = Calendar.getInstance();
        fecha_s=completarCeros(cal1.get(Calendar.DATE),2)+"/"+completarCeros((cal1.get(Calendar.MONTH)+1),2)+"/"+cal1.get(Calendar.YEAR);
        fecha.setDate(cal1.getTime());
        if(buscar_cierre(fecha_s)==0){
            calcular_venta(fecha_s);
        }else{
            JOptionPane.showMessageDialog(null,"El cierre de caja para la fecha actual, ya fue realizado.");
            cerrar.setEnabled(false);
        }
    }

    public String completarCeros(long ticket, int cant){
        String ceros="";
        String t=Long.toString(ticket);
        for(int i=0;i<cant-t.length();i++){
            ceros+="0";
        }
        return(ceros+t);
    }
    
    private void calcular_venta(String fecha){
        String consulta="SELECT sum(monto) total FROM ticket a,detalle_ticket b WHERE a.id_ticket=b.id_ticket and a.fecha = '"+fecha+"' and a.anulado='No' and a.id_agencia="+agencia+" and a.id_usuario="+usuario;
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(),consulta);
        if(buscar.ObtenerError()==null){
            ResultSet resultado=buscar.ObtenerResultado();
            try {
                resultado.last();
                if(resultado.getObject("total")!=null){
                    vendido.setText(resultado.getObject("total").toString());
                    sobrante.setText(resultado.getObject("total").toString());
                    efectivo.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null,"No hay ventas para la Fecha actual.");
                }
            } catch (SQLException ex) {

            }
        }
    }
    
    private int buscar_cierre(String fecha){
        String consulta="SELECT id_cierre FROM cierre_de_caja WHERE fecha = '"+fecha+"' and id_agencia="+agencia+" and id_usuario="+usuario;
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(),consulta);
        if(buscar.ObtenerError()==null){
            ResultSet resultado=buscar.ObtenerResultado();
            try {
                    if(resultado.next()){
                    return 1;
                    }
            } catch (SQLException ex) {

            }
        }
        return 0;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        efectivo = new javax.swing.JTextField();
        debito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        credito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vendido = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sobrante = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        buscar = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cuadrar = new javax.swing.JButton();
        reporte = new javax.swing.JButton();
        ajuste = new javax.swing.JButton();

        jLabel9.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 102, 255)), "Cuadre de Cajas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel6.setText("Efectivo:");

        efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                efectivoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                efectivoKeyPressed(evt);
            }
        });

        debito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                debitoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                debitoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setText("Debitos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setText("Creditos:");

        credito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                creditoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Conteo en Caja:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Faltante:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel7.setText("Fecha:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Venta registrada:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Bs.");

        vendido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vendido.setText(" ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Bs.");

        contado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contado.setText("0");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Bs.");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Bs.");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Bs.");

        sobrante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sobrante.setText("0");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Bs.");

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/magnifier.png"))); // NOI18N
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cerrar.setBackground(new java.awt.Color(51, 102, 255));
        cerrar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("Cerrar Caja");
        cerrar.setToolTipText("Ver estados de Tickets");
        cerrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cerrar.setFocusable(false);
        cerrar.setMaximumSize(new java.awt.Dimension(71, 23));
        cerrar.setMinimumSize(new java.awt.Dimension(71, 23));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(efectivo)
                            .addComponent(debito)
                            .addComponent(credito, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(contado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sobrante, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(vendido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15)
                    .addComponent(contado)
                    .addComponent(jLabel5)
                    .addComponent(jLabel18)
                    .addComponent(sobrante))
                .addGap(18, 18, 18)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255)), "Seleccione una Opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cuadrar.setBackground(new java.awt.Color(51, 102, 255));
        cuadrar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        cuadrar.setForeground(new java.awt.Color(255, 255, 255));
        cuadrar.setText("Cuadre de Caja");
        cuadrar.setToolTipText("Anulacion de tickets");
        cuadrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cuadrar.setFocusable(false);
        cuadrar.setMaximumSize(new java.awt.Dimension(71, 23));
        cuadrar.setMinimumSize(new java.awt.Dimension(71, 23));

        reporte.setBackground(new java.awt.Color(51, 102, 255));
        reporte.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        reporte.setForeground(new java.awt.Color(255, 255, 255));
        reporte.setText("Reporte de Caja");
        reporte.setToolTipText("   Pagar Premios");
        reporte.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reporte.setFocusable(false);
        reporte.setMaximumSize(new java.awt.Dimension(71, 23));
        reporte.setMinimumSize(new java.awt.Dimension(71, 23));

        ajuste.setBackground(new java.awt.Color(51, 102, 255));
        ajuste.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        ajuste.setForeground(new java.awt.Color(255, 255, 255));
        ajuste.setText("Ajuste de Cuenta");
        ajuste.setToolTipText("Ver estados de Tickets");
        ajuste.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ajuste.setFocusable(false);
        ajuste.setMaximumSize(new java.awt.Dimension(71, 23));
        ajuste.setMinimumSize(new java.awt.Dimension(71, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuadrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cuadrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        String sentencia="";
        if(!sobrante.getText().equalsIgnoreCase("0.0")){
            int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea cerrar la caja con dinero faltante? Este proceso es Irreversible.");
            if(respuesta==0){
                sentencia="INSERT INTO cierre_de_caja (id_usuario,id_agencia,total_diario,fecha,efectivo,debito,credito,diferencia) values ("+usuario+","+agencia+","+vendido.getText()+",'"+fecha_s+"',"+efectivo.getText()+","+debito.getText()+","+credito.getText()+","+sobrante.getText()+")";
                InsertarBD ejecutar=new InsertarBD(Con.conexion(),sentencia);
                cerrar.setEnabled(false);
                efectivo.setEnabled(false);
                debito.setEnabled(false);
                credito.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Cierre de caja guardado con éxito.");
            }
        }else{
            int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea guardar el cierre de caja? Este proceso es Irreversible.");
            if(respuesta==0){
                sentencia="INSERT INTO cierre_de_caja (id_usuario,id_agencia,total_diario,fecha,efectivo,debito,credito,diferencia) values ("+usuario+","+agencia+","+vendido.getText()+",'"+fecha_s+"',"+efectivo.getText()+","+debito.getText()+","+credito.getText()+","+sobrante.getText()+")";
                InsertarBD ejecutar=new InsertarBD(Con.conexion(),sentencia);
                cerrar.setEnabled(false);
                efectivo.setEnabled(false);
                debito.setEnabled(false);
                credito.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Cierre de caja guardado con éxito.");
            }
        }
    }//GEN-LAST:event_cerrarActionPerformed

    private void efectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_efectivoKeyPressed
        if(evt.VK_ENTER==evt.getKeyCode()){
            double montoa=Double.parseDouble(contado.getText());
            double montob=Double.parseDouble(efectivo.getText());
            double montoc=Double.parseDouble(sobrante.getText());
            
           contado.setText(String.valueOf(montoa+montob));
           sobrante.setText(String.valueOf(montoc-montob));
           debito.requestFocus();
        }
    }//GEN-LAST:event_efectivoKeyPressed

    private void debitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debitoKeyPressed
        if(evt.VK_ENTER==evt.getKeyCode()){
            double montoa=Double.parseDouble(contado.getText());
            double montob=Double.parseDouble(debito.getText());
            double montoc=Double.parseDouble(sobrante.getText());
            
           contado.setText(String.valueOf(montoa+montob));
           sobrante.setText(String.valueOf(montoc-montob));
           credito.requestFocus();
        }
    }//GEN-LAST:event_debitoKeyPressed

    private void creditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoKeyPressed
        if(evt.VK_ENTER==evt.getKeyCode()){
            double montoa=Double.parseDouble(contado.getText());
            double montob=Double.parseDouble(credito.getText());
            double montoc=Double.parseDouble(sobrante.getText());
            
           contado.setText(String.valueOf(montoa+montob));
           sobrante.setText(String.valueOf(montoc-montob));
           cerrar.requestFocus();
        }
    }//GEN-LAST:event_creditoKeyPressed

    private void efectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_efectivoKeyTyped
        char c =evt.getKeyChar(); 
        if((c<'0'|| c>'9') && c!='.') evt.consume();
    }//GEN-LAST:event_efectivoKeyTyped

    private void debitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debitoKeyTyped
        char c =evt.getKeyChar(); 
        if((c<'0'|| c>'9') && c!='.') evt.consume();
    }//GEN-LAST:event_debitoKeyTyped

    private void creditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditoKeyTyped
        char c =evt.getKeyChar(); 
        if((c<'0'|| c>'9') && c!='.') evt.consume();
    }//GEN-LAST:event_creditoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuadre().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajuste;
    private javax.swing.JLabel buscar;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel contado;
    private javax.swing.JTextField credito;
    private javax.swing.JButton cuadrar;
    private javax.swing.JTextField debito;
    private javax.swing.JTextField efectivo;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reporte;
    private javax.swing.JLabel sobrante;
    private javax.swing.JLabel vendido;
    // End of variables declaration//GEN-END:variables
}
