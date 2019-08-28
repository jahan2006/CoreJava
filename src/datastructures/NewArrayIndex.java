package datastructures;

public class NewArrayIndex {
    public static void main(String[] args) {
        int [] num  = {12,14,16};
        System.out.println(num[0]);
        System.out.println(num[3]);
        System.out.println(num[2]);
        try {
            System.out.println(num[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch the exception");
        }
    }
}
