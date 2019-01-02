package factories;

class Person {
    public int id;
    public String name;

    public Person(final int id, final String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonFactory {
    private int idCounter;

    public Person createPerson(final String name) {
        final Person person = new Person(idCounter, name);
        idCounter++;
        return person;
    }
}