package cast;

public class Actor extends Artist {
    private boolean isInMainRole;

    public Actor(String name, int age, Gender gender, boolean isInMainRole) {
        super(name, age, gender);
        this.isInMainRole = isInMainRole;
    }
}
