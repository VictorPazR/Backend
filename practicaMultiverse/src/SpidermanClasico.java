import java.awt.*;

public class SpidermanClasico extends Spiderman implements SpidermanActionsCallback{
    String apariencia;
    String ciudad;
    public SpidermanClasico(String nombre, float altura, int peso, String aparicion,String apariencia, String ciudad){
        super(nombre,altura,peso,aparicion);
        this.apariencia = apariencia;
        this.ciudad = ciudad;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public void telaraña(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("clasico.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void sentido(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("sentido.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void fuerza(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("fuerza1.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void agilidad(Screen s) {
        s.setVisible(true);
        s.out(MostrarDatos(),"Helvetica",28, Color.BLUE);
        s.showImage("agilidad1.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+" Apariencia: "+apariencia+" Cuidad: "+ciudad;
    }
}
