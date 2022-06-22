/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.PrivateOwnerDAO;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.PrivateOwnerM;

/**
 *
 * @author denis
 */
public class PrivateOwner extends javax.swing.JFrame {

    /**
     * Creates new form PrivateOwner
     */
    byte op = 0;
    public PrivateOwner() {
        initComponents();
        this.getContentPane().setBackground(Color.PINK);
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaOwner = new javax.swing.JTextField();
        cajaFn = new javax.swing.JTextField();
        cajaLn = new javax.swing.JTextField();
        cajaDir = new javax.swing.JTextField();
        cajaNumT = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnConsul = new javax.swing.JButton();
        btnLimp = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        comboOp = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPO = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cajaEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cajaContra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Private Owner");

        jLabel2.setText("Owner No.:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Num. Tel:");

        cajaOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaOwnerKeyTyped(evt);
            }
        });

        cajaFn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaFnKeyTyped(evt);
            }
        });

        cajaLn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaLnKeyTyped(evt);
            }
        });

        cajaDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaDirKeyTyped(evt);
            }
        });

        cajaNumT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNumTKeyTyped(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnElim.setText("Eliminar");
        btnElim.setEnabled(false);
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnAct.setText("Actualizar");
        btnAct.setEnabled(false);
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnConsul.setText("Consultar");
        btnConsul.setEnabled(false);
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnLimp.setText("Limpiar Campos");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });

        btnReg.setText("Regresar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        comboOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Agregar", "Eliminar", "Actualizar", "Consultar" }));
        comboOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOpActionPerformed(evt);
            }
        });

        jLabel7.setText("Opciones:");

        jLabel8.setText("Filtro:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Owner No", "First Name", "Last Name", "Dirección", "Num. Tel", "Email", "Contraseña", "Todos" }));
        comboFiltro.setEnabled(false);

        tablaPO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPOMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPO);

        jLabel9.setText("Email:");

        jLabel10.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaFn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaLn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaDir))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaNumT)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnElim, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAct, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnConsul, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimp, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaContra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReg)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaFn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaLn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaNumT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReg)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cajaContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        ventanaPrincipal vp = new ventanaPrincipal();
        this.setVisible(false);
        vp.setVisible(true);
    }//GEN-LAST:event_btnRegActionPerformed

    private void comboOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOpActionPerformed
        if(comboOp.getSelectedIndex() == 0){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(false);
                btnElim.setEnabled(false);
                btnConsul.setEnabled(false);
                btnLimp.setEnabled(false);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 1){
                btnAdd.setEnabled(true);
                btnAct.setEnabled(false);
                btnElim.setEnabled(false);
                btnConsul.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 2){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(false);
                btnElim.setEnabled(true);
                btnConsul.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 3){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(true);
                btnElim.setEnabled(false);
                btnConsul.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 4){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(false);
                btnElim.setEnabled(false);
                btnConsul.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
                comboFiltro.setEnabled(true);
            }
    }//GEN-LAST:event_comboOpActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        PrivateOwnerDAO poDAO = new PrivateOwnerDAO();
        if(cajaOwner.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene todos los campos antes de continuar");
        }else{
            PrivateOwnerM po = new PrivateOwnerM(cajaOwner.getText(), cajaFn.getText(), cajaLn.getText(), cajaDir.getText(), cajaNumT.getText(), cajaEmail.getText(), cajaContra.getText());
            if(poDAO.insertarPrivateOwner(po)){
                actualizarTabla();
            }else{
                actualizarTabla();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        reestablecer(cajaContra, cajaDir, cajaEmail, cajaFn, cajaLn, cajaNumT, cajaOwner);
    }//GEN-LAST:event_btnLimpActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        PrivateOwnerDAO poDAO = new PrivateOwnerDAO();
        
        if(poDAO.eliminarPrivateOwner(cajaOwner.getText())){
            actualizarTabla();
            reestablecer(cajaContra, cajaDir, cajaEmail, cajaFn, cajaLn, cajaNumT, cajaOwner);
        }else{
            actualizarTabla();
            reestablecer(cajaContra, cajaDir, cajaEmail, cajaFn, cajaLn, cajaNumT, cajaOwner);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void tablaPOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPOMouseClicked
        obtenerRegistro();
    }//GEN-LAST:event_tablaPOMouseClicked

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        PrivateOwnerDAO poDAO = new PrivateOwnerDAO();
        
        PrivateOwnerM po = new PrivateOwnerM(cajaOwner.getText(), cajaFn.getText(), cajaLn.getText(), cajaDir.getText(), cajaNumT.getText(), cajaEmail.getText(), cajaContra.getText());
        
        if(poDAO.modificarPrivateOwner(po)){
            actualizarTabla();
            reestablecer(cajaContra, cajaDir, cajaEmail, cajaFn, cajaLn, cajaNumT, cajaOwner);
        }else{
            actualizarTabla();
            reestablecer(cajaContra, cajaDir, cajaEmail, cajaFn, cajaLn, cajaNumT, cajaOwner);
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        if(comboOp.getSelectedIndex() == 0){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 1){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 2){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 3){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 4){
                PrivateOwnerDAO poDAO = new PrivateOwnerDAO();
                
                if(comboFiltro.getSelectedIndex() == 1){
                    if(cajaOwner.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 1;
                    }
                    cajaOwner.setEnabled(true);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 2){
                    if(cajaFn.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 2;
                    }
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(true);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 3){
                    if(cajaLn.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 3;
                    }
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(true);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 4){
                    if(cajaDir.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 4;
                    }
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(true);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 5){
                    if(cajaNumT.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 5;
                    }
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(true);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 6){
                    if(cajaEmail.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 6;
                    }
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(true);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 7){
                    if(cajaContra.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 7;
                    }
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(true);
                }else if(comboFiltro.getSelectedIndex() == 0){
                    op = 0;
                    cajaOwner.setEnabled(false);
                    cajaFn.setEnabled(false);
                    cajaLn.setEnabled(false);
                    cajaDir.setEnabled(false);
                    cajaNumT.setEnabled(false);
                    cajaEmail.setEnabled(false);
                    cajaContra.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 8){
                    op = 8;
                    cajaOwner.setEnabled(true);
                    cajaFn.setEnabled(true);
                    cajaLn.setEnabled(true);
                    cajaDir.setEnabled(true);
                    cajaNumT.setEnabled(true);
                    cajaEmail.setEnabled(true);
                    cajaContra.setEnabled(true);
                }
                actualizarTabla3();
            }

    }//GEN-LAST:event_btnConsulActionPerformed

    private void cajaOwnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaOwnerKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != '\b')
                && ((caracter < 65) || (caracter > 90))){
            evt.consume();
        }
    }//GEN-LAST:event_cajaOwnerKeyTyped

    private void cajaFnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaFnKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac) || Character.isSpaceChar(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajaFnKeyTyped

    private void cajaLnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaLnKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac) || Character.isSpaceChar(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajaLnKeyTyped

    private void cajaDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaDirKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac) || Character.isSpaceChar(carac) || Character.isDigit(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajaDirKeyTyped

    private void cajaNumTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNumTKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != 45) && (caracter != '\b')){
            evt.consume();
        }
    }//GEN-LAST:event_cajaNumTKeyTyped
    public void reestablecer(Component...componentes){
        for(Component Component : componentes){
            if(Component instanceof JTextField){
                ((JTextField)Component).setText("");
            }
        }
    }
    
    public void actualizarTabla(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM privateOwner";
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaPO.setModel(modeloDatos);
    }
    
    public void actualizarTabla2(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM privateOwner WHERE ownerNo = '" + cajaOwner.getText() + "'";
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaPO.setModel(modeloDatos);
    }
    
    public void actualizarTabla3(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM privateOwner";
        
        ResultSetTableModel modeloDatos = null;
        
        if(op == 8){
            consulta = "SELECT * FROM privateowner WHERE ownerNo = '" + cajaOwner.getText() +
                    "', AND fName = '" + cajaFn.getText() + "', AND lName = '" + cajaLn.getText() +
                    "', AND address = '" + cajaDir.getText() + "', AND telNo = '" + cajaNumT.getText() +
                    "', AND email = '" + cajaEmail.getText() + "', AND password = '" + cajaContra.getText() + "';";
        }else if(op == 1){
            consulta = "SELECT * FROM privateowner WHERE ownerNo = '" + cajaOwner.getText() + "';";
        }else if(op == 2){
            consulta = "SELECT * FROM privateowner WHERE fName = '" + cajaFn.getText() + "';";
        }else if(op == 3){
            consulta = "SELECT * FROM privateowner WHERE lName = '" + cajaLn.getText() + "';";
        }else if(op == 4){
            consulta = "SELECT * FROM privateowner WHERE address = '" + cajaDir.getText() + "';";
        }else if(op == 5){
            consulta = "SELECT * FROM privateowner WHERE telNo = '" + cajaNumT.getText() + "';";
        }else if(op == 6){
            consulta = "SELECT * FROM privateowner WHERE email = '" + cajaEmail.getText() + "';";
        }else if(op == 7){
            consulta = "SELECT * FROM privateowner WHERE password = '" + cajaContra.getText() + "';";
        }
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaPO.setModel(modeloDatos);
    }
    
    public void obtenerRegistro(){
        cajaOwner.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 0));
        cajaFn.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 1));
        cajaLn.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 2));
        cajaDir.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 3));
        cajaNumT.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 4));
        cajaEmail.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 5));
        cajaContra.setText((String) tablaPO.getValueAt(tablaPO.getSelectedRow(), 6));
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
            java.util.logging.Logger.getLogger(PrivateOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrivateOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrivateOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrivateOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrivateOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnLimp;
    private javax.swing.JButton btnReg;
    private javax.swing.JTextField cajaContra;
    private javax.swing.JTextField cajaDir;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaFn;
    private javax.swing.JTextField cajaLn;
    private javax.swing.JTextField cajaNumT;
    private javax.swing.JTextField cajaOwner;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<String> comboOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPO;
    // End of variables declaration//GEN-END:variables
}
