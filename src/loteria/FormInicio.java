package loteria;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormInicio extends javax.swing.JFrame {

    /**
     * ***viene de sesion cuando se active esa parte***
     */
    Scanner sc = new Scanner(System.in);
    public int usuario = 1;
    public int agencia = 1;
    public int banca = 1;
    /**
     * *********************
     */
    int turno = 1;
    int min_banca, max_banca = 0;
    int limite_agencia = 0;
    String jugada = "N";
    double monto_total = 0;
    int haym = 0, hayt = 0, hayn = 0;
    int limite = 3;
    int movimiento = 0;
    int cant_agotados = 0;
    double consumido = 0;
    int[][] matriz = new int[500][2];
    int cant_matriz = 0;
    // instancia que devuelve un unico objeto del tipo conexion
    ConexionUnica Con = new ConexionUnica();
    // instancia para el control del timer
    Timer timer = new Timer();
    //variable para administrar visualizacion unica de la ventana agotado
    boolean agotado_abierto = false;

    public FormInicio() {
        initComponents();
        limite_banca();
        limite_agencia();
        llenarloteriasM();
        llenarloteriasT();
        llenarloteriasN();
        reiniciar_loterias();
        turnoActivo();
        darFoco();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnularTicket = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        PagoTicket = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        BuscarTicket = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        HistoricoTicket = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        DetalleHistorico = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        Anulados = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        DetalleAnulados = new javax.swing.JDialog();
        TicketAbiertos = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        TicketCerrados = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        VentasDia = new javax.swing.JDialog();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        Resultados = new javax.swing.JDialog();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        Menu_Emergente = new javax.swing.JPopupMenu();
        Item1 = new javax.swing.JMenuItem();
        Item2 = new javax.swing.JMenuItem();
        Agotados = new javax.swing.JDialog();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabla_agotados = new javax.swing.JTable();
        boton_jugar_agotados = new javax.swing.JButton();
        boton_cancelar_agotado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MostrarTicket = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        nro_ticket = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        det_ticket = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        fecha_t = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hora_t = new javax.swing.JLabel();
        boton_pagar = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        boton_anular = new javax.swing.JButton();
        oculta = new javax.swing.JDialog();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabla_oculta = new javax.swing.JTable();
        boton_cancelar_agotado3 = new javax.swing.JButton();
        Alerta = new javax.swing.JDialog();
        jPanel29 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ContenedorTotal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_loteriasm = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_loteriast = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabla_loteriasn = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_astral = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_jugadas = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipo_jugada = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        montou = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        boton_imprimir = new javax.swing.JButton();
        boton_limpiarl = new javax.swing.JButton();
        boton_repetirt = new javax.swing.JButton();
        boton_borrarj = new javax.swing.JButton();
        boton_anularj = new javax.swing.JButton();
        boton_ayuda = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        boton_limpiart = new javax.swing.JButton();
        boton_borrarj1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        numero_ticket = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        montot = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        boton_buscar = new javax.swing.JButton();
        texto_buscar = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        seria = new javax.swing.JLabel();
        permuta = new javax.swing.JLabel();
        terminales = new javax.swing.JLabel();
        desmarca_sorteo = new javax.swing.JLabel();
        esc_imprimir = new javax.swing.JLabel();
        eliminar_jugada = new javax.swing.JLabel();
        todos_signos = new javax.swing.JLabel();
        f12_imprimir = new javax.swing.JLabel();
        sorteo_noche = new javax.swing.JLabel();
        sorteo_tarde = new javax.swing.JLabel();
        sorteo_mañana = new javax.swing.JLabel();
        todos_sorteo = new javax.swing.JLabel();
        todos_sorteo1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cantidad_numero = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        monto_total2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        factura = new javax.swing.JButton();
        boton_borrarj8 = new javax.swing.JButton();
        boton_borrarj4 = new javax.swing.JButton();
        boton_borrarj7 = new javax.swing.JButton();

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Introduza los datos del Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.darkGray)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel24.setForeground(java.awt.Color.darkGray);
        jLabel24.setText("Ticket:");

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel25.setForeground(java.awt.Color.darkGray);
        jLabel25.setText("Clave:");

        jButton2.setBackground(java.awt.Color.gray);
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Aceptar");
        jButton2.setBorder(null);

        jButton3.setBackground(java.awt.Color.gray);
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.setBorder(null);

        jTextField6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6))
                .addGap(19, 19, 19))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(37, 37, 37)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AnularTicketLayout = new javax.swing.GroupLayout(AnularTicket.getContentPane());
        AnularTicket.getContentPane().setLayout(AnularTicketLayout);
        AnularTicketLayout.setHorizontalGroup(
            AnularTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AnularTicketLayout.setVerticalGroup(
            AnularTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Introduza los datos del Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.darkGray)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel26.setForeground(java.awt.Color.darkGray);
        jLabel26.setText("Ticket:");

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel27.setForeground(java.awt.Color.darkGray);
        jLabel27.setText("Fecha:");

        jButton4.setBackground(java.awt.Color.gray);
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Aceptar");
        jButton4.setBorder(null);

        jButton5.setBackground(java.awt.Color.gray);
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cancelar");
        jButton5.setBorder(null);

        jTextField8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8))
                .addGap(19, 19, 19))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(37, 37, 37)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PagoTicketLayout = new javax.swing.GroupLayout(PagoTicket.getContentPane());
        PagoTicket.getContentPane().setLayout(PagoTicketLayout);
        PagoTicketLayout.setHorizontalGroup(
            PagoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PagoTicketLayout.setVerticalGroup(
            PagoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Introduza los datos del Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.darkGray)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel28.setForeground(java.awt.Color.darkGray);
        jLabel28.setText("Ticket:");

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel29.setForeground(java.awt.Color.darkGray);
        jLabel29.setText("Fecha:");

        jButton6.setBackground(java.awt.Color.gray);
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Aceptar");
        jButton6.setBorder(null);

        jButton7.setBackground(java.awt.Color.gray);
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cancelar");
        jButton7.setBorder(null);

        jTextField10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10))
                .addGap(19, 19, 19))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(37, 37, 37)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BuscarTicketLayout = new javax.swing.GroupLayout(BuscarTicket.getContentPane());
        BuscarTicket.getContentPane().setLayout(BuscarTicketLayout);
        BuscarTicketLayout.setHorizontalGroup(
            BuscarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BuscarTicketLayout.setVerticalGroup(
            BuscarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Introduza los datos del Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.darkGray)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.darkGray);
        jLabel31.setText("Fecha:");

        jButton8.setBackground(java.awt.Color.gray);
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Aceptar");
        jButton8.setBorder(null);

        jButton16.setBackground(java.awt.Color.gray);
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Cancelar");
        jButton16.setBorder(null);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jTextField11)
                .addGap(19, 19, 19))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11)
                    .addComponent(jLabel31))
                .addGap(92, 92, 92)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HistoricoTicketLayout = new javax.swing.GroupLayout(HistoricoTicket.getContentPane());
        HistoricoTicket.getContentPane().setLayout(HistoricoTicketLayout);
        HistoricoTicketLayout.setHorizontalGroup(
            HistoricoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HistoricoTicketLayout.setVerticalGroup(
            HistoricoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jTable4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ticket", "Estado", "Monto", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setGridColor(java.awt.Color.lightGray);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setHeaderValue("Hora");
        }

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton17.setBackground(java.awt.Color.gray);
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Imprimir");
        jButton17.setBorder(null);

        jButton18.setBackground(java.awt.Color.gray);
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Cancelar");
        jButton18.setBorder(null);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DetalleHistoricoLayout = new javax.swing.GroupLayout(DetalleHistorico.getContentPane());
        DetalleHistorico.getContentPane().setLayout(DetalleHistoricoLayout);
        DetalleHistoricoLayout.setHorizontalGroup(
            DetalleHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DetalleHistoricoLayout.setVerticalGroup(
            DetalleHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetalleHistoricoLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true), "Introduza los datos del Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.darkGray)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTextField12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jLabel32.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel32.setForeground(java.awt.Color.darkGray);
        jLabel32.setText("Fecha:");

        jButton19.setBackground(java.awt.Color.gray);
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Aceptar");
        jButton19.setBorder(null);

        jButton20.setBackground(java.awt.Color.gray);
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Cancelar");
        jButton20.setBorder(null);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jTextField12)
                .addGap(19, 19, 19))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12)
                    .addComponent(jLabel32))
                .addGap(92, 92, 92)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AnuladosLayout = new javax.swing.GroupLayout(Anulados.getContentPane());
        Anulados.getContentPane().setLayout(AnuladosLayout);
        AnuladosLayout.setHorizontalGroup(
            AnuladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AnuladosLayout.setVerticalGroup(
            AnuladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DetalleAnuladosLayout = new javax.swing.GroupLayout(DetalleAnulados.getContentPane());
        DetalleAnulados.getContentPane().setLayout(DetalleAnuladosLayout);
        DetalleAnuladosLayout.setHorizontalGroup(
            DetalleAnuladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DetalleAnuladosLayout.setVerticalGroup(
            DetalleAnuladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial de Tickets Reportados"));

        jTable5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Asunto", "Estado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setGridColor(java.awt.Color.lightGray);
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton22.setBackground(java.awt.Color.gray);
        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Cerrar");
        jButton22.setBorder(null);

        jButton23.setBackground(java.awt.Color.gray);
        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Cerrar Ticket");
        jButton23.setBorder(null);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton23)
                        .addGap(29, 29, 29)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TicketAbiertosLayout = new javax.swing.GroupLayout(TicketAbiertos.getContentPane());
        TicketAbiertos.getContentPane().setLayout(TicketAbiertosLayout);
        TicketAbiertosLayout.setHorizontalGroup(
            TicketAbiertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TicketAbiertosLayout.setVerticalGroup(
            TicketAbiertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketAbiertosLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial de Tickets Reportados"));

        jTable6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Asunto", "Estado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setGridColor(java.awt.Color.lightGray);
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton24.setBackground(java.awt.Color.gray);
        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Cerrar");
        jButton24.setBorder(null);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TicketCerradosLayout = new javax.swing.GroupLayout(TicketCerrados.getContentPane());
        TicketCerrados.getContentPane().setLayout(TicketCerradosLayout);
        TicketCerradosLayout.setHorizontalGroup(
            TicketCerradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TicketCerradosLayout.setVerticalGroup(
            TicketCerradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketCerradosLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton21.setBackground(java.awt.Color.gray);
        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Imprimir");
        jButton21.setBorder(null);

        jButton25.setBackground(java.awt.Color.gray);
        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Cancelar");
        jButton25.setBorder(null);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentasDiaLayout = new javax.swing.GroupLayout(VentasDia.getContentPane());
        VentasDia.getContentPane().setLayout(VentasDiaLayout);
        VentasDiaLayout.setHorizontalGroup(
            VentasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentasDiaLayout.setVerticalGroup(
            VentasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jTable7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteo", "Número", "Signo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton26.setBackground(java.awt.Color.gray);
        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Imprimir");
        jButton26.setBorder(null);

        jButton27.setBackground(java.awt.Color.gray);
        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Cancelar");
        jButton27.setBorder(null);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ResultadosLayout = new javax.swing.GroupLayout(Resultados.getContentPane());
        Resultados.getContentPane().setLayout(ResultadosLayout);
        ResultadosLayout.setHorizontalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ResultadosLayout.setVerticalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu_Emergente.setBackground(new java.awt.Color(98, 91, 91));
        Menu_Emergente.setForeground(new java.awt.Color(255, 255, 255));

        Item1.setBackground(new java.awt.Color(231, 231, 231));
        Item1.setText("Cambiar Monto");
        Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item1ActionPerformed(evt);
            }
        });
        Menu_Emergente.add(Item1);

        Item2.setBackground(new java.awt.Color(231, 231, 231));
        Item2.setText("Eliminar Seleccion");
        Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item2Click(evt);
            }
        });
        Menu_Emergente.add(Item2);

        Agotados.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Agotados.setAlwaysOnTop(true);
        Agotados.setMaximumSize(new java.awt.Dimension(390, 370));
        Agotados.setMinimumSize(new java.awt.Dimension(390, 370));
        Agotados.setResizable(false);
        Agotados.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                AgotadosWindowActivated(evt);
            }
        });

        tabla_agotados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loteria", "Numero", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_agotados.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tabla_agotados);
        if (tabla_agotados.getColumnModel().getColumnCount() > 0) {
            tabla_agotados.getColumnModel().getColumn(0).setResizable(false);
            tabla_agotados.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabla_agotados.getColumnModel().getColumn(1).setResizable(false);
            tabla_agotados.getColumnModel().getColumn(2).setResizable(false);
        }

        boton_jugar_agotados.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        boton_jugar_agotados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/24px/Imprimir.png"))); // NOI18N
        boton_jugar_agotados.setText("Jugar");
        boton_jugar_agotados.setToolTipText("<html><p align=\"center\"><b><u>I</u>Jugar</b><br>(F12)</p></html>    ");
        boton_jugar_agotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_jugar_agotadosActionPerformed(evt);
            }
        });

        boton_cancelar_agotado.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        boton_cancelar_agotado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Atras2.png"))); // NOI18N
        boton_cancelar_agotado.setText("Cancelar");
        boton_cancelar_agotado.setToolTipText("<html><p align=\"center\"><b><u>I</u>Jugar</b><br>(F12)</p></html>    ");
        boton_cancelar_agotado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelar_agotadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setText("Numeros Limitados:");

        javax.swing.GroupLayout AgotadosLayout = new javax.swing.GroupLayout(Agotados.getContentPane());
        Agotados.getContentPane().setLayout(AgotadosLayout);
        AgotadosLayout.setHorizontalGroup(
            AgotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgotadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(112, 112, 112))
            .addGroup(AgotadosLayout.createSequentialGroup()
                .addGroup(AgotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgotadosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(boton_jugar_agotados, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(boton_cancelar_agotado))
                    .addGroup(AgotadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AgotadosLayout.setVerticalGroup(
            AgotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgotadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_jugar_agotados)
                    .addComponent(boton_cancelar_agotado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MostrarTicket.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        MostrarTicket.setMinimumSize(new java.awt.Dimension(330, 360));
        MostrarTicket.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setText("Ticket Nro.:");

        nro_ticket.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        det_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loteria", "Numero", "Signo", "Monto"
            }
        ));
        jScrollPane12.setViewportView(det_ticket);
        if (det_ticket.getColumnModel().getColumnCount() > 0) {
            det_ticket.getColumnModel().getColumn(0).setPreferredWidth(120);
            det_ticket.getColumnModel().getColumn(1).setPreferredWidth(70);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel9.setText("Fecha:");

        fecha_t.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel11.setText("Hora:");

        hora_t.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N

        boton_pagar.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        boton_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/pagar.png"))); // NOI18N
        boton_pagar.setText("Pagar");
        boton_pagar.setToolTipText("<html><p align=\"center\"><b>Pagar<br></p></html>    ");
        boton_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pagarActionPerformed(evt);
            }
        });

        boton_volver.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        boton_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Atras2.png"))); // NOI18N
        boton_volver.setText("Volver");
        boton_volver.setToolTipText("<html><p align=\"center\"><b>Volver<br></p></html>    ");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });

        boton_anular.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        boton_anular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/24px/Borrar.png"))); // NOI18N
        boton_anular.setText("Anular");
        boton_anular.setToolTipText("<html><p align=\"center\"><b>Anular<br></p></html>    ");
        boton_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_anularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MostrarTicketLayout = new javax.swing.GroupLayout(MostrarTicket.getContentPane());
        MostrarTicket.getContentPane().setLayout(MostrarTicketLayout);
        MostrarTicketLayout.setHorizontalGroup(
            MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MostrarTicketLayout.createSequentialGroup()
                        .addComponent(boton_volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_pagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_anular)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarTicketLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarTicketLayout.createSequentialGroup()
                                .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarTicketLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nro_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                                    .addGroup(MostrarTicketLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fecha_t, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hora_t, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarTicketLayout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        MostrarTicketLayout.setVerticalGroup(
            MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nro_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fecha_t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hora_t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabla_oculta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(tabla_oculta);
        if (tabla_oculta.getColumnModel().getColumnCount() > 0) {
            tabla_oculta.getColumnModel().getColumn(0).setResizable(false);
            tabla_oculta.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout ocultaLayout = new javax.swing.GroupLayout(oculta.getContentPane());
        oculta.getContentPane().setLayout(ocultaLayout);
        ocultaLayout.setHorizontalGroup(
            ocultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ocultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        ocultaLayout.setVerticalGroup(
            ocultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ocultaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        boton_cancelar_agotado3.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        boton_cancelar_agotado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Atras2.png"))); // NOI18N
        boton_cancelar_agotado3.setText("Volver");
        boton_cancelar_agotado3.setToolTipText("<html><p align=\"center\"><b><u>I</u>Jugar</b><br>(F12)</p></html>    ");

        Alerta.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Alerta.setMaximumSize(new java.awt.Dimension(365, 94));
        Alerta.setMinimumSize(new java.awt.Dimension(365, 94));
        Alerta.setSize(new java.awt.Dimension(365, 94));

        jLabel12.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel12.setText("Debe realizar alguna accion lo mas pronto posible");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AlertaLayout = new javax.swing.GroupLayout(Alerta.getContentPane());
        Alerta.getContentPane().setLayout(AlertaLayout);
        AlertaLayout.setHorizontalGroup(
            AlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AlertaLayout.setVerticalGroup(
            AlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        ContenedorTotal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setFocusable(false);
        panel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFocusable(false);

        tabla_loteriasm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_loteriasm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_loteriasm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_loteriasm.setFocusCycleRoot(true);
        tabla_loteriasm.setGridColor(new java.awt.Color(153, 153, 153));
        tabla_loteriasm.setNextFocusableComponent(numero);
        tabla_loteriasm.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabla_loteriasm.setSurrendersFocusOnKeystroke(true);
        tabla_loteriasm.getTableHeader().setReorderingAllowed(false);
        tabla_loteriasm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_loteriasmMouseClicked(evt);
            }
        });
        tabla_loteriasm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabla_loteriasmFocusGained(evt);
            }
        });
        tabla_loteriasm.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabla_loteriasmPropertyChange(evt);
            }
        });
        tabla_loteriasm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_loteriasmKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_loteriasm);
        if (tabla_loteriasm.getColumnModel().getColumnCount() > 0) {
            tabla_loteriasm.getColumnModel().getColumn(0).setMinWidth(25);
            tabla_loteriasm.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabla_loteriasm.getColumnModel().getColumn(0).setMaxWidth(25);
            tabla_loteriasm.getColumnModel().getColumn(1).setResizable(false);
            tabla_loteriasm.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_loteriasm.getColumnModel().getColumn(2).setResizable(false);
            tabla_loteriasm.getColumnModel().getColumn(2).setPreferredWidth(25);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        panel.addTab("Mañana", jPanel8);

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setFocusable(false);

        tabla_loteriast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_loteriast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_loteriast.setGridColor(new java.awt.Color(153, 153, 153));
        tabla_loteriast.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabla_loteriast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_loteriastMouseClicked(evt);
            }
        });
        tabla_loteriast.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabla_loteriastFocusGained(evt);
            }
        });
        tabla_loteriast.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabla_loteriastPropertyChange(evt);
            }
        });
        tabla_loteriast.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_loteriastKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(tabla_loteriast);
        if (tabla_loteriast.getColumnModel().getColumnCount() > 0) {
            tabla_loteriast.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabla_loteriast.getColumnModel().getColumn(1).setResizable(false);
            tabla_loteriast.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_loteriast.getColumnModel().getColumn(2).setResizable(false);
            tabla_loteriast.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel.addTab("Tarde", jPanel9);

        jScrollPane10.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setFocusable(false);

        tabla_loteriasn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_loteriasn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_loteriasn.setGridColor(new java.awt.Color(153, 153, 153));
        tabla_loteriasn.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabla_loteriasn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_loteriasnMouseClicked(evt);
            }
        });
        tabla_loteriasn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabla_loteriasnFocusGained(evt);
            }
        });
        tabla_loteriasn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabla_loteriasnPropertyChange(evt);
            }
        });
        tabla_loteriasn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_loteriasnKeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(tabla_loteriasn);
        if (tabla_loteriasn.getColumnModel().getColumnCount() > 0) {
            tabla_loteriasn.getColumnModel().getColumn(0).setMinWidth(25);
            tabla_loteriasn.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabla_loteriasn.getColumnModel().getColumn(0).setMaxWidth(25);
            tabla_loteriasn.getColumnModel().getColumn(1).setResizable(false);
            tabla_loteriasn.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_loteriasn.getColumnModel().getColumn(2).setResizable(false);
            tabla_loteriasn.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel.addTab("Noche", jPanel5);

        tabla_astral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_astral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "ARIES"},
                {null, "TAURO"},
                {null, "GÉMINIS"},
                {null, "CÁNCER"},
                {null, "LEO"},
                {null, "VIRGO"},
                {null, "LIBRA"},
                {null, "ESCORPIO"},
                {null, "SAGITARIO"},
                {null, "CAPRICORNIO"},
                {null, "ACUARIO"},
                {null, "PISCIS"}
            },
            new String [] {
                "", "Astral"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_astral.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabla_astral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_astralMouseClicked(evt);
            }
        });
        tabla_astral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabla_astralFocusGained(evt);
            }
        });
        tabla_astral.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabla_astralPropertyChange(evt);
            }
        });
        tabla_astral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_astralKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_astral);
        if (tabla_astral.getColumnModel().getColumnCount() > 0) {
            tabla_astral.getColumnModel().getColumn(0).setMinWidth(25);
            tabla_astral.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabla_astral.getColumnModel().getColumn(0).setMaxWidth(25);
            tabla_astral.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_jugadas.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        tabla_jugadas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tabla_jugadas.setForeground(java.awt.Color.darkGray);
        tabla_jugadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugada", "Loteria", "Signo", "Número", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_jugadas.setComponentPopupMenu(Menu_Emergente);
        tabla_jugadas.setFocusable(false);
        tabla_jugadas.setGridColor(java.awt.Color.lightGray);
        tabla_jugadas.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabla_jugadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_jugadasKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_jugadas);
        if (tabla_jugadas.getColumnModel().getColumnCount() > 0) {
            tabla_jugadas.getColumnModel().getColumn(0).setMinWidth(50);
            tabla_jugadas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_jugadas.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_jugadas.getColumnModel().getColumn(2).setMinWidth(120);
            tabla_jugadas.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla_jugadas.getColumnModel().getColumn(2).setMaxWidth(120);
            tabla_jugadas.getColumnModel().getColumn(3).setMinWidth(100);
            tabla_jugadas.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla_jugadas.getColumnModel().getColumn(3).setMaxWidth(100);
            tabla_jugadas.getColumnModel().getColumn(4).setMinWidth(200);
            tabla_jugadas.getColumnModel().getColumn(4).setPreferredWidth(200);
            tabla_jugadas.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("Monto:");
        jLabel5.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setText("Jugada:");
        jLabel3.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setText("Número:");
        jLabel7.setFocusable(false);

        tipo_jugada.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tipo_jugada.setForeground(new java.awt.Color(255, 0, 0));
        tipo_jugada.setFocusable(false);

        numero.setNextFocusableComponent(montou);
        numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroKeyReleased(evt);
            }
        });

        montou.setNextFocusableComponent(tabla_loteriasm);
        montou.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                montouFocusGained(evt);
            }
        });
        montou.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montouKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                montouKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo_jugada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montou, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(montou)
                    .addComponent(numero)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(tipo_jugada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accesos Directo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setFocusable(false);

        boton_imprimir.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        boton_imprimir.setForeground(new java.awt.Color(255, 255, 255));
        boton_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Imprimir.png"))); // NOI18N
        boton_imprimir.setToolTipText("<html><p align=\"center\"><b><u>I</u>mprimir</b><br>(F12)</p></html>    ");
        boton_imprimir.setFocusable(false);
        boton_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_imprimirActionPerformed(evt);
            }
        });

        boton_limpiarl.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        boton_limpiarl.setForeground(new java.awt.Color(255, 255, 255));
        boton_limpiarl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Limpiar.png"))); // NOI18N
        boton_limpiarl.setToolTipText("<html><p align=\"center\"><b><u>L</u>impiar Lista</b><br>(L)</p> </html>    ");
        boton_limpiarl.setFocusable(false);
        boton_limpiarl.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_limpiarl.setMinimumSize(new java.awt.Dimension(71, 23));
        boton_limpiarl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarlActionPerformed(evt);
            }
        });

        boton_repetirt.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        boton_repetirt.setForeground(new java.awt.Color(255, 255, 255));
        boton_repetirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Repetir2.png"))); // NOI18N
        boton_repetirt.setToolTipText("<html><p align=\"center\"><b><u>R</u>epetir Ticket</b><br>(R)</p> </html>    ");
        boton_repetirt.setFocusable(false);
        boton_repetirt.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_repetirt.setMinimumSize(new java.awt.Dimension(71, 23));

        boton_borrarj.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        boton_borrarj.setForeground(new java.awt.Color(255, 255, 255));
        boton_borrarj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Borrar6.png"))); // NOI18N
        boton_borrarj.setToolTipText("<html><p align=\"center\"><b><u>B</u>orrar Jugada</b><br>(DEL)</p> </html>    ");
        boton_borrarj.setFocusable(false);
        boton_borrarj.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_borrarj.setMinimumSize(new java.awt.Dimension(71, 23));
        boton_borrarj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarjActionPerformed(evt);
            }
        });

        boton_anularj.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        boton_anularj.setForeground(new java.awt.Color(255, 255, 255));
        boton_anularj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Borrar4.png"))); // NOI18N
        boton_anularj.setToolTipText("<html><p align=\"center\"><b><u>A</u>nular Jugada</b><br>(A)</p> </html>    ");
        boton_anularj.setFocusable(false);
        boton_anularj.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_anularj.setMinimumSize(new java.awt.Dimension(71, 23));
        boton_anularj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_anularjActionPerformed(evt);
            }
        });

        boton_ayuda.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        boton_ayuda.setForeground(new java.awt.Color(255, 255, 255));
        boton_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Ayuda2.png"))); // NOI18N
        boton_ayuda.setToolTipText("<html><p align=\"center\"><b><u>A</u>yuda</b><br>(F1)</p> </html>    ");
        boton_ayuda.setFocusable(false);
        boton_ayuda.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_ayuda.setMinimumSize(new java.awt.Dimension(71, 23));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel30.setForeground(java.awt.Color.darkGray);
        jLabel30.setText("<html><p align=\"center\"><b><u>I</u>mprimir</b><br>(ESC)</p> </html>    ");
        jLabel30.setFocusable(false);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setForeground(java.awt.Color.darkGray);
        jLabel33.setText("<html><p align=\"center\"><b><u>L</u>impiar Todo</b><br>(F7)</p> </html>    ");
        jLabel33.setFocusable(false);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel35.setForeground(java.awt.Color.darkGray);
        jLabel35.setText("<html><p align=\"center\"><b><u>L</u>impiar Lista</b><br>(L)</p> </html>    ");
        jLabel35.setFocusable(false);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel36.setForeground(java.awt.Color.darkGray);
        jLabel36.setText("<html><p align=\"center\"><b><u>A</u>nular Jugada</b><br>(A)</p> </html>    ");
        jLabel36.setFocusable(false);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel37.setForeground(java.awt.Color.darkGray);
        jLabel37.setText("<html><p align=\"center\"><b><u>R</u>epetir Ticket</b><br>(R)</p> </html>    ");
        jLabel37.setFocusable(false);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setForeground(java.awt.Color.darkGray);
        jLabel38.setText("<html><p align=\"center\"><b><u>A</u>yuda</b><br>(F1)</p> </html>    ");
        jLabel38.setFocusable(false);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel39.setForeground(java.awt.Color.darkGray);
        jLabel39.setText("<html><p align=\"center\"><b><u>L</u>impiar Loterias</b><br>(F3)</p> </html>   ");
        jLabel39.setFocusable(false);

        boton_limpiart.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        boton_limpiart.setForeground(new java.awt.Color(255, 255, 255));
        boton_limpiart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/Borrar5.png"))); // NOI18N
        boton_limpiart.setToolTipText("<html><p align=\"center\"><b><u>L</u>impiar Todo</b><br>(F7)</p> </html>  ");
        boton_limpiart.setFocusable(false);
        boton_limpiart.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_limpiart.setMinimumSize(new java.awt.Dimension(71, 23));
        boton_limpiart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiartActionPerformed(evt);
            }
        });

        boton_borrarj1.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        boton_borrarj1.setForeground(new java.awt.Color(255, 255, 255));
        boton_borrarj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/negro.png"))); // NOI18N
        boton_borrarj1.setToolTipText("<html><p align=\"center\"><b><u>G</u>anador del Dia</b><br>(G)</p> </html>    ");
        boton_borrarj1.setFocusable(false);
        boton_borrarj1.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_borrarj1.setMinimumSize(new java.awt.Dimension(71, 23));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setForeground(java.awt.Color.darkGray);
        jLabel40.setText("<html><p align=\"center\"><b><u>G</u>anadores</b><br>(G)</p> </html>   ");
        jLabel40.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_limpiarl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_repetirt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_borrarj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_limpiart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_anularj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(boton_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_borrarj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_limpiart, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_limpiarl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_anularj, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_repetirt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_borrarj, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_borrarj1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        jPanel4.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setText("Ticket:");

        numero_ticket.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        numero_ticket.setText("(0)");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setText("Monto:");

        montot.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        montot.setText("0,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numero_ticket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(75, 75, 75)
                .addComponent(montot)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(numero_ticket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(montot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        boton_buscar.setBackground(java.awt.Color.red);
        boton_buscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boton_buscar.setForeground(new java.awt.Color(255, 255, 255));
        boton_buscar.setText("Buscar");
        boton_buscar.setBorder(null);
        boton_buscar.setFocusable(false);
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        texto_buscar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        texto_buscar.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        texto_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texto_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(texto_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addComponent(texto_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setForeground(java.awt.Color.darkGray);
        jLabel34.setText("Nueva Jugada");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        jPanel13.setFocusable(false);

        seria.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        seria.setForeground(java.awt.Color.darkGray);
        seria.setText("(.) SERIE");

        permuta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        permuta.setForeground(java.awt.Color.darkGray);
        permuta.setText("(P) PERMUTAS");

        terminales.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        terminales.setForeground(java.awt.Color.darkGray);
        terminales.setText("(T) TERMINALES");

        desmarca_sorteo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        desmarca_sorteo.setForeground(java.awt.Color.darkGray);
        desmarca_sorteo.setText("(F3) DESMARCA SORTEO");

        esc_imprimir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        esc_imprimir.setForeground(java.awt.Color.darkGray);
        esc_imprimir.setText("(L) LIMPIAR LISTA");

        eliminar_jugada.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        eliminar_jugada.setForeground(java.awt.Color.darkGray);
        eliminar_jugada.setText("(F7) LIMPIAR TODO");

        todos_signos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        todos_signos.setForeground(java.awt.Color.darkGray);
        todos_signos.setText("(F4) TODOS LOS SIGNOS");

        f12_imprimir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        f12_imprimir.setForeground(java.awt.Color.darkGray);
        f12_imprimir.setText("(ESC) IMPRIMIR");

        sorteo_noche.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sorteo_noche.setForeground(java.awt.Color.darkGray);
        sorteo_noche.setText("(CTRL+N) SORTEO NOCHE");

        sorteo_tarde.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sorteo_tarde.setForeground(java.awt.Color.darkGray);
        sorteo_tarde.setText("(CTRL+T) SORTEO TARDE");

        sorteo_mañana.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sorteo_mañana.setForeground(java.awt.Color.darkGray);
        sorteo_mañana.setText("(CTRL+M) SORTEO MAÑANA");

        todos_sorteo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        todos_sorteo.setForeground(java.awt.Color.darkGray);
        todos_sorteo.setText("(CTRL+O) TODOS LOS SORTEOS");

        todos_sorteo1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        todos_sorteo1.setForeground(java.awt.Color.darkGray);
        todos_sorteo1.setText("(CTRL+S) SIGNOS");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seria)
                    .addComponent(permuta)
                    .addComponent(terminales)
                    .addComponent(desmarca_sorteo))
                .addGap(47, 47, 47)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todos_signos)
                    .addComponent(eliminar_jugada)
                    .addComponent(esc_imprimir)
                    .addComponent(f12_imprimir))
                .addGap(40, 40, 40)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(sorteo_mañana)
                        .addGap(30, 30, 30)
                        .addComponent(todos_sorteo1))
                    .addComponent(sorteo_tarde)
                    .addComponent(sorteo_noche)
                    .addComponent(todos_sorteo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(todos_signos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar_jugada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esc_imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f12_imprimir))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(seria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(permuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terminales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desmarca_sorteo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sorteo_mañana)
                    .addComponent(todos_sorteo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteo_tarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteo_noche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todos_sorteo)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        jPanel11.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Cantidad de Números:");
        jLabel1.setFocusable(false);

        cantidad_numero.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        cantidad_numero.setText("(0)");
        cantidad_numero.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setText("Monto Total:");
        jLabel8.setFocusable(false);

        monto_total2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        monto_total2.setText("0,00");
        monto_total2.setFocusable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad_numero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(39, 39, 39)
                .addComponent(monto_total2)
                .addGap(22, 22, 22))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cantidad_numero)
                    .addComponent(jLabel8)
                    .addComponent(monto_total2))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        factura.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        factura.setForeground(new java.awt.Color(255, 255, 255));
        factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/factura.png"))); // NOI18N
        factura.setToolTipText("<html><p align=\"center\"><b><u>F</u>actura</b><br></p> </html>    ");
        factura.setFocusable(false);
        factura.setMaximumSize(new java.awt.Dimension(71, 23));
        factura.setMinimumSize(new java.awt.Dimension(71, 23));
        factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaActionPerformed(evt);
            }
        });

        boton_borrarj8.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        boton_borrarj8.setForeground(new java.awt.Color(255, 255, 255));
        boton_borrarj8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/herramineta.png"))); // NOI18N
        boton_borrarj8.setToolTipText("<html><p align=\"center\"><b><u>H</u>erramientas</b><br> </html>    ");
        boton_borrarj8.setFocusable(false);
        boton_borrarj8.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_borrarj8.setMinimumSize(new java.awt.Dimension(71, 23));
        boton_borrarj8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarj8ActionPerformed(evt);
            }
        });

        boton_borrarj4.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        boton_borrarj4.setForeground(new java.awt.Color(255, 255, 255));
        boton_borrarj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/dinero.png"))); // NOI18N
        boton_borrarj4.setToolTipText("<html><p align=\"center\"><b><u>R</u>esultado</b><br> </html>    ");
        boton_borrarj4.setFocusable(false);
        boton_borrarj4.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_borrarj4.setMinimumSize(new java.awt.Dimension(71, 23));
        boton_borrarj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarj4ActionPerformed(evt);
            }
        });

        boton_borrarj7.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        boton_borrarj7.setForeground(new java.awt.Color(255, 255, 255));
        boton_borrarj7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/32px/opciones.png"))); // NOI18N
        boton_borrarj7.setToolTipText("<html><p align=\"center\"><b><u>B</u>orrar Jugada</b><br>(DEL)</p> </html>    ");
        boton_borrarj7.setFocusable(false);
        boton_borrarj7.setMaximumSize(new java.awt.Dimension(71, 23));
        boton_borrarj7.setMinimumSize(new java.awt.Dimension(71, 23));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_borrarj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_borrarj4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_borrarj7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_borrarj4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_borrarj8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boton_borrarj7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout ContenedorTotalLayout = new javax.swing.GroupLayout(ContenedorTotal);
        ContenedorTotal.setLayout(ContenedorTotalLayout);
        ContenedorTotalLayout.setHorizontalGroup(
            ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTotalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorTotalLayout.createSequentialGroup()
                    .addGap(577, 577, 577)
                    .addComponent(jLabel34)
                    .addContainerGap(835, Short.MAX_VALUE)))
        );
        ContenedorTotalLayout.setVerticalGroup(
            ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContenedorTotalLayout.createSequentialGroup()
                        .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContenedorTotalLayout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(ContenedorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorTotalLayout.createSequentialGroup()
                    .addGap(320, 320, 320)
                    .addComponent(jLabel34)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_loteriasmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_loteriasmKeyPressed
        if (evt.VK_ENTER == evt.getKeyCode()) {
            tabla_loteriasm.setRowSelectionInterval(tabla_loteriasm.getSelectedRow() - 1, tabla_loteriasm.getSelectedRow() - 1);
            numero.requestFocus();
        }
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_tabla_loteriasmKeyPressed

    private void tabla_loteriastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_loteriastKeyPressed
        if (evt.VK_ENTER == evt.getKeyCode()) {
            tabla_loteriast.setRowSelectionInterval(tabla_loteriast.getSelectedRow() - 1, tabla_loteriast.getSelectedRow() - 1);
            numero.requestFocus();
        }
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_tabla_loteriastKeyPressed

    private void tabla_loteriasnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_loteriasnKeyPressed
        if (evt.VK_ENTER == evt.getKeyCode()) {
            if (tabla_loteriasn.getSelectedRow() > 0) {
                tabla_loteriasn.setRowSelectionInterval(tabla_loteriasn.getSelectedRow() - 1, tabla_loteriasn.getSelectedRow() - 1);
                numero.requestFocus();
            }
        }
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_tabla_loteriasnKeyPressed

    private void boton_limpiarlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarlActionPerformed
        limpiarjugada();
    }//GEN-LAST:event_boton_limpiarlActionPerformed

    private void boton_limpiartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiartActionPerformed
        limpiarjugada();
        reiniciar_loterias();
    }//GEN-LAST:event_boton_limpiartActionPerformed

    private void tabla_jugadasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_jugadasKeyReleased
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_tabla_jugadasKeyReleased

    private void boton_borrarjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarjActionPerformed
        reiniciar_loterias();
    }//GEN-LAST:event_boton_borrarjActionPerformed

    private void numeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyReleased
        seleccionarJugada(evt);
    }//GEN-LAST:event_numeroKeyReleased

    private void montouKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montouKeyPressed
        if (evt.VK_ENTER == evt.getKeyCode()) {
            montou.setText(new Integer(montou.getText()).toString());
            if (montou.getText().length() == 0) {
                jLabel5.setForeground(Color.red);
                montou.requestFocus();
            } else if (new Integer(montou.getText()) < min_banca) {
                jLabel5.setForeground(Color.red);
                montou.requestFocus();
                JOptionPane.showMessageDialog(null, "Monto minimo: Bs." + min_banca);
                Toolkit.getDefaultToolkit().beep();
            } else if (numero.getText().length() == 0) {
                jLabel7.setForeground(Color.red);
                numero.requestFocus();
                Toolkit.getDefaultToolkit().beep();
            } else if (jugada.equals("N")) {
                jugadaNormal(numero.getText());
                calcularMontoTotal();
                tipo_jugada.setText("");
                numero.setText("");
                jugada = "N";
            } else if (jugada.equals("T") && numero.getText().length() == 2) {
                jugadaNormal(numero.getText());
                calcularMontoTotal();
                tipo_jugada.setText("");
                numero.setText("");
                jugada = "N";
            } else if (jugada.equals("P") && numero.getText().length() == 3) {
                String respuesta[] = permuta(numero.getText());
                String definitivo[] = llenar(respuesta);
                for (int j = 0; j < definitivo.length; j++) {
                    if (definitivo[j] != null) {
                        jugadaNormal(definitivo[j]);
                        jugada = "N";
                    }
                }
                tipo_jugada.setText("");
                numero.setText("");
                calcularMontoTotal();
            } else if (jugada.equals("P") && numero.getText().length() == 2) {
                String respuesta[] = permutaTerminal(numero.getText());
                String definitivo[] = llenar(respuesta);
                for (int j = 0; j < definitivo.length; j++) {
                    if (definitivo[j] != null) {
                        jugada = "T";
                        jugadaNormal(definitivo[j]);
                        jugada = "N";
                    }
                }
                tipo_jugada.setText("");
                numero.setText("");
                calcularMontoTotal();
            } else if (jugada.equals("S") && numero.getText().length() == 2) {
                String respuesta[] = serie(numero.getText());
                for (int j = 0; j < respuesta.length; j++) {
                    if (respuesta[j] != null) {
                        jugada = "N";
                        jugadaNormal(respuesta[j]);
                    }
                }
                tipo_jugada.setText("");
                numero.setText("");
                calcularMontoTotal();
            } else if (jugada.equals("S") && numero.getText().length() > 2) {
                JOptionPane.showMessageDialog(null, "Las series solo se permiten con dos digitos.");
                numero.requestFocus();
            } else if (jugada.equals("T") && numero.getText().length() > 2) {
                JOptionPane.showMessageDialog(null, "Los terminales solo se permiten con dos digitos.");
                numero.requestFocus();
            } else {
                numero.setText("");
                numero.requestFocus();
            }
        } else if (evt.VK_TAB == evt.getKeyCode()) {
            darFoco();
        }
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_montouKeyPressed

    private void numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER && numero.getText().length() == 0 || evt.getKeyCode() == evt.VK_ENTER && numero.getText().length() >= 2) {

            montou.requestFocus();
        } else if (evt.getKeyCode() == evt.VK_ENTER && numero.getText().length() == 1) {
            numero.requestFocus();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Minimo de 2 Digitos");
        }
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_numeroKeyPressed

    private void tabla_astralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_astralKeyPressed
        if (evt.VK_ENTER == evt.getKeyCode()) {
            numero.requestFocus();
        }
        funcionesDelTeclado(evt);
    }//GEN-LAST:event_tabla_astralKeyPressed

    private void montouKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montouKeyTyped
        char c = evt.getKeyChar();
        if (montou.getText().length() == 4) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_montouKeyTyped

    private void numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyTyped
        char c = evt.getKeyChar();
        int no = 0;
        for (int i = 0; i < tabla_loteriasm.getRowCount(); i++) {
            if (tabla_loteriasm.getValueAt(i, 0).equals(true)) {
                no++;
            }
        }
        for (int i = 0; i < tabla_loteriasn.getRowCount(); i++) {
            if (tabla_loteriasn.getValueAt(i, 0).equals(true)) {
                no++;
            }
        }
        for (int i = 0; i < tabla_loteriast.getRowCount(); i++) {
            if (tabla_loteriast.getValueAt(i, 0).equals(true)) {
                no++;
            }
        }
        if (numero.getText().length() == limite) {
            evt.consume();
        }
        if (!Character.isDigit(c) || no == 0) {
            evt.consume();
        }
    }//GEN-LAST:event_numeroKeyTyped

    private void tabla_loteriasmPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabla_loteriasmPropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName().toString()) && movimiento == 0) {
            if (tabla_loteriasm.getSelectedRow() < tabla_loteriasm.getRowCount() - 1) {
                tabla_loteriasm.setRowSelectionInterval(tabla_loteriasm.getSelectedRow() + 1, tabla_loteriasm.getSelectedRow() + 1);
                movimiento++;
            } else {
                tabla_loteriasm.setRowSelectionInterval(0, 0);
                movimiento++;
            }
        } else {
            movimiento = 0;
        }
    }//GEN-LAST:event_tabla_loteriasmPropertyChange

    private void tabla_loteriastPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabla_loteriastPropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName().toString()) && movimiento == 0) {
            if (tabla_loteriast.getSelectedRow() < tabla_loteriast.getRowCount() - 1) {
                tabla_loteriast.setRowSelectionInterval(tabla_loteriast.getSelectedRow() + 1, tabla_loteriast.getSelectedRow() + 1);
                movimiento++;
            } else {
                tabla_loteriast.setRowSelectionInterval(0, 0);
                movimiento++;
            }
        } else {
            movimiento = 0;
        }
    }//GEN-LAST:event_tabla_loteriastPropertyChange

    private void tabla_loteriasnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabla_loteriasnPropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName().toString()) && movimiento == 0) {
            if (tabla_loteriasn.getSelectedRow() < tabla_loteriasn.getRowCount() - 1) {
                tabla_loteriasn.setRowSelectionInterval(tabla_loteriasn.getSelectedRow() + 1, tabla_loteriasn.getSelectedRow() + 1);
                movimiento++;
            } else {
                tabla_loteriasn.setRowSelectionInterval(0, 0);
                movimiento++;
            }
        } else {
            movimiento = 0;
        }
    }//GEN-LAST:event_tabla_loteriasnPropertyChange

    private void tabla_astralPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabla_astralPropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName().toString()) && movimiento == 0) {
            if (tabla_astral.getSelectedRow() < tabla_astral.getRowCount() - 1) {
                tabla_astral.setRowSelectionInterval(tabla_astral.getSelectedRow() + 1, tabla_astral.getSelectedRow() + 1);
                movimiento++;
            } else {
                tabla_astral.setRowSelectionInterval(0, 0);
                movimiento++;
            }
        } else {
            movimiento = 0;
        }
    }//GEN-LAST:event_tabla_astralPropertyChange

    private void Item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item1ActionPerformed
        String cant;
        cant = JOptionPane.showInputDialog("Introduzca el Nuevo Monto");
        DefaultTableModel dtm = (DefaultTableModel) tabla_jugadas.getModel();
        int arr[] = tabla_jugadas.getSelectedRows();
        for (int i = 0; i < tabla_jugadas.getSelectedRows().length; i++) {
            dtm.setValueAt(cant, arr[i], 4);
        }
        this.calcularMontoTotal();
    }//GEN-LAST:event_Item1ActionPerformed

    private void Item2Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item2Click
        DefaultTableModel dtm = (DefaultTableModel) tabla_jugadas.getModel();
        int arr[] = tabla_jugadas.getSelectedRows();
        for (int i = tabla_jugadas.getSelectedRows().length - 1; i >= 0; i--) {
            dtm.removeRow(arr[i]);
        }
        this.calcularMontoTotal();
    }//GEN-LAST:event_Item2Click

    private void boton_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_imprimirActionPerformed
        imprimir_ticket();
    }//GEN-LAST:event_boton_imprimirActionPerformed

    private void boton_jugar_agotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_jugar_agotadosActionPerformed
        int monto_original, numero, numero2, monto, monto2;
        String loteria, loteria2;
        DefaultTableModel modelo = (DefaultTableModel) tabla_agotados.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) tabla_jugadas.getModel();

        for (int i = 0; i < tabla_agotados.getRowCount(); i++) {

            numero = new Integer(tabla_agotados.getValueAt(i, 1).toString());
            loteria = tabla_agotados.getValueAt(i, 0).toString();
            monto = new Integer(tabla_agotados.getValueAt(i, 2).toString());

            for (int j = 0; j < tabla_jugadas.getRowCount(); j++) {
                numero2 = new Integer(tabla_jugadas.getValueAt(j, 3).toString());
                monto_original = new Integer(tabla_jugadas.getValueAt(j, 4).toString());
                loteria2 = tabla_jugadas.getValueAt(i, 1).toString();
                if (numero == numero2 && monto_original > monto && loteria.compareTo(loteria2) == 0) {
                    tabla_jugadas.setValueAt(monto, i, 4);
                }
            }
        }
        
        int filas = tabla_agotados.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        
        for (int i = tabla_jugadas.getRowCount() - 1; i >= 0; i--) {
            monto2 = new Integer(tabla_jugadas.getValueAt(i, 4).toString());
            if (monto2 == 0) {
                modelo2.removeRow(i);
            }
        }
        cant_agotados = 0;
        Agotados.dispose();
        this.setEnabled(true);
        
        if (tabla_jugadas.getRowCount() > 0) {
            imprimir_ticket();
            limpiar_todo();
        } else {
            JOptionPane.showMessageDialog(null, "No hay jugadas para guardar");
        }
        
    }//GEN-LAST:event_boton_jugar_agotadosActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        darFoco();
    }//GEN-LAST:event_formComponentShown

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        if (texto_buscar.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese en numero de ticket.");
        } else {
            buscar_ticket(texto_buscar.getText());
        }
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pagarActionPerformed
        String clave = JOptionPane.showInputDialog("Ingrese la Clave:");
        pagar_ticket(nro_ticket.getText(), clave);
        MostrarTicket.dispose();
    }//GEN-LAST:event_boton_pagarActionPerformed

    private void boton_borrarj8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarj8ActionPerformed
        Herramientas f = new Herramientas();
        f.agencia = agencia;
        f.usuario = usuario;
        f.setTitle("Herramientas");
        f.setLocation(100, 100);
        f.setVisible(true);
    }//GEN-LAST:event_boton_borrarj8ActionPerformed

    private void boton_borrarj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarj4ActionPerformed
        resultados f = new resultados();
        f.setLocationRelativeTo(null);
        f.setTitle("Resultados");
        f.agencia = agencia;
        f.usuario = usuario;
        f.banca = banca;
        f.setVisible(true);
    }//GEN-LAST:event_boton_borrarj4ActionPerformed

    private void facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaActionPerformed
        factura f = new factura();
        f.agencia = agencia;
        f.usuario = usuario;
        f.setLocationRelativeTo(null);
        f.setTitle("Tickets");
        f.setVisible(true);
    }//GEN-LAST:event_facturaActionPerformed

    private void tabla_loteriasmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabla_loteriasmFocusGained
        tabla_loteriasm.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_loteriasmFocusGained

    private void texto_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_buscarKeyTyped
        if (numero_ticket.getText().length() == 6) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_texto_buscarKeyTyped

    private void montouFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montouFocusGained
        montou.setSelectionStart(0);
        montou.setSelectionEnd(4);
    }//GEN-LAST:event_montouFocusGained

    private void tabla_loteriasmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_loteriasmMouseClicked
        tabla_loteriasm.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_loteriasmMouseClicked

    private void tabla_loteriastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_loteriastMouseClicked
        tabla_loteriast.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_loteriastMouseClicked

    private void tabla_loteriasnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_loteriasnMouseClicked
        tabla_loteriasn.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_loteriasnMouseClicked

    private void tabla_loteriastFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabla_loteriastFocusGained
        tabla_loteriast.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_loteriastFocusGained

    private void tabla_loteriasnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabla_loteriasnFocusGained
        tabla_loteriasn.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_loteriasnFocusGained

    private void tabla_astralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabla_astralFocusGained
        tabla_astral.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_astralFocusGained

    private void tabla_astralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_astralMouseClicked
        tabla_astral.setColumnSelectionInterval(0, 0);
    }//GEN-LAST:event_tabla_astralMouseClicked

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        MostrarTicket.dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    private void boton_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_anularActionPerformed
        String clave = JOptionPane.showInputDialog("Ingrese la clave:");
        anular_ticket(nro_ticket.getText(), clave);
        MostrarTicket.dispose();
    }//GEN-LAST:event_boton_anularActionPerformed

    private void boton_anularjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_anularjActionPerformed
        String ticket = JOptionPane.showInputDialog("Ingrese el numero de Ticket:");
        if (ticket.length() > 1) {
            String clave = JOptionPane.showInputDialog("Ingrese la clave:");
            anular_ticket(ticket, clave);
        }
    }//GEN-LAST:event_boton_anularjActionPerformed

    private void boton_cancelar_agotadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelar_agotadoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_agotados.getModel();
        int filas = tabla_agotados.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        cant_agotados = 0;
        Agotados.dispose();
        this.setEnabled(true);
        try {
            Con.conexion().rollback();
        } catch (SQLException ex1) {
            System.out.println("Error en ActionPerformed boton_cancelar ventana agotado" + ex1.getMessage());
        }
    }//GEN-LAST:event_boton_cancelar_agotadoActionPerformed

    private void ventanaAgotado() {
        // Limitacion de tiempo de la ventana agotados
        this.agotado_abierto = true;
        timer.schedule(new TimerTask() {
            int segundos = 0;

            @Override
            public void run() {
                segundos++;
                if (segundos == 1) {
                    // advertencia de tiempo
                    Alerta.setLocationRelativeTo(null);
                    Alerta.setVisible(true);
                    Alerta.requestFocus();
                    Alerta.setSize(365, 150);
                }
                if (segundos == 2) {
                    //cerrar advertencia
                    Alerta.dispose();
                }
                if (segundos == 5) {
                    //cierre de ventana emergente
                    DefaultTableModel modelo = (DefaultTableModel) tabla_agotados.getModel();
                    int filas = tabla_agotados.getRowCount();
                    for (int i = 0; filas > i; i++) {
                        modelo.removeRow(0);
                    }
                    cant_agotados = 0;
                    Agotados.dispose();
                    Agotados.setVisible(false);
                    regresar();

                }
            }

        }, 1, 1000);

    }

    private void AgotadosWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AgotadosWindowActivated
        if (this.agotado_abierto == false) {
            this.ventanaAgotado();
        }
    }//GEN-LAST:event_AgotadosWindowActivated

    private void regresar() {
        this.setEnabled(true);
        this.agotado_abierto = false;
    }

    private void turnoActivo() {
        Calendar cal1 = Calendar.getInstance();
        int hora = Integer.valueOf(completarCeros(cal1.get(Calendar.HOUR_OF_DAY), 2));
        if (hora < 13) {
            turno = 1;
        }
        if (hora >= 13 && hora < 19) {
            turno = 2;
        }
        if (hora >= 19) {
            turno = 3;
        }
    }

    private void darFoco() {
        if (turno == 1 && haym > 0) {
            panel.setSelectedIndex(0);
            tabla_loteriasm.requestFocus();
            tabla_loteriasm.setColumnSelectionInterval(0, 0);
            tabla_loteriasm.setRowSelectionInterval(0, 0);
            tabla_loteriasm.changeSelection(0, 0, false, false);
        } else if (turno == 2 && hayt > 0) {
            panel.setSelectedIndex(1);
            tabla_loteriast.requestFocus();
            tabla_loteriast.setColumnSelectionInterval(0, 0);
            tabla_loteriast.setRowSelectionInterval(0, 0);
            tabla_loteriast.changeSelection(0, 0, false, false);
        } else if (turno == 3 && hayn > 0) {
            panel.setSelectedIndex(2);
            tabla_loteriasn.requestFocus();
            tabla_loteriasn.setColumnSelectionInterval(0, 0);
            tabla_loteriasn.setRowSelectionInterval(0, 0);
            tabla_loteriasn.changeSelection(0, 0, false, false);
        }
    }

    private void llenarloteriasM() {
        haym = 0;
        ConsultasBD buscar = new ConsultasBD(Con.conexion(), "SELECT * FROM loteria WHERE hora=1 and activo=1;");
        DefaultTableModel modelo = (DefaultTableModel) tabla_loteriasm.getModel();
        Object[] fila = new Object[3];
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                while (resultado.next()) {
                    fila[0] = new Boolean(false);
                    fila[1] = resultado.getObject("nombre");
                    fila[2] = resultado.getString("signo");
                    modelo.addRow(fila);
                    haym++;
                }
            } catch (SQLException ex) {
            }
        }
    }

    private void funcionesDelTeclado(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == evt.VK_F4) {
            for (int i = 0; i < tabla_astral.getRowCount(); i++) {
                tabla_astral.setValueAt(true, i, 0);
            }
            darFoco();
        } else if (tabla_loteriasm.hasFocus() == true && (evt.getKeyCode() == KeyEvent.VK_O) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            for (int i = 0; i < tabla_loteriasm.getRowCount(); i++) {
                tabla_loteriasm.setValueAt(true, i, 0);
            }
        } else if (tabla_loteriast.hasFocus() == true && (evt.getKeyCode() == KeyEvent.VK_O) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            for (int i = 0; i < tabla_loteriast.getRowCount(); i++) {
                tabla_loteriast.setValueAt(true, i, 0);
            }
        } else if (tabla_loteriasn.hasFocus() == true && (evt.getKeyCode() == KeyEvent.VK_O) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            for (int i = 0; i < tabla_loteriasn.getRowCount(); i++) {
                tabla_loteriasn.setValueAt(true, i, 0);
            }
        } else if (evt.getKeyChar() == 'l' || evt.getKeyChar() == 'L') {
            limpiarjugada();
        } else if (jLabel7.getForeground() == Color.RED && numero.getText().length() > 0) {
            jLabel7.setForeground(Color.BLACK);
        } else if (jLabel5.getForeground() == Color.RED && montou.getText().length() == 1) {
            jLabel5.setForeground(Color.BLACK);
        } else if (evt.VK_F7 == evt.getKeyCode()) {
            limpiar_todo();
            darFoco();
        } else if (evt.VK_F3 == evt.getKeyCode()) {
            reiniciar_loterias();
            darFoco();
        } else if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            imprimir_ticket();
            darFoco();
        } else if (evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A') {
            String ticket = JOptionPane.showInputDialog("Ingrese el numero de Ticket:");
            if (ticket.length() > 1) {
                String clave = JOptionPane.showInputDialog("Ingrese la clave:");
                anular_ticket(ticket, clave);
            }
        } else {
            seleccionarJugada(evt);
            cambiarTurno(evt);
        }
    }

    private void llenarloteriasT() {
        hayt = 0;
        ConsultasBD buscar = new ConsultasBD(Con.conexion(), "SELECT * FROM loteria WHERE hora=2 and activo=1;");
        DefaultTableModel modelo = (DefaultTableModel) tabla_loteriast.getModel();
        Object[] fila = new Object[3];
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                while (resultado.next()) {
                    fila[0] = new Boolean(false);
                    fila[1] = resultado.getObject("nombre");
                    fila[2] = resultado.getString("signo");
                    modelo.addRow(fila);
                    hayt++;
                }
            } catch (SQLException ex) {
            }
        }
    }

    private void llenarloteriasN() {
        hayn = 0;
        ConsultasBD buscar = new ConsultasBD(Con.conexion(), "SELECT * FROM loteria WHERE hora=3 and activo=1;");
        DefaultTableModel modelo = (DefaultTableModel) tabla_loteriasn.getModel();
        Object[] fila = new Object[3];
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                while (resultado.next()) {
                    fila[0] = new Boolean(false);
                    fila[1] = resultado.getObject("nombre");
                    fila[2] = resultado.getString("signo");
                    modelo.addRow(fila);
                    hayn++;
                }
            } catch (SQLException ex) {
            }
        }
    }

    private int signo() {
        int signos = 0;
        int con_signo = 0;
        for (int i = 0; i < tabla_loteriasm.getRowCount(); i++) {
            if (tabla_loteriasm.getValueAt(i, 0).equals(true)) {
                if (tabla_loteriasm.getValueAt(i, 2).equals("1")) {
                    con_signo++;
                    for (int j = 0; j < tabla_astral.getRowCount(); j++) {
                        if (tabla_astral.getValueAt(j, 0).equals(true)) {
                            signos++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < tabla_loteriast.getRowCount(); i++) {
            if (tabla_loteriast.getValueAt(i, 0).equals(true)) {
                if (tabla_loteriast.getValueAt(i, 2).equals("1")) {
                    con_signo++;
                    for (int j = 0; j < tabla_astral.getRowCount(); j++) {
                        if (tabla_astral.getValueAt(j, 0).equals(true)) {
                            signos++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < tabla_loteriasn.getRowCount(); i++) {
            if (tabla_loteriasn.getValueAt(i, 0).equals(true)) {
                if (tabla_loteriasn.getValueAt(i, 2).equals("1")) {
                    con_signo++;
                    for (int j = 0; j < tabla_astral.getRowCount(); j++) {
                        if (tabla_astral.getValueAt(j, 0).equals(true)) {
                            signos++;
                        }
                    }
                }
            }
        }
        if (con_signo == 0) {
            return 1;
        } else {
            return signos;
        }
    }

    private void jugadaNormal(String num) {
        if (signo() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione al menos un signo, para la loteria astral.");
            tabla_astral.requestFocus();
            tabla_astral.setColumnSelectionInterval(0, 0);
            tabla_astral.setRowSelectionInterval(0, 0);

        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabla_jugadas.getModel();
            if (num.length() == 2 && jugada.equals("N")) {
                jugada = "T";
            }
            for (int i = 0; i < tabla_loteriasm.getRowCount(); i++) {
                if (tabla_loteriasm.getValueAt(i, 0).equals(true)) {
                    if (tabla_loteriasm.getValueAt(i, 2).equals("1")) {
                        for (int j = 0; j < tabla_astral.getRowCount(); j++) {
                            if (tabla_astral.getValueAt(j, 0).equals(true)) {
                                if (tabla_jugadas.getRowCount() > 0) {
                                    int fila = buscarJugada((String) tabla_loteriasm.getValueAt(i, 1), num);
                                    if (fila != -1) {
                                        int monto = Integer.parseInt(tabla_jugadas.getValueAt(fila, 4).toString());
                                        tabla_jugadas.setValueAt(monto + Integer.parseInt(montou.getText()), fila, 4);

                                    } else {
                                        String datos[] = {jugada, (String) tabla_loteriasm.getValueAt(i, 1), (String) tabla_astral.getValueAt(j, 1), num, montou.getText()};
                                        modelo.addRow(datos);
                                    }
                                } else {
                                    String datos[] = {jugada, (String) tabla_loteriasm.getValueAt(i, 1), (String) tabla_astral.getValueAt(j, 1), num, montou.getText()};
                                    modelo.addRow(datos);
                                }
                            }
                        }
                    } else if (tabla_jugadas.getRowCount() > 0) {
                        int fila = buscarJugada((String) tabla_loteriasm.getValueAt(i, 1), num);
                        if (fila != -1) {
                            int monto = Integer.parseInt(tabla_jugadas.getValueAt(fila, 4).toString());
                            tabla_jugadas.setValueAt(monto + Integer.parseInt(montou.getText()), fila, 4);

                        } else {
                            String datos[] = {jugada, (String) tabla_loteriasm.getValueAt(i, 1), "", num, montou.getText()};
                            modelo.addRow(datos);
                        }
                    } else {
                        String datos[] = {jugada, (String) tabla_loteriasm.getValueAt(i, 1), "", num, montou.getText()};
                        modelo.addRow(datos);
                    }
                }
            }
            for (int i = 0; i < tabla_loteriast.getRowCount(); i++) {
                if (tabla_loteriast.getValueAt(i, 0).equals(true)) {
                    if (tabla_loteriast.getValueAt(i, 2).equals("1")) {
                        for (int j = 0; j < tabla_astral.getRowCount(); j++) {
                            if (tabla_astral.getValueAt(j, 0).equals(true)) {
                                if (tabla_jugadas.getRowCount() > 0) {
                                    int fila = buscarJugada((String) tabla_loteriast.getValueAt(i, 1), num);
                                    if (fila != -1) {
                                        int monto = Integer.parseInt(tabla_jugadas.getValueAt(fila, 4).toString());
                                        tabla_jugadas.setValueAt(monto + Integer.parseInt(montou.getText()), fila, 4);
                                    } else {
                                        String datos[] = {jugada, (String) tabla_loteriast.getValueAt(i, 1), (String) tabla_astral.getValueAt(j, 1), num, montou.getText()};
                                        modelo.addRow(datos);
                                    }
                                } else {
                                    String datos[] = {jugada, (String) tabla_loteriast.getValueAt(i, 1), (String) tabla_astral.getValueAt(j, 1), num, montou.getText()};
                                    modelo.addRow(datos);
                                }
                            }
                        }
                    } else if (tabla_jugadas.getRowCount() > 0) {
                        int fila = buscarJugada((String) tabla_loteriast.getValueAt(i, 1), num);
                        if (fila != -1) {
                            int monto = Integer.parseInt(tabla_jugadas.getValueAt(fila, 4).toString());
                            tabla_jugadas.setValueAt(monto + Integer.parseInt(montou.getText()), fila, 4);

                        } else {
                            String datos[] = {jugada, (String) tabla_loteriast.getValueAt(i, 1), "", num, montou.getText()};
                            modelo.addRow(datos);
                        }
                    } else {
                        String datos[] = {jugada, (String) tabla_loteriast.getValueAt(i, 1), "", num, montou.getText()};
                        modelo.addRow(datos);
                    }
                }
            }
            for (int i = 0; i < tabla_loteriasn.getRowCount(); i++) {
                if (tabla_loteriasn.getValueAt(i, 0).equals(true)) {
                    if (tabla_loteriasn.getValueAt(i, 2).equals("1")) {
                        for (int j = 0; j < tabla_astral.getRowCount(); j++) {
                            if (tabla_astral.getValueAt(j, 0).equals(true)) {
                                if (tabla_jugadas.getRowCount() > 0) {
                                    int fila = buscarJugada((String) tabla_loteriasn.getValueAt(i, 1), num);
                                    if (fila != -1) {
                                        int monto = Integer.parseInt(tabla_jugadas.getValueAt(fila, 4).toString());
                                        tabla_jugadas.setValueAt(monto + Integer.parseInt(montou.getText()), fila, 4);

                                    } else {
                                        String datos[] = {jugada, (String) tabla_loteriasn.getValueAt(i, 1), (String) tabla_astral.getValueAt(j, 1), num, montou.getText()};
                                        modelo.addRow(datos);
                                    }
                                } else {
                                    String datos[] = {jugada, (String) tabla_loteriasn.getValueAt(i, 1), (String) tabla_astral.getValueAt(j, 1), num, montou.getText()};
                                    modelo.addRow(datos);
                                }
                            }
                        }
                    } else if (tabla_jugadas.getRowCount() > 0) {
                        int fila = buscarJugada((String) tabla_loteriasn.getValueAt(i, 1), num);
                        if (fila != -1) {
                            int monto = Integer.parseInt(tabla_jugadas.getValueAt(fila, 4).toString());
                            tabla_jugadas.setValueAt(monto + Integer.parseInt(montou.getText()), fila, 4);

                        } else {
                            String datos[] = {jugada, (String) tabla_loteriasn.getValueAt(i, 1), "", num, montou.getText()};
                            modelo.addRow(datos);
                        }
                    } else {
                        String datos[] = {jugada, (String) tabla_loteriasn.getValueAt(i, 1), "", num, montou.getText()};
                        modelo.addRow(datos);
                    }
                }
            }
            numero.requestFocus();
        }
    }

    public static String[] permuta(String numero) {
        String[] elementos = new String[4];
        elementos = numero.split("");
        String[] elementos2 = new String[6];
        elementos2[0] = elementos[0] + elementos[1] + elementos[2];
        elementos2[1] = elementos[0] + elementos[2] + elementos[1];
        elementos2[2] = elementos[1] + elementos[0] + elementos[2];
        elementos2[3] = elementos[1] + elementos[2] + elementos[0];
        elementos2[4] = elementos[2] + elementos[1] + elementos[0];
        elementos2[5] = elementos[2] + elementos[0] + elementos[1];
        return elementos2;
    }

    public static String[] permutaTerminal(String numero) {
        String[] elementos = numero.split("");
        String[] elementos2 = new String[2];
        elementos2[0] = elementos[0] + elementos[1];
        elementos2[1] = elementos[1] + elementos[0];
        return elementos2;
    }

    public String[] serie(String numero) {
        String[] elementos = new String[10];
        for (int i = 0; i < 10; i++) {
            elementos[i] = String.valueOf(i) + numero;
        }
        return elementos;
    }

    public static int buscarRepetidos(String valor, String[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            if (valor.equals(elementos[i])) {
                return 1;
            }
        }
        return 0;
    }

    public static String[] llenar(String[] elementos) {
        String[] definitivo = new String[6];
        for (int i = 0; i < elementos.length; i++) {
            if (buscarRepetidos(elementos[i], definitivo) == 0) {
                definitivo[i] = elementos[i];
            }
        }
        return definitivo;
    }

    private void reiniciar_loterias() {
        for (int i = 0; i < tabla_loteriasm.getRowCount(); i++) {
            tabla_loteriasm.setValueAt(false, i, 0);
        }
        for (int i = 0; i < tabla_loteriast.getRowCount(); i++) {
            tabla_loteriast.setValueAt(false, i, 0);
        }
        for (int i = 0; i < tabla_loteriasn.getRowCount(); i++) {
            tabla_loteriasn.setValueAt(false, i, 0);
        }
        for (int i = 0; i < tabla_astral.getRowCount(); i++) {
            tabla_astral.setValueAt(false, i, 0);
        }
    }

    public void limpiarjugada() {
        DefaultTableModel modelo = (DefaultTableModel) tabla_jugadas.getModel();
        int filas = tabla_jugadas.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    public String completarCeros(long ticket, int cant) {
        String ceros = "";
        String t = Long.toString(ticket);
        for (int i = 0; i < cant - t.length(); i++) {
            ceros += "0";
        }
        return (ceros + t);
    }

    public void calcularMontoTotal() {
        monto_total = 0;
        for (int i = 0; i < tabla_jugadas.getRowCount(); i++) {
            monto_total = monto_total + new Double(tabla_jugadas.getValueAt(i, 4).toString());
        }
        monto_total2.setText(String.valueOf(monto_total));
        montot.setText(String.valueOf(monto_total));
    }

    public void cambiarTurno(java.awt.event.KeyEvent evt) {
        if ((evt.getKeyCode() == KeyEvent.VK_T) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            panel.setSelectedIndex(1);
            tabla_loteriast.requestFocus();
            tabla_loteriast.setRowSelectionInterval(0, 0);
            tabla_loteriast.changeSelection(0, 0, false, false);
        } else if ((evt.getKeyCode() == KeyEvent.VK_N) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            panel.setSelectedIndex(2);
            tabla_loteriasn.requestFocus();
            tabla_loteriasn.setRowSelectionInterval(0, 0);
            tabla_loteriasn.changeSelection(0, 0, false, false);
        } else if ((evt.getKeyCode() == KeyEvent.VK_M) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            panel.setSelectedIndex(0);
            tabla_loteriasm.requestFocus();
            tabla_loteriasm.setRowSelectionInterval(0, 0);
            tabla_loteriasm.changeSelection(0, 0, false, false);
        } else if ((evt.getKeyCode() == KeyEvent.VK_S) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            tabla_astral.requestFocus();
            tabla_astral.setRowSelectionInterval(0, 0);
            tabla_astral.changeSelection(0, 0, false, false);
        }
    }

    public void seleccionarJugada(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == 9) {
            numero.requestFocus();
        }
        switch (evt.getKeyChar()) {
            case 'p':
                jugada = "P";
                tipo_jugada.setText("Permuta");
                break;
            case 't':
                jugada = "T";
                tipo_jugada.setText("Terminal");
                break;
            case '.':
                jugada = "S";
                tipo_jugada.setText("Serie");
                break;
            default:
                break;
        }
    }

    public int consultarAgotado(int nro, int monto, int lot) {
        int permitido = monto;
        String consulta = "SELECT * FROM nro_agotado WHERE numero=" + nro + " and id_banca=" + banca;
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(), consulta);
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                while (resultado.next()) {
                    int monto_max_t = resultado.getInt("monto_max_total");
                    int monto_max_j = resultado.getInt("monto_max_jugada");
                    int monto_consumido = resultado.getInt("monto_consumido");
                    int loteria = resultado.getInt("id_loteria");
                    if (loteria == 0) {
                        if (monto > monto_max_j && monto_max_j > 0) {
                            permitido = monto_max_j;
                        }
                        if (monto_max_t > 0) {
                            if (monto > (monto_max_t - monto_consumido)) {
                                if (permitido > monto_max_t - monto_consumido) {
                                    permitido = monto_max_t - monto_consumido;
                                }
                            }
                        }
                        if (permitido < 0) {
                            permitido = 0;
                        }
                    } else if (lot == loteria) {
                        if (monto > monto_max_j && monto_max_j > 0) {
                            if (permitido > monto_max_j) {
                                permitido = monto_max_j;
                            }
                        }
                        if (monto_max_t > 0) {
                            if (monto > (monto_max_t - monto_consumido)) {
                                if (permitido > monto_max_t - monto_consumido) {
                                    permitido = monto_max_t - monto_consumido;
                                }
                            }
                        }
                        if (permitido < 0) {
                            permitido = 0;
                        }
                    } else {
                        permitido = monto;
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
            }
        }
        if (permitido > limite_agencia) {
            permitido = limite_agencia;
        }
        if (permitido > max_banca) {
            permitido = max_banca;
        }
        return permitido;
    }

    public int consultarAgotadoGeneral() {
        // retorna cuanto es permitido jugar de ese numero
        BuscarTotalesNumero();
        int permitido = 0;
        for (int i = 0; i < cant_matriz; i++) {
            String consulta = "SELECT monto_max_total,monto_consumido FROM nro_agotado WHERE numero=" + matriz[i][0] + " and id_loteria=0 and id_banca=" + banca;
            ConsultasBD buscar;
            buscar = new ConsultasBD(Con.conexion(), consulta);
            if (buscar.ObtenerError() == null) {
                ResultSet resultado = buscar.ObtenerResultado();
                try {
                    if (resultado.last()) {
                        permitido = resultado.getInt("monto_max_total") - resultado.getInt("monto_consumido");
                       
                        if (permitido < matriz[i][1]) {
                            cambiarMontoDisponible(matriz[i][0], permitido);
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo conectar");
                }
            }
        }
        return permitido;
    }

    public void limite_banca() {
        String consulta = "SELECT monto_minimo,monto_maximo FROM banca WHERE id_banca=" + banca;
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(), consulta);
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                if (resultado != null) {
                    resultado.last();
                    min_banca = resultado.getInt("monto_minimo");
                    max_banca = resultado.getInt("monto_maximo");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
            }
        }
    }

    public void limite_agencia() {
        String consulta = "SELECT limite FROM agencia WHERE id_agencia=" + agencia;
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(), consulta);
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                if (resultado != null) {
                    resultado.last();
                    limite_agencia = resultado.getInt("limite");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
            }
        }
    }

    public int obtenerLoteria(String nombre) {
        int num = 0;
        String consulta = "SELECT id_loteria FROM loteria WHERE activo=1 and nombre='" + nombre + "'";
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(), consulta);
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                if (resultado != null) {
                    resultado.last();
                    num = resultado.getInt("id_loteria");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Loteria no Disponible");
            }
        }
        return num;
    }

    private long num_ticket() {
        int repetido = 1;
        long valor = 1;
        while (repetido == 1) {
            valor = Math.abs(1 + (long) (Math.random() * (1 - 999999)));
            String consulta = "SELECT * FROM ticket,usuarios WHERE usuarios.id_usuario=" + usuario + " and usuarios.id_agencia=ticket.id_agencia and ticket.anulado='No' and ticket.numero_ticket='" + completarCeros(valor, 6) + "'";
            ConsultasBD buscar;
            buscar = new ConsultasBD(Con.conexion(), consulta);
            if (buscar.ObtenerError() == null) {
                ResultSet resultado = buscar.ObtenerResultado();
                try {
                    if (resultado != null && !resultado.next()) {
                        repetido = 0;
                    }
                } catch (SQLException ex) {

                }
            } else {
                System.out.println(buscar.ObtenerError());
            }
        }
        return valor;
    }

    private long clave() {
        int repetido = 1;
        long valor = 1;
        while (repetido == 1) {
            valor = Math.abs(1 + (long) (Math.random() * (1 - 999999999)));
            String consulta = "SELECT * FROM ticket,usuarios WHERE usuarios.id_usuario=" + usuario + " and usuarios.id_agencia=ticket.id_agencia and ticket.anulado='No' and ticket.clave='" + completarCeros(valor, 9) + "'";
            ConsultasBD buscar;
            buscar = new ConsultasBD(Con.conexion(), consulta);
            if (buscar.ObtenerError() == null) {
                ResultSet resultado = buscar.ObtenerResultado();
                try {
                    if (resultado != null && !resultado.next()) {
                        repetido = 0;
                    }
                } catch (SQLException ex) {

                }
            }
        }
        return valor;
    }

    private void guardarTicket() {
        int id_ticket = 0;
        int entrada = 0;
        String ticket = completarCeros(num_ticket(), 6);
        String clave = completarCeros(clave(), 9);
        Calendar cal1 = Calendar.getInstance();
        String fecha = completarCeros(cal1.get(Calendar.DATE), 2) + "/" + completarCeros((cal1.get(Calendar.MONTH) + 1), 2) + "/" + cal1.get(Calendar.YEAR);
        String hora = completarCeros(cal1.get(Calendar.HOUR_OF_DAY), 2) + ":" + completarCeros(cal1.get(Calendar.MINUTE), 2) + ":" + completarCeros(cal1.get(Calendar.SECOND), 2);
        String sentencia = "INSERT INTO ticket "
                + "(numero_ticket,id_usuario,id_agencia,clave,fecha,hora,anulado,estado) "
                + "values ('" + ticket + "'," + usuario + "," + agencia + ",'" + clave + "','" + fecha + "','" + hora + "','No','En Juego')";
        String consulta = "SELECT id_ticket FROM ticket "
                + "WHERE numero_ticket='" + ticket + "' AND id_agencia=" + agencia;

        InsertarBD ejecutar = new InsertarBD(Con.conexion(), sentencia);
        ConsultasBD buscar = new ConsultasBD(Con.conexion(), consulta);

        if (buscar.ObtenerError() == null) {
            try {
                ResultSet resultado = buscar.ObtenerResultado();
                resultado.last();
                id_ticket = (int) resultado.getObject("id_ticket");
                guardar_detalle_ticket(id_ticket);
            } catch (SQLException ex) {
                Logger.getLogger(FormInicio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void guardar_detalle_ticket(int id) {
        int loteria, numero, monto;
        String sentencia, astral;

        for (int i = 0; i < tabla_jugadas.getRowCount(); i++) {

            monto = new Integer(tabla_jugadas.getValueAt(i, 4).toString());
            numero = new Integer(tabla_jugadas.getValueAt(i, 3).toString());
            loteria = obtenerLoteria(tabla_jugadas.getValueAt(i, 1).toString());
            astral = tabla_jugadas.getValueAt(i, 2).toString();

            if (monto > 0) {
                sentencia = "INSERT INTO detalle_ticket (id_loteria,id_ticket,numero,astral,monto) values (" + loteria + "," + id + "," + numero + ",'" + astral + "'," + monto + ")";
                InsertarBD ejecutar = new InsertarBD(Con.conexion(), sentencia);
                actualizar_consumido(numero, loteria, monto);
            }
        }
    }

    private void actualizar_consumido(int numero, int loteria, int monto) {
        int id = -1;
        String sentencia;
        try {
            String consulta = "SELECT * FROM nro_agotado WHERE numero=" + numero + " and id_banca=" + banca;
            ConsultasBD buscar = new ConsultasBD(Con.conexion(), consulta);
            if (buscar.ObtenerError() == null) {
                ResultSet resultado = buscar.ObtenerResultado();
                while (resultado.next()) {
                    id = resultado.getInt("id_loteria");
                    if (id == 0) {
                        sentencia = "update nro_agotado set monto_consumido=monto_consumido+" + monto + " where id_banca=" + banca + " and id_loteria=0 and numero=" + numero;
                        InsertarBD ejecutar = new InsertarBD(Con.conexion(), sentencia);
                    } else if (loteria == id) {
                        sentencia = "update nro_agotado set monto_consumido=monto_consumido+" + monto + " where id_banca=" + banca + " and id_loteria=" + loteria + " and numero=" + numero;
                        InsertarBD ejecutar = new InsertarBD(Con.conexion(), sentencia);
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void limpiar_todo() {
        limpiarjugada();
        reiniciar_loterias();
        montou.setText("");
        monto_total2.setText("");
        monto_total = 0;
    }

    public int buscarJugada(String loteria, String numero) {
        int indice = -1;
        String nombre;
        String num;
        DefaultTableModel dtm = (DefaultTableModel) tabla_jugadas.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            nombre = dtm.getValueAt(i, 1).toString();
            num = dtm.getValueAt(i, 3).toString();
            indice++;
            if (nombre.equalsIgnoreCase(loteria) && num.equalsIgnoreCase(numero)) {
                return indice;
            }
        }
        return -1;
    }

    private void buscar_ticket(String ticket) {
        try {
            String consulta = "SELECT * FROM ticket WHERE numero_ticket=" + ticket;
            ConsultasBD buscar = new ConsultasBD(Con.conexion(), consulta);
            if (buscar.ObtenerError() == null) {
                ResultSet resultado = buscar.ObtenerResultado();
                if (resultado.last()) {
                    int id = resultado.getInt("id_ticket");
                    String consulta2 = "SELECT * FROM detalle_ticket WHERE id_ticket=" + id;
                    ConsultasBD buscar2 = new ConsultasBD(Con.conexion(), consulta2);
                    nro_ticket.setText(ticket);
                    fecha_t.setText(resultado.getString("fecha"));
                    hora_t.setText(resultado.getString("hora"));
                    DefaultTableModel modelo = (DefaultTableModel) det_ticket.getModel();
                    int filas = det_ticket.getRowCount();
                    for (int i = 0; filas > i; i++) {
                        modelo.removeRow(0);
                    }
                    Object[] fila = new Object[4];
                    int total = 0;
                    if (buscar2.ObtenerError() == null) {
                        ResultSet resultado2 = buscar2.ObtenerResultado();
                        while (resultado2.next()) {
                            fila[0] = buscar_abreviacion(resultado2.getInt("id_loteria"));
                            fila[1] = resultado2.getInt("numero");
                            fila[2] = resultado2.getString("astral");
                            fila[3] = resultado2.getInt("monto");
                            total = total + resultado2.getInt("monto");
                            modelo.addRow(fila);
                        }
                    }
                    MostrarTicket.setLocationRelativeTo(null);
                    MostrarTicket.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Ticket no encontrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);

        }
    }

    private String buscar_abreviacion(int id) {
        try {
            String consulta = "SELECT abreviacion FROM loteria WHERE id_loteria=" + id;
            ConsultasBD buscar = new ConsultasBD(Con.conexion(), consulta);
            if (buscar.ObtenerError() == null) {
                ResultSet resultado = buscar.ObtenerResultado();
                if (resultado.last()) {
                    String ab = resultado.getString("abreviacion");
                    return ab;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "";
    }

    private void imprimir_ticket() {

        int monto_original, numero;
        String loteria;
        DefaultTableModel modelo = (DefaultTableModel) tabla_agotados.getModel();
        Object[] fila = new Object[3];

        try {
            // inicio de la transaccion
            Con.conexion().setAutoCommit(false);
            if (tabla_jugadas.getRowCount() > 0) {
                for (int i = 0; i < tabla_jugadas.getRowCount(); i++) {
                    monto_original = new Integer(tabla_jugadas.getValueAt(i, 4).toString());
                    if (monto_original > 0) {
                        numero = new Integer(tabla_jugadas.getValueAt(i, 3).toString());
                        loteria = tabla_jugadas.getValueAt(i, 1).toString();
                        int monto = consultarAgotado(numero, monto_original, obtenerLoteria(loteria));
                        if (monto_original > monto) {
                            fila[0] = loteria;
                            fila[1] = numero;
                            fila[2] = monto;
                            modelo.addRow(fila);
                            cant_agotados++;
                        }
                    }
                }
                consultarAgotadoGeneral();
                if (cant_agotados > 0) {
                    Agotados.setLocationRelativeTo(this);
                    Agotados.setTitle("Numeros Agotados");
                    this.setEnabled(false);
                    Agotados.setVisible(true);
                    Agotados.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(null, "Imprimiendo el Ticket");
                    guardarTicket();
                    limpiar_todo();
                    Con.conexion().commit();
                }
            } else {
                // en caso de que el usuario no haya seleccionado nada
                JOptionPane.showMessageDialog(null, "No hay jugadas para guardar");
                try {
                    Con.conexion().rollback();
                } catch (SQLException ex1) {
                    System.out.println(ex1.getMessage());
                }
            }

        } catch (SQLException | NumberFormatException | HeadlessException ex) {
            // si existe algun error en el proceso | aca deberia notificar que el usuario lo intente nuevamente
            try {
                Con.conexion().rollback();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }

        }

    }

    private void copiarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) tabla_oculta.getModel();
        Object[] fila = new Object[2];
        for (int i = 0; i < tabla_jugadas.getRowCount(); i++) {
            fila[0] = tabla_jugadas.getValueAt(i, 3);
            fila[1] = tabla_jugadas.getValueAt(i, 4);
            dtm.addRow(fila);
        }
    }

    private void BuscarTotalesNumero() {
        copiarTabla();
        DefaultTableModel dtm = (DefaultTableModel) tabla_oculta.getModel();
        int numero = Integer.parseInt(tabla_oculta.getValueAt(tabla_oculta.getRowCount() - 1, 0).toString());
        int monto = 0;
        int i;
        for (i = tabla_oculta.getRowCount() - 1; i >= 0; i--) {
            if (Integer.parseInt(tabla_oculta.getValueAt(i, 0).toString()) == numero) {
                monto = monto + Integer.parseInt(tabla_oculta.getValueAt(i, 1).toString());
                dtm.removeRow(i);
            }
            if (i == 0 && tabla_oculta.getRowCount() > 0) {
                matriz[cant_matriz][0] = numero;
                matriz[cant_matriz][1] = monto;
                cant_matriz++;
                i = tabla_oculta.getRowCount();
                monto = 0;
                numero = Integer.parseInt(tabla_oculta.getValueAt(tabla_oculta.getRowCount() - 1, 0).toString());
            }
            if (tabla_oculta.getRowCount() == 0) {
                matriz[cant_matriz][0] = numero;
                matriz[cant_matriz][1] = monto;
                cant_matriz++;
            }

        }
    }

    private void cambiarMontoDisponible(int numero, int permitido) {
        int monto = 0;
        String loteria;
        DefaultTableModel modelo = (DefaultTableModel) tabla_agotados.getModel();
        Object[] fila = new Object[3];
        if (tabla_agotados.getRowCount() == 0) {
            for (int i = 0; i < tabla_jugadas.getRowCount(); i++) {
                if (Integer.parseInt(tabla_jugadas.getValueAt(i, 3).toString()) == numero) {
                    monto = Integer.parseInt(tabla_jugadas.getValueAt(i, 4).toString());
                    loteria = tabla_jugadas.getValueAt(i, 1).toString();
                    if (monto > permitido) {
                        fila[0] = loteria;
                        fila[1] = numero;
                        fila[2] = permitido;
                        modelo.addRow(fila);
                        cant_agotados++;
                        permitido = 0;
                    } else {
                        permitido = permitido - monto;
                    }
                }
            }
        } else {
            for (int i = 0; i < tabla_agotados.getRowCount(); i++) {
                if (Integer.parseInt(tabla_agotados.getValueAt(i, 1).toString()) == numero) {
                    monto = Integer.parseInt(tabla_agotados.getValueAt(i, 2).toString());
                    if (monto > permitido) {
                        tabla_agotados.setValueAt(permitido, i, 2);
                        permitido = 0;
                    } else {
                        permitido = permitido - monto;
                    }
                }
            }
        }
    }

    private void anular_ticket(String ticket, String clave) {
        String id;
        Calendar cal1 = Calendar.getInstance();
        String fecha = completarCeros(cal1.get(Calendar.DATE), 2) + "/" + completarCeros((cal1.get(Calendar.MONTH) + 1), 2) + "/" + cal1.get(Calendar.YEAR);
        String hora = completarCeros(cal1.get(Calendar.HOUR_OF_DAY), 2) + ":" + completarCeros(cal1.get(Calendar.MINUTE), 2) + ":" + cal1.get(Calendar.SECOND);
        String consulta = "SELECT * FROM ticket WHERE numero_ticket=" + ticket + " and clave=" + clave;
        ConsultasBD buscar = new ConsultasBD(Con.conexion(), consulta);
        if (buscar.ObtenerError() == null) {
            try {
                ResultSet resultado = buscar.ObtenerResultado();
                if (resultado != null && resultado.next()) {
                    id = resultado.getString("id_ticket");
                    String anu = resultado.getString("anulado");
                    String fecha1 = (String) resultado.getObject("fecha");
                    if (anu.equalsIgnoreCase("no")) {
                        if (!fecha1.equals(fecha)) {
                            JOptionPane.showMessageDialog(null, "Expiro el tiempo para anular el ticket.");
                        } else {
                            String hora2 = (String) resultado.getObject("hora");
                            int h = Integer.parseInt(hora.substring(0, 2));
                            int m = Integer.parseInt(hora.substring(3, 5));
                            int h2 = Integer.parseInt(hora2.substring(0, 2));
                            int m2 = Integer.parseInt(hora2.substring(3, 5));
                            if (h > h2 || m - m2 > 30) {
                                JOptionPane.showMessageDialog(null, "Expiro el tiempo para anular el ticket.");
                            } else if (anu.equalsIgnoreCase("no")) {
                                String sentencia = "UPDATE ticket SET anulado='Si' where id_ticket=" + id;
                                InsertarBD ejecutar = new InsertarBD(Con.conexion(), sentencia);
                                JOptionPane.showMessageDialog(null, "Ticket Anulado.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Este Ticket ya esta anulado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ticket no encontrado, o clave errada.");
                }
            } catch (SQLException ex) {

            }
        }

    }

    private void pagar_ticket(String ticket, String clave) {
        String consulta = "SELECT id_premio,a.id_ticket FROM premios a,ticket b WHERE a.id_ticket=b.id_ticket and b.numero_ticket=" + ticket + " and b.clave=" + clave + " and a.estado='Pendiente' and a.id_agencia=" + agencia;
        System.out.println(consulta);
        ConsultasBD buscar;
        buscar = new ConsultasBD(Con.conexion(), consulta);
        if (buscar.ObtenerError() == null) {
            ResultSet resultado = buscar.ObtenerResultado();
            try {
                if (resultado != null && resultado.next()) {
                    int premio = resultado.getInt("id_premio");
                    String sentencia = "UPDATE premios SET estado='Pagado' where id_premio=" + premio;
                    InsertarBD ejecutar = new InsertarBD(Con.conexion(), sentencia);
                    int id = resultado.getInt("a.id_ticket");
                    String sentencia2 = "UPDATE ticket SET estado='Pagado' where id_ticket=" + id;
                    System.out.println(sentencia2);
                    InsertarBD ejecutar2 = new InsertarBD(Con.conexion(), sentencia2);
                    JOptionPane.showMessageDialog(null, "Ticket Pagado.");

                } else {
                    JOptionPane.showMessageDialog(null, "Ticket no encontrado. El premio no existe o ya fue pagado.");
                }
            } catch (SQLException ex) {

            }
        }
    }

    public void main(String args[]) {
        new FormInicio().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Agotados;
    private javax.swing.JDialog Alerta;
    private javax.swing.JDialog Anulados;
    private javax.swing.JDialog AnularTicket;
    private javax.swing.JDialog BuscarTicket;
    private javax.swing.JPanel ContenedorTotal;
    private javax.swing.JDialog DetalleAnulados;
    private javax.swing.JDialog DetalleHistorico;
    private javax.swing.JDialog HistoricoTicket;
    private javax.swing.JMenuItem Item1;
    private javax.swing.JMenuItem Item2;
    private javax.swing.JPopupMenu Menu_Emergente;
    private javax.swing.JDialog MostrarTicket;
    private javax.swing.JDialog PagoTicket;
    private javax.swing.JDialog Resultados;
    private javax.swing.JDialog TicketAbiertos;
    private javax.swing.JDialog TicketCerrados;
    private javax.swing.JDialog VentasDia;
    private javax.swing.JButton boton_anular;
    private javax.swing.JButton boton_anularj;
    private javax.swing.JButton boton_ayuda;
    private javax.swing.JButton boton_borrarj;
    private javax.swing.JButton boton_borrarj1;
    private javax.swing.JButton boton_borrarj4;
    private javax.swing.JButton boton_borrarj7;
    private javax.swing.JButton boton_borrarj8;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_cancelar_agotado;
    private javax.swing.JButton boton_cancelar_agotado3;
    private javax.swing.JButton boton_imprimir;
    private javax.swing.JButton boton_jugar_agotados;
    private javax.swing.JButton boton_limpiarl;
    private javax.swing.JButton boton_limpiart;
    private javax.swing.JButton boton_pagar;
    private javax.swing.JButton boton_repetirt;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel cantidad_numero;
    private javax.swing.JLabel desmarca_sorteo;
    private javax.swing.JTable det_ticket;
    private javax.swing.JLabel eliminar_jugada;
    private javax.swing.JLabel esc_imprimir;
    private javax.swing.JLabel f12_imprimir;
    private javax.swing.JButton factura;
    private javax.swing.JLabel fecha_t;
    private javax.swing.JLabel hora_t;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel monto_total2;
    private javax.swing.JLabel montot;
    private javax.swing.JTextField montou;
    private javax.swing.JLabel nro_ticket;
    private javax.swing.JTextField numero;
    private javax.swing.JLabel numero_ticket;
    private javax.swing.JDialog oculta;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JLabel permuta;
    private javax.swing.JLabel seria;
    private javax.swing.JLabel sorteo_mañana;
    private javax.swing.JLabel sorteo_noche;
    private javax.swing.JLabel sorteo_tarde;
    private javax.swing.JTable tabla_agotados;
    private javax.swing.JTable tabla_astral;
    private javax.swing.JTable tabla_jugadas;
    private javax.swing.JTable tabla_loteriasm;
    private javax.swing.JTable tabla_loteriasn;
    private javax.swing.JTable tabla_loteriast;
    private javax.swing.JTable tabla_oculta;
    private javax.swing.JLabel terminales;
    private javax.swing.JTextField texto_buscar;
    private javax.swing.JLabel tipo_jugada;
    private javax.swing.JLabel todos_signos;
    private javax.swing.JLabel todos_sorteo;
    private javax.swing.JLabel todos_sorteo1;
    // End of variables declaration//GEN-END:variables
}
