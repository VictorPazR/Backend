package PracticaHarry;

public class test {
    public static void main(String[] args) {
        Mago mago1 = new Mago("Harry Potter","Gryffindor","Expecto Patronum","Capa de invisibilidad",7);
        Mago mago2 = new Mago("Hermione Granger","Gryffindor","Wingardium Leviosa","Gira Tiempo",7);
        Mago mago3 = new Mago("Draco Malfoy","Slytherin","Paralizador","Varita Magica",7);
        System.out.println(mago1.toString());
        System.out.println(mago2.toString());
        System.out.println(mago3.toString());
    }
}
