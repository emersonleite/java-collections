package entities.set;

import java.util.Objects;

public class People extends entities.list.People {

    private String document = "";

    public People(String name, int age, String job, float height, String document) {
        super(name, age, job, height);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    //@Override
    //public boolean equals(Object o) {
    //if (this == o) return true;
    //if (o == null || getClass() != o.getClass()) return false;
    //if (!super.equals(o)) return false;
    //People people = (People) o;
    //return Objects.equals(document, people.document);
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(document, people.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(document);
    }
}
