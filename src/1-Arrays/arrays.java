public class arrays{
    public static void main(String[] args) {


        //datatype[] variable_name = new int[];
        //store 5 roll numbers in an array

        int[] roll_no = new int[5];
        roll_no[0] = 100;
        roll_no[1] = 102;
        roll_no[2] = 103;
        roll_no[3] = 104;
        roll_no[4] = 105;
        roll_no[5] = 106;


        //directly we can write it as:

        int[] roll_no2 = {10,20,22,35,40}; //Here the int data type represents the type of data stored in array

        //arrays can only have similar data type
        //int means only integers in the array, float means only float values in the array 

        int [] roll_nos; //declaration of an array, roll_nos is getting defined in the stack 
        roll_nos = new int[5]; //initialisation: here object is being created in the heap
    }
    }
