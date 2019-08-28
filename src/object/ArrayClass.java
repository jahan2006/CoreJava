package object;

public class ArrayClass {
    public static void main(String[] args) {
        int []id={20,30,40,50};
        System.out.println(id[0]);
        System.out.println(id[1]);
        System.out.println(id[2]);
        System.out.println(id[3]);
        try{
            System.out.println(id[2+3]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("exception the cautch");
        }
        //perform below


    }

}
