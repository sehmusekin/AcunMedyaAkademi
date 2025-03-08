package employess;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Ahmet", 5000, "IT", 5);
        Developer developer = new Developer(2, "Mehmet", 4000, "IT", "Java Developer");

        System.out.println("Manager Prim: " + manager.calculateBonus());
        System.out.println("Developer Prim: " + developer.calculateBonus());
    }
}

