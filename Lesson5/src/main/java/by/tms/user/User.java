package by.tms.user;

public class User {
    public String name;
    public String surname;
    public int age;
    public String sex;

    public User(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getFullName() {
        return surname + " " + name;
    }

    public void ageIncrease() {
        this.age += 1;
    }
}



