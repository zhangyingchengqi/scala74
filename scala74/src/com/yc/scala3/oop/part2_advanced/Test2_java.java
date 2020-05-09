package com.yc.scala3.oop.part2_advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2_java {
    public static void main(String[] args) {
        Person p1=new Person("张三",20);
        Person p2=new Person("张三丰",22);
        Person p3=new Person("李三",19);

        List<Person> ps=new ArrayList<Person>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);

        //  java.util.Collections类
        //java.util.Comparator
        Collections.sort(   ps ,  new PersonComparator()   );

        for( Person p:ps){
            System.out.println(   p );
        }
    }
}

//1。 利用泛型来完成了自动的类型转换
class PersonComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Person p1=(Person)o1;
        Person p2=(Person)o2;
        return   p1.getAge()-p2.getAge();
    }
}
