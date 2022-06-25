/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.BranchDAO;
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
import modelo.BranchM;

/**
 *
 * @author denis
 */
public class Sucursal extends javax.swing.JFrame {

    /**
     * Creates new form Sucursal
     */
    byte op = 0;
    private TableRowSorter trsFiltro;
    private DefaultTableModel tablaDatos;
    public Sucursal() {
        initComponents();
        this.getContentPane().setBackground(Color.PINK);
        
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
        cajaBranch = new javax.swing.JTextField();
        cajaCalle = new javax.swing.JTextField();
        cajaCiud = new javax.swing.JTextField();
        cajaCP = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnCons = new javax.swing.JButton();
        btnLimp = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        comboOp = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBranch = new javax.swing.JTable();
        btnHist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sucursal");
        setBackground(new java.awt.Color(255, 160, 155));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Sucursal");

        jLabel2.setText("Branch No.:");

        jLabel3.setText("Calle:");

        jLabel4.setText("Ciudad:");

        jLabel5.setText("Código Postal:");

        cajaBranch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaBranchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaBranchKeyTyped(evt);
            }
        });

        cajaCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaCalleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCalleKeyTyped(evt);
            }
        });

        cajaCiud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaCiudKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCiudKeyTyped(evt);
            }
        });

        cajaCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaCPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCPKeyTyped(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.setEnabled(false);
        btnAdd.setMaximumSize(new java.awt.Dimension(45, 35));
        btnAdd.setMinimumSize(new java.awt.Dimension(45, 35));
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

        jLabel6.setText("Opciones:");

        jLabel7.setText("Filtro:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Branch No", "Calle", "Ciudad", "Código Postal", "Todos", " " }));
        comboFiltro.setEnabled(false);

        tablaBranch.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBranchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBranch);

        btnHist.setText("Historial Eliminación");
        btnHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaCalle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaCiud))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaCP)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnElim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnHist, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLimp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cajaBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaCiud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCons, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajaCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        BranchDAO bDAO = new BranchDAO();
        if(cajaBranch.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }else{
            BranchM b = new BranchM(cajaBranch.getText(), cajaCalle.getText(), cajaCiud.getText(), cajaCP.getText());
            if(bDAO.insertarBranch(b)){
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
                btnCons.setEnabled(false);
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
        reestablecer(cajaBranch, cajaCP, cajaCalle, cajaCiud);
        actualizarTabla();
    }//GEN-LAST:event_btnLimpActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        BranchDAO bDAO = new BranchDAO();
        
        if(bDAO.eliminarBranch(cajaBranch.getText())){
            actualizarTabla();
            reestablecer(cajaBranch, cajaCP, cajaCalle, cajaCiud);
        }else{
            actualizarTabla();
            reestablecer(cajaBranch, cajaCP, cajaCalle, cajaCiud);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void tablaBranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBranchMouseClicked
        obtenerRegistro();
    }//GEN-LAST:event_tablaBranchMouseClicked

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        BranchDAO bDAO = new BranchDAO();
        
        BranchM b = new BranchM(cajaBranch.getText(), cajaCalle.getText(), cajaCiud.getText(), cajaCP.getText());
        
        if(bDAO.modificarBranch(b)){
            actualizarTabla();
            reestablecer(cajaBranch, cajaCP, cajaCalle, cajaCiud);
        
        }else{
            actualizarTabla();
            reestablecer(cajaBranch, cajaCP, cajaCalle, cajaCiud);
            
        }
    }//GEN-LAST:event_btnActActionPerformed

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
                BranchDAO bDAO = new BranchDAO();
                
                if(comboFiltro.getSelectedIndex() == 1){
                    if(cajaBranch.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 1;
                    }
                    //cajaBranch.setEnabled(true);
                    //cajaCalle.setEnabled(false);
                    //cajaCiud.setEnabled(false);
                    //cajaCP.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 2){
                    if(cajaCalle.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 2;
                    }
                    //cajaBranch.setEnabled(false);
                    //cajaCalle.setEnabled(true);
                    //cajaCiud.setEnabled(false);
                    //cajaCP.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 3){
                    if(cajaCiud.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 3;
                    }
                    //cajaBranch.setEnabled(false);
                    //cajaCalle.setEnabled(false);
                    //cajaCiud.setEnabled(true);
                    //cajaCP.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 4){
                    if(cajaCP.getText().isEmpty()){
                        op = 0;
                    }else{
                        op = 4;
                    }
                    //cajaBranch.setEnabled(false);
                    //cajaCalle.setEnabled(false);
                    //cajaCiud.setEnabled(false);
                    //cajaCP.setEnabled(true);
                }else if(comboFiltro.getSelectedIndex() == 0){
                    op = 0;
                    //cajaBranch.setEnabled(false);
                    //cajaCalle.setEnabled(false);
                    //cajaCiud.setEnabled(false);
                    //cajaCP.setEnabled(false);
                }else if(comboFiltro.getSelectedIndex() == 5){
                    op = 5;
                    cajaBranch.setEnabled(true);
                    cajaCalle.setEnabled(true);
                    cajaCiud.setEnabled(true);
                    cajaCP.setEnabled(true);
                }
                actualizarTabla3();
            }
    }//GEN-LAST:event_btnConsActionPerformed

    private void cajaBranchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBranchKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != '\b')
                && ((caracter < 65) || (caracter > 90))){
            evt.consume();
        }
    }//GEN-LAST:event_cajaBranchKeyTyped

    private void cajaCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCalleKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac) || Character.isSpaceChar(carac) || Character.isDigit(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajaCalleKeyTyped

    private void cajaCiudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCiudKeyTyped
        char carac = evt.getKeyChar();
        if(Character.isLetter(carac)){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_cajaCiudKeyTyped

    private void cajaCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCPKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < 48) || (caracter > 57)) && (caracter != '\b')
                && ((caracter < 65) || (caracter > 90)) && (caracter != 32)){
            evt.consume();
        }
    }//GEN-LAST:event_cajaCPKeyTyped

    private void btnHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistActionPerformed
        HistorialEliminacion hc = new HistorialEliminacion();
        this.setVisible(false);
        hc.setVisible(true);
    }//GEN-LAST:event_btnHistActionPerformed

    private void cajaBranchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBranchKeyReleased
        if(comboOp.getSelectedIndex() == 2 || comboOp.getSelectedIndex() == 3 || comboOp.getSelectedIndex() == 4){
            buscarPorCampos();
        }
    }//GEN-LAST:event_cajaBranchKeyReleased

    private void cajaCalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCalleKeyReleased
        if(comboOp.getSelectedIndex() == 2 || comboOp.getSelectedIndex() == 3 || comboOp.getSelectedIndex() == 4){
            buscarPorCampos();
        }
    }//GEN-LAST:event_cajaCalleKeyReleased

    private void cajaCiudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCiudKeyReleased
        if(comboOp.getSelectedIndex() == 2 || comboOp.getSelectedIndex() == 3 || comboOp.getSelectedIndex() == 4){
            buscarPorCampos();
        }
    }//GEN-LAST:event_cajaCiudKeyReleased

    private void cajaCPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCPKeyReleased
        if(comboOp.getSelectedIndex() == 2 || comboOp.getSelectedIndex() == 3 || comboOp.getSelectedIndex() == 4){
            buscarPorCampos();
        }
    }//GEN-LAST:event_cajaCPKeyReleased
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
        String consulta = "SELECT * FROM branch";
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaBranch.setModel(modeloDatos);
    }
    
    public void actualizarTabla2(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM branch WHERE branchNo LIKE '" + cajaBranch.getText() + "%'";
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
            System.out.println(modeloDatos);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaBranch.setModel(modeloDatos);
    }
    
    public void actualizarTabla3(){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = "SELECT * FROM branch";
        
        ResultSetTableModel modeloDatos = null;
        
        if(op == 5){
            consulta = "SELECT * FROM branch WHERE branchNo = '" + cajaBranch.getText() +
                    "', AND street = '" + cajaCalle.getText() + "', AND city = '" + cajaCiud.getText() +
                    "', AND postcode = '" + cajaCP.getText() + "';";
        }else if(op == 1){
            consulta = "SELECT * FROM branch WHERE branchNo = '" + cajaBranch.getText() + "';";
        }else if(op == 2){
            consulta = "SELECT * FROM branch WHERE street = '" + cajaCalle.getText() + "';";
        }else if(op == 3){
            consulta = "SELECT * FROM branch WHERE city = '" + cajaCiud.getText() + "';";
        }else if(op == 2){
            consulta = "SELECT * FROM branch WHERE postcode = '" + cajaCP.getText() + "';";
        }
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaBranch.setModel(modeloDatos);
    }
    
    public void actualizarTabla(String sql){
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dreamhome;"
                    + "user=sa;"
                    + "password=hanji123;"
                    + "encrypt=true;trustServerCertificate=true;";
        String consulta = sql;
        
        ResultSetTableModel modeloDatos = null;
        try{
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        }catch(SQLException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaBranch.setModel(modeloDatos);
    }
    
    public void buscarPorCampos(){
        if(!cajaBranch.getText().isEmpty()){
            actualizarTabla("SELECT * FROM branch WHERE branchNo LIKE '" + cajaBranch.getText() + "%'");
        }else if(!cajaCalle.getText().isEmpty()){
            actualizarTabla("SELECT * FROM branch WHERE street LIKE '" + cajaCalle.getText() + "%'");
        }else if(!cajaCiud.getText().isEmpty()){
            actualizarTabla("select * from branch where city like '" + cajaCiud.getText() + "%'");
        }else if(!cajaCP.getText().isEmpty()){
            actualizarTabla("select * from branch where postcode like '" + cajaCP.getText() + "%'");
        }else if(cajaBranch.getText().isEmpty() && cajaCalle.getText().isEmpty() &&
                cajaCiud.getText().isEmpty() && cajaCP.getText().isEmpty()){
            actualizarTabla("Select * from branch");
        }
    }
    
    public void obtenerRegistro(){
        cajaBranch.setText((String) tablaBranch.getValueAt(tablaBranch.getSelectedRow(), 0));
        cajaCalle.setText((String) tablaBranch.getValueAt(tablaBranch.getSelectedRow(), 1));
        cajaCiud.setText((String) tablaBranch.getValueAt(tablaBranch.getSelectedRow(), 2));
        cajaCP.setText((String) tablaBranch.getValueAt(tablaBranch.getSelectedRow(), 3));
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
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCons;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnHist;
    private javax.swing.JButton btnLimp;
    private javax.swing.JButton btnReg;
    private javax.swing.JTextField cajaBranch;
    private javax.swing.JTextField cajaCP;
    private javax.swing.JTextField cajaCalle;
    private javax.swing.JTextField cajaCiud;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JComboBox<String> comboOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBranch;
    // End of variables declaration//GEN-END:variables
}
