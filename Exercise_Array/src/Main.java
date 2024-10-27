import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
//        1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10


        Scanner input = new Scanner(System.in);

        ArrayList <Integer> num = new ArrayList();
        System.out.println("enter number of list ");
            int q = input.nextInt();
        while(q!=0){

            num.add(q);


            System.out.println("enter your numbers or 0 to exit");
             q = input.nextInt();
        }

        if(num.getFirst()==num.getLast())
            System.out.println("true ");
        else
            System.out.println("false ");



//        2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
//                Original Array:
//[1, 4, 17, 7, 25, 3, 100]


        ArrayList <Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(3);
        num1.add(17);
        num1.add(7);
        num1.add(25);
        num1.add(3);
        num1.add(100);


        int avr=0;
        for(int n : num1){
            int n1 =0;
                   n1 = n1 + n;
            avr = n1/num1.size();

        }
        System.out.println("avarege is "+avr);

        for(int n : num1){
            if(avr < n)
                System.out.println(n);
        }


//        3.Write a Java program to get the larger value between first and last element of an array of integers.
//                Original Array:
//[20, 30, 40]
//        Sample Output:
//        Larger value between first and last element: 40

        int [] num2 = new int[3];
        for (int i = 0; i <num2.length; i++) {
            System.out.println("pleas enter your numbers ");
            num2[i]= input.nextInt();
        }

        if(num2[0]> num2[2]){
            System.out.println("Larger value between first and last element: "+num2[0]);

        }else
            System.out.println("Larger value between first and last element: "+ num2[2]);


//        4.Write a Java program to swap the first and last elements of an array and create a new array.
//                Original Array:
//[20, 30, 40]


        ArrayList <Integer>num3 = new ArrayList<>();

        System.out.println("enter your numbers or 0 to exit");
        int e = input.nextInt();
        while(e!=0){
            num3.add(e);

            System.out.println("enter your numbers or 0 to exit");
             e = input.nextInt();
        }

            int e1 = num3.get(0);
            num3.set(0, num3.get(num3.size()-1));
            num3.set(num3.size()-1 , e1);
        System.out.println("New array after swapping the first and last elements: "+num3);



//        5. Write a program that places the odd elements of an array before the even elements.
//                Original Array: [2,3,40,1,5,9,4,10,7]
//        Sample Output: [3,1,5,9,7,2,40,4,10]


        ArrayList <Integer>num4 = new ArrayList<>();
//        num4.add(2);
//        num4.add(3);
//        num4.add(40);
//        num4.add(1);
//        num4.add(5);
//        num4.add(9);
//        num4.add(4);
//        num4.add(10);
//        num4.add(7);
        System.out.println("enter your numbers or 0 to exit");
        int w = input.nextInt();
        while(w!=0){

            num4.add(w);


            System.out.println("enter your numbers or 0 to exit");
             w = input.nextInt();
        }
        ArrayList <Integer>num7 = new ArrayList<>();

        for(int n : num4){

            if(n%2!=0)
                num7.add(n);



        }
        for(int n : num4){

                if(n %2 ==0 )
                num7.add(n);


        }

        System.out.println(num7);
//
//        6. Write a program that test the equality of two arrays. [2,3,6,6,4] [2,3,6,6,4]
//        Sample Output: true


        ArrayList <Integer>num5 = new ArrayList<>();
        ArrayList <Integer>num6 = new ArrayList<>();

        System.out.println("enter your numbers or 0 to exit array 1");
            int v= input.nextInt(); ;
        while(v!=0){
            num5.add(v);

            System.out.println("enter your numbers or 0 to array 1");
             v = input.nextInt();
        }
        System.out.println("enter your numbers or 0 to array 2");
        int z = input.nextInt();
        while(z!=0){
            num6.add(z);

            System.out.println("enter your numbers or 0 to array 2");
            z = input.nextInt();
        }

        if(num5.equals(num6))
        System.out.println("true ");
        else
            System.out.println("false ");



































    }
}