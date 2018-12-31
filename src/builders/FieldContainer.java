package builders;

public class FieldContainer {
    private final String name;
    private final String type;

    public FieldContainer(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
