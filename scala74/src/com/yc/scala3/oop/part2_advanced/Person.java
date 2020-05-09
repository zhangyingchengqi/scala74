package com.yc.scala3.oop.part2_advanced;

public class Person implements Comparable{   //person能比较

    private String name;
    private Integer age;

    @Override
    public int compareTo(Object o) {
        if( ! (o instanceof Person) ){
            return 1;
        }
        Person oo=(Person)o;
        return this.age-oo.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
