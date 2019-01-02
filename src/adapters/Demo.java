package adapters;


// Exercise Link:
// https://www.udemy.com/design-patterns-java/learn/v4/t/quiz/4350294
public class Demo {
    public static void main(final String[] args) {
        final SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(new Square(5));

        System.out.println(adapter.getHeight());
        System.out.println(adapter.getWidth());
    }
}
