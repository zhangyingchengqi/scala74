package com.yc.scala3.oop.part2_advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3_java {
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
        Collections.sort(   ps   );

        //   循环ps      if( p1.comapraTo( p2) )

        for( Person p:ps){
            System.out.println(   p );
        }
    }
}
