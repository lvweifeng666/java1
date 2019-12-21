

public class ss {

    public static void main(String[] args) {

        ReverseWithStringBuilderBuiltinMethod builtinMethod = new ReverseWithStringBuilderBuiltinMethod();

        builtinMethod.reverseWithStringBuilderBuiltinMethod("javaguides");

    }

    public String reverseWithStringBuilderBuiltinMethod(String string) {

        final StringBuilder builder = new StringBuilder(string);

        display(string, builder.reverse().toString());

        return builder.reverse().toString();

    }

    private void display(String input, String output) {

        System.out.println(" input string :: " + input);

        System.out.println(" output string :: " + output);

    }

}

