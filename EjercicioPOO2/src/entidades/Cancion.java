package entidades;

public class Cancion {
    private String titular;
    private String autor;

    public Cancion() {

    }

    public Cancion(String titular, String autor) {
        this.titular = titular;
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitular() {
        return titular;
    }
}
