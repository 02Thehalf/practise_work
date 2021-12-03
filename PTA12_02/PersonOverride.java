package PTA12_02;

import java.util.Objects;

public class PersonOverride {
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public PersonOverride(){
        this("default",1,true);
    }

    @Override
    public String toString() {
        return name+"-"+age+"-"+gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonOverride that = (PersonOverride) o;
        return age == that.age && gender == that.gender && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
