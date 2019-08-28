package datastructures.array;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random= new Random();
        System.out.println(random.nextInt(100));
        int[]studentId = new int[5];
      //  Random random= new Random();
        for(int i=0;i<5;i++){
            int newValue=random.nextInt(100);
            studentId[i]=newValue;
          //  for (int i =0;i<studentId.length);
        }

    }
}
