package by.tms.main;

public class Person {
    private String name;
    private String sex;
    private int age;
    private Address personAddress;
    private boolean fit;


    public Person(String name, String sex, int age, Address personAddress) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.personAddress = personAddress;
    }

    public boolean isFit() {
        return fit;
    }

    public void setFit(boolean fit) {
        this.fit = fit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", personAddress=" + personAddress +
                '}';
    }
}
