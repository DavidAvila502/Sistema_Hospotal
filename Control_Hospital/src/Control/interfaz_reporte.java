/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dolar
 */
public class interfaz_reporte extends javax.swing.JInternalFrame {
     conexion     conex = new conexion();
    consultas_hospital cons = new consultas_hospital();
    String ls_accion;
    
    
    
    String ls_fecha_inicial, ls_fecha_final;
    
    
    String ls_medico,ls_especialidad;
    
    
    
    
    
    
    
    
    
    /**
     * Creates new form interfaz_reporte
     */
    public interfaz_reporte() throws SQLException {
        initComponents();
        
        llenarComboBoxMedico();        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_fecha_inicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtf_fecha_final = new javax.swing.JTextField();
        btn_consultar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtf_especialidad = new javax.swing.JTextField();
        cbx_medico = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte De Citas");

        miTabla2=new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){

                return false;

            }

        };
        miTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Paciente", "Direccion", "Telefono", "Fecha", "Hora"
            }
        ));
        jScrollPane1.setViewportView(miTabla2);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("YYYY-MM-DD");

        jLabel3.setText("Especialidad");

        jLabel4.setText("Fecha inicial");

        jLabel5.setText("Fecha final");

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel2.setText("Medico");

        jtf_especialidad.setEditable(false);

        cbx_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_medicoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("YYYY-MM-DD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addGap(253, 253, 253)
                        .addComponent(jLabel7)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtf_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(405, 405, 405)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtf_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel5))
                                .addComponent(btn_consultar))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_salir)
                                .addComponent(jtf_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_consultar)
                    .addComponent(btn_salir)
                    .addComponent(jtf_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cbx_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_medicoActionPerformed
        // TODO add your handling code here:
        
        
        
        
        String cadena="",nomb;
        int posicion=0;
        
        
        
        try{
        cadena=cbx_medico.getSelectedItem().toString();
       
        
        ls_accion="SELECT especialidad FROM medicos WHERE nombre = '"+cadena+"'";
        
        
        //Crea un objeto Statemen, para poder ejecutar una instruccion SQL
        
        Statement st = conex.getConnection().createStatement();
        
        ResultSet rs = st.executeQuery(ls_accion);

       /* while(rs.next()){
     
        jComboBox2.addItem(rs.getString(1)+".- "+rs.getString(2));
        
        }
      */
       if(rs.next()){
       jtf_especialidad.setText(rs.getString(1));
       }
        
      rs.close();//Libera la resultSet
        st.close();//Libera el Stetement 
        
        }catch(SQLException ex){
    
    Logger.getLogger(interfaz_citas.class.getName()).log(Level.SEVERE,null,ex);
    
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_cbx_medicoActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        // TODO add your handling code here:
        
        
        
        ls_medico =cbx_medico.getSelectedItem().toString();
        ls_especialidad= jtf_especialidad.getText();
        ls_fecha_inicial=jtf_fecha_inicial.getText();
        ls_fecha_final=jtf_fecha_final.getText();
        
        
        
        
        
        //Crea un modelo de la tabla visual
               DefaultTableModel model = new DefaultTableModel();// definimos el objeto tableModel
		
                //Asignamos la tabla modelo a la tabla creada
		miTabla2.setModel(model);
		model.addColumn("Paciente");
		model.addColumn("Direccion");
                model.addColumn("Telefono");
                model.addColumn("Fecha");
                model.addColumn("Hora");
                
                
                
	

                //Ordenar las columnas
                TableRowSorter<TableModel> ordena =new TableRowSorter<TableModel>(model);
                miTabla2.setRowSorter(ordena);
                         
		/* enviamos el objeto TableModel, como mandamos el objeto podemos
		  manipularlo desde el metodo */
		cons.MostrarTablaREPORTES(ls_medico, ls_fecha_inicial, ls_fecha_final, model, conex);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_consultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cbx_medico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtf_especialidad;
    private javax.swing.JTextField jtf_fecha_final;
    private javax.swing.JTextField jtf_fecha_inicial;
    private javax.swing.JTable miTabla2;
    // End of variables declaration//GEN-END:variables





    public void llenarComboBoxMedico() throws SQLException{
    
    
    ls_accion="SELECT * FROM medicos";
        
        
        //Crea un objeto, para poder ejecutar una instruccion sql
        Statement st= conex.getConnection().createStatement();
        
        //Genera un query o consulta de la tabla especificada y
        //regresa el resultado de la consulta de un objeto resultset
        
        ResultSet rs = st.executeQuery(ls_accion);        
        
        
        //Se recorre a tabla virtual(ResultSet) en la memoria
        while(rs.next())//Mueve el cursor al siguiente reegistro
        {
        
         cbx_medico.addItem(rs.getString(2));
        
        
        }
        
        rs.close();//Libera la resultSet
        st.close();//Libera el Stetement
        
    
    
    
    
    
    }
    
    
    
    



























}