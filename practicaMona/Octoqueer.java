package practicaMona;

public class Octoqueer extends  Mona{
    int gatos;
    String actividad;
    public Octoqueer(String color, String objeto, int tentaculos, int gatos, String actividad){
        super(color, objeto,tentaculos);
        this.gatos=gatos;
        this.actividad=actividad;
    }

    public int getGatos() {
        return gatos;
    }

    public void setGatos(int gatos) {
        this.gatos = gatos;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Numero de gatos: "+gatos+" Actividad que realiza: "+actividad;
    }
}
