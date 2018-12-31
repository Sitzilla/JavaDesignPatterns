package builders;

// Exercise Link:
// https://www.udemy.com/design-patterns-java/learn/v4/t/quiz/412390
public class Demo {
    public static void main(final String[] args) {
        final CombinedCodeBuilder codeBuilder = new CombinedCodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        System.out.println(codeBuilder);
    }
}
