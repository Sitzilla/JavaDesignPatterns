package builders;

import java.util.ArrayList;
import java.util.List;

// Combined code for project submission in single file
class CombinedCodeBuilder {
    private final Code code;

    public CombinedCodeBuilder(final String className)
    {
        code = new Code(className);
    }

    public CombinedCodeBuilder addField(final String name, final String type)
    {
        code.addField(name, type);
        return this;
    }

    @Override
    public String toString()
    {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("public class ")
                .append(code.getClassName())
                .append('\n') //Exercise requirements specify open curly brace on a new line ¯\_(ツ)_/¯
                .append('{')
                .append('\n');

        for (final FieldContainer field : code.getFields()) {
            stringBuilder
                    .append("  public ")
                    .append(field.getType())
                    .append(' ')
                    .append(field.getName())
                    .append(";\n");
        }

        stringBuilder.append('}');

        return stringBuilder.toString();
    }

    class Code {
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

    class FieldContainer {
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
}
