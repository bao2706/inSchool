package com.codegym;
import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args){
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.4);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(3.5,"red",false);
        System.out.println("Ham trc khi sort");
        for( ComparableCircle circle: circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();

        Arrays.sort(circles);
        System.out.println("Ham sau khi sort");
        for( ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }
}
