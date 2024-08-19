package ayakhanya.group.id.domain;

/**
 * Represents a person in a one-to-many entity relationship, where a person can have many friends.
 */
public class Person {
    private int age;
    private String name;
    private String email;
    private char gender;

    // Getters and Setters to adhere to encapsulation

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
