package builders;

public class CodeBuilder {
    private final Code code;

    public CodeBuilder(final String className) {
        code = new Code(className);
    }

    public CodeBuilder addField(final String name, final String type) {
        code.addField(name, type);
        return this;
    }

    @Override
    public String toString() {
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
}