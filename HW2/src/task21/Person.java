package task21;

public class Person {

    private final String name;
    private final String surname;
    private final int age;

    private Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    static class Builder {
        private String name;
        private String surname;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, surname, age);
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
