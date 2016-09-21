
package loteria;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */
public class resultados extends javax.swing.JFrame {
    public int usuario;
    public int agencia;
    public int banca;
    Conectar Con= new Conectar();
    int modulo=0;
    
    public resultados() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        resultado.requestFocus();
        desde.setVisible(false);
        hasta.setVisible(false);
        fecha1.setVisible(false);
        fecha2.setVisible(false);
        buscar_reporte.setVisible(false);
        titulo_total.setVisible(false);
        total.setVisible(false);
        titulo_total1.setVisible(false);
        total1.setVisible(false);
        man.setVisible(false);
        tar.setVisible(false);
        noc.setVisible(false);
        tod.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        resultado = new javax.swing.JButton();
        ganadores = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        desde = new javax.swing.JLabel();
        hasta = new javax.swing.JLabel();
        buscar_reporte = new javax.swing.JButton();
        titulo_total = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        titulo_total1 = new javax.swing.JLabel();
        man = new javax.swing.JRadioButton();
        tar = new javax.swing.JRadioButton();
        noc = new javax.swing.JRadioButton();
        tod = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Seleccione una Opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        resultado.setBackground(new java.awt.Color(0, 102, 255));
        resultado.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setText("Resultados");
        resultado.setToolTipText("Resultados diarios");
        resultado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resultado.setFocusable(false);
        resultado.setMaximumSize(new java.awt.Dimension(71, 23));
        resultado.setMinimumSize(new java.awt.Dimension(71, 23));
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        ganadores.setBackground(new java.awt.Color(0, 102, 255));
        ganadores.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        ganadores.setForeground(new java.awt.Color(255, 255, 255));
        ganadores.setText("Ganadores");
        ganadores.setToolTipText(" Nro Ganadores");
        ganadores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ganadores.setFocusable(false);
        ganadores.setMaximumSize(new java.awt.Dimension(71, 23));
        ganadores.setMinimumSize(new java.awt.Dimension(71, 23));
        ganadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganadoresActionPerformed(evt);
            }
        });

        ventas.setBackground(new java.awt.Color(0, 102, 255));
        ventas.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        ventas.setForeground(new java.awt.Color(255, 255, 255));
        ventas.setText("Ventas Diarias");
        ventas.setToolTipText("Ventas del Dias");
        ventas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ventas.setFocusable(false);
        ventas.setMaximumSize(new java.awt.Dimension(71, 23));
        ventas.setMinimumSize(new java.awt.Dimension(71, 23));
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        reportes.setBackground(new java.awt.Color(0, 102, 255));
        reportes.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        reportes.setForeground(new java.awt.Color(255, 255, 255));
        reportes.setText("Reportes");
        reportes.setToolTipText("Reportes completo");
        reportes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ganadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ganadores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "RESULTADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        tabla_resultados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);

        desde.setText("Desde:");

        hasta.setText("Hasta");

        buscar_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/magnifier.png"))); // NOI18N
        buscar_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_reporteActionPerformed(evt);
            }
        });

        titulo_total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titulo_total.setText("Total Venta:   Bs.");

        total.setText("0");

        total1.setText("0");

        titulo_total1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titulo_total1.setText("Total Comision:   Bs.");

        man.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(man);
        man.setText("Mañana");

        tar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(tar);
        tar.setText("Tarde");

        noc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(noc);
        noc.setText("Noche");

        tod.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(tod);
        tod.setText("Todas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(desde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(man)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tod)
                        .addGap(16, 16, 16)
                        .addComponent(hasta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(titulo_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titulo_total1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(man)
                            .addComponent(tar)
                            .addComponent(noc)
                            .addComponent(tod)))
                    .addComponent(buscar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_total)
                    .addComponent(total)
                    .addComponent(titulo_total1)
                    .addComponent(total1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        modulo=1;
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultados.getModel();
        int filas=tabla_resultados.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Loteria");
        modelo.addColumn("Signo");
        modelo.addColumn("Numero");
        desde.setVisible(true);
        desde.setText("Fecha:");
        hasta.setVisible(false);
        fecha1.setVisible(true);
        fecha2.setVisible(false);
        buscar_reporte.setVisible(false);
        titulo_total.setVisible(false);
        total.setVisible(false);
        titulo_total1.setVisible(false);
        total1.setVisible(false);
        man.setVisible(true);
        tar.setVisible(true);
        noc.setVisible(true);
        tod.setVisible(true);
        man.setLocation(600, 300);
    }//GEN-LAST:event_resultadoActionPerformed

    private void ganadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganadoresActionPerformed
       modulo=2;
       DefaultTableModel modelo = (DefaultTableModel) tabla_resultados.getModel();
       int filas=tabla_resultados.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }
       modelo.setColumnCount(0);
       modelo.setRowCount(0);
       modelo.addColumn("Fecha");
       modelo.addColumn("Loteria");
       modelo.addColumn("Ticket");
       modelo.addColumn("Ganador");
       modelo.addColumn("Premio");
       modelo.addColumn("estado");
       desde.setVisible(true);
       desde.setText("Hasta:");
        hasta.setVisible(true);
        fecha1.setVisible(true);
        fecha2.setVisible(true);
        buscar_reporte.setVisible(true);
        titulo_total.setVisible(false);
        total.setVisible(false);
        titulo_total1.setVisible(false);
        total1.setVisible(false);
        man.setVisible(false);
        tar.setVisible(false);
        noc.setVisible(false);
        tod.setVisible(false);
    }//GEN-LAST:event_ganadoresActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        modulo=3;
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultados.getModel();
        int filas=tabla_resultados.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Loteria");
        modelo.addColumn("Monto (Bs)");
        modelo.addColumn("Comision (Bs)");
        desde.setVisible(false);
        hasta.setVisible(false);
        fecha1.setVisible(false);
        fecha2.setVisible(false);
        buscar_reporte.setVisible(false);
        titulo_total.setVisible(true);
        total.setVisible(true);
        titulo_total1.setVisible(true);
        total1.setVisible(true);
        man.setVisible(false);
        tar.setVisible(false);
        noc.setVisible(false);
        tod.setVisible(false);
        Double totalV=0.0;
        Double totalC=0.0;
        Calendar cal1 = Calendar.getInstance();
        String fecha=completarCeros(cal1.get(Calendar.DATE),2)+"/"+completarCeros((cal1.get(Calendar.MONTH)+1),2)+"/"+cal1.get(Calendar.YEAR);
        String consulta="SELECT c.nombre,sum(monto) as monto FROM ticket a,detalle_ticket b,loteria c WHERE a.fecha='"+fecha+"' and a.id_ticket=b.id_ticket and a.anulado='No' and id_usuario="+usuario+" and id_agencia="+agencia+" and b.id_loteria=c.id_loteria group by b.id_loteria";
        ConsultasBD buscar= new ConsultasBD(Con.conexion(),consulta);
        Object[] fila = new Object[3];
        if(buscar.ObtenerError()==null){
            ResultSet resultado=buscar.ObtenerResultado();
            try {
                while(resultado.next()){
                    fila[0]= resultado.getObject("nombre");
                    fila[1]=resultado.getString("monto");
                    Double monto=Double.parseDouble(resultado.getString("monto"))*(comision()/100);
                    fila[2]=Math.round(monto);
                    totalV=totalV+Double.parseDouble(resultado.getString("monto"));
                    totalC=totalC+monto;                    
                    modelo.addRow(fila);
                }
                long aux=Math.round(totalC);
                total.setText(totalV.toString());
                total1.setText(String.valueOf(aux));
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_ventasActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        modulo=4;
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultados.getModel();
        int filas=tabla_resultados.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Fecha");
        modelo.addColumn("Dia");
        modelo.addColumn("Monto (Bs)");
        desde.setVisible(true);
        desde.setText("Hasta:");
        hasta.setVisible(true);
        fecha1.setVisible(true);
        fecha2.setVisible(true);
        buscar_reporte.setVisible(true);
        titulo_total.setVisible(true);
        total.setVisible(true);
        titulo_total1.setVisible(true);
        total1.setVisible(true);
        total.setText("0");
        total1.setText("0");
        man.setVisible(false);
        tar.setVisible(false);
        noc.setVisible(false);
        tod.setVisible(false);
    }//GEN-LAST:event_reportesActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            Calendar cal1 = Calendar.getInstance();
            String fecha=completarCeros(cal1.get(Calendar.DATE),2)+"/"+completarCeros((cal1.get(Calendar.MONTH)+1),2)+"/"+cal1.get(Calendar.YEAR);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate = formato.parse(fecha);
            fecha1.setDate(fechaDate);
            fecha2.setDate(fechaDate);
      } catch (ParseException ex) {
        
      } 
    }//GEN-LAST:event_formComponentShown

    private void buscar_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_reporteActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultados.getModel();
        String f1=completarCeros(fecha1.getCalendar().get(Calendar.DATE),2)+"/"+completarCeros((fecha1.getCalendar().get(Calendar.MONTH)+1),2)+"/"+fecha1.getCalendar().get(Calendar.YEAR);
        String f2=completarCeros(fecha2.getCalendar().get(Calendar.DATE),2)+"/"+completarCeros((fecha2.getCalendar().get(Calendar.MONTH)+1),2)+"/"+fecha2.getCalendar().get(Calendar.YEAR);               
        int filas=tabla_resultados.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }
        if(modulo==4){
            Double totalV=0.0;
            Double totalC=0.0;
            String consulta="SELECT fecha,sum(monto) as monto FROM ticket a,detalle_ticket b WHERE a.fecha between '"+f1+"' and '"+f2+"' and a.id_ticket=b.id_ticket and a.anulado='No' and id_usuario="+usuario+" and id_agencia="+agencia+" group by a.fecha";
            ConsultasBD buscar= new ConsultasBD(Con.conexion(),consulta);
            Object[] fila = new Object[3];
            if(buscar.ObtenerError()==null){
                ResultSet resultado=buscar.ObtenerResultado();
                try {
                    while(resultado.next()){
                        fila[0]= resultado.getObject("fecha");
                        fila[1]=resultado.getString("monto");
                        Double monto=Double.parseDouble(resultado.getString("monto"))*(comision()/100);
                        fila[2]=Math.round(monto);
                        totalV=totalV+Double.parseDouble(resultado.getString("monto"));
                        totalC=totalC+monto;                    
                        modelo.addRow(fila);
                    }
                    long aux=Math.round(totalC);
                    total.setText(totalV.toString());
                    total1.setText(String.valueOf(aux));
                } catch (SQLException ex) {
                }
            }
        }else if(modulo==2){
            String consulta="SELECT a.fecha,b.abreviacion,c.numero_ticket,a.numero,a.monto,a.estado FROM premios a,loteria b,ticket c WHERE a.id_agencia="+agencia+" and a.fecha between '"+f1+"' and '"+f2+"' and a.id_loteria=b.id_loteria and a.id_ticket=c.id_ticket";
            ConsultasBD buscar= new ConsultasBD(Con.conexion(),consulta);
            Object[] fila = new Object[6];
            if(buscar.ObtenerError()==null){
                ResultSet resultado=buscar.ObtenerResultado();
                try {
                    while(resultado.next()){
                            fila[0]= resultado.getObject("fecha");
                            fila[1]=resultado.getString("abreviacion");
                            fila[2]=resultado.getString("numero_ticket");
                            fila[3]=resultado.getString("numero");
                            fila[4]=resultado.getObject("monto");
                            fila[5]=resultado.getObject("estado");
                            modelo.addRow(fila);
                    }
                } catch (SQLException ex) {
                }
            }
        }
    }//GEN-LAST:event_buscar_reporteActionPerformed

    public float comision(){
        float com=0;
        String consulta="SELECT comision from agencia where id_banca="+banca+" and id_agencia="+agencia;
        ConsultasBD buscar= new ConsultasBD(Con.conexion(),consulta);
        if(buscar.ObtenerError()==null){
            ResultSet resultado=buscar.ObtenerResultado();
            try {
                resultado.last();
                com= Float.parseFloat(resultado.getString("comision"));
            } catch (SQLException ex) {
            }  
        }
        return com;
    }
    
    public String completarCeros(long ticket, int cant){
        String ceros="";
        String t=Long.toString(ticket);
        for(int i=0;i<cant-t.length();i++){
            ceros+="0";
        }
        return(ceros+t);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_reporte;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel desde;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JButton ganadores;
    private javax.swing.JLabel hasta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton man;
    private javax.swing.JRadioButton noc;
    private javax.swing.JButton reportes;
    private javax.swing.JButton resultado;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JRadioButton tar;
    private javax.swing.JLabel titulo_total;
    private javax.swing.JLabel titulo_total1;
    private javax.swing.JRadioButton tod;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
