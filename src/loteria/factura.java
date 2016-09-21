package loteria;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana Karina
 */
public class factura extends javax.swing.JFrame {

    int usuario,agencia,jugada,seleccionado=0;
    Conectar Con= new Conectar();

    public factura() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        numero_ticket.requestFocus();
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boton_limpiarl = new javax.swing.JButton();
        boton_limpiarl1 = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        anular = new javax.swing.JButton();
        pago_ticket = new javax.swing.JButton();
        ver1 = new javax.swing.JButton();
        repetir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        numero_de_ticket = new javax.swing.JLabel();
        numero_ticket = new javax.swing.JTextField();
        numero_clave = new javax.swing.JTextField();
        claves = new javax.swing.JLabel();
        tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fecha = new javax.swing.JLabel();
        anulado = new javax.swing.JLabel();
        El_Anulado = new javax.swing.JTextField();
        La_Fecha = new javax.swing.JTextField();
        botonpagar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NUMERO DE TICKET");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("TICKET");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel8.setText("/");

        jLabel9.setText("/");

        boton_limpiarl.setBackground(new java.awt.Color(255, 255, 255));
        boton_limpiarl.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        boton_limpiarl.setText("Pago Ticket");
        boton_limpiarl.setToolTipText("<html><p align=\"center\"><b><u>L</u>impiar Lista</b><br>(L)</p> </html>    ");
        boton_limpiarl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton_limpiarl.setFocusable(false);
        boton_limpiarl.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_limpiarl.setMinimumSize(new java.awt.Dimension(71, 23));

        boton_limpiarl1.setBackground(new java.awt.Color(255, 255, 255));
        boton_limpiarl1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        boton_limpiarl1.setText("Cancelar Ticket");
        boton_limpiarl1.setToolTipText("<html><p align=\"center\"><b><u>L</u>impiar Lista</b><br>(L)</p> </html>    ");
        boton_limpiarl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton_limpiarl1.setFocusable(false);
        boton_limpiarl1.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_limpiarl1.setMinimumSize(new java.awt.Dimension(71, 23));

        ver.setBackground(new java.awt.Color(204, 204, 204));
        ver.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        ver.setText("Ver Ticket");
        ver.setToolTipText("");
        ver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ver.setFocusable(false);
        ver.setMaximumSize(new java.awt.Dimension(71, 23));
        ver.setMinimumSize(new java.awt.Dimension(71, 23));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SELECCIONE SU OPCION");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null), "Seleccione una opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N

        anular.setBackground(new java.awt.Color(51, 102, 255));
        anular.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular.setForeground(new java.awt.Color(255, 255, 255));
        anular.setText("Anular Ticket");
        anular.setToolTipText("Anulacion de tickets");
        anular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular.setFocusable(false);
        anular.setMaximumSize(new java.awt.Dimension(71, 23));
        anular.setMinimumSize(new java.awt.Dimension(71, 23));
        anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularActionPerformed(evt);
            }
        });

        pago_ticket.setBackground(new java.awt.Color(51, 102, 255));
        pago_ticket.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        pago_ticket.setForeground(new java.awt.Color(255, 255, 255));
        pago_ticket.setText("Pago Ticket");
        pago_ticket.setToolTipText("   Pagar Premios");
        pago_ticket.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pago_ticket.setFocusable(false);
        pago_ticket.setMaximumSize(new java.awt.Dimension(71, 23));
        pago_ticket.setMinimumSize(new java.awt.Dimension(71, 23));
        pago_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pago_ticketActionPerformed(evt);
            }
        });

        ver1.setBackground(new java.awt.Color(51, 102, 255));
        ver1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        ver1.setForeground(new java.awt.Color(255, 255, 255));
        ver1.setText("Ver Ticket");
        ver1.setToolTipText("Ver estados de Tickets");
        ver1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ver1.setFocusable(false);
        ver1.setMaximumSize(new java.awt.Dimension(71, 23));
        ver1.setMinimumSize(new java.awt.Dimension(71, 23));
        ver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver1ActionPerformed(evt);
            }
        });

        repetir.setBackground(new java.awt.Color(51, 102, 255));
        repetir.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        repetir.setForeground(new java.awt.Color(255, 255, 255));
        repetir.setText("Repetir Ticket");
        repetir.setToolTipText("Duplicar tickets");
        repetir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pago_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repetir, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(anular, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pago_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ver1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repetir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {anular, pago_ticket, repetir, ver1});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null), "TICKETS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N

        numero_de_ticket.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numero_de_ticket.setText("NUMERO DE TICKET");

        numero_ticket.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numero_ticket.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numero_ticket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero_ticketKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numero_ticketKeyPressed(evt);
            }
        });

        numero_clave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numero_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero_claveKeyTyped(evt);
            }
        });

        claves.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        claves.setText("CLAV E");

        tabla.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loteria", "Numero", "Astral", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setRowMargin(2);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla);
        tabla.setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fecha.setText("FECHA");

        anulado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        anulado.setText("ESTADO");

        El_Anulado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        El_Anulado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        La_Fecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        La_Fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        botonpagar.setBackground(new java.awt.Color(51, 102, 255));
        botonpagar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        botonpagar.setText("Pagar");
        botonpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(claves)
                        .addGap(18, 18, 18)
                        .addComponent(numero_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(numero_de_ticket)
                        .addGap(18, 18, 18)
                        .addComponent(numero_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(La_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonpagar)
                .addGap(37, 37, 37)
                .addComponent(anulado)
                .addGap(28, 28, 28)
                .addComponent(El_Anulado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_de_ticket)
                    .addComponent(numero_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claves)
                    .addComponent(numero_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(anulado)
                    .addComponent(El_Anulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(La_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonpagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 11, 530, 258));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anular_ticket(String ticket,String clave){
       String id;
       Calendar cal1 = Calendar.getInstance();
       String fecha=completarCeros(cal1.get(Calendar.DATE),2)+"/"+completarCeros((cal1.get(Calendar.MONTH)+1),2)+"/"+cal1.get(Calendar.YEAR);
       String hora=completarCeros(cal1.get(Calendar.HOUR_OF_DAY),2)+":"+completarCeros(cal1.get(Calendar.MINUTE),2)+":"+cal1.get(Calendar.SECOND);
       String consulta="SELECT * FROM ticket WHERE numero_ticket="+ticket+" and clave="+clave;
       ConsultasBD buscar=new ConsultasBD(Con.conexion(),consulta);
       if(buscar.ObtenerError()==null){
            try {
                ResultSet resultado=buscar.ObtenerResultado();
                if(resultado!=null && resultado.next()){
                      id = resultado.getString("id_ticket");
                      String anu = resultado.getString("anulado");
                      String fecha1 = (String)resultado.getObject("fecha");
                    if(anu.equalsIgnoreCase("no")){
                        if (!fecha1.equals(fecha)){
                             JOptionPane.showMessageDialog(null,"Expiro el tiempo para anular el ticket.");
                        }else{
                             String hora2=(String)resultado.getObject("hora");
                             int h=Integer.parseInt(hora.substring(0, 2));
                             int m=Integer.parseInt(hora.substring(3,5));
                             int h2=Integer.parseInt(hora2.substring(0, 2));
                             int m2=Integer.parseInt(hora2.substring(3,5));
                             if (h > h2 || m - m2 > 30){
                                JOptionPane.showMessageDialog(null,"Expiro el tiempo para anular el ticket.");
                             }else{
                                if (anu.equalsIgnoreCase("no")){
                                    String sentencia="UPDATE ticket SET anulado='Si' where id_ticket="+id;
                                    InsertarBD ejecutar=new InsertarBD(Con.conexion(),sentencia);
                                    JOptionPane.showMessageDialog(null,"Ticket Anulado.");
                                }                                
                             }
                        }
                    }else{
                           JOptionPane.showMessageDialog(null,"Este Ticket ya esta anulado");
                    }
                }else{
                      JOptionPane.showMessageDialog(null,"Ticket no encontrado, o clave errada.");
                }
            }catch (SQLException ex) {
            }
        }
    }
   
   private void pagar_ticket(String ticket,String clave){
        String consulta="SELECT id_premio,a.id_ticket FROM premios a,ticket b WHERE a.id_ticket=b.id_ticket and b.numero_ticket="+ticket+" and b.clave="+clave+" and a.estado='Pendiente' and a.id_agencia="+agencia;
        System.out.println(consulta);
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(),consulta);
        if(buscar.ObtenerError()==null){
            ResultSet resultado=buscar.ObtenerResultado();
            try {
                if(resultado!=null && resultado.next()){
                    int premio=resultado.getInt("id_premio"); 
                    String sentencia="UPDATE premios SET estado='Pagado' where id_premio="+premio;
                    InsertarBD ejecutar=new InsertarBD(Con.conexion(),sentencia);
                    int id=resultado.getInt("a.id_ticket"); 
                    String sentencia2="UPDATE ticket SET estado='Pagado' where id_ticket="+id;
                    System.out.println(sentencia2);
                    InsertarBD ejecutar2=new InsertarBD(Con.conexion(),sentencia2);
                    JOptionPane.showMessageDialog(null,"Ticket Pagado.");

                }else{
                    JOptionPane.showMessageDialog(null,"Ticket no encontrado. El premio no existe o ya fue pagado.");
                }
            } catch (SQLException ex) {

            }
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
 
   private void buscar_ticket(String ticket){
        try {    
           String consulta="SELECT * FROM ticket WHERE numero_ticket="+ticket;
           ConsultasBD buscar=new ConsultasBD(Con.conexion(),consulta);
            if(buscar.ObtenerError()==null){
                ResultSet resultado=buscar.ObtenerResultado();
                if(resultado.last()){
                    int id=resultado.getInt("id_ticket");
                    String consulta2="SELECT * FROM detalle_ticket WHERE id_ticket="+id;
                    ConsultasBD buscar2=new ConsultasBD(Con.conexion(),consulta2);
                    String anulados = resultado.getString("anulado");
                    String estado = resultado.getString("estado");
                    La_Fecha.setText(resultado.getString("fecha"));                    
                    if (anulados.equalsIgnoreCase("Si")){
                        El_Anulado.setText("Anulado");
                    }else{
                        El_Anulado.setText(estado);
                    }                    
                    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                    Object[] fila = new Object[4];
                    int total=0;
                    if(buscar2.ObtenerError()==null){
                        ResultSet resultado2=buscar2.ObtenerResultado();
                        int filas=jTable1.getRowCount();
                        for (int i = 0;filas>i; i++) {
                             modelo.removeRow(0);
                        }     
                        while(resultado2.next()){
                            fila[0]= buscar_abreviacion(resultado2.getInt("id_loteria"));
                            fila[1]= resultado2.getInt("numero");
                            fila[2]=resultado2.getString("astral");
                            fila[3]=resultado2.getInt("monto");
                            total=total+resultado2.getInt("monto");
                            modelo.addRow(fila);
                        }
                    }
                    tabla.setVisible(true);
                    La_Fecha.setVisible(true);
                    El_Anulado.setVisible(true);
                    fecha.setVisible(true);
                    anulado.setVisible(true);
                   
                }else{
                    JOptionPane.showMessageDialog(null,"Ticket no encontrado.");
                }
            }
            Con.conexion().close();
        } catch (SQLException ex) {
            System.out.println(ex);
            ;
        }
    }
   
   private String buscar_abreviacion(int id){
        try {    
           String consulta="SELECT abreviacion FROM loteria WHERE id_loteria="+id;
           ConsultasBD buscar=new ConsultasBD(Con.conexion(),consulta);
            if(buscar.ObtenerError()==null){
                ResultSet resultado=buscar.ObtenerResultado();
                if(resultado.last()){
                    String ab=resultado.getString("abreviacion");
                    return ab;
                }
            }
           Con.conexion().close();
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return "";
    } 
    
    private void pago_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pago_ticketActionPerformed
        numero_clave.setVisible(true);
       claves.setVisible(true);
       botonpagar.setText("Pagar");
       botonpagar.setVisible(true);
       tabla.setVisible(false);
       La_Fecha.setVisible(false);
       El_Anulado.setVisible(false);
       fecha.setVisible(false);
       anulado.setVisible(false);
    }//GEN-LAST:event_pago_ticketActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       tabla.setVisible(false);
       numero_clave.setVisible(false);
       claves.setVisible(false);
       La_Fecha.setVisible(false);
       El_Anulado.setVisible(false);
       fecha.setVisible(false);
       anulado.setVisible(false);
       botonpagar.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void ver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver1ActionPerformed
        botonpagar.setText("Ver");
        numero_clave.setVisible(false);
        claves.setVisible(false);
        botonpagar.setVisible(true);
    }//GEN-LAST:event_ver1ActionPerformed

    private void numero_ticketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_ticketKeyPressed
       if(evt.VK_ENTER==evt.getKeyCode()){
           if(numero_ticket.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Ingrese el numero de ticket.");
            }else{
                buscar_ticket(numero_ticket.getText());  
           }
       }
    }//GEN-LAST:event_numero_ticketKeyPressed

    private void numero_ticketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_ticketKeyTyped
        if (numero_ticket.getText().length()== 6){
             evt.consume();
         }
        char c =evt.getKeyChar(); 
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_numero_ticketKeyTyped

    private void numero_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_claveKeyTyped
        if (numero_clave.getText().length()== 9){
             evt.consume();
         }
        char c =evt.getKeyChar(); 
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_numero_claveKeyTyped

    private void anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularActionPerformed
        numero_clave.setVisible(true);
       claves.setVisible(true);
       botonpagar.setText("Anular");
       botonpagar.setVisible(true);          
       tabla.setVisible(false);
       La_Fecha.setVisible(false);
       El_Anulado.setVisible(false);
       fecha.setVisible(false);
       anulado.setVisible(false);
    }//GEN-LAST:event_anularActionPerformed

    private void botonpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpagarActionPerformed
        if(botonpagar.getText().equalsIgnoreCase("Anular")){
            if(numero_ticket.getText().length()==0 || numero_clave.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Ingrese el numero de ticket y clave.");
            }else{
                anular_ticket(numero_ticket.getText(),numero_clave.getText());
            }
        }else if(botonpagar.getText().equalsIgnoreCase("Pagar")){
            if(numero_ticket.getText().length()==0 || numero_clave.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Ingrese el numero de ticket y clave.");
            }else{
                pagar_ticket(numero_ticket.getText(),numero_clave.getText());
            }
        }else{
            if(numero_ticket.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Ingrese el numero de ticket.");
            }else{
                buscar_ticket(numero_ticket.getText());
            }
        }       
    }//GEN-LAST:event_botonpagarActionPerformed
    
    public static void main(String args[]) {     
        new factura().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField El_Anulado;
    private javax.swing.JTextField La_Fecha;
    private javax.swing.JLabel anulado;
    private javax.swing.JButton anular;
    private javax.swing.JButton boton_limpiarl;
    private javax.swing.JButton boton_limpiarl1;
    private javax.swing.JButton botonpagar;
    private javax.swing.JLabel claves;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField numero_clave;
    private javax.swing.JLabel numero_de_ticket;
    private javax.swing.JTextField numero_ticket;
    private javax.swing.JButton pago_ticket;
    private javax.swing.JButton repetir;
    private javax.swing.JPanel tabla;
    private javax.swing.JButton ver;
    private javax.swing.JButton ver1;
    // End of variables declaration//GEN-END:variables

}
