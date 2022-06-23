/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ClientDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.ClientM;

/**
 *
 * @author denis
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    byte op = 0;
    private TableRowSorter trsFiltro;
    private DefaultTableModel tablaDatos;
    public Client() {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
        actualizarTabla();
        this.setLocationRelativeTo(null);
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
        jLabel7 = new javax.swing.JLabel();
        cajaClientNo = new javax.swing.JTextField();
        cajafName = new javax.swing.JTextField();
        cajalName = new javax.swing.JTextField();
        cajaTelNo = new javax.swing.JTextField();
        cajaPref = new javax.swing.JTextField();
        cajaMaxR = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnCons = new javax.swing.JButton();
        btnLimp = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        comboOp = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClient = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cajaEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setText("Client No.");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name");

        jLabel5.setText("Tel. No.");

        jLabel6.setText("Pref. Type:");

        jLabel7.setText("Max Rent:");

        cajaClientNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaClientNoKeyTyped(evt);
            }
        });

        cajafName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajafNameActionPerformed(evt);
            }
        });
        cajafName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajafNameKeyTyped(evt);
            }
        });

        cajalName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajalNameKeyTyped(evt);
            }
        });

        cajaTelNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTelNoKeyTyped(evt);
            }
        });

        cajaPref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPrefKeyTyped(evt);
            }
        });

        cajaMaxR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaMaxRKeyTyped(evt);
            }
        });

        btnAdd.setText("Añadir");
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

        btnCons.setText("Consultar");
        btnCons.setEnabled(false);
        btnCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsActionPerformed(evt);
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

        jLabel8.setText("Opciones:");

        jLabel9.setText("Filtro:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "ClientNo", "First Name", "Last Name", "Tel. No", "Pref. Type", "Max Rent", "Todos" }));
        comboFiltro.setEnabled(false);
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        tablaClient.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClient);

        jLabel10.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaEmail)
                                .addGap(202, 202, 202))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaClientNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajafName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajalName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaMaxR))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaTelNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaPref)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCons, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimp, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnReg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnElim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaClientNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajafName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCons))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaPref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cajaMaxR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajafNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajafNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajafNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ClientDAO cDAO = new ClientDAO();
        String maxR = cajaMaxR.getText();
        if(cajaClientNo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }else{
            int maxRent = Integer.parseInt(maxR);
            ClientM c = new ClientM(cajaClientNo.getText(), cajafName.getText(), cajalName.getText(), cajaTelNo.getText(), cajaPref.getText(), maxRent, cajaEmail.getText());
            if(cDAO.insertarClient(c)){
                actualizarTabla();
            }else{
                actualizarTabla();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
                btnCons.setEnabled(true);
                btnLimp.setEnabled(false);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 1){
                btnAdd.setEnabled(true);
                btnAct.setEnabled(false);
                btnElim.setEnabled(false);
                btnCons.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 2){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(false);
                btnElim.setEnabled(true);
                btnCons.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 3){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(true);
                btnElim.setEnabled(false);
                btnCons.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
            }else if(comboOp.getSelectedIndex() == 4){
                btnAdd.setEnabled(false);
                btnAct.setEnabled(false);
                btnElim.setEnabled(false);
                btnCons.setEnabled(true);
                btnLimp.setEnabled(true);
                btnReg.setEnabled(true);
                comboFiltro.setEnabled(true);
            }
    }//GEN-LAST:event_comboOpActionPerformed

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        reestablecer(cajaClientNo, cajaEmail, cajaMaxR, cajaPref, cajaTelNo, cajafName, cajalName);
        actualizarTabla();
    }//GEN-LAST:event_btnLimpActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        ClientDAO cDAO = new ClientDAO();
        
        if(cDAO.eliminarClient(cajaClientNo.getText())){
            actualizarTabla();
            reestablecer(cajaClientNo, cajaEmail, cajaMaxR, cajaPref, cajaTelNo, cajafName, cajalName);
        }else{
            actualizarTabla();
            reestablecer(cajaClientNo, cajaEmail, cajaMaxR, cajaPref, cajaTelNo, cajafName, cajalName);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void tablaClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientMouseClicked
        obtenerRegistro();
    }//GEN-LAST:event_tablaClientMouseClicked

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        ClientDAO cDAO = new ClientDAO();
        
        String maxR = cajaMaxR.getText();
        int maxRent = Integer.parseInt(maxR);
        ClientM c = new ClientM(cajaClientNo.getText(), cajafName.getText(), cajalName.getText(), cajaTelNo.getText(), cajaPref.getText(), maxRent, cajaEmail.getText());
        
        if(cDAO.modificarClient(c)){
            actualizarTabla();
            reestablecer(cajaClientNo, cajaEmail, cajaMaxR, cajaPref, cajaTelNo, cajafName, cajalName);
        }else{
            actualizarTabla();
            reestablecer(cajaClientNo, cajaEmail, cajaMaxR, cajaPref, cajaTelNo, cajafName, cajalName);
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void btnConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsActionPerformed
        if(comboOp.getSelectedIndex() == 0){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 1){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 2){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 3){
                actualizarTabla2();
            }else if(comboOp.getSelectedIndex() == 4){
                ClientDAO cDAO = new ClientDAO();
                
                if(comboFiltro.getSelectedIndex() == 1){
                    if(cajaClientNo.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 1;
                    }
                    //cajaClientNo.setEnabled(true);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 2){
                    if(cajafName.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 2;
                    }
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(true);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 3){
                    if(cajalName.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 3;
                    }
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(true);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 4){
                    if(cajaTelNo.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 4;
                    }
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(true);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 5){
                    if(cajaPref.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 5;
                    }
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(true);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 6){
                    if(cajaMaxR.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 6;
                    }
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(true);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 7){
                    if(cajaEmail.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 7;
                    }
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(true);
                }else if(comboFiltro.getSelectedIndex() == 0){
                    op = 0;
                    //cajaClientNo.setEnabled(false);
                    //cajafName.setEnabled(false);
                    //cajalName.setEnabled(false);
                    //cajaTelNo.setEnabled(false);
                    //cajaPref.setEnabled(false);
                    //cajaMaxR.setEnabled(false);
                    //cajaEmail.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 8){
                    op = 8;
                    cajaClientNo.setEnabled(true);
                    cajafName.setEnabled(true);
                    cajalName.setEnabled(true);
                    cajaTelNo.setEnabled(true);
                    cajaPref.setEnabled(true);
                    cajaMaxR.setEnabled(true);
                    cajaEmail.setEnabled(true);
                }
                actualizarTabla3();
            }
    }//GEN-LAST:event_btnConsActionPerformed

    private void cajaMaxRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaMaxRKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != '\b')){
            evt.consume();
        }
    }//GEN-LAST:event_cajaMaxRKeyTyped

    private void cajaTelNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTelNoKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != 45) && (caracter != '\b')){
            evt.consume();
        }
    }//GEN-LAST:event_cajaTelNoKeyTyped

    private void cajaClientNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaClientNoKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != '\b')
                && ((caracter < 65) || (caracter > 90))){
            evt.consume();
        }
    }//GEN-LAST:event_cajaClientNoKeyTyped

    private void cajafNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajafNameKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac) || Character.isSpaceChar(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajafNameKeyTyped

    private void cajalNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajalNameKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac) || Character.isSpaceChar(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajalNameKeyTyped

    private void cajaPrefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPrefKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajaPrefKeyTyped
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
        String consulta = "SELECT * FROM client";
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaClient.setModel(modeloDatos);
    }
    
    public void actualizarTabla2(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM client WHERE clientNo = '" + cajaClientNo.getText() + "'";
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaClient.setModel(modeloDatos);
    }
    
    public void actualizarTabla3(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM client";
        
        ResultSetTableModel modeloDatos = null;
        
        if(op == 8){
            int maxR = -1;
            if(cajaMaxR.getText() != ""){
                maxR = Integer.parseInt(cajaMaxR.getText());
            }
            consulta = "SELECT * FROM client WHERE clientNo = '" + cajaClientNo.getText() + 
                    "', AND fName = '" + cajafName.getText() + "', AND lName = '" + cajalName.getText() +
                    "', AND telNo = '" + cajaTelNo.getText() + "', AND prefType = '" + cajaPref.getText() +
                    "', AND maxRent = " + maxR + ", AND email = '" + cajaEmail.getText() + "';";
        }else if(op == 1){
            consulta = "SELECT * FROM client WHERE clientNo = '" + cajaClientNo.getText() + "';";
        }else if(op == 2){
            consulta = "SELECT * FROM client WHERE fName = '" + cajafName.getText() + "';";
        }else if(op == 3){
            consulta = "SELECT * FROM client WHERE lName = '" + cajalName.getText() + "';";
        }else if(op == 4){
            consulta = "SELECT * FROM client WHERE telNo = '" + cajaTelNo.getText() + "';";
        }else if(op == 5){
            consulta = "SELECT * FROM client WHERE prefType = '" + cajaPref.getText() + "';";
        }else if(op == 6){
            int maxR = -1;
            if(cajaMaxR.getText() != ""){
                maxR = Integer.parseInt(cajaMaxR.getText());
            }
            consulta = "SELECT * FROM client WHERE maxRent = " + maxR + ";";
        }else if(op == 7){
            consulta = "SELECT * FROM client WHERE email = '" + cajaEmail.getText() + "';";
        }
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaClient.setModel(modeloDatos);
    }
    
    public void obtenerRegistro(){
        cajaClientNo.setText((String)tablaClient.getValueAt(tablaClient.getSelectedRow(), 0));
        cajafName.setText((String)tablaClient.getValueAt(tablaClient.getSelectedRow(), 1));
        cajalName.setText((String)tablaClient.getValueAt(tablaClient.getSelectedRow(), 2));
        cajaTelNo.setText((String)tablaClient.getValueAt(tablaClient.getSelectedRow(), 3));
        cajaPref.setText((String)tablaClient.getValueAt(tablaClient.getSelectedRow(), 4));
        int i = (int) tablaClient.getValueAt(tablaClient.getSelectedRow(), 5);
        cajaMaxR.setText(i + "");
        cajaEmail.setText((String)tablaClient.getValueAt(tablaClient.getSelectedRow(), 6));
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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCons;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnLimp;
    private javax.swing.JButton btnReg;
    private javax.swing.JTextField cajaClientNo;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaMaxR;
    private javax.swing.JTextField cajaPref;
    private javax.swing.JTextField cajaTelNo;
    private javax.swing.JTextField cajafName;
    private javax.swing.JTextField cajalName;
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
    private javax.swing.JTable tablaClient;
    // End of variables declaration//GEN-END:variables
}
