package features

class Operators {
    static class Person {
        private String firstName;
    }
    static main(args) {
        def string = 'string'
        def result = string ? 'Not empty and null' : 'null or empty'
        result = string ?: 'null or empty'
        2 ** 10
        def person = new Person();
        println person.firstName
        println person.firstName?.startsWith("a")

        person.firstName = '123';
        println person.firstName
        println person.firstName?.startsWith("a")
        (0..3)

        String string2 = "string";
        String result2 = (string2 != null && string2.length() > 0) ? 'Not empty and null' : 'null or empty'; // or StringUtils
    }
}
