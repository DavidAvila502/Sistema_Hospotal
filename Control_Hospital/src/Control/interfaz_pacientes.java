/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dolar
 */
public class interfaz_pacientes extends javax.swing.JInternalFrame {
    
    conexion     conex = new conexion();
    consultas_hospital cons = new consultas_hospital();
    
     boolean   lb_nuevo=false;
    
     int ll_id;
     String ls_nombre,ls_direccion,ls_telefono;
     

     
     
     
    /**
     * Creates new form interfaz_pasientes
     */
    public interfaz_pacientes() {
        initComponents();
        
         mostrarDatosConTableModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_direccion = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_alta = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        miTabla2=new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){

                return false;

            }

        };
        miTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Direccion", "Telefono"
            }
        ));
        miTabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miTabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(miTabla2);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PACIENTES");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setText("id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Dirección");

        jLabel4.setText("Telefono");

        jtf_id.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(36, 36, 36))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_direccion)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        btn_alta.setText("Alta");
        btn_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaActionPerformed(evt);
            }
        });

        btn_grabar.setText("Grabar");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_alta)
                .addGap(74, 74, 74)
                .addComponent(btn_grabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(62, 62, 62)
                .addComponent(btn_eliminar)
                .addGap(68, 68, 68)
                .addComponent(btn_salir)
                .addGap(86, 86, 86))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alta)
                    .addComponent(btn_grabar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_salir))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        Limpiar();
        
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaActionPerformed
        // TODO add your handling code here:
        
        lb_nuevo=true;
        Limpiar();
        
        
    }//GEN-LAST:event_btn_altaActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        // TODO add your handling code here:
        
        ll_id=0;
        ls_nombre  =  jtf_nombre.getText();
        ls_direccion  = jtf_direccion.getText();
        ls_telefono = jtf_telefono.getText();
        
        
        if(lb_nuevo){
        
        cons.registrarPACIENTE(1,ll_id , ls_nombre, ls_direccion, ls_telefono, conex);
        
        
        
        
        }else{
        
        ll_id=Integer.parseInt(jtf_id.getText());      
        
        cons.registrarPACIENTE(2,ll_id , ls_nombre, ls_direccion, ls_telefono, conex);
        
        
        }
        
        mostrarDatosConTableModel();
        Limpiar();
        
        
        
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        ll_id =Integer.parseInt(jtf_id.getText());
        
        cons.registrarPACIENTE(3,ll_id , ls_nombre, ls_direccion, ls_telefono, conex);
        
         mostrarDatosConTableModel();
        Limpiar();
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void miTabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miTabla2MouseClicked
        // TODO add your handling code here:
        
        int fila =miTabla2.getSelectedRow();
        
        jtf_id.setText(miTabla2.getValueAt(fila, 0).toString());
        jtf_nombre.setText(miTabla2.getValueAt(fila, 1).toString());
        jtf_direccion.setText(miTabla2.getValueAt(fila, 2).toString());
        jtf_telefono.setText(miTabla2.getValueAt(fila, 3).toString());
        
        lb_nuevo=false;
        
        
    }//GEN-LAST:event_miTabla2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alta;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtf_direccion;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    private javax.swing.JTable miTabla2;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    private void mostrarDatosConTableModel() {
		
            //Crea un modelo de la tabla visual
               DefaultTableModel model = new DefaultTableModel();// definimos el objeto tableModel
		
                //Asignamos la tabla modelo a la tabla creada
		miTabla2.setModel(model);
		model.addColumn("Id");
		model.addColumn("Nombre");
                model.addColumn("Direccion");
                model.addColumn("Telefono");
                
                
                
	;

                //Ordenar las columnas
                TableRowSorter<TableModel> ordena =new TableRowSorter<TableModel>(model);
                miTabla2.setRowSorter(ordena);
                         
		/* enviamos el objeto TableModel, como mandamos el objeto podemos
		  manipularlo desde el metodo */
		cons.consultaPacientesConTableModel(model, conex);       
	}
    
    
    
    
    
  


private void Limpiar(){

    
    jtf_id.setText("");
    jtf_nombre.setText("");
    jtf_direccion.setText("");
    jtf_telefono.setText("");
    
    
    lb_nuevo=true;

    
    
    
    
    

}































}