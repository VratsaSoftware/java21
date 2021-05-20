package cast;

import java.util.Objects;

public class Director extends Artist {

    private int yearsOfExperience;

    public Director(String name, int age, Gender gender, int yearsOfExperience) {
        super(name, age, gender);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return yearsOfExperience == director.yearsOfExperience &&
                super.getName().equals(director.getName()) &&
                super.getAge() == director.getAge() &&
                super.getGender() == director.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearsOfExperience, super.getName(), super.getAge(), super.getGender());
    }
}
