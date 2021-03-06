/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import com.unab.edu.dao.ClienteDao;
import com.unab.edu.dao.EmpleadoDao;
import com.unab.edu.entidades.Empleado;
import com.unab.edu.entidades.Cliente;
import com.unab.edu.entidades.Tablas;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 */
public class crudCliente extends javax.swing.JFrame {
//HolaSoyGerman
    /**
     *
     */
    public crudCliente() {
        initComponents();
        setLocationRelativeTo(this);
        MostrarClientes();
        //Ajustar el contenido de la Tabla
        Tablas.resizeColumnWidth(tbClientes,26,81);
        //CODIGO PARA VOLVER TRANSPARENTE LA TABLA
        Tablas.removeBackground(tbClientes, jScrollPane1);
        
    }
    
      void MostrarClientes() {
        String TITULOS[] = {"ID", "NOMBRE", "TIPO", "CONTACTO", "TELEFONO", "DIRECCION", "CORREO", "DUI", "NIT", "NRC"};
        DefaultTableModel modeloTabla = new DefaultTableModel(null, TITULOS);
        ClienteDao clienteDao = new ClienteDao();
        var listaEmpleados = clienteDao.MostrarClientes();
        String filas[] = new String[10];
        for (var iterarDatos : listaEmpleados) {
            filas[0] = String.valueOf(iterarDatos.getIdCliente());
            filas[1] = iterarDatos.getNombre();
            filas[2] = iterarDatos.getTipo();
            filas[3] = iterarDatos.getContacto();
            filas[4] = iterarDatos.getTelefono();
            filas[5] = iterarDatos.getDireccion();
            filas[6] = iterarDatos.getCorreo();
            filas[7] = iterarDatos.getDui();
            filas[8] = iterarDatos.getNit();
            filas[9] = iterarDatos.getNrc();
            modeloTabla.addRow(filas);
        }
        tbClientes.setModel(modeloTabla);
    }
       void Limpiar() {
        txtNombreCliente.setText("");
        txtDireccion.setText("");
        txtCorreoCliente.setText("");;
        txtContactoCliente.setText("");
        txtTelefonoCliente.setText("");
        txtTipoCliente.setText("");
        txtNitCliente.setText("");
        txtNrcCliente.setText("");
        txtDuiCliente.setText("");
        lblIdCliente.setText("");
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoCliente1 = new javax.swing.JLabel();
        pnMenu = new javax.swing.JTabbedPane();
        tbDatos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblIdCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblContactoCliente = new javax.swing.JLabel();
        txtContactoCliente = new javax.swing.JTextField();
        lblTipoCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        lblTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblCorreoCliente = new javax.swing.JLabel();
        txtNitCliente = new javax.swing.JTextField();
        lblNitCliente = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        lblNrcCliente = new javax.swing.JLabel();
        txtNrcCliente = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtTipoCliente = new javax.swing.JTextField();
        btnElminar1 = new javax.swing.JButton();
        lblTipoCliente2 = new javax.swing.JLabel();
        txtDuiCliente = new javax.swing.JTextField();
        lblNombreCliente1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbListado = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();

        lblTipoCliente1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTipoCliente1.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCliente1.setText("Tipo:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedor");

        pnMenu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);

        lblIdCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(255, 255, 255));

        txtNombreCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lblContactoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContactoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblContactoCliente.setText("Contacto:");

        txtContactoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lblTipoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTipoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCliente.setText("Tipo:");

        lblDireccionCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDireccionCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccionCliente.setText("Dirección:");

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        lblTelefonoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTelefonoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonoCliente.setText("Teléfono:");

        txtTelefonoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lblCorreoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCorreoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoCliente.setText("Correo:");

        txtNitCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lblNitCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNitCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNitCliente.setText("NIT:");

        txtCorreoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lblNrcCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNrcCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNrcCliente.setText("NRC:");

        txtNrcCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        btnGuardarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtTipoCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        btnElminar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnElminar1.setText("Eliminar");
        btnElminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElminar1ActionPerformed(evt);
            }
        });

        lblTipoCliente2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTipoCliente2.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCliente2.setText("Dui");

        txtDuiCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lblNombreCliente1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNombreCliente1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCliente1.setText("Nombre:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorreoCliente)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1))
                            .addComponent(lblCorreoCliente)
                            .addComponent(lblDireccionCliente)
                            .addComponent(txtDuiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoCliente2))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGuardarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnElminar1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblContactoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(lblIdCliente))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addComponent(txtContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonoCliente)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNitCliente)
                            .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNrcCliente)
                            .addComponent(txtNrcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoCliente)
                            .addComponent(txtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(lblNombreCliente1)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblContactoCliente))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIdCliente)))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContactoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoCliente)
                    .addComponent(lblDireccionCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNitCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNrcCliente))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoCliente2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNrcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTipoCliente)
                        .addGap(6, 6, 6)
                        .addComponent(txtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtDuiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lblCorreoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnElminar1)
                    .addComponent(btnLimpiar))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(lblNombreCliente1)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        javax.swing.GroupLayout tbDatosLayout = new javax.swing.GroupLayout(tbDatos);
        tbDatos.setLayout(tbDatosLayout);
        tbDatosLayout.setHorizontalGroup(
            tbDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbDatosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tbDatosLayout.setVerticalGroup(
            tbDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnMenu.addTab("DATOS", tbDatos);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setOpaque(false);

        jScrollPane3.setOpaque(false);

        tbClientes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbClientes.setOpaque(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbClientes);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 410));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.jpg"))); // NOI18N
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        javax.swing.GroupLayout tbListadoLayout = new javax.swing.GroupLayout(tbListado);
        tbListado.setLayout(tbListadoLayout);
        tbListadoLayout.setHorizontalGroup(
            tbListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbListadoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tbListadoLayout.setVerticalGroup(
            tbListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbListadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnMenu.addTab("LISTADO", tbListado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        //Obteniendo los datos del Formulario
        cliente.setNombre(txtNombreCliente.getText());
        cliente.setTipo(txtTipoCliente.getText());
        cliente.setContacto(txtContactoCliente.getText());
        cliente.setTelefono(txtTelefonoCliente.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setCorreo(txtCorreoCliente.getText());
        cliente.setDui(txtDuiCliente.getText());
        cliente.setNit(txtNitCliente.getText());
        cliente.setNrc(txtNrcCliente.getText());
        if (cliente.getNombre().equals("") || cliente.getTipo().equals("") || cliente.getContacto().equals("")
                || cliente.getTelefono().equals("") || cliente.getDireccion().equals("") || cliente.getCorreo().equals("")
                || cliente.getDui().equals("") || cliente.getNit().equals("") || cliente.getNrc().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar los Campos!", "Advertencia", 2);
        } else if (lblIdCliente.getText().isEmpty()) {
            clienteDao.AgregarCliente(cliente);
        } else {
            cliente.setIdCliente(Integer.parseInt(lblIdCliente.getText()));
            clienteDao.ActualizarCliente(cliente);
        }
        MostrarClientes();
        Limpiar();
                               
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnElminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminar1ActionPerformed
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setIdCliente(Integer.parseInt(lblIdCliente.getText()));
        clienteDao.EliminarCliente(cliente);
        MostrarClientes();
        Limpiar();
    }//GEN-LAST:event_btnElminar1ActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        pnMenu.setSelectedIndex(pnMenu.indexOfComponent(tbDatos));
        //Obtener la fila seleccionada
        int fila = tbClientes.getSelectedRow();
        //Capturando los datos de la fila seleccionada "IDEMPLEADO", "NOMBRE", "APELLIDO","SEXO", "DIRECCIÓN","TELÉFONO", "DUI", "NIT","CARGO","DEPARTAMENTO"
        String IdCliente = String.valueOf(tbClientes.getValueAt(fila, 0));
        String Nombre = String.valueOf(tbClientes.getValueAt(fila, 1));
        String Tipo = String.valueOf(tbClientes.getValueAt(fila, 2));
        String Contacto = String.valueOf(tbClientes.getValueAt(fila, 3));
        String Telefono = String.valueOf(tbClientes.getValueAt(fila, 4));
        String Direccion = String.valueOf(tbClientes.getValueAt(fila, 5));
        String Correo = String.valueOf(tbClientes.getValueAt(fila, 6));
        String Dui = String.valueOf(tbClientes.getValueAt(fila, 7));
        String Nit = String.valueOf(tbClientes.getValueAt(fila, 8));
        String Nrc = String.valueOf(tbClientes.getValueAt(fila, 9));
        lblIdCliente.setText(IdCliente);
        txtNombreCliente.setText(Nombre);
        txtTipoCliente.setText(Tipo);
        txtContactoCliente.setText(Contacto);
        txtTelefonoCliente.setText(Telefono);
        txtDireccion.setText(Direccion);
        txtCorreoCliente.setText(Correo);
        txtDuiCliente.setText(Dui);
        txtNitCliente.setText(Nit);
        txtNrcCliente.setText(Nrc);
    }//GEN-LAST:event_tbClientesMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar1;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblContactoCliente;
    private javax.swing.JLabel lblCorreoCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNitCliente;
    private javax.swing.JLabel lblNombreCliente1;
    private javax.swing.JLabel lblNrcCliente;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTipoCliente;
    private javax.swing.JLabel lblTipoCliente1;
    private javax.swing.JLabel lblTipoCliente2;
    private javax.swing.JTabbedPane pnMenu;
    private javax.swing.JTable tbClientes;
    private javax.swing.JPanel tbDatos;
    private javax.swing.JPanel tbListado;
    private javax.swing.JTextField txtContactoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtDuiCliente;
    private javax.swing.JTextField txtNitCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNrcCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTipoCliente;
    // End of variables declaration//GEN-END:variables
}
