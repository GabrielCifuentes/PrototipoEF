/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslados.vista;



import traslados.Modelo.daoBodega;
import traslados.controlador.clsBodega;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;

/**
 *
 * @author visitante
 */
public class frmMantenimientobodega extends javax.swing.JInternalFrame {

    
     
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Concepto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        daoBodega cDAO = new daoBodega();
        List<clsBodega> c = cDAO.select();
        tablaLineas.setModel(modelo);
        String[] dato = new String[6];
        for (int i = 0; i < c.size(); i++) {
            dato[0] = Integer.toString(c.get(i).getId_bodega());
            dato[1] = c.get(i).getNombre_bodega();
            dato[2] = c.get(i).getDireccion_bodega();
            dato[3] = c.get(i).getTipo_bodega();
            dato[4] = c.get(i).getEstatus_bodega();

            dato[5] = Integer.toString(c.get(i).getId_empresa());
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscaraplicacion() {
        clsBodega cAConsultar = new clsBodega();
        daoBodega cDAO = new daoBodega();
        cAConsultar.setId_bodega(Integer.parseInt(txtbuscado.getText()));
        cAConsultar = cDAO.query(cAConsultar);
        txtNombre1.setText(cAConsultar.getNombre_bodega());
         txtdireccion1.setText(cAConsultar.getDireccion_bodega());
          txtbodega1.setText(cAConsultar.getTipo_bodega());
         txtestatus1.setText(cAConsultar.getEstatus_bodega());
         txtempresa.setText(Integer.toString(cAConsultar.getId_empresa()));
    }

    public frmMantenimientobodega() {
        initComponents();
        llenadoDeTablas();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        txtempresa = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLineas = new javax.swing.JTable();
        cbox_lineas = new javax.swing.JComboBox<>();
        label4 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        txtdireccion1 = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        txtbodega1 = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        txtestatus1 = new javax.swing.JTextField();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Bodegas");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 331, 95, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 331, 95, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 374, 95, -1));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Bodegas");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 0, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 331, 95, -1));

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Id empresa");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        getContentPane().add(txtbuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 375, 102, -1));

        txtempresa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtempresa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtempresa.setOpaque(false);
        getContentPane().add(txtempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 374, 95, -1));

        tablaLineas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaLineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Bodega", "Nombre", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaLineas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 96, 633, 303));

        cbox_lineas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_lineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_lineasActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_lineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 417, 263, -1));

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setText("Bodegas");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 421, -1, -1));

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");
        getContentPane().add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 20, 13, -1));

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 417, -1, -1));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Id Bodega");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 43, -1, -1));

        txtid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtid.setOpaque(false);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 43, 110, -1));

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("Nombre");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 73, -1, -1));

        txtNombre1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtNombre1.setOpaque(false);
        getContentPane().add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 20));

        label8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label8.setText("Direccion");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtdireccion1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtdireccion1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtdireccion1.setOpaque(false);
        getContentPane().add(txtdireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 110, -1));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("Tipo Bodega");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtbodega1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtbodega1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtbodega1.setOpaque(false);
        getContentPane().add(txtbodega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, -1));

        label10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label10.setText("Estatus");
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtestatus1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtestatus1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtestatus1.setOpaque(false);
        getContentPane().add(txtestatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        daoBodega cDAO = new daoBodega();
        clsBodega cAEliminar = new clsBodega();
        cAEliminar.setId_bodega(Integer.parseInt(txtbuscado.getText()));
        cDAO.delete(cAEliminar);
       
        llenadoDeTablas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        daoBodega cDAO = new daoBodega();
        clsBodega cAInsertar = new clsBodega();
            
         cAInsertar.setId_bodega(Integer.parseInt(txtid.getText()));
        cAInsertar.setNombre_bodega(txtNombre1.getText());
        cAInsertar.setDireccion_bodega(txtdireccion1.getText());
        cAInsertar.setTipo_bodega(txtbodega1.getText());
        cAInsertar.setEstatus_bodega(txtestatus1.getText());
        
         cAInsertar.setId_empresa(Integer.parseInt(txtempresa.getText()));
        
 
        cDAO.insert(cAInsertar);
        
        
        
        llenadoDeTablas();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscaraplicacion();
        
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
//        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cbox_lineas.setSelectedIndex(0);
        txtempresa.setText("");
        txtbuscado.setText("");
 
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbox_lineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_lineasActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_lineasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\ayudas\\ProcesoMayor.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ayudas\\ProcesoMayor.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no Fue encontrada");
            }
            System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_lineas;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaLineas;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtbodega1;
    private javax.swing.JTextField txtbuscado;
    private javax.swing.JTextField txtdireccion1;
    private javax.swing.JTextField txtempresa;
    private javax.swing.JTextField txtestatus1;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
