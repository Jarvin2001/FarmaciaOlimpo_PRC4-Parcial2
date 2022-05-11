/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_olimpo_p2_prc4.formularios;

import farmacia_olimpo_p2_prc4.clases.Clientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jarvi
 */
public class frmMantenimientoClientes extends javax.swing.JFrame {

     Clientes cli = new Clientes();
     DefaultTableModel modelo = new DefaultTableModel();
     
    public frmMantenimientoClientes() {
        initComponents();
         CargarDatosLocal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMantenimientoEmpleados = new javax.swing.JLabel();
        lblEnEstaVentana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantenimientoClientes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        btnEliminar2 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        lblLimpiar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        lblDerecho = new javax.swing.JLabel();
        lblBuscartxt = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        spBuscar = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        spNombre = new javax.swing.JSeparator();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        spApellido = new javax.swing.JSeparator();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        spTelefono = new javax.swing.JSeparator();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        spDireccion = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        spEmail = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        lblfooter = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        spTelefono1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMantenimientoEmpleados.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        lblMantenimientoEmpleados.setForeground(new java.awt.Color(0, 0, 153));
        lblMantenimientoEmpleados.setText("Mantenimiento Clientes");
        jPanel1.add(lblMantenimientoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 860, 90));

        lblEnEstaVentana.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblEnEstaVentana.setForeground(new java.awt.Color(153, 153, 153));
        lblEnEstaVentana.setText("En esta ventana podras Agregar, Modificar y Eliminar clientes de tu sistema");
        jPanel1.add(lblEnEstaVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 850, -1));

        tblMantenimientoClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblMantenimientoClientes.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tblMantenimientoClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idclientes", "Nombre", "Apellido", "Telefono", "Direccion", "Correo Electronico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMantenimientoClientes.setGridColor(new java.awt.Color(0, 0, 153));
        tblMantenimientoClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMantenimientoClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMantenimientoClientes);
        if (tblMantenimientoClientes.getColumnModel().getColumnCount() > 0) {
            tblMantenimientoClientes.getColumnModel().getColumn(0).setResizable(false);
            tblMantenimientoClientes.getColumnModel().getColumn(1).setResizable(false);
            tblMantenimientoClientes.getColumnModel().getColumn(2).setResizable(false);
            tblMantenimientoClientes.getColumnModel().getColumn(3).setResizable(false);
            tblMantenimientoClientes.getColumnModel().getColumn(4).setResizable(false);
            tblMantenimientoClientes.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 1080, 350));

        btnAgregar.setBackground(new java.awt.Color(0, 102, 255));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        lblAgregar1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar1.setText("Agregar");
        lblAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAgregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 120, 30));

        btnModificar.setBackground(new java.awt.Color(0, 102, 255));

        lblModificar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(255, 255, 255));
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("Modificar");
        lblModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 120, 30));

        btnEliminar2.setBackground(new java.awt.Color(0, 102, 255));

        lblEliminar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEliminar2Layout = new javax.swing.GroupLayout(btnEliminar2);
        btnEliminar2.setLayout(btnEliminar2Layout);
        btnEliminar2Layout.setHorizontalGroup(
            btnEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminar2Layout.createSequentialGroup()
                .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEliminar2Layout.setVerticalGroup(
            btnEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        lblLimpiar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("Limpiar");
        lblLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, -1));

        btnRegresar.setBackground(new java.awt.Color(0, 102, 255));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        Regresar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regresar.setText("<   Regresar");
        Regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel1.add(lblDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 50, 780));

        lblBuscartxt.setBackground(new java.awt.Color(102, 102, 102));
        lblBuscartxt.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblBuscartxt.setForeground(new java.awt.Color(102, 102, 102));
        lblBuscartxt.setText("Buscar");
        jPanel1.add(lblBuscartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        txtBuscar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 310, 30));
        jPanel1.add(spBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, 10));

        lblNombre.setBackground(new java.awt.Color(102, 102, 102));
        lblNombre.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, -1));

        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 430, 30));
        jPanel1.add(spNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 440, 10));

        lblApellido.setBackground(new java.awt.Color(102, 102, 102));
        lblApellido.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido.setText("Apellido");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, -1));

        txtApellido.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 430, 30));
        jPanel1.add(spApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 440, 10));

        lblTelefono.setBackground(new java.awt.Color(102, 102, 102));
        lblTelefono.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(102, 102, 102));
        lblTelefono.setText("Teléfono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 150, -1));

        txtTelefono.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 430, 30));
        jPanel1.add(spTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 440, 10));

        lblDireccion.setBackground(new java.awt.Color(102, 102, 102));
        lblDireccion.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(102, 102, 102));
        lblDireccion.setText("Dirección");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 150, -1));

        txtDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setBorder(null);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 430, 30));
        jPanel1.add(spDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 440, 10));

        lblEmail.setBackground(new java.awt.Color(102, 102, 102));
        lblEmail.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblEmail.setText("Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 150, -1));

        txtEmail.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 430, 30));
        jPanel1.add(spEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 440, 10));

        btnBuscar.setBackground(new java.awt.Color(0, 102, 255));

        lblBuscar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");
        lblBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 90, -1));
        jPanel1.add(lblfooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1130, 40));

        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 0));
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setBorder(null);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 110, 40));
        jPanel1.add(spTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 110, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtid.setText("");
        txtBuscar.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
       
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed

    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
      
    }//GEN-LAST:event_RegresarMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tblMantenimientoClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantenimientoClientesMouseClicked
        // Get The Index Of The Slected Row
        int i = tblMantenimientoClientes.getSelectedRow();
        TableModel model = tblMantenimientoClientes.getModel();
        this.txtid.enable(false);
        this.txtid.setText(model.getValueAt(i, 0).toString());
        this.txtNombre.setText(model.getValueAt(i, 1).toString());
        this.txtApellido.setText(model.getValueAt(i, 2).toString());
        this.txtTelefono.setText(model.getValueAt(i, 3).toString());
        this.txtDireccion.setText(model.getValueAt(i, 4).toString());
        this.txtEmail.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_tblMantenimientoClientesMouseClicked

    private void lblAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregar1MouseClicked
        String resultado;
        cli.setNombre(this.txtNombre.getText());
        cli.setApellido(this.txtApellido.getText());
        cli.setTelefono(Integer.valueOf(this.txtTelefono.getText()));
        cli.setDireccion(this.txtDireccion.getText());
        cli.setEmail(this.txtEmail.getText());
        resultado = cli.NuevoCliente();
        CargarDatosLocal();
    }//GEN-LAST:event_lblAgregar1MouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
       String resultado;
        cli.setNombre(this.txtNombre.getText());
        cli.setApellido(this.txtApellido.getText());
        cli.setTelefono(Integer.valueOf(this.txtTelefono.getText()));
        cli.setDireccion(this.txtDireccion.getText());
        cli.setEmail(this.txtEmail.getText());
        resultado = cli.NuevoCliente();
        CargarDatosLocal();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked
       String resultado = null;
        resultado = cli.ModificarDatos(
                Integer.parseInt(txtid.getText()),
                txtNombre.getText(),
                txtApellido.getText(),
                Integer.parseInt(txtTelefono.getText()),
                txtDireccion.getText(),
                txtEmail.getText());
        CargarDatosLocal();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_lblModificarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        String resultado = null;
        resultado = cli.EliminarDatos(Integer.parseInt(txtid.getText()));
        CargarDatosLocal();
    }//GEN-LAST:event_lblEliminarMouseClicked

    
    public void CargarDatosLocal() {
        tblMantenimientoClientes.setModel(cli.CargarDatos());
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
            java.util.logging.Logger.getLogger(frmMantenimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMantenimientoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Regresar;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEliminar2;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregar1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscartxt;
    private javax.swing.JLabel lblDerecho;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnEstaVentana;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblMantenimientoEmpleados;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblfooter;
    private javax.swing.JSeparator spApellido;
    private javax.swing.JSeparator spBuscar;
    private javax.swing.JSeparator spDireccion;
    private javax.swing.JSeparator spEmail;
    private javax.swing.JSeparator spNombre;
    private javax.swing.JSeparator spTelefono;
    private javax.swing.JSeparator spTelefono1;
    private javax.swing.JTable tblMantenimientoClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
