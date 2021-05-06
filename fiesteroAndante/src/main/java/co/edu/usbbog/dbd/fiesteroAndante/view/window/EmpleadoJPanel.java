package co.edu.usbbog.dbd.fiesteroAndante.view.window;

import co.edu.usbbog.dbd.fiesteroAndante.model.EmpleadoDTO;
import co.edu.usbbog.dbd.fiesteroAndante.view.frame.ClienteAppJFrame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmpleadoJPanel extends javax.swing.JPanel {
private ClienteAppJFrame appJframe;
    /**
     * Creates new form Empleados
     * @param appJframe
     */
    public EmpleadoJPanel(ClienteAppJFrame appJframe) {
        this.appJframe = appJframe;
        initComponents();
        this.cargarDatos();
        
    }
    
    private void cargarDatos() {

        List<EmpleadoDTO> empleados = this.appJframe.mostrarEmpleados();
        DefaultTableModel model = (DefaultTableModel) jTableEmpleados.getModel();
        model.setRowCount(0);
        for (EmpleadoDTO empleado : empleados) {
            model.addRow(new Object[]{empleado.getId_empleado(), empleado.getNombre_empleado(),
                empleado.getProfesion_empleado(), empleado.getTelefono_empleado(), empleado.getCorreo_empleado(),
                empleado.getSalario_empleado(), empleado.getCargo(), empleado.getSucursal().getId_sucursal()});
        }

        jComboBoxSucursal.removeAllItems();
        jComboBoxSucursal.addItem("Sucursal");
        for (EmpleadoDTO empleado : empleados) {
            jComboBoxSucursal.addItem(empleado.getSucursal().getId_sucursal() + "");
        }
    }

    private void limpiar() {
        Id_Emp.setText("");
        NombreEmp.setText("");
        ProfesionEmp.setText("");
        TelefonoEmp.setText("");
        CorreoEmp.setText("");
        SalarioEmp.setText("");
        CargoEmp.setText("");
        jComboBoxSucursal.setSelectedIndex(0);
    }

    private boolean validar() {
        return !(Id_Emp.getText().equals("")
                || NombreEmp.getText().equals("")
                || ProfesionEmp.getText().equals("")
                || TelefonoEmp.getText().equals("")
                || CorreoEmp.getText().equals("")
                || SalarioEmp.getText().equals("")
                || CargoEmp.getText().equals(""))
                || jComboBoxSucursal.getSelectedIndex() == 0;
    }

    private void crearEmpleado() {
        if (this.validar()) {
            try {
                String salida = this.appJframe.crearEmpleados(
                        Integer.parseInt(Id_Emp.getText()),
                        NombreEmp.getText(),
                        ProfesionEmp.getText(),
                        Integer.parseInt(TelefonoEmp.getText()),
                        CorreoEmp.getText(),
                        Double.parseDouble(SalarioEmp.getText()),
                        CargoEmp.getText(),
                        Integer.parseInt(jComboBoxSucursal.getItemAt(jComboBoxSucursal.getSelectedIndex())));
                JOptionPane.showMessageDialog(null, salida, "Crear Empleado", 1);
                this.cargarDatos();
                this.limpiar();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Los campos de id_empleado, telefono y saldo deben ser numéricos", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", 2);
        }
    }

    private void actualizarEmpleado() {
        if (this.validar()) {
            try {
                String salida = this.appJframe.modificarEmpleado(
                        Integer.parseInt(Id_Emp.getText()),
                        NombreEmp.getText(),
                        ProfesionEmp.getText(),
                        Integer.parseInt(TelefonoEmp.getText()),
                        CorreoEmp.getText(),
                        Double.parseDouble(SalarioEmp.getText()),
                        CargoEmp.getText(),
                        Integer.parseInt(jComboBoxSucursal.getItemAt(jComboBoxSucursal.getSelectedIndex())));
                JOptionPane.showMessageDialog(null, salida, "Modificar Empleado", 1);
                this.cargarDatos();
                this.limpiar();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Los campos de id_empleado, telefono y saldo deben ser numéricos", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", 2);
        }
    }
    
    private void eliminarEmpleado() {
        if (!Id_Emp.getText().equals("")) {
            try {
                String salida = this.appJframe.eliminarEmpleado(Integer.parseInt(Id_Emp.getText()));
                JOptionPane.showMessageDialog(null, salida, "Eliminar Empleado", 1);
                this.cargarDatos();
                this.limpiar();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El número de teléfono debe ser un valor numérico", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de teléfono", "ERROR", 2);
        }
    }

    private void buscarEmpleado() {
        if (!Id_Emp.getText().equals("")) {
            try {
                EmpleadoDTO empleado = this.appJframe.buscarEmpleado(Integer.parseInt(Id_Emp.getText()));
                if (empleado != null) {
                    JOptionPane.showMessageDialog(null, "Encontrado", "Buscar Empleado", 1);
                    NombreEmp.setText(empleado.getNombre_empleado());
                    ProfesionEmp.setText(empleado.getProfesion_empleado());
                    TelefonoEmp.setText(empleado.getTelefono_empleado() + "");
                    CorreoEmp.setText(empleado.getCorreo_empleado());
                    SalarioEmp.setText(empleado.getSalario_empleado() + "");
                    CargoEmp.setText(empleado.getCargo());
                    for (int i = 0; i < jComboBoxSucursal.getItemCount(); i++) {
                        if (jComboBoxSucursal.getItemAt(i).equals(empleado.getSucursal().getId_sucursal() + "")) {
                            jComboBoxSucursal.setSelectedIndex(i);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No encontrado", "Buscar Empleado", 1);
                    this.limpiar();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El número de id_empleado debe ser un valor numérico", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de id_empleado", "ERROR", 2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CargoEmp = new javax.swing.JTextField();
        TelefonoEmp = new javax.swing.JTextField();
        CorreoEmp = new javax.swing.JTextField();
        NombreEmp = new javax.swing.JTextField();
        Id_Emp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        BuscarEmp = new javax.swing.JButton();
        EliminarEmp = new javax.swing.JButton();
        jComboBoxSucursal = new javax.swing.JComboBox<>();
        ActualizarEmp = new javax.swing.JButton();
        MenuEmp = new javax.swing.JButton();
        CrearEmp = new javax.swing.JButton();
        ProfesionEmp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SalarioEmp = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 350, 10));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sucursal");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cédula");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        CargoEmp.setBackground(new java.awt.Color(255, 255, 255));
        CargoEmp.setForeground(new java.awt.Color(0, 0, 0));
        CargoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargoEmpActionPerformed(evt);
            }
        });
        add(CargoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 160, -1));

        TelefonoEmp.setBackground(new java.awt.Color(255, 255, 255));
        TelefonoEmp.setForeground(new java.awt.Color(0, 0, 0));
        TelefonoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoEmpActionPerformed(evt);
            }
        });
        add(TelefonoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 160, -1));

        CorreoEmp.setBackground(new java.awt.Color(255, 255, 255));
        CorreoEmp.setForeground(new java.awt.Color(0, 0, 0));
        CorreoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoEmpActionPerformed(evt);
            }
        });
        add(CorreoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, -1));

        NombreEmp.setBackground(new java.awt.Color(255, 255, 255));
        NombreEmp.setForeground(new java.awt.Color(0, 0, 0));
        NombreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEmpActionPerformed(evt);
            }
        });
        add(NombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        Id_Emp.setBackground(new java.awt.Color(255, 255, 255));
        Id_Emp.setForeground(new java.awt.Color(0, 0, 0));
        Id_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_EmpActionPerformed(evt);
            }
        });
        add(Id_Emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, -1));

        jTableEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        jTableEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Profesion", "Teléfono", "Correo", "Salario", "Cargo", "Sucursal"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpleados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 590, 90));

        BuscarEmp.setBackground(new java.awt.Color(0, 0, 0));
        BuscarEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BuscarEmp.setForeground(new java.awt.Color(255, 255, 255));
        BuscarEmp.setText("Buscar");
        BuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEmpActionPerformed(evt);
            }
        });
        add(BuscarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 120, 30));

        EliminarEmp.setBackground(new java.awt.Color(0, 0, 0));
        EliminarEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        EliminarEmp.setForeground(new java.awt.Color(255, 255, 255));
        EliminarEmp.setText("Eliminar");
        EliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEmpActionPerformed(evt);
            }
        });
        add(EliminarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 100, -1));

        jComboBoxSucursal.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxSucursal.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sucursal" }));
        jComboBoxSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSucursalActionPerformed(evt);
            }
        });
        add(jComboBoxSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 160, -1));

        ActualizarEmp.setBackground(new java.awt.Color(0, 0, 0));
        ActualizarEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ActualizarEmp.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarEmp.setText("Actualizar");
        ActualizarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarEmpActionPerformed(evt);
            }
        });
        add(ActualizarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 130, -1));

        MenuEmp.setBackground(new java.awt.Color(0, 0, 0));
        MenuEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MenuEmp.setForeground(new java.awt.Color(255, 255, 255));
        MenuEmp.setText("Ir a menú");
        MenuEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEmpActionPerformed(evt);
            }
        });
        add(MenuEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 110, -1));

        CrearEmp.setBackground(new java.awt.Color(0, 0, 0));
        CrearEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CrearEmp.setForeground(new java.awt.Color(255, 255, 255));
        CrearEmp.setText("Crear");
        CrearEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEmpActionPerformed(evt);
            }
        });
        add(CrearEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 80, -1));

        ProfesionEmp.setBackground(new java.awt.Color(255, 255, 255));
        ProfesionEmp.setForeground(new java.awt.Color(0, 0, 0));
        ProfesionEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesionEmpActionPerformed(evt);
            }
        });
        add(ProfesionEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 140, -1));

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Profesión");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salario");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        SalarioEmp.setBackground(new java.awt.Color(255, 255, 255));
        SalarioEmp.setForeground(new java.awt.Color(0, 0, 0));
        SalarioEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioEmpActionPerformed(evt);
            }
        });
        add(SalarioEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 160, -1));
        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEmpActionPerformed
        this.buscarEmpleado();
    }//GEN-LAST:event_BuscarEmpActionPerformed

    private void ActualizarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarEmpActionPerformed
        this.actualizarEmpleado();
    }//GEN-LAST:event_ActualizarEmpActionPerformed

    private void ProfesionEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesionEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfesionEmpActionPerformed

    private void Id_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_EmpActionPerformed

    private void NombreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEmpActionPerformed

    private void CorreoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoEmpActionPerformed

    private void TelefonoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoEmpActionPerformed

    private void SalarioEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioEmpActionPerformed

    private void CargoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargoEmpActionPerformed

    private void jComboBoxSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSucursalActionPerformed

    private void CrearEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEmpActionPerformed
        this.crearEmpleado();
    }//GEN-LAST:event_CrearEmpActionPerformed

    private void EliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEmpActionPerformed
        this.eliminarEmpleado();
    }//GEN-LAST:event_EliminarEmpActionPerformed

    private void MenuEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEmpActionPerformed
      this.appJframe. irDeEmpleadoAMenu(this);
    }//GEN-LAST:event_MenuEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarEmp;
    private javax.swing.JButton BuscarEmp;
    private javax.swing.JTextField CargoEmp;
    private javax.swing.JTextField CorreoEmp;
    private javax.swing.JButton CrearEmp;
    private javax.swing.JButton EliminarEmp;
    private javax.swing.JTextField Id_Emp;
    private javax.swing.JButton MenuEmp;
    private javax.swing.JTextField NombreEmp;
    private javax.swing.JTextField ProfesionEmp;
    private javax.swing.JTextField SalarioEmp;
    private javax.swing.JTextField TelefonoEmp;
    private javax.swing.JComboBox<String> jComboBoxSucursal;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEmpleados;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
