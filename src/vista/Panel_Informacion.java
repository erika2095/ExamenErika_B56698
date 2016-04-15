/**
 *
 * @author 3rika
 */
package vista;

import controlador.Controlador_FRM_VentanaBiblioteca;

public class Panel_Informacion extends javax.swing.JPanel {

    Controlador_FRM_VentanaBiblioteca controladorVentana;
    
    public Panel_Informacion() {
        initComponents();
        deshabilitarCampos();
    }
    
    public void agregarEventos(Controlador_FRM_VentanaBiblioteca controladorVentana)
    {
        this.controladorVentana = controladorVentana;
        this.jt_NumPrestamo.addActionListener(controladorVentana);
    }
    
    public String[] devolverInformacion()
    {
        String informacion[]=new String[4];
        informacion[0] = this.jt_NumPrestamo.getText();
        informacion[1] = this.jt_NombreUsuario.getText();
        informacion[2] = this.jt_CedulaUsuario.getText();
        informacion[3] = this.jt_ISBN.getText();
        
        return informacion;
    }
    
    public String devolverNumeroPrestamo()
    {
        return this.jt_NumPrestamo.getText();
    }
    
    public void establecerNumeroPrestamo(String numero)
    {
        this.jt_NumPrestamo.setText(numero);
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_NombreUsuario.setText(arreglo[0]);
        this.jt_CedulaUsuario.setText(arreglo[1]);
        this.jt_ISBN.setText(arreglo[2]);
    }
    
    public void habilitarCampos()
    {
        this.jt_NombreUsuario.setEnabled(true);
        this.jt_CedulaUsuario.setEnabled(true);
        this.jt_ISBN.setEnabled(true);
    }
    
    public void deshabilitarCampos()
    {
        this.jt_NumPrestamo.setEnabled(true);
        this.jt_NumPrestamo.setText("");
        this.jt_NombreUsuario.setEnabled(false);
        this.jt_NombreUsuario.setText("");
        this.jt_CedulaUsuario.setEnabled(false);
        this.jt_CedulaUsuario.setText("");
        this.jt_ISBN.setEnabled(false);
        this.jt_ISBN.setText("");
    }
    
    public void habilitarEdicion()
    {
        this.jt_NumPrestamo.setEnabled(false);
        this.jt_NombreUsuario.setEnabled(true);
        this.jt_CedulaUsuario.setEnabled(true);
        this.jt_ISBN.setEnabled(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt_NumPrestamo = new javax.swing.JTextField();
        jt_NombreUsuario = new javax.swing.JTextField();
        jt_CedulaUsuario = new javax.swing.JTextField();
        jt_ISBN = new javax.swing.JTextField();

        jLabel1.setText("Biblioteca UCR");

        jLabel2.setText("Numero de Prestamo");

        jLabel3.setText("Nombre del Usuario");

        jLabel4.setText("Cedula del Usuario");

        jLabel5.setText("ISBN del Libro");

        jt_NumPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_NumPrestamoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_NumPrestamo)
                            .addComponent(jt_NombreUsuario)
                            .addComponent(jt_CedulaUsuario)
                            .addComponent(jt_ISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_NumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NumPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NumPrestamoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
        {
            controladorVentana.buscar();
        }
    }//GEN-LAST:event_jt_NumPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jt_CedulaUsuario;
    private javax.swing.JTextField jt_ISBN;
    private javax.swing.JTextField jt_NombreUsuario;
    private javax.swing.JTextField jt_NumPrestamo;
    // End of variables declaration//GEN-END:variables
}
