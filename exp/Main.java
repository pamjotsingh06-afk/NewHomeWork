package PamjotSingh.exp;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public final float PI = 3.14f;
//    public static ArrayList<Integer> even = new ArrayList<>();


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        containsNumber(numbers, 5);
//        numbers(100, 1);


    }
        public static boolean containsNumber(ArrayList<Integer> numbers,int p){
            for(int k : numbers ){
                if(k == p){
                    System.out.println("yes " + p +" is inside");
                    return true;
                }
            }
            System.out.println("no " + p + " was not found.");
            return false;

        }

//        public static void numbers(int a, int b) {
//            ArrayList<Integer> evens = new ArrayList<>();
//            if (a < b) {
//                while (a < b) {
//                    if (a % 2 == 0) {
//                        evens.add(a);
//                    }
//                    a++;
//                }
//            } else {
//                while (b <= a) {
//                    if (b % 2 == 0) {
//                        evens.add(b);
//                    }
//                    b++;
//                }
//            }
//            for(int n : evens){
//                System.out.println(n);
//            }
//        }
//        even.add(10);
//        even.add(53);
//        even.add(28);
//        even.add(19);
//        even.add(1);
//        even.add(2);
//        even.add(6);
//        Iterator<Integer> iseven = even.iterator();
//            while (iseven.hasNext()){
//                int nub = iseven.next();
//                if (nub % 2 == 0){
//                    System.out.println(nub);
//                    System.out.println("----------------");
//                }else {
//                    iseven.remove();
//                }
//            }
//            for(int n : even){
//                System.out.println(n);
//            }

//        for (int nub : even){
//            if( nub % 2 ==0){
//                System.out.println(nub);
//            }
//        }
//        isCheap(100);
//        isEven(7, 20);
    }
//        public static void isEven (int a, int b){
//            if(a < b){
//                while(a <= b){
//                    if(a%2 == 0){
//                        System.out.println(a);
//                    }
//                a++;
//                }
//            }else if (b < a){
//                while(b <= a){
//                    if(b%2 == 0){
//                        System.out.println(b);
//                    }
//                }
//            }else{
//                if(a % 2 == 0){
//                    System.out.println(a);
//                }
//                System.out.println("pleas insert different numbers. this number is not even btw");
//            }
//        }


//    public static void isCheap(int price) {
//        if (price <= 100) {
//            System.out.println("cheap");
//        } else {
//            System.out.println("expensive");
//        }
//        String response = price < 100 ? "cheap" : "expansive";
//        System.out.println(response);


