package Interface;

public class Bird  implements Flyable{
    @Override
    public void fly() {
        System.out.println("Kuş uçuyor...");
    }
}
