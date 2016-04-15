/**
 *
 * @author 3rika
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Metodo_Biblioteca;
import vista.FRM_VentanaBiblioteca;

public class Controlador_FRM_VentanaBiblioteca implements ActionListener
{
    public Metodo_Biblioteca metodoBiblioteca;
    FRM_VentanaBiblioteca ventanaBiblioteca;
    
    public Controlador_FRM_VentanaBiblioteca(FRM_VentanaBiblioteca ventanaBliblioteca)
    {
        metodoBiblioteca = new Metodo_Biblioteca();
        this.ventanaBiblioteca = ventanaBliblioteca;
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            buscar();
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodoBiblioteca.agregarBiblioteca(ventanaBiblioteca.devolverInformacion());
            ventanaBiblioteca.mostrarMensaje("Agregado correctamente");
            ventanaBiblioteca.resetear();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodoBiblioteca.modificarBiblioteca(ventanaBiblioteca.devolverInformacion());
            ventanaBiblioteca.mostrarMensaje("Modificado correctamente");
            ventanaBiblioteca.resetear();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodoBiblioteca.eliminarBiblioteca(ventanaBiblioteca.devolverInformacion());
            ventanaBiblioteca.mostrarMensaje("Eliminado correctamente");
            ventanaBiblioteca.resetear();
        }
    }
    
    public void buscar()
    {
        if(metodoBiblioteca.consultarBiblioteca(ventanaBiblioteca.devolverNumeroPrestamo()))
        {
            ventanaBiblioteca.mostrarInformacion(metodoBiblioteca.getBibliotecaConsulta());
            ventanaBiblioteca.habilitarEdicion();
        }
        else
        {
            ventanaBiblioteca.mostrarMensaje("--> No se encuentra registrado...");
            ventanaBiblioteca.habilitarAgregar();
        }
    }
}
