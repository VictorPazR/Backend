import java.awt.*;
import java.lang.invoke.StringConcatFactory;

public class Spidercerdo extends Spiderman implements SpidermanActionsCallback{
    String apariencia;
    String ciudad;
    String raza;
    public Spidercerdo(String nombre, float altura, int peso, String aparicion, String apariencia,String cuidad, String raza){
        super(nombre, altura, peso, aparicion);
        this.apariencia = apariencia;
        this.ciudad = cuidad;
        this.raza = raza;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getCuidad() {
        return ciudad;
    }

    public void setCuidad(String cuidad) {
        this.ciudad = cuidad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Aparencia: "+apariencia+" Cuidad: "+ciudad+" Raza: "+raza;
    }

    @Override
    public void telaraña(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("telaraña2.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void sentido(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("sentido2.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void fuerza(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("fuerza2.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void agilidad(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("agilidad2.gif");
        s.setBounds(200,100,1100,900);
    }
}
