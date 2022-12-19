import java.util.Objects;

public class Equals {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equals equals = (Equals) o;
        return Objects.equals(name, equals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
