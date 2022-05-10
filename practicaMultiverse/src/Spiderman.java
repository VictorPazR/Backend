public class Spiderman {
    String nombre;
    float altura;
    int peso;
    String primera_aparicion;
    public Spiderman(String nombre, float altura, int peso, String aparicion){
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.primera_aparicion = aparicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPrimera_aparicion() {
        return primera_aparicion;
    }

    public void setPrimera_aparicion(String primera_aparicion) {
        this.primera_aparicion = primera_aparicion;
    }

    public String MostrarDatos(){
        return "Nombre: "+nombre+" Altura: "+altura+" Peso: "+peso+" Primera Aparicion: "+primera_aparicion;
    }
}
