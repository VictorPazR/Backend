package practicaMona;

public class Megacatv2 extends  Mona{
    String videojuego;
    public Megacatv2(String color, String objeto, int tentaculos, String videojuego){
        super(color,objeto,tentaculos);
        this.videojuego = videojuego;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Videojuego: "+videojuego;
    }
}
