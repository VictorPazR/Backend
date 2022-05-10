package practicaMona;

public class test {
    public static void main(String[] args) {
        Catstello cats1 = new Catstello("Negro","Mesa DJ",3,126);
        Grinchtocat grinch1 = new Grinchtocat("Verde","Esfera de navidad", 4,109,"Azul","Santa Claus");
        Scubatocat scuba1 = new Scubatocat("Gris, Negro y Azul", "Tanque de oxigeno",4,"Nadando con un pez","Reloj");
        Octoqueer octo1 = new Octoqueer("Muchos","Banderas",4,5,"Festejo");
        Megacatv2 mega1 = new Megacatv2("Azul","Arma",4,"Megaman");
        Heisencat heisenberg1 = new Heisencat("Amarillo","Martillo",5,"Breaking Bad","Gafas y Mascara");
        System.out.println(cats1.MostrarDatos());
        System.out.println(grinch1.MostrarDatos());
        System.out.println(scuba1.MostrarDatos());
        System.out.println(octo1.MostrarDatos());
        System.out.println(mega1.MostrarDatos());
        System.out.println(heisenberg1.MostrarDatos());
    }
}
