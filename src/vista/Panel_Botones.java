/**
 *
 * @author 3rika
 */
package vista;

import controlador.Controlador_FRM_VentanaBiblioteca;

public class Panel_Botones extends javax.swing.JPanel {

    public Panel_Botones() {
        initComponents();
        deshabilitarBotones();
    }
    
    public void agregarEventos(Controlador_FRM_VentanaBiblioteca controladorVentana)
    {
        this.btn_Agregar.addActionListener(controladorVentana);
        this.btn_Buscar.addActionListener(controladorVentana);
        this.btn_Modificar.addActionListener(controladorVentana);
        this.btn_Eliminar.addActionListener(controladorVentana);
    }
    
    public void habilitarAgregar()
    {
        this.btn_Agregar.setEnabled(true);
    }
    
    public void deshabilitarBotones()
    {
        this.btn_Agregar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
    }
    
    public void habilitarEdicion()
    {
        this.btn_Modificar.setEnabled(true);
        this.btn_Eliminar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Buscar.setText("Buscar");

        btn_Agregar.setText("Agregar");

        btn_Modificar.setText("Modificar");

        btn_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_Buscar)
                .addGap(18, 18, 18)
                .addComponent(btn_Agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
