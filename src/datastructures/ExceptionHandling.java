package datastructures;

public class ExceptionHandling {
    // create an int Array with 3 index.  try to print last index +1's value
    // handle in the try catch block
    //print exception occured



    public static void main(String[] args) {
        String[]name={"mr x","mr y","mr z","mr a"};
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        // try --keyword{--try block starts
        // body of the try block
        //}--try block ends catch --keyword (exception's name which we are trying to catch e--
      //  variable for the exception ){-- catch block starts
        // body of the catch block
        //}--catch block ends
        //finally --keywords --finally block always gets execute
        // mostly used for db connectivety closing
        //file reader closing
        try {
            System.out.println(name[4]);

        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception occured");
        }
    }
}
