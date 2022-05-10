package practicaMona;

public class Heisencat extends Mona{
    String pelicula;
    String accesorio;

    public Heisencat(String color, String objeto, int tentaculos, String pelicula, String accesorio){
        super(color, objeto, tentaculos);
        this.pelicula=pelicula;
        this.accesorio = accesorio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(String accesorio) {
        this.accesorio = accesorio;
    }
    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Pelicula inspiracion: "+pelicula+" Accesorios: "+accesorio;
    }
}
