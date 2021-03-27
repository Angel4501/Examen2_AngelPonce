package examen2_angelponce;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Examen2_AngelPonce extends javax.swing.JFrame {

    public Examen2_AngelPonce() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    private int helpv = 0;
    private int helpe = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearautos = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vin = new javax.swing.JTextField();
        autonomia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        teb = new javax.swing.JTextField();
        materialbateria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        capacidadmaletero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tec = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tipovolante = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        materialmasusado = new javax.swing.JTextField();
        cantidadbotones = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tei = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        visor = new javax.swing.JTextField();
        anchopantalla = new javax.swing.JTextField();
        materialasientos = new javax.swing.JTextField();
        cantidadpantallas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        eom = new javax.swing.JTextField();
        tes = new javax.swing.JTextField();
        tea = new javax.swing.JTextField();
        masaje = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        crearensambladores = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        verautosyensambladores = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlvehiculos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlensambladores = new javax.swing.JList<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        ensamblaje = new javax.swing.JDialog();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        part = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        vervehiculosfallidos = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        modificarensamblador = new javax.swing.JDialog();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        ngenero = new javax.swing.JTextField();
        nnombre = new javax.swing.JTextField();
        nedad = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        vervehiculosensamblados = new javax.swing.JDialog();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jDialog8 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        jLabel1.setText("Crear Vehiculos");

        jLabel2.setText("VIN");

        jLabel3.setText("Color");

        jLabel4.setText("1) Bateria");

        jLabel5.setText("autonomia");

        jLabel6.setText("material");

        jLabel7.setText("tiempo ensamblaje (segundos)");

        jLabel8.setText("3) Interior");

        jLabel9.setText("Tipo");

        jLabel10.setText("Capacidad maletero");

        jLabel11.setText("tiempo ensamblaje (segundos)");

        jLabel12.setText("2) Carroceria");

        jLabel13.setText("Material mas usado");

        jLabel14.setText("tipo de volante");

        jLabel15.setText("cantidad de botones");

        jLabel16.setText("tiempo ensamblaje (segundos)");

        jLabel17.setText("4) SIstema de Infoentretenimiento");

        jLabel18.setText("Visor (si o no)");

        jLabel19.setText("Cantidad de pantallas");

        jLabel20.setText("ancho de pantalla principal");

        jLabel21.setText("tiempo ensamblaje (segundos)");

        jLabel22.setText("5) Asientos");

        jLabel23.setText("Material");

        jLabel24.setText("Electrico o manual?");

        jLabel25.setText("Masaje (si o no)");

        jLabel26.setText("tiempo ensamblaje (segundos)");

        jButton3.setText("GUARDAD AUTO");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearautosLayout = new javax.swing.GroupLayout(crearautos.getContentPane());
        crearautos.getContentPane().setLayout(crearautosLayout);
        crearautosLayout.setHorizontalGroup(
            crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearautosLayout.createSequentialGroup()
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearautosLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1))
                    .addGroup(crearautosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crearautosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crearautosLayout.createSequentialGroup()
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(crearautosLayout.createSequentialGroup()
                                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(crearautosLayout.createSequentialGroup()
                                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(crearautosLayout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tec, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crearautosLayout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(capacidadmaletero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(117, 117, 117)
                                                .addComponent(jLabel22)
                                                .addGap(8, 8, 8))
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearautosLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(38, 38, 38)))
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(materialasientos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(masaje, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(crearautosLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crearautosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(tipovolante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crearautosLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(materialmasusado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crearautosLayout.createSequentialGroup()
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidadbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tei, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crearautosLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(teb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(materialbateria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(26, 26, 26)
                                    .addComponent(cantidadpantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(28, 28, 28)
                                    .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anchopantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crearautosLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(vin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel8))
                                .addGroup(crearautosLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(343, 343, 343)
                                    .addComponent(jLabel17))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearautosLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(517, Short.MAX_VALUE)))
            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearautosLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel12)
                    .addContainerGap(593, Short.MAX_VALUE)))
        );
        crearautosLayout.setVerticalGroup(
            crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearautosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cantidadpantallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(materialbateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(teb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(anchopantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearautosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crearautosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(capacidadmaletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(materialasientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(tec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(crearautosLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(materialmasusado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(tipovolante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(crearautosLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel24)
                                            .addComponent(eom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(masaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25))
                                        .addGap(18, 18, 18)
                                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26)))))
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(cantidadbotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearautosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearautosLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(548, Short.MAX_VALUE)))
            .addGroup(crearautosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearautosLayout.createSequentialGroup()
                    .addGap(334, 334, 334)
                    .addComponent(jLabel12)
                    .addContainerGap(333, Short.MAX_VALUE)))
        );

        jLabel27.setText("Crear ensambladores");

        jLabel28.setText("ID");

        jLabel29.setText("NOMBRE");

        jLabel30.setText("genero");

        jLabel31.setText("edad");

        jButton4.setText("CREAR ENSAMBLADOR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearensambladoresLayout = new javax.swing.GroupLayout(crearensambladores.getContentPane());
        crearensambladores.getContentPane().setLayout(crearensambladoresLayout);
        crearensambladoresLayout.setHorizontalGroup(
            crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearensambladoresLayout.createSequentialGroup()
                .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearensambladoresLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel27))
                    .addGroup(crearensambladoresLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addGroup(crearensambladoresLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crearensambladoresLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(26, 26, 26)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(crearensambladoresLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearensambladoresLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
            .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearensambladoresLayout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );
        crearensambladoresLayout.setVerticalGroup(
            crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearensambladoresLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(40, 40, 40)
                .addComponent(jLabel29)
                .addGap(28, 28, 28)
                .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearensambladoresLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(273, Short.MAX_VALUE)))
            .addGroup(crearensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crearensambladoresLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        jlvehiculos.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jlvehiculos);

        jlensambladores.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jlensambladores);

        jLabel33.setText("Vehiculos");

        jLabel34.setText("Ensambladores");

        jButton5.setText("eliminar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("modificar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("eliminar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("modificar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("HACER ENSAMBLAJE");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel35.setText("Selecciona un auto y un ensamblador para poder hacer ensamblaje");

        jLabel32.setText("(dale click a uno de Vehiculos, y luego click a uno de Ensambladores, luego HACER ENSAMBLAJE)");

        jButton13.setText("Ver Vehiculos que se han ensamblado");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout verautosyensambladoresLayout = new javax.swing.GroupLayout(verautosyensambladores.getContentPane());
        verautosyensambladores.getContentPane().setLayout(verautosyensambladoresLayout);
        verautosyensambladoresLayout.setHorizontalGroup(
            verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(126, 126, 126))
            .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addGap(77, 77, 77))
            .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel35))
                    .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verautosyensambladoresLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verautosyensambladoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton13))
        );
        verautosyensambladoresLayout.setVerticalGroup(
            verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verautosyensambladoresLayout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(verautosyensambladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton6)
                        .addComponent(jButton8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(12, 12, 12))
        );

        jLabel36.setText("Ensamblaje");

        jLabel37.setText("Parte que se está ensamblando: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pieza Instalada", "Tiempo (milisegundos)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout ensamblajeLayout = new javax.swing.GroupLayout(ensamblaje.getContentPane());
        ensamblaje.getContentPane().setLayout(ensamblajeLayout);
        ensamblajeLayout.setHorizontalGroup(
            ensamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ensamblajeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(part, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ensamblajeLayout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ensamblajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(224, 224, 224))
        );
        ensamblajeLayout.setVerticalGroup(
            ensamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ensamblajeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel36)
                .addGap(28, 28, 28)
                .addGroup(ensamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(part, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel38.setText("Vehiculos que fallaron en el ensamblaje");

        javax.swing.GroupLayout vervehiculosfallidosLayout = new javax.swing.GroupLayout(vervehiculosfallidos.getContentPane());
        vervehiculosfallidos.getContentPane().setLayout(vervehiculosfallidosLayout);
        vervehiculosfallidosLayout.setHorizontalGroup(
            vervehiculosfallidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vervehiculosfallidosLayout.createSequentialGroup()
                .addGroup(vervehiculosfallidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vervehiculosfallidosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vervehiculosfallidosLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel38)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        vervehiculosfallidosLayout.setVerticalGroup(
            vervehiculosfallidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vervehiculosfallidosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel39.setText("Modificar Ensamblador");

        jLabel40.setText("nuevo ID");

        jLabel41.setText("nuevo genero");

        jLabel42.setText("nuevo nombre");

        jLabel43.setText("nueva edad");

        jButton12.setText("MODIFICAR ENSAMBLADOR");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificarensambladorLayout = new javax.swing.GroupLayout(modificarensamblador.getContentPane());
        modificarensamblador.getContentPane().setLayout(modificarensambladorLayout);
        modificarensambladorLayout.setHorizontalGroup(
            modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarensambladorLayout.createSequentialGroup()
                .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarensambladorLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel39))
                    .addGroup(modificarensambladorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modificarensambladorLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nedad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngenero, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(modificarensambladorLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        modificarensambladorLayout.setVerticalGroup(
            modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarensambladorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addGap(29, 29, 29)
                .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(ngenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(nedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel44.setText("Vehiculos que se han ensamblado");

        jList1.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jList1);

        javax.swing.GroupLayout vervehiculosensambladosLayout = new javax.swing.GroupLayout(vervehiculosensamblados.getContentPane());
        vervehiculosensamblados.getContentPane().setLayout(vervehiculosensambladosLayout);
        vervehiculosensambladosLayout.setHorizontalGroup(
            vervehiculosensambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vervehiculosensambladosLayout.createSequentialGroup()
                .addGroup(vervehiculosensambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vervehiculosensambladosLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel44))
                    .addGroup(vervehiculosensambladosLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        vervehiculosensambladosLayout.setVerticalGroup(
            vervehiculosensambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vervehiculosensambladosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel44)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog8Layout = new javax.swing.GroupLayout(jDialog8.getContentPane());
        jDialog8.getContentPane().setLayout(jDialog8Layout);
        jDialog8Layout.setHorizontalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog8Layout.setVerticalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar Ensambladores");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Agregar Vehiculos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton10.setText("Ver vehiculos/ensambladores, eliminar, modificar, hacer ensamblaje");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("Ver vehiculos que fallaron en ensamblaje");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton1)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //helpv = 0;
        if (helpv == 0) {
            Bateria b;
            b = new Bateria(Integer.parseInt(autonomia.getText()), materialbateria.getText(), Integer.parseInt(teb.getText()));
            Carroceria c;
            c = new Carroceria(tipo.getText(), Integer.parseInt(capacidadmaletero.getText()), Integer.parseInt(tec.getText()));
            Interior in;
            in = new Interior(materialmasusado.getText(), tipovolante.getText(), Integer.parseInt(cantidadbotones.getText()),
                    Integer.parseInt(tei.getText()));
            SistemaInfoentretenimiento sinf;
            sinf = new SistemaInfoentretenimiento(Integer.parseInt(cantidadpantallas.getText()), visor.getText(),
                    Integer.parseInt(anchopantalla.getText()), Integer.parseInt(tes.getText()));
            Asientos a;
            a = new Asientos(materialasientos.getText(), eom.getText(), masaje.getText(), Integer.parseInt(tea.getText()));
            Vehiculo ve = new Vehiculo(vin.getText(), color.getText(), b, c, in, sinf, a);
            vehiculos.add(ve);
            JOptionPane.showMessageDialog(null, "Creaste nuevo vehiculo");
            DefaultListModel modelo = (DefaultListModel) jlvehiculos.getModel();
            modelo.addElement(ve);
            jlvehiculos.setModel(modelo);
            File veh = new File("./vehiculos.txt");
            if (veh.exists()) {
                BufferedWriter bw = null;
                try {
                    bw = new BufferedWriter(new FileWriter(veh, true));
                    bw.write(ve.toString());
                    bw.newLine();
                    bw.flush();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el archivo");
            }
        } else {
            Bateria b;
            b = new Bateria(Integer.parseInt(autonomia.getText()), materialbateria.getText(), Integer.parseInt(teb.getText()));
            Carroceria c;
            c = new Carroceria(tipo.getText(), Integer.parseInt(capacidadmaletero.getText()), Integer.parseInt(tec.getText()));
            Interior in;
            in = new Interior(materialmasusado.getText(), tipovolante.getText(), Integer.parseInt(cantidadbotones.getText()),
                    Integer.parseInt(tei.getText()));
            SistemaInfoentretenimiento sinf;
            sinf = new SistemaInfoentretenimiento(Integer.parseInt(cantidadpantallas.getText()), visor.getText(),
                    Integer.parseInt(anchopantalla.getText()), Integer.parseInt(tes.getText()));
            Asientos a;
            a = new Asientos(materialasientos.getText(), eom.getText(), masaje.getText(), Integer.parseInt(tea.getText()));
            Vehiculo ve = new Vehiculo(vin.getText(), color.getText(), b, c, in, sinf, a);
            //vehiculos.add(ve);
            vehiculos.set(jlvehiculos.getSelectedIndex(), ve);
            //JOptionPane.showMessageDialog(null, "Modificaste vehiculo");
            DefaultListModel modelo = (DefaultListModel) jlvehiculos.getModel();
            //modelo.addElement(ve);
            if (jlvehiculos.getSelectedIndex() >= 0) {
                modelo.setElementAt(ve, jlvehiculos.getSelectedIndex());
                jlvehiculos.setModel(modelo);
                JOptionPane.showMessageDialog(null, "Modificaste el auto");
            }

        }


    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        verautosyensambladores.pack();
        verautosyensambladores.setModal(true);
        verautosyensambladores.setLocationRelativeTo(null);
        verautosyensambladores.setVisible(true);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        helpv = 0;
        if (helpv == 0) {
            jLabel1.setText("Crear Vehiculos");
            jButton3.setText("GUARDAR AUTO");
        }
        crearautos.pack();
        crearautos.setModal(true);
        crearautos.setLocationRelativeTo(null);
        crearautos.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        crearensambladores.pack();
        crearensambladores.setModal(true);
        crearensambladores.setLocationRelativeTo(null);
        crearensambladores.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        vervehiculosfallidos.pack();
        vervehiculosfallidos.setModal(true);
        vervehiculosfallidos.setLocationRelativeTo(null);
        vervehiculosfallidos.setVisible(true);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //String ID, String nombre, String genero, String edad
        Ensamblador e = new Ensamblador(id.getText(), name.getText(), gender.getText(), age.getText());
        ensambladores.add(e);
        JOptionPane.showMessageDialog(null, "Creaste el ensamblador!");
        DefaultListModel modelo = (DefaultListModel) jlensambladores.getModel();
        modelo.addElement(e);
        jlensambladores.setModel(modelo);
        File en = new File("./ensambladores.txt");
        if (en.exists()) {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(en, true));
                bw.write(e.toString());
                bw.newLine();
                bw.flush();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Algo salio mal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe el archivo");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (jlensambladores.getSelectedIndex() >= 0) {
            ensambladores.remove(jlensambladores.getSelectedIndex());
            DefaultListModel modelo = (DefaultListModel) jlensambladores.getModel();
            modelo.removeElementAt(jlensambladores.getSelectedIndex());
            jlensambladores.setModel(modelo);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if (jlvehiculos.getSelectedIndex() >= 0 && jlensambladores.getSelectedIndex() >= 0) {
            ClaseHilo h;
            //part.setText("Bateria");
            int bateria = vehiculos.get(jlvehiculos.getSelectedIndex()).getBateria().getTiempo() * 1000;
            int carroceria = vehiculos.get(jlvehiculos.getSelectedIndex()).getCarroceria().getTiempo() * 1000;
            int interior = vehiculos.get(jlvehiculos.getSelectedIndex()).getInterior().getTiempo() * 1000;
            int sinf = vehiculos.get(jlvehiculos.getSelectedIndex()).getSi().getTiempo() * 1000;
            int asientos = vehiculos.get(jlvehiculos.getSelectedIndex()).getAsientos().getTiempo() * 1000;
            h = new ClaseHilo(part, bateria, carroceria, interior, sinf, asientos, jTable1);
            h.start();
            ensamblaje.pack();
            ensamblaje.setModal(true);
            ensamblaje.setLocationRelativeTo(null);
            ensamblaje.setVisible(true);
            DefaultListModel modelo = (DefaultListModel) jlensambladores.getModel();
            ensambladores.get(jlensambladores.getSelectedIndex()).setCantidadvehiculosensamblados(1);
            modelo.setElementAt(ensambladores.get(jlensambladores.getSelectedIndex()),
                    jlensambladores.getSelectedIndex());
            
            DefaultListModel mode = (DefaultListModel)jList1.getModel();
            mode.addElement(jlvehiculos.getSelectedValue());
            jList1.setModel(mode);
            
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if (jlvehiculos.getSelectedIndex() >= 0) {
            vehiculos.remove(jlvehiculos.getSelectedIndex());
            DefaultListModel modelo = (DefaultListModel) jlvehiculos.getModel();
            modelo.removeElementAt(jlvehiculos.getSelectedIndex());
            jlvehiculos.setModel(modelo);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (jlvehiculos.getSelectedIndex() >= 0) {
            helpv = 1;
            if (helpv == 1) {
                jLabel1.setText("Modificar Vehiculos");
                jButton3.setText("MODIFICAR AUTO");
                vin.setText("");
                color.setText("");
                autonomia.setText("");
                materialbateria.setText("");
                teb.setText("");
                tipo.setText("");
                capacidadmaletero.setText("");
                tec.setText("");
                materialmasusado.setText("");
                tipovolante.setText("");
                cantidadbotones.setText("");
                tei.setText("");
                cantidadpantallas.setText("");
                visor.setText("");
                anchopantalla.setText("");
                tes.setText("");
                materialasientos.setText("");
                eom.setText("");
                masaje.setText("");
                tea.setText("");

                crearautos.pack();
                crearautos.setModal(true);
                crearautos.setLocationRelativeTo(null);
                crearautos.setVisible(true);

            }

        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (jlensambladores.getSelectedIndex() >= 0) {
            modificarensamblador.pack();
            modificarensamblador.setModal(true);
            modificarensamblador.setLocationRelativeTo(null);
            modificarensamblador.setVisible(true);

        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        Ensamblador en = new Ensamblador(nid.getText(), nnombre.getText(), ngenero.getText(), nedad.getText());
        ensambladores.set(jlensambladores.getSelectedIndex(), en);
        DefaultListModel modelo = (DefaultListModel) jlensambladores.getModel();
        modelo.setElementAt(en, jlensambladores.getSelectedIndex());
        jlensambladores.setModel(modelo);
        JOptionPane.showMessageDialog(null, "Modificaste el ensamblador!");
        nid.setText("");
        nnombre.setText("");
        ngenero.setText("");
        nedad.setText("");
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        vervehiculosensamblados.pack();
        vervehiculosensamblados.setModal(true);
        vervehiculosensamblados.setLocationRelativeTo(null);
        vervehiculosensamblados.setVisible(true);
        
    }//GEN-LAST:event_jButton13MouseClicked

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
            java.util.logging.Logger.getLogger(Examen2_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen2_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen2_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen2_AngelPonce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen2_AngelPonce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField anchopantalla;
    private javax.swing.JTextField autonomia;
    private javax.swing.JTextField cantidadbotones;
    private javax.swing.JTextField cantidadpantallas;
    private javax.swing.JTextField capacidadmaletero;
    private javax.swing.JTextField color;
    private javax.swing.JDialog crearautos;
    private javax.swing.JDialog crearensambladores;
    private javax.swing.JDialog ensamblaje;
    private javax.swing.JTextField eom;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog8;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> jlensambladores;
    private javax.swing.JList<String> jlvehiculos;
    private javax.swing.JTextField masaje;
    private javax.swing.JTextField materialasientos;
    private javax.swing.JTextField materialbateria;
    private javax.swing.JTextField materialmasusado;
    private javax.swing.JDialog modificarensamblador;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nedad;
    private javax.swing.JTextField ngenero;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField nnombre;
    private javax.swing.JLabel part;
    private javax.swing.JTextField tea;
    private javax.swing.JTextField teb;
    private javax.swing.JTextField tec;
    private javax.swing.JTextField tei;
    private javax.swing.JTextField tes;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField tipovolante;
    private javax.swing.JDialog verautosyensambladores;
    private javax.swing.JDialog vervehiculosensamblados;
    private javax.swing.JDialog vervehiculosfallidos;
    private javax.swing.JTextField vin;
    private javax.swing.JTextField visor;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private ArrayList<Ensamblador> ensambladores = new ArrayList();
}
