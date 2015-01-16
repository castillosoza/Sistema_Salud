# Sistema_Salud
Proyectos desarrollados en Netbeans
package mantenedor;

import Base.Conexion;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class frameAccion extends javax.swing.JFrame {

    private int opcion;

    Conexion acc=null;
     
    frameAccion Accion;
        
    
    Connection con;
    Statement stc=null;
    ResultSet rs=null;

    String rut="",nombres="",sistema="",fec_control="",hora="",doctor="",especialidad="",observaciones= "";
    int id=0;

    
    
    public frameAccion(int opcion) {
        this.opcion=opcion;
        acc = Conexion.getInstance();
        initComponents();
    }
    
     private frameAccion() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfRut = new javax.swing.JTextField();
        jbtConsultar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbSalud = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jtfFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfNombreDoctor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfEspecialidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtObse = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jbtAceptar = new javax.swing.JButton();
        jbtLimpiar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Rut"));

        jLabel1.setText("Ingrese acá su rut:");

        jbtConsultar.setText("Consultar");
        jbtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRut, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtConsultar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Agende su hora"));

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Sistema de Salud");

        jcbSalud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione uno", "Fonasa", "Isapre", "Particular", " " }));

        jLabel4.setText("Fecha Control");

        jLabel5.setText("Hora");

        jLabel6.setText("Nombre Doctor");

        jLabel7.setText("Especialidad");

        jLabel8.setText("Causa/Observaciones");

        jtxtObse.setColumns(20);
        jtxtObse.setRows(5);
        jScrollPane1.setViewportView(jtxtObse);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbSalud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombreDoctor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(jtfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfNombreDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jbtAceptar.setText("Aceptar");
        jbtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAceptarActionPerformed(evt);
            }
        });

        jbtLimpiar.setText("Limpiar");
        jbtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimpiarActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jbtAceptar)
                .addGap(18, 18, 18)
                .addComponent(jbtLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jbtCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAceptar)
                    .addComponent(jbtLimpiar)
                    .addComponent(jbtCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jbtAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        switch (opcion)
        {
            case 1: // Ingresar
                rut = jtfRut.getText();
                nombres=jtfNombre.getText();
                sistema=jcbSalud.getSelectedItem().toString();
                fec_control=jtfFecha.getText();
                hora=jtfFecha.getText();
                doctor=jtfFecha.getText();
                especialidad=jtfEspecialidad.getText();
                observaciones=jtxtObse.getText();
                try {
                    String sql = "INSERT INTO paciente ("
                        +"rut,"
                        +"nombre,"
                        +"sistema,"
                        +"fec_control,"
                        +"hora,"
                        +"doctor,"
                        +"especialidad,"
                        +"observaciones)"
                        +"VALUES('"
                        +rut+"','"
                        +nombres+"','"
                        +sistema+"','"
                        +fec_control+"','"
                        +hora+"','"    
                        +doctor+"','"
                        +especialidad+"','"
                        +observaciones+"')";
                    acc.ejecutarIAE(sql);
                    //
                    JOptionPane.showConfirmDialog(null,"Seguro de Grabar?","Confirmación",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Hora ingresada exitosamente");
                    this.setVisible(false);
                }catch (Exception ex)
                {
                    Logger.getLogger(frameAccion.class.getName()).log(Level.SEVERE,null,ex);
                }
                break;
            
            case 2: // eliminar
                try {
                    // String sql = "DELETE From alumno where rut=' "+rut+"'";
                    String sql = "DELETE From paciente where id=' "+id+"'";
                    acc.ejecutarIAE(sql);
                     JOptionPane.showConfirmDialog(null,"Seguro de elimnar?","Confirmación",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Hora Borrada exitosamente");
                    this.setVisible(false);
                }catch (Exception ex)
                {
                    Logger.getLogger(frameAccion.class.getName()).log(Level.SEVERE,null,ex);
                }
                break;
            
        }
    }                                          

    private void jbtConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        

        rut=jtfRut.getText();
        try {
            String sql = "SELECT * FROM paciente WHERE rut='"+rut+"';";
            rs=acc.ejecutarQuery(sql);
            
            if (rs.next())
            {
                    
                id=rs.getInt(1);
                JOptionPane.showMessageDialog(null,"Registro numero="+id);
                jtfNombre.setText(rs.getString(3));
                //jcbSalud.setText(rs.getString(4));
                jtfFecha.setText(rs.getString(5));
                jtfHora.setText(rs.getString(6));
                jtfNombreDoctor.setText(rs.getString(7));
                jtfEspecialidad.setText(rs.getString(8));
                jtxtObse.setText(rs.getString(9));
                
                if (opcion==2)
                {
                
                jtfNombre.setEnabled(true);
                jcbSalud.setEnabled(true);
                jtfFecha.setEnabled(true);
                jtfHora.setEnabled(true);
                jtfNombreDoctor.setEnabled(true);
                jtfEspecialidad.setEnabled(true);
                jtxtObse.setEnabled(true);
                jtfNombre.requestFocus();
                }
            }
            else
            {
                
                jtfNombre.setEnabled(true);
                jcbSalud.setEnabled(true);
                jtfFecha.setEnabled(true);
                jtfHora.setEnabled(true);
                jtfNombreDoctor.setEnabled(true);
                jtfEspecialidad.setEnabled(true);
                jtxtObse.setEnabled(true);
                jtfNombre.requestFocus();
                
            }
        }catch (Exception ex)
        {
            Logger.getLogger(frameAccion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }                                            

    private void jbtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           

                jtfRut.setText(" ");
                jtfNombre.setText(" ");
                jcbSalud.getSelectedItem();
                jtfFecha.setText(" ");
                jtfHora.setText(" ");
                jtfNombreDoctor.setText(" ");
                jtfEspecialidad.setText(" ");
                jtxtObse.setText(" ");
        
    }                                          

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        Accion.setVisible(false);
        
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameAccion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAceptar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtConsultar;
    private javax.swing.JButton jbtLimpiar;
    private javax.swing.JComboBox jcbSalud;
    private javax.swing.JTextField jtfEspecialidad;
    private javax.swing.JTextField jtfFecha;
    private javax.swing.JTextField jtfHora;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreDoctor;
    private javax.swing.JTextField jtfRut;
    private javax.swing.JTextArea jtxtObse;
    // End of variables declaration                   
}
