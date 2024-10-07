import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.getId() == student.getId() && Objects.equals(this.getName(), student.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName());
    }
}
