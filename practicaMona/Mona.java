package practicaMona;

public class Mona {
    public String color_principal;
    public int tentaculos;
    public String objeto;
    public Mona(String c, String o, int t){
        this.color_principal = c;
        this.objeto = o;
        this.tentaculos = t;
    }

    public String getColor_principal() {
        return color_principal;
    }

    public void setColor_principal(String color_principal) {
        this.color_principal = color_principal;
    }

    public int getTentaculos() {
        return tentaculos;
    }

    public void setTentaculos(int tentaculos) {
        this.tentaculos = tentaculos;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
    public String MostrarDatos(){
        return "Color principal: "+color_principal+" Tentaculos: "+tentaculos+" Objeto: "+objeto;
    }
}
