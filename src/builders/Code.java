package builders;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private final String className;
    private final List<FieldContainer> fields = new ArrayList<FieldContainer>();


    public Code(final String className) {
        this.className = className;
    }

    public void addField(final String name, final String type) {
        fields.add(new FieldContainer(name, type));
    }

    public String getClassName() {
        return className;
    }

    public List<FieldContainer> getFields() {
        return fields;
    }
}
