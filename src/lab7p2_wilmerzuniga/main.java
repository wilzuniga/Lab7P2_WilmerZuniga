/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_wilmerzuniga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wilme
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        // siemp = jTree1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenuItem();
        Elegir = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        AREATEXT = new javax.swing.JTextArea();
        PELEAR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TFNOMBREZMB = new javax.swing.JTextField();
        TFAtaqueZMB = new javax.swing.JTextField();
        TFVidaZMB = new javax.swing.JTextField();
        TFedadZMB = new javax.swing.JTextField();
        TFTAMAÑOZMB = new javax.swing.JTextField();
        TFAÑOSEXPZMB = new javax.swing.JTextField();
        TFColBANDERAZMB = new javax.swing.JTextField();
        TFDireccionImagenZMB = new javax.swing.JTextField();
        TFAggPerwsonaZMB = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        BTNAggPerwsonaZMB = new javax.swing.JButton();
        BTNAggPerwsonaZMB1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBRANGOPLT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBTIPOPLT = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFNOMBREPLT = new javax.swing.JTextField();
        TFVIDAPLT = new javax.swing.JTextField();
        TFATAQUEPLT = new javax.swing.JTextField();
        BTCREARPLT = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFMAGNITUDZMB = new javax.swing.JTextField();
        TFPesoPLT = new javax.swing.JTextField();
        TFNombreProyectilPLT = new javax.swing.JTextField();
        TFALTURAPLT = new javax.swing.JTextField();
        TFCPLORPLT = new javax.swing.JTextField();
        Dureza = new javax.swing.JTextField();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        Imprimir.setText("Elegir");
        jPopupMenu1.add(Imprimir);

        Elegir.setText("Imprimir");
        jPopupMenu1.add(Elegir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Entidades");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zombies");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clasico");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cargado");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Plantas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Explosiva");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Disparo");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Defensa");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTree1);

        AREATEXT.setColumns(20);
        AREATEXT.setRows(5);
        jScrollPane2.setViewportView(AREATEXT);

        PELEAR.setText("PELEA");
        PELEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PELEARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(PELEAR)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PELEAR)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Test", jPanel1);

        jLabel8.setText("Nombre");

        jLabel13.setText("Ataque");

        jLabel14.setText("Tamaño");

        jLabel15.setText("Tipo");

        jLabel16.setText("Persona");

        jLabel17.setText("Vida");

        jLabel18.setText("Direccion Imagen");

        jLabel19.setText("Edad");

        jLabel20.setText("Color Bandera");

        jLabel21.setText("Años Experiencia");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasico", "Cargado" }));

        BTNAggPerwsonaZMB.setText("+");
        BTNAggPerwsonaZMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAggPerwsonaZMBActionPerformed(evt);
            }
        });

        BTNAggPerwsonaZMB1.setText("Crear zombie");
        BTNAggPerwsonaZMB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAggPerwsonaZMB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFColBANDERAZMB))
                        .addGap(313, 313, 313))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel21))
                                    .addComponent(TFVidaZMB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel13))
                                        .addGap(84, 84, 84))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFNOMBREZMB)
                                            .addComponent(TFAtaqueZMB))
                                        .addGap(64, 64, 64)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel19)
                                    .addComponent(TFedadZMB, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(TFTAMAÑOZMB)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(TFAÑOSEXPZMB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TFAggPerwsonaZMB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTNAggPerwsonaZMB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(BTNAggPerwsonaZMB1)
                            .addComponent(TFDireccionImagenZMB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(130, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFNOMBREZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFedadZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFDireccionImagenZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFAtaqueZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTAMAÑOZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFAggPerwsonaZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAggPerwsonaZMB))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFVidaZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFAÑOSEXPZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAggPerwsonaZMB1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFColBANDERAZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Zombies", jPanel3);

        jLabel1.setText("Rango");

        CBRANGOPLT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));

        jLabel2.setText("Tipo");

        CBTIPOPLT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Explosiva", "Disparo", "Defensa" }));

        jLabel3.setText("Nombre");

        jLabel4.setText("Ataque");

        jLabel6.setText("Vida");

        BTCREARPLT.setText("CREAR");
        BTCREARPLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCREARPLTActionPerformed(evt);
            }
        });

        jLabel5.setText("Magnitud Explosion");

        jLabel7.setText("Altura");

        jLabel9.setText("Peso");

        jLabel10.setText("Color");

        jLabel11.setText("Nombre Proyectil");

        jLabel12.setText("Dureza");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CBRANGOPLT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFMAGNITUDZMB)
                            .addComponent(TFALTURAPLT)
                            .addComponent(TFCPLORPLT))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TFNombreProyectilPLT)
                                .addComponent(TFPesoPLT, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(CBTIPOPLT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11))
                            .addComponent(Dureza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFNOMBREPLT, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(TFVIDAPLT))
                        .addGap(18, 82, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTCREARPLT)
                            .addComponent(TFATAQUEPLT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNOMBREPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFATAQUEPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBRANGOPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBTIPOPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFVIDAPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTCREARPLT))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNombreProyectilPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFMAGNITUDZMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFALTURAPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPesoPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCPLORPLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        jTabbedPane1.addTab("Plantas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAggPerwsonaZMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAggPerwsonaZMB1ActionPerformed
        if (((String) jComboBox3.getSelectedItem()).equals("Clasico")) {
            listaZombies.add(new Clasico(Integer.parseInt(TFAÑOSEXPZMB.getText()), (new Bandera(TFColBANDERAZMB.getText(), TFDireccionImagenZMB.getText())), TFNOMBREZMB.getText(), Double.parseDouble(TFAtaqueZMB.getText()), Double.parseDouble(TFVidaZMB.getText())));
        } else {
            listaZombies.add(new Cargado(Integer.parseInt(TFTAMAÑOZMB.getText()), Integer.parseInt(TFedadZMB.getText()), TFNOMBREZMB.getText(), Double.parseDouble(TFAtaqueZMB.getText()), Double.parseDouble(TFVidaZMB.getText()), listakills));
        }
        
        actualizarfingarbol();
        try {
            escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNAggPerwsonaZMB1ActionPerformed

    private void BTNAggPerwsonaZMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAggPerwsonaZMBActionPerformed
        listakills.add(TFAggPerwsonaZMB.getText());
        TFAggPerwsonaZMB.setText("");
    }//GEN-LAST:event_BTNAggPerwsonaZMBActionPerformed

    private void BTCREARPLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCREARPLTActionPerformed
        System.out.println(((String) CBTIPOPLT.getSelectedItem()));
        if (((String) CBTIPOPLT.getSelectedItem()).equals("Explosiva")) {
            listaplantas.add(new Explosiva(Integer.parseInt(TFMAGNITUDZMB.getText()), TFNOMBREPLT.getText(), Double.parseDouble(TFATAQUEPLT.getText()), Double.parseDouble(TFVIDAPLT.getText()), (String) CBRANGOPLT.getSelectedItem()));
        } else if (((String) CBTIPOPLT.getSelectedItem()).equals("Disparo")) {
            listaplantas.add(new Disparo(TFNombreProyectilPLT.getText(), TFCPLORPLT.getText(), TFNOMBREPLT.getText(), Double.parseDouble(TFATAQUEPLT.getText()), Double.parseDouble(TFVIDAPLT.getText()), ((String) CBRANGOPLT.getSelectedItem())));
        } else {
            listaplantas.add(new Defensa(Integer.parseInt(TFALTURAPLT.getText()), Integer.parseInt(Dureza.getText()), Integer.parseInt(TFPesoPLT.getText()), TFNOMBREPLT.getText(), Double.parseDouble(TFATAQUEPLT.getText()), Double.parseDouble(TFVIDAPLT.getText()), ((String) CBRANGOPLT.getSelectedItem())));
        }
        actualizarfingarbol();
        System.out.println(listaplantas);
    }//GEN-LAST:event_BTCREARPLTActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DefaultTreeModel m
                = (DefaultTreeModel) jTree1.getModel();
        Object V1 = jTree1.getSelectionPath().getLastPathComponent();
        nodo_seleccionado = (DefaultMutableTreeNode) V1;
        
        for (Plantas listaplanta : listaplantas) {
            if(listaplanta.getNombre().equals(nodo_seleccionado)){
                listaplantas.remove(listaplanta);
            }
        }
        
        for (Zombies listaZomby : listaZombies) {
            if(listaZomby.getNombre().equals(listaZombies)){
                listaZombies.remove(listaZomby);
            }
        }
        m.removeNodeFromParent(
               nodo_seleccionado);
        m.reload();    }//GEN-LAST:event_EliminarActionPerformed

    private void PELEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PELEARActionPerformed
        for (int i = 0; i < listaZombies.size(); i++) {
            if (listaZombies.get(i).getAtaque() > listaplantas.get(i).getAtaque()){
                AREATEXT.append(listaZombies.get(i).getNombre() + " le gano a la planta seleccionada,");  
            }else{
                AREATEXT.append(listaplantas.get(i).getNombre() + " le gano a el zombie seleccionada,");
            }

        }
        
    }//GEN-LAST:event_PELEARActionPerformed

    public void actualizarfingarbol() {
         arbol();
        
        for (Plantas planta : listaplantas) {
            DefaultTreeModel m = (DefaultTreeModel) jTree1.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_planta = new DefaultMutableTreeNode(planta.getNombre());
            //DefaultMutableTreeNode nodo_plantaabajo 

            if (planta instanceof Explosiva) {
                ((DefaultMutableTreeNode) (raiz.getChildAt(1)).getChildAt(0)).add(nodo_planta);
            } else if (planta instanceof Disparo) {
                if (planta.getRango().equals("Bajo")) {
                    ((DefaultMutableTreeNode) ((raiz.getChildAt(1)).getChildAt(1)).getChildAt(0)).add(nodo_planta);
                } else if (planta.getRango().equals("Medio")) {
                    ((DefaultMutableTreeNode) ((raiz.getChildAt(1)).getChildAt(1)).getChildAt(1)).add(nodo_planta);
                } else {
                    ((DefaultMutableTreeNode) ((raiz.getChildAt(1)).getChildAt(1)).getChildAt(2)).add(nodo_planta);

                }
            } else {
                ((DefaultMutableTreeNode) (raiz.getChildAt(1)).getChildAt(2)).add(nodo_planta);

            }

            m.reload();
        }

        for (Zombies zombies : listaZombies) {
            DefaultTreeModel m = (DefaultTreeModel) jTree1.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_zombies = new DefaultMutableTreeNode(zombies.getNombre());

            if (zombies instanceof Clasico) {
                ((DefaultMutableTreeNode) (raiz.getChildAt(0)).getChildAt(0)).add(nodo_zombies);
            } else {
                ((DefaultMutableTreeNode) (raiz.getChildAt(0)).getChildAt(1)).add(nodo_zombies);
            }

            m.reload();
            

        }
        

    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String coso = "";

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Zombies t : listaZombies) {
                bw.write("Nombre=" + t.getNombre() + ",");
                bw.write("Ataque=" + t.getAtaque() + ",");
                bw.write("Vida=" + t.getVida() + "_");

                if (t instanceof Cargado) {
                    bw.write("Cargado:(");
                    bw.write("Edad=" + ((Cargado) t).getEdad() + ";");
                    bw.write("Comidos=" + ((Cargado) t).printArrayl(((Cargado) t).getComidos()) + ";");
                    bw.write("Tamaño=" + ((Cargado) t).getTamaño() + ")");
                } else if (t instanceof Clasico) {
                    bw.write("Clasico:(");
                    bw.write("Experiencia=" + ((Clasico) t).getExperiencia() + ";");
                    bw.write("Bandera=" + "[");
                    bw.write("Direccion:" + ((Clasico) t).getBanderas().getDireccion() + ",");
                    bw.write("Color:" + ((Clasico) t).getBanderas().getColor() + "])");
                }
                bw.write("|");
            }
            bw.flush();//pasar al rom
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaZombies = new ArrayList();
        String coso = "";

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("_");
                while (sc.hasNext()) {
                    listaZombies.add(new Zombies(sc.nextInt(),
                            sc.next(),
                            sc.nextInt(),
                            
                    ));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    public void arbol(){
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Entidades");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zombies");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clasico");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cargado");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Plantas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Explosiva");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Disparo");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Defensa");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    DefaultMutableTreeNode nodo_seleccionado;
    private File archivo = new File("./Zombies.txt");
    private ArrayList<Plantas> listaplantas = new ArrayList();
    private ArrayList<String> listakills = new ArrayList();
    private ArrayList<Zombies> listaZombies = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREATEXT;
    private javax.swing.JButton BTCREARPLT;
    private javax.swing.JButton BTNAggPerwsonaZMB;
    private javax.swing.JButton BTNAggPerwsonaZMB1;
    private javax.swing.JComboBox<String> CBRANGOPLT;
    private javax.swing.JComboBox<String> CBTIPOPLT;
    private javax.swing.JTextField Dureza;
    private javax.swing.JMenuItem Elegir;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Imprimir;
    private javax.swing.JButton PELEAR;
    private javax.swing.JTextField TFALTURAPLT;
    private javax.swing.JTextField TFATAQUEPLT;
    private javax.swing.JTextField TFAggPerwsonaZMB;
    private javax.swing.JTextField TFAtaqueZMB;
    private javax.swing.JTextField TFAÑOSEXPZMB;
    private javax.swing.JTextField TFCPLORPLT;
    private javax.swing.JTextField TFColBANDERAZMB;
    private javax.swing.JTextField TFDireccionImagenZMB;
    private javax.swing.JTextField TFMAGNITUDZMB;
    private javax.swing.JTextField TFNOMBREPLT;
    private javax.swing.JTextField TFNOMBREZMB;
    private javax.swing.JTextField TFNombreProyectilPLT;
    private javax.swing.JTextField TFPesoPLT;
    private javax.swing.JTextField TFTAMAÑOZMB;
    private javax.swing.JTextField TFVIDAPLT;
    private javax.swing.JTextField TFVidaZMB;
    private javax.swing.JTextField TFedadZMB;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
