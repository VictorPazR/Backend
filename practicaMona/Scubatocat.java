package practicaMona;

public class Scubatocat extends Mona {
    String entorno;
    String accesorios;
    public Scubatocat(String color, String objeto, int tentaculos,String entorno,String accesorios){
        super(color,objeto,tentaculos);
        this.entorno= entorno;
        this.accesorios = accesorios;
    }

    public String getEntorno() {
        return entorno;
    }

    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Entorno: "+entorno+" Accesorio: "+accesorios;
    }
}
