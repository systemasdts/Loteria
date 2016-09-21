
package loteria;

import java.awt.Font;

/**
 *
 * @author Ana Karina
 */
public class calculadora extends javax.swing.JFrame {
    double a=0,b=0;
    int sig=0;
    String op="";
    public calculadora() {
        initComponents();
        anular7.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        borrarult = new javax.swing.JButton();
        boton_imprimir3 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        raiz = new javax.swing.JButton();
        signo = new javax.swing.JButton();
        anular2 = new javax.swing.JButton();
        anular3 = new javax.swing.JButton();
        anular4 = new javax.swing.JButton();
        anular5 = new javax.swing.JButton();
        anular6 = new javax.swing.JButton();
        anular7 = new javax.swing.JButton();
        anular9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null), "Calculadora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N

        atras.setBackground(new java.awt.Color(255, 255, 255));
        atras.setFont(new java.awt.Font("Segoe UI Light", 0, 9)); // NOI18N
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/borrar.png"))); // NOI18N
        atras.setToolTipText("");
        atras.setFocusable(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        borrarult.setBackground(new java.awt.Color(255, 255, 255));
        borrarult.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        borrarult.setText("E");
        borrarult.setToolTipText("");
        borrarult.setFocusable(false);
        borrarult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarultActionPerformed(evt);
            }
        });

        boton_imprimir3.setBackground(new java.awt.Color(255, 255, 255));
        boton_imprimir3.setFont(new java.awt.Font("Segoe UI Light", 0, 9)); // NOI18N
        boton_imprimir3.setText("C");
        boton_imprimir3.setToolTipText("");
        boton_imprimir3.setFocusable(false);
        boton_imprimir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_imprimir3ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b9.setText("9");
        b9.setToolTipText("");
        b9.setFocusable(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b8.setText("8");
        b8.setToolTipText("");
        b8.setFocusable(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b7.setText("7");
        b7.setToolTipText("");
        b7.setFocusable(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b6.setText("6");
        b6.setToolTipText("");
        b6.setFocusable(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b4.setText("4");
        b4.setToolTipText("");
        b4.setFocusable(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b5.setText("5");
        b5.setToolTipText("");
        b5.setFocusable(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b1.setText("1");
        b1.setToolTipText("");
        b1.setFocusable(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b2.setText("2");
        b2.setToolTipText("");
        b2.setFocusable(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b3.setText("3");
        b3.setToolTipText("");
        b3.setFocusable(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(255, 255, 255));
        b0.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        b0.setText("0");
        b0.setToolTipText("");
        b0.setFocusable(false);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        coma.setBackground(new java.awt.Color(255, 255, 255));
        coma.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        coma.setText(",");
        coma.setToolTipText("");
        coma.setFocusable(false);
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });

        numero.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        numero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero.setText("0");
        numero.setMaximumSize(new java.awt.Dimension(26, 49));
        numero.setMinimumSize(new java.awt.Dimension(26, 49));
        numero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numeroMouseClicked(evt);
            }
        });

        raiz.setBackground(new java.awt.Color(51, 102, 255));
        raiz.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        raiz.setForeground(new java.awt.Color(255, 255, 255));
        raiz.setText("√");
        raiz.setToolTipText("");
        raiz.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        raiz.setFocusable(false);
        raiz.setMaximumSize(new java.awt.Dimension(71, 23));
        raiz.setMinimumSize(new java.awt.Dimension(71, 23));
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        signo.setBackground(new java.awt.Color(51, 102, 255));
        signo.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        signo.setForeground(new java.awt.Color(255, 255, 255));
        signo.setText("±");
        signo.setToolTipText("");
        signo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signo.setFocusable(false);
        signo.setMaximumSize(new java.awt.Dimension(71, 23));
        signo.setMinimumSize(new java.awt.Dimension(71, 23));
        signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoActionPerformed(evt);
            }
        });

        anular2.setBackground(new java.awt.Color(51, 102, 255));
        anular2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular2.setForeground(new java.awt.Color(255, 255, 255));
        anular2.setText("/");
        anular2.setToolTipText("");
        anular2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular2.setFocusable(false);
        anular2.setMaximumSize(new java.awt.Dimension(71, 23));
        anular2.setMinimumSize(new java.awt.Dimension(71, 23));
        anular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular2ActionPerformed(evt);
            }
        });

        anular3.setBackground(new java.awt.Color(51, 102, 255));
        anular3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular3.setForeground(new java.awt.Color(255, 255, 255));
        anular3.setText("%");
        anular3.setToolTipText("");
        anular3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular3.setFocusable(false);
        anular3.setMaximumSize(new java.awt.Dimension(71, 23));
        anular3.setMinimumSize(new java.awt.Dimension(71, 23));
        anular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular3ActionPerformed(evt);
            }
        });

        anular4.setBackground(new java.awt.Color(51, 102, 255));
        anular4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular4.setForeground(new java.awt.Color(255, 255, 255));
        anular4.setText("1/x");
        anular4.setToolTipText("");
        anular4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular4.setFocusable(false);
        anular4.setMaximumSize(new java.awt.Dimension(71, 23));
        anular4.setMinimumSize(new java.awt.Dimension(71, 23));
        anular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular4ActionPerformed(evt);
            }
        });

        anular5.setBackground(new java.awt.Color(51, 102, 255));
        anular5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular5.setForeground(new java.awt.Color(255, 255, 255));
        anular5.setText("*");
        anular5.setToolTipText("");
        anular5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular5.setFocusable(false);
        anular5.setMaximumSize(new java.awt.Dimension(71, 23));
        anular5.setMinimumSize(new java.awt.Dimension(71, 23));
        anular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular5ActionPerformed(evt);
            }
        });

        anular6.setBackground(new java.awt.Color(51, 102, 255));
        anular6.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular6.setForeground(new java.awt.Color(255, 255, 255));
        anular6.setText("-");
        anular6.setToolTipText("");
        anular6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular6.setFocusable(false);
        anular6.setMaximumSize(new java.awt.Dimension(71, 23));
        anular6.setMinimumSize(new java.awt.Dimension(71, 23));
        anular6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular6ActionPerformed(evt);
            }
        });

        anular7.setBackground(new java.awt.Color(51, 102, 255));
        anular7.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular7.setForeground(new java.awt.Color(255, 255, 255));
        anular7.setText("=");
        anular7.setToolTipText("");
        anular7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular7.setFocusable(false);
        anular7.setMaximumSize(new java.awt.Dimension(71, 23));
        anular7.setMinimumSize(new java.awt.Dimension(71, 23));
        anular7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular7ActionPerformed(evt);
            }
        });

        anular9.setBackground(new java.awt.Color(51, 102, 255));
        anular9.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        anular9.setForeground(new java.awt.Color(255, 255, 255));
        anular9.setText("+");
        anular9.setToolTipText("");
        anular9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        anular9.setFocusable(false);
        anular9.setMaximumSize(new java.awt.Dimension(71, 23));
        anular9.setMinimumSize(new java.awt.Dimension(71, 23));
        anular9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anular9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anular2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anular3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anular5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anular4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anular6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anular9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anular7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(borrarult, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_imprimir3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(boton_imprimir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrarult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anular2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anular3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anular5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anular4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anular6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anular9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(anular7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        if (!numero.getText().equalsIgnoreCase("0")) {
            numero.setText(numero.getText().substring(0, numero.getText().length()-1)); 
        }
        ajustarTamaño();
    }//GEN-LAST:event_atrasActionPerformed

    private void borrarultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarultActionPerformed
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_borrarultActionPerformed

    private void boton_imprimir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_imprimir3ActionPerformed
        a=b=0;
        op="";
        sig=0;
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_boton_imprimir3ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("9");
        }else{
            numero.setText(numero.getText()+"9");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("8");
        }else{
            numero.setText(numero.getText()+"8");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("7");
        }else{
            numero.setText(numero.getText()+"7");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("6");
        }else{
            numero.setText(numero.getText()+"6");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b6ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("4");
        }else{
            numero.setText(numero.getText()+"4");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("5");
        }else{
            numero.setText(numero.getText()+"5");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("1");
        }else{
            numero.setText(numero.getText()+"1");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("2");
        }else{
            numero.setText(numero.getText()+"2");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("3");
        }else{
            numero.setText(numero.getText()+"3");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b3ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("0");
        }else{
            numero.setText(numero.getText()+"0");
        }
        ajustarTamaño();
    }//GEN-LAST:event_b0ActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("0.");
        }else{
            numero.setText(numero.getText()+".");
        }
        ajustarTamaño();
    }//GEN-LAST:event_comaActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        if(sig!=1){
            numero.setText(String.valueOf(Math.sqrt(Double.parseDouble(numero.getText()))));
        }else
            numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_raizActionPerformed

    private void signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoActionPerformed
        if (!numero.getText().equalsIgnoreCase("0")) {
            if(sig==0){
                numero.setText("-"+numero.getText());
                sig=1;
            }else{
                numero.setText(numero.getText().substring(1, numero.getText().length())); 
                sig=0;
            }
        }
        ajustarTamaño();
    }//GEN-LAST:event_signoActionPerformed

    private void anular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular2ActionPerformed
        op="d";
        a=Double.parseDouble(numero.getText());
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_anular2ActionPerformed

    private void anular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular3ActionPerformed
        op="p";
        a=Integer.valueOf(numero.getText());
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_anular3ActionPerformed

    private void anular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular4ActionPerformed
        numero.setText(String.valueOf(1/Double.parseDouble(numero.getText())));
        ajustarTamaño();
    }//GEN-LAST:event_anular4ActionPerformed

    private void anular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular5ActionPerformed
        op="m";
        a=Double.parseDouble(numero.getText());
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_anular5ActionPerformed

    private void anular6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular6ActionPerformed
        op="r";
        a=Double.parseDouble(numero.getText());
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_anular6ActionPerformed

    private void anular7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular7ActionPerformed
        b=Double.parseDouble(numero.getText());
        switch(op){
            case "s":
                numero.setText(String.valueOf(a+b));
                break;
            case "r":
                numero.setText(String.valueOf(a-b));
                break;
            case "m":
                numero.setText(String.valueOf(a*b));
                break;
            case "d":
                numero.setText(String.valueOf(a/b));
                break;
            case "p":
                numero.setText(String.valueOf(a*(b/100)));
                break;
        }
        ajustarTamaño();
    }//GEN-LAST:event_anular7ActionPerformed

    private void anular9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anular9ActionPerformed
        op="s";
        a=Double.parseDouble(numero.getText());
        numero.setText("0");
        ajustarTamaño();
    }//GEN-LAST:event_anular9ActionPerformed

    private void numeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroMouseClicked
        if (numero.getText().equalsIgnoreCase("0")) {
            numero.setText("");
        }
    }//GEN-LAST:event_numeroMouseClicked

    private void ajustarTamaño(){
        if(numero.getText().length()>10){
            Font fuente=new Font("Consolas", Font.PLAIN,18);
            numero.setFont( fuente ) ;
        }else if(numero.getText().length()>21){
            Font fuente=new Font("Consolas", Font.PLAIN,18);
            numero.setFont( fuente ) ;
        }else{
            Font fuente=new Font("Consolas", Font.PLAIN,36);
            numero.setFont( fuente ) ;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anular2;
    private javax.swing.JButton anular3;
    private javax.swing.JButton anular4;
    private javax.swing.JButton anular5;
    private javax.swing.JButton anular6;
    private javax.swing.JButton anular7;
    private javax.swing.JButton anular9;
    private javax.swing.JButton atras;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton borrarult;
    private javax.swing.JButton boton_imprimir3;
    private javax.swing.JButton coma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField numero;
    private javax.swing.JButton raiz;
    private javax.swing.JButton signo;
    // End of variables declaration//GEN-END:variables
}
