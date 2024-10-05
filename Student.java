public class Student {
    private static int ID = 1;
    private final int id;
    private final String name;

    public Student(String name) {
        this.id = ID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
