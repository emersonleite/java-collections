package entities.list;

import java.util.Objects;

public class People implements Comparable<People> {

    private String name;
    private int age;
    private String job;
    private float height;

    public People(String name, int age, String job, float height) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age; // + ", job=" + job + ", height=" + height;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /* Permite a utilização de Collections.sort para lista */
    @Override
    public int compareTo(People o) {
        return Integer.compare(age, o.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        People people = (People) o;
        return Objects.equals(name, people.name);
    }
}
