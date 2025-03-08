package employess;

public   class Manager extends Employee{
    private int teamSize;

    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }
    @Override
    public double calculateBonus() {
        return salary * 0.1 + teamSize * 50;
    }
}
