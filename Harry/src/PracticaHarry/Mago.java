package PracticaHarry;

public class Mago {
    public String nombre;
    public String casa;
    public String hechizo;
    public String objeto;
    public int edad;


    public Mago(String n,String c,String h, String o, int e){
        this.nombre = n;
        this.casa = c;
        this.hechizo = h;
        this.objeto = o;
        this.edad = e;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCasa(){
        return this.casa;
    }
    public String getHechizo(){
        return this.hechizo;
    }
    public String getObjeto() {
        return this.objeto;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre1){
        this.nombre = nombre1;
    }
    public void setCasa(String casa1){
        this.casa = casa1;
    }
    public void setHechizo(String hechizo1){
        this.hechizo = hechizo1;
    }
    public void setObjeto(String objeto1){
        this.objeto = objeto1;
    }
    public void setEdad(int edad1){
        this.edad = edad1;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nombre='" + nombre + '\'' +
                ", casa='" + casa + '\'' +
                ", hechizo='" + hechizo + '\'' +
                ", objeto='" + objeto + '\'' +
                ", edad=" + edad +
                '}';
    }
}
