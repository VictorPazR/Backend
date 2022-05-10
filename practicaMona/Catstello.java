package practicaMona;

public class Catstello extends Mona {
    int id;
    public Catstello(String color, String objeto, int tentaculos, int id){
        super(color,objeto,tentaculos);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Id:"+id;
    }
}
