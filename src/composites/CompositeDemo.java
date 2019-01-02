package composites;

import java.util.*;

// Exercise Link:
// https://www.udemy.com/design-patterns-java/learn/v4/t/quiz/4350298
interface ValueContainer extends Iterable<Integer> {}

class SingleValue implements ValueContainer {
    public int value;

    public SingleValue(final int value) {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Collections.singleton(value).iterator();
    }
}

class ManyValues extends ArrayList<Integer> implements ValueContainer {
}


class MyList extends ArrayList<ValueContainer> {
    public MyList(final Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
        int total = 0;

        for (final ValueContainer container : this) {
            for (final int value : container) {
                total += value;
            }
        }

        System.out.println("Total value: " + total);
        return total;
    }
}

class Demo {
    public static void main(final String[] args) {
        final SingleValue value1 = new SingleValue(2);
        final SingleValue value2 = new SingleValue(5);

        final List list = new ArrayList();
        list.add(value1);
        list.add(value2);

        final MyList valueContainers = new MyList(list);
        valueContainers.sum();
    }
}