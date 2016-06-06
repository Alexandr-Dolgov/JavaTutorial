package com.socolov.linkedList.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {

    @Test
    void test() {
        List list = new ArrayList();
        list.add("q");
        list.add("qw");
        list.add("qwe");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

        for (Iterator it = list.iterator(); it.hasNext();) {
            Object element = iterator.next();
            System.out.println(element);
        }

        Object[] arr = {"q", "qw", "qwe"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //foreach здесь можно использовать в правой части те объекты, которые реализуют интерфейс Iterable
        for (Object el : list) {
            System.out.println(el);
        }

    }

}
