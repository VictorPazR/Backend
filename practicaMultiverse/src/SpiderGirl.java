import java.awt.*;

public class SpiderGirl extends Spiderman implements SpidermanActionsCallback{
    String poder_especial;
    String ocupacion;
    public SpiderGirl(String nombre, float altura, int peso, String aparicion, String poder_especial, String ocupacion){
        super(nombre, altura,peso,aparicion);
        this.poder_especial = poder_especial;
        this.ocupacion = ocupacion;
    }

    public String getPoder_especial() {
        return poder_especial;
    }

    public void setPoder_especial(String poder_especial) {
        this.poder_especial = poder_especial;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public void telaraña(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("telaraña3.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void sentido(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("sentido3.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void fuerza(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("fuerza3.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void agilidad(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("agilidad3.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Poder especial: "+poder_especial+" Ocupacion: "+ocupacion;
    }
}
