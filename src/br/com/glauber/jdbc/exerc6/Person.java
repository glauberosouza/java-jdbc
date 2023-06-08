package br.com.glauber.jdbc.exerc6;

public class Person {
    private long idt;
    private String name;

    public Person(long idt, String name) {
        this.idt = idt;
        this.name = name;
    }

    public Person() {
    }

    public long getIdt() {
        return idt;
    }

    public void setIdt(long idt) {
        this.idt = idt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idt=" + idt +
                ", name='" + name + '\'' +
                '}';
    }
}
