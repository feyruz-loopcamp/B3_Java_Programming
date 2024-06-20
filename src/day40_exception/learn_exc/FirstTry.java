package day40_exception.learn_exc;

import day40_exception.throws_keyword.UsingThrows;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First print out");

        String str = "loopcamp";
        //            01234567

        try{
            System.out.println(str.charAt(9)); // input.nextInt(); --- >  9
        } catch (Exception e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("Exception is caught");
        }

        System.out.println("Last print out");



    }
}
