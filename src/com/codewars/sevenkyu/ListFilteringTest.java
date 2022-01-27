/*
* List Filtering
* Takes a list of non-negative integers and strings and returns a new list
* with the strings filtered out.
* */
package com.codewars.sevenkyu;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;


class ListFiltering{
    public static List filterListMethodOne(final List list) {
        return Arrays.asList(list.stream().filter(s -> s instanceof Integer).toArray());
    }
    public static List filterListMethodTwo(final List list) {
        return (List)list.stream().filter(e -> ! (e instanceof String)).collect(Collectors.toList());
    }
}
public class ListFilteringTest {
    public static void main(String[] args) {
        ListFiltering lf = new ListFiltering();
        System.out.println("Method 1");
        System.out.println(lf.filterListMethodOne(Arrays.asList(new Object[]{1,2,"a","b"})));
        System.out.println(lf.filterListMethodOne(Arrays.asList(new Object[]{1,"a","b",0,15})));
        System.out.println(lf.filterListMethodOne(Arrays.asList(new Object[]{1,2,"aasf","1","123",123})));

        System.out.println("Method 2");
        System.out.println(lf.filterListMethodTwo(Arrays.asList(new Object[]{1,2,"a","b"})));
        System.out.println(lf.filterListMethodTwo(Arrays.asList(new Object[]{1,"a","b",0,15})));
        System.out.println(lf.filterListMethodTwo(Arrays.asList(new Object[]{1,2,"aasf","1","123",123})));
    }
}
