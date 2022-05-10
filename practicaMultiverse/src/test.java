
public class test {
    public static void main(String[] args) {
        Screen s = new Screen();
        SpidermanClasico clasico = new SpidermanClasico("\nPeter Benjamin Parker",170,147,
                "Amazing Fantasy #15","Humano","Nueva York\n");
        Spidercerdo cerdo = new Spidercerdo("\nPeter Benjamin Porker",100,
                43,"Marvel Tails #1","Cerdo","Nueva York","Cerdo mutante\n");
        SpiderGirl girl = new SpiderGirl("\nMay 'Mayday' Parker",178,52,"What If #105 Vol.2",
                "Creacion de feromonas","Estudiante\n");
        clasico.telaraña(s);
        clasico.sentido(s);
        clasico.fuerza(s);
        clasico.agilidad(s);
        cerdo.telaraña(s);
        cerdo.sentido(s);
        cerdo.fuerza(s);
        cerdo.agilidad(s);
        girl.telaraña(s);
        girl.sentido(s);
        girl.fuerza(s);
        girl.agilidad(s);
    }
}
