/**
 *
 * @author 3rika
 */
package modelo;

public class Biblioteca {

    private String numeroPrestamo;
    private String nombreUsuario;
    private String cedulaUsuario;
    private String ISBN;

    public Biblioteca(String numeroPrestamo, String nombreUsuario, String cedulaUsuario, String ISBN) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.ISBN = ISBN;
    }
    
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getInformacion()
    {
        return "\nNumero de prestamo: " + getNumeroPrestamo() + " Nombre del usuario: " + getNombreUsuario() + " Cedula del usuario: " + getCedulaUsuario() + " ISBN del libro: " + getISBN() ;
    }
}
