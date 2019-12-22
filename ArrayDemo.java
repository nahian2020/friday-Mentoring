public class ArrayDemo {
    /**
     * 1. Each method shall take array as argument
     * 2. iterate using for each loop
     * 3.  one method using for loop and one for each for loop
     * 4. Main method should have minimum code (3 lines or 2lines)
     * */

    int[] a= {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[] studentId ={12,14,16,18,20,22,24,26,28};
    int[] num ={21,25,16,102,20,22,24,25,28};

    public static void main(String[] args) {
        ArrayDemo s1=new ArrayDemo();
        //s1.readArrayUsingForLoop(s1.studentId);
        s1.readArrayUsingForLoop(s1.a);
        System.out.println(">>>>>>>>>>>");
        s1.readArrayUsingForEachLoop(s1.num);

    }
    public void readArrayUsingForLoop( int [] arrayb ){

        for(int i=0; i<arrayb.length; i++){
            System.out.println(arrayb[i]);
        }
        System.out.println();
        //Cant hard code any array here
    }
    public void readArrayUsingForEachLoop(int [] array){

        for (int i : array){
            System.out.println(i);
        }

    }


    

