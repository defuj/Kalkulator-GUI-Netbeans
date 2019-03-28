
import java.text.DecimalFormat;

/**
 *
 * @author defuj
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlusMinus = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnSamadengan = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnClearHistori = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAkar = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnPangkat2 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnBagiX = new javax.swing.JButton();
        txtHasil = new javax.swing.JLabel();
        txtHistori = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalulator");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        btnPlusMinus.setText("±");
        btnPlusMinus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPlusMinus.setBorderPainted(false);
        btnPlusMinus.setPreferredSize(new java.awt.Dimension(79, 40));
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn0.setBorderPainted(false);
        btn0.setPreferredSize(new java.awt.Dimension(79, 40));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnKoma.setText(".");
        btnKoma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKoma.setBorderPainted(false);
        btnKoma.setPreferredSize(new java.awt.Dimension(79, 40));
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnSamadengan.setText("=");
        btnSamadengan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSamadengan.setBorderPainted(false);
        btnSamadengan.setPreferredSize(new java.awt.Dimension(79, 40));
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setBorderPainted(false);
        btn1.setPreferredSize(new java.awt.Dimension(79, 40));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn4.setBorderPainted(false);
        btn4.setPreferredSize(new java.awt.Dimension(79, 40));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn7.setBorderPainted(false);
        btn7.setPreferredSize(new java.awt.Dimension(79, 40));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnClearHistori.setText("CE");
        btnClearHistori.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClearHistori.setBorderPainted(false);
        btnClearHistori.setPreferredSize(new java.awt.Dimension(79, 40));
        btnClearHistori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearHistoriActionPerformed(evt);
            }
        });

        btnPersen.setText("%");
        btnPersen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPersen.setBorderPainted(false);
        btnPersen.setPreferredSize(new java.awt.Dimension(79, 40));
        btnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersenActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn2.setBorderPainted(false);
        btn2.setPreferredSize(new java.awt.Dimension(79, 40));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn5.setBorderPainted(false);
        btn5.setPreferredSize(new java.awt.Dimension(79, 40));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn8.setBorderPainted(false);
        btn8.setPreferredSize(new java.awt.Dimension(79, 40));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClear.setBorderPainted(false);
        btnClear.setPreferredSize(new java.awt.Dimension(79, 40));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAkar.setText("√");
        btnAkar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAkar.setBorderPainted(false);
        btnAkar.setPreferredSize(new java.awt.Dimension(79, 40));
        btnAkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkarActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3.setBorderPainted(false);
        btn3.setPreferredSize(new java.awt.Dimension(79, 40));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn6.setBorderPainted(false);
        btn6.setPreferredSize(new java.awt.Dimension(79, 40));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn9.setBorderPainted(false);
        btn9.setPreferredSize(new java.awt.Dimension(79, 40));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDel.setText("DEL");
        btnDel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDel.setBorderPainted(false);
        btnDel.setPreferredSize(new java.awt.Dimension(79, 40));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnPangkat2.setText("x^2");
        btnPangkat2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPangkat2.setBorderPainted(false);
        btnPangkat2.setPreferredSize(new java.awt.Dimension(79, 40));
        btnPangkat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPangkat2ActionPerformed(evt);
            }
        });

        btnTambah.setText("+");
        btnTambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTambah.setBorderPainted(false);
        btnTambah.setPreferredSize(new java.awt.Dimension(79, 40));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setText("─");
        btnKurang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKurang.setBorderPainted(false);
        btnKurang.setPreferredSize(new java.awt.Dimension(79, 40));
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKali.setText("×");
        btnKali.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKali.setBorderPainted(false);
        btnKali.setPreferredSize(new java.awt.Dimension(79, 40));
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setText("÷");
        btnBagi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBagi.setBorderPainted(false);
        btnBagi.setPreferredSize(new java.awt.Dimension(79, 40));
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnBagiX.setText("1/x");
        btnBagiX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBagiX.setBorderPainted(false);
        btnBagiX.setPreferredSize(new java.awt.Dimension(79, 40));
        btnBagiX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiXActionPerformed(evt);
            }
        });

        txtHasil.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtHasil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHasil.setText("0");

        txtHistori.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHistori.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHistori.setPreferredSize(new java.awt.Dimension(0, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPersen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClearHistori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAkar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPangkat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBagiX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSamadengan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHistori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHistori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAkar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPangkat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagiX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearHistori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inisialisasi Variabel
    double nilai1;
    String op = "";
      
    
    //Metod untuk menambahkan angka pada teks
    public void tambahAngka(String a){
        if(txtHasil.getText().equals("0")){
            txtHasil.setText(a);
        }else{
            txtHasil.setText(txtHasil.getText()+a);
        }
        //setNilai(Double.parseDouble(txtHasil.getText()));
    }
    
    //Metod untuk memasukan nilai pada teks ke variabel nilai1
    public void setNilai(double a){
        nilai1 = a;
    }
    
    //Metod untuk mengilangkan nilai double yang mempunyai koma nol (Misal : 1.0 menjadi 1)
    public String hilangkanKoma(double a){
        String hasil;
        DecimalFormat df = new DecimalFormat("###.#");
        hasil = df.format(a);
        return hasil;
    }
    
    //Metod untuk memeriksa apakah sudah ada operator atau tidak
    public boolean cekOperator(){
        boolean hasil;
        if(op.equals("")){
            hasil = false;
        }else{
            hasil = true;
        }
        return hasil;
    }
    
    public void kalkulasikanNilai(){
        if(op.equals("+")){
            nilai1 = nilai1+Double.parseDouble(txtHasil.getText());
        }else if(op.equals("-")){
            nilai1 = nilai1-Double.parseDouble(txtHasil.getText());
        }else if(op.equals("*")){
            nilai1 = nilai1*Double.parseDouble(txtHasil.getText());
        }else if(op.equals("/")){
            nilai1 = nilai1/Double.parseDouble(txtHasil.getText());
        }
    }
    
    
    //Event klik tombol angka
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        tambahAngka("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        tambahAngka("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        tambahAngka("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        tambahAngka("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        tambahAngka("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        tambahAngka("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        tambahAngka("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        tambahAngka("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        tambahAngka("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        tambahAngka("2");
    }//GEN-LAST:event_btn2ActionPerformed

    
    
    //Event klik tombol CE
    private void btnClearHistoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearHistoriActionPerformed
        txtHistori.setText("");
    }//GEN-LAST:event_btnClearHistoriActionPerformed

    //Event klik tombol C
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtHistori.setText("");
        txtHasil.setText("0");
        nilai1 = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    
    
    //Event Klik Tombol Oprator
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        op = "+";
        txtHistori.setText(hilangkanKoma(nilai1)+op);
        txtHasil.setText("0");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        op = "-";
        txtHistori.setText(hilangkanKoma(nilai1)+op);
        txtHasil.setText("0");
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        op = "*";
        txtHistori.setText(hilangkanKoma(nilai1)+"x");
        txtHasil.setText("0");
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
        }else{
            setNilai(Double.parseDouble(txtHasil.getText()));
        }
        
        op = "/";
        txtHistori.setText(hilangkanKoma(nilai1)+"÷");
        txtHasil.setText("0");
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnBagiXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiXActionPerformed
        nilai1 = Double.parseDouble(txtHasil.getText());
        nilai1 = 1/nilai1;
        txtHasil.setText(hilangkanKoma(nilai1));
    }//GEN-LAST:event_btnBagiXActionPerformed

    private void btnPangkat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPangkat2ActionPerformed
        nilai1 = Double.parseDouble(txtHasil.getText());
        nilai1 = nilai1*nilai1;
        txtHasil.setText(hilangkanKoma(nilai1));
        txtHistori.setText("");
    }//GEN-LAST:event_btnPangkat2ActionPerformed

    private void btnAkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkarActionPerformed
        nilai1 = Double.parseDouble(txtHasil.getText());
        nilai1 = Math.sqrt(nilai1);
        txtHasil.setText(hilangkanKoma(nilai1));
        txtHistori.setText("");
    }//GEN-LAST:event_btnAkarActionPerformed

    //Event untuk menghapus satu angka dari teks
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if(txtHasil.getText().length() > 1){
            StringBuffer str = new StringBuffer(txtHasil.getText());
            str = str.deleteCharAt(txtHasil.getText().length()-1);
            txtHasil.setText(String.valueOf(str));
            setNilai(Double.parseDouble(String.valueOf(str)));
        }else{
            tambahAngka("0");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    //Event tombol samadengan
    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        if(cekOperator()){
            kalkulasikanNilai();
            op = "";
            txtHistori.setText(txtHistori.getText()+txtHasil.getText());
            txtHasil.setText(hilangkanKoma(nilai1));
        }
    }//GEN-LAST:event_btnSamadenganActionPerformed

    
    //Event tombol untuk mengubah nilai Positif menjadi Negatif ataupun sebaliknya
    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
        double a = Double.parseDouble(txtHasil.getText());
        if(a<0){
            a = a+(a*-2);
            setNilai(a);
            txtHasil.setText(hilangkanKoma(nilai1));
        }else{
            a = a-(a+a);
            setNilai(a);
            txtHasil.setText(hilangkanKoma(nilai1));
        }
    }//GEN-LAST:event_btnPlusMinusActionPerformed

    
    //Menambahkan koma pada teks
    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        txtHasil.setText(txtHasil.getText()+".");
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersenActionPerformed
        txtHistori.setText(txtHasil.getText()+"÷100");
        nilai1 = Double.parseDouble(txtHasil.getText())/100;
        txtHasil.setText(hilangkanKoma(nilai1));
    }//GEN-LAST:event_btnPersenActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAkar;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnBagiX;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearHistori;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnPangkat2;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel txtHasil;
    private javax.swing.JLabel txtHistori;
    // End of variables declaration//GEN-END:variables
}
