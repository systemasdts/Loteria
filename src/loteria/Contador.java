package loteria;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author wivdows 7
 */
public class Contador extends javax.swing.JFrame {
    public Contador() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b2 = new javax.swing.JTextField();
        b5 = new javax.swing.JTextField();
        b10 = new javax.swing.JTextField();
        b20 = new javax.swing.JTextField();
        b50 = new javax.swing.JTextField();
        b100 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
        t50 = new javax.swing.JLabel();
        t100 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_copiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255)), "CONTADOR DE BILLETE ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setText("CANT. CONTADA:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("2 Bs. ");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("5 Bs. ");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("10 Bs.");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("20 Bs. ");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("50 Bs.");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("100 Bs.");
        jLabel10.setToolTipText("");

        b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b2FocusLost(evt);
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b2KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b2KeyPressed(evt);
            }
        });

        b5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b5FocusLost(evt);
            }
        });
        b5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b5KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b5KeyPressed(evt);
            }
        });

        b10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b10FocusLost(evt);
            }
        });
        b10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b10KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b10KeyPressed(evt);
            }
        });

        b20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b20FocusLost(evt);
            }
        });
        b20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b20KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b20KeyPressed(evt);
            }
        });

        b50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b50FocusLost(evt);
            }
        });
        b50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b50KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b50KeyPressed(evt);
            }
        });

        b100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b100.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b100.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b100FocusLost(evt);
            }
        });
        b100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b100KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b100KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setText("DENOMINACIÓN:");

        t2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        t10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t20.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        t20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t50.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        t50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t100.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        t100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel4.setText("TOTAL:");

        btn_copiar.setBackground(new java.awt.Color(51, 102, 255));
        btn_copiar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        btn_copiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_copiar.setText("Copiar Monto");
        btn_copiar.setToolTipText("Anulacion de tickets");
        btn_copiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_copiar.setMaximumSize(new java.awt.Dimension(71, 23));
        btn_copiar.setMinimumSize(new java.awt.Dimension(71, 23));
        btn_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel11.setText("TOTAL GENERAL:");

        tg.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        tg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tg.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b100, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t50, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t100, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b50, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b100, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(t50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
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
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copiarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(tg.getText());
        clipboard.setContents(data, data);
    }//GEN-LAST:event_btn_copiarActionPerformed

    private void b100KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b100KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_b100KeyTyped

    private void b100KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b100KeyPressed
        if(evt.VK_ENTER== evt.getKeyCode()){
            btn_copiar.requestFocus();
        }
    }//GEN-LAST:event_b100KeyPressed

    private void b100FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b100FocusLost
        if(!b100.getText().isEmpty()){
            int a=Integer.parseInt(b100.getText())*100;
            t100.setText(String.valueOf(a));
            int b=Integer.parseInt(tg.getText())+a;
            tg.setText(String.valueOf(b));
        }
    }//GEN-LAST:event_b100FocusLost

    private void b50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b50KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_b50KeyTyped

    private void b50KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b50KeyPressed
        if(evt.VK_ENTER== evt.getKeyCode()){
            b100.requestFocus();
        }
    }//GEN-LAST:event_b50KeyPressed

    private void b50FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b50FocusLost
        if(!b50.getText().isEmpty()){
            int a=Integer.parseInt(b50.getText())*50;
            t50.setText(String.valueOf(a));
            int b=Integer.parseInt(tg.getText())+a;
            tg.setText(String.valueOf(b));
        }
    }//GEN-LAST:event_b50FocusLost

    private void b20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b20KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_b20KeyTyped

    private void b20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b20KeyPressed
        if(evt.VK_ENTER== evt.getKeyCode()){
            b50.requestFocus();
        }
    }//GEN-LAST:event_b20KeyPressed

    private void b20FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b20FocusLost
        if(!b20.getText().isEmpty()){
            int a=Integer.parseInt(b20.getText())*20;
            t20.setText(String.valueOf(a));
            int b=Integer.parseInt(tg.getText())+a;
            tg.setText(String.valueOf(b));
        }
    }//GEN-LAST:event_b20FocusLost

    private void b10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b10KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_b10KeyTyped

    private void b10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b10KeyPressed
        if(evt.VK_ENTER== evt.getKeyCode()){
            b20.requestFocus();
        }
    }//GEN-LAST:event_b10KeyPressed

    private void b10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b10FocusLost
        if(!b10.getText().isEmpty()){
            int a=Integer.parseInt(b10.getText())*10;
            t10.setText(String.valueOf(a));
            int b=Integer.parseInt(tg.getText())+a;
            tg.setText(String.valueOf(b));
        }
    }//GEN-LAST:event_b10FocusLost

    private void b5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b5KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_b5KeyTyped

    private void b5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b5KeyPressed
        if(evt.VK_ENTER== evt.getKeyCode()){
            b10.requestFocus();
        }
    }//GEN-LAST:event_b5KeyPressed

    private void b5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b5FocusLost
        if(!b5.getText().isEmpty()){
            int a=Integer.parseInt(b5.getText())*5;
            t5.setText(String.valueOf(a));
            int b=Integer.parseInt(tg.getText())+a;
            tg.setText(String.valueOf(b));
        }
    }//GEN-LAST:event_b5FocusLost

    private void b2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_b2KeyTyped

    private void b2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyPressed
        if(evt.VK_ENTER== evt.getKeyCode()){
            b5.requestFocus();
        }
    }//GEN-LAST:event_b2KeyPressed

    private void b2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b2FocusLost
        if(!b2.getText().isEmpty()){
            int a=Integer.parseInt(b2.getText())*2;
            t2.setText(String.valueOf(a));
            int b=Integer.parseInt(tg.getText())+a;
            tg.setText(String.valueOf(b));
        }
    }//GEN-LAST:event_b2FocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b10;
    private javax.swing.JTextField b100;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b20;
    private javax.swing.JTextField b5;
    private javax.swing.JTextField b50;
    private javax.swing.JButton btn_copiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t100;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t20;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t50;
    private javax.swing.JLabel tg;
    // End of variables declaration//GEN-END:variables
}
