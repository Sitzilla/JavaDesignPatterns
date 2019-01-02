package factories;

// Exercise Link:
// https://www.udemy.com/design-patterns-java/learn/v4/t/quiz/4350360
public class Demo {
    public static void main(final String[] args) {
        final PersonFactory personFactory = new PersonFactory();
        final Person person1 = personFactory.createPerson("Link");
        final Person person2 = personFactory.createPerson("Zelda");
        final Person person3 = personFactory.createPerson("Epona");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
