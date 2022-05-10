package practicaMona;

public class Grinchtocat extends Mona{
    String fondo;
    String vestuario;
    int id;
    public Grinchtocat(String color, String objeto, int tentaculos, int id, String fondo, String vestuario){
        super(color,objeto,tentaculos);
        this.id=id;
        this.fondo = fondo;
        this.vestuario = vestuario;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public String getVestuario() {
        return vestuario;
    }
    public void setVestuario(String vestuario) {
        this.vestuario = vestuario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Id: "+id+" Fondo: "+fondo+" Vestuario: "+vestuario;
    }
}
