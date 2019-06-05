package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == "" || name == null || name.length() > 40 || age > 120 || age < 0) {
            throw new IllegalArgumentException("negative"); 
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
