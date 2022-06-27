//non generic classes can have genric methods
package com.cg.generics;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {12,6,8,3,5,9,45};
        int a=2;
        int b=5;
        Non_gen obj= new Non_gen();
        obj.swap_ele(arr,a,b);
        obj.print(arr);

    }
}
class Non_gen{
    public <E> void swap_ele(int arr[],int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void print(int aar1[]){
        for (int i = 0; i < aar1.length; i++) {
            System.out.println(aar1[i]);
        }
    }
}
