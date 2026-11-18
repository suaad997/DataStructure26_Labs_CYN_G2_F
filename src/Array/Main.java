package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arrayss arr= new Arrayss();
        int []numbers={1,2,3,7,5};
        int result= arr.linearSearch(numbers,8);

        if(result!=-1)
        System.out.println("Value found at index:"+result);
        else
            System.out.println("Value not found");
       // arr.traversal(numbers);

        //numbers[3]=9;
//        int []numbers2=new int[4];
//        arr.input(numbers2);
       // arr.update(numbers,9,9);
        //arr.delete(numbers,4);


       // arr.Reverse_traversal(numbers);



        //System.out.println(Arrays.toString(numbers));

//
//        for(int e:numbers)
//            System.out.println(e);
    }
}
