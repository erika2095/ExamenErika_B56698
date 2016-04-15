/**
 *
 * @author 3rika
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodo_Biblioteca 
{
    private ArrayList <Biblioteca> arrayBiblioteca;
    String arregloInformacionConsultada[] = new String[3];
    
    public Metodo_Biblioteca()
    {
        arrayBiblioteca = new ArrayList <Biblioteca>();
    }
    
    public void agregarBiblioteca(String informacion[])
    {
        Biblioteca biblioteca = new Biblioteca(informacion[0], informacion[1], informacion[2], informacion[3]);
        arrayBiblioteca.add(biblioteca);
    }
    
    public void mostrarInformacion()
    {
        for(int contador = 0; contador < arrayBiblioteca.size(); contador++)
        {
            JOptionPane.showMessageDialog(null, arrayBiblioteca.get(contador).getInformacion());
        }
    }
    
    public boolean consultarBiblioteca(String numPrestamo)
    {
        boolean existe = false;
        
        for(int contador = 0; contador < arrayBiblioteca.size(); contador++)
        {
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(numPrestamo))
            {
                arregloInformacionConsultada[0] = arrayBiblioteca.get(contador).getNombreUsuario();
                arregloInformacionConsultada[1] = arrayBiblioteca.get(contador).getCedulaUsuario();
                arregloInformacionConsultada[2] = arrayBiblioteca.get(contador).getISBN();
               
            }
        }
        return existe;
    }
    
    public String[] getBibliotecaConsulta()
    {
        return this.arregloInformacionConsultada;
    }
    
    public void modificarBiblioteca(String arreglo[])
    {
        for(int contador=0; contador < arrayBiblioteca.size(); contador++)
        {
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayBiblioteca.get(contador).setNombreUsuario(arreglo[1]);
                arrayBiblioteca.get(contador).setCedulaUsuario(arreglo[2]);
                arrayBiblioteca.get(contador).setISBN(arreglo[3]);
            }
        }
    }
    
    public void eliminarBiblioteca(String arreglo[])
    {
        for(int contador=0; contador < arrayBiblioteca.size(); contador++)
        {
            arrayBiblioteca.remove(contador);
        }
    }
}
