package InterviewQuestions;

public class Factorial {
    public static void main(String[] args) {
        
        //Ascending Order --> 5! = 1 * 2 * 3 * 4 * 5 = 120
        int num = 5;

        long factorial = 1;

        //5 will be included in the calculation too so <= will be used here for num variable
        for(int i = 1; i <= num; i++){

            //
            factorial = factorial * i; //1 //2 //6 //24 //120
        }

        System.out.println("Factorial from method 1 is: " + factorial);


        //Descending number -> 5 * 4 * 3 * 2 * 1
        // int num2 = 5;

        // long factorial2 = 1;

        // for(int i = num2; i >= 1; i--){
        //     factorial2 = factorial2 * i;
        // }
        // System.out.println("Factorial from method 2 is: " + factorial2);
    }
}


//Logic behind this problem:

// We have to multiply at each point, so in order to multiply 5 values from 1-5, we need to loop through them and multiply each value of loop to 
// the factorial variable which is holding 1 initially but will change according to the condition when we will multiply it by value of i.

// Humay har point pe multiply karna hai numbers ko, to agar 5 ka factorial nikalne k liye 1-5 multiplication karni hai to loop karna parega from 
// 1-5, pehle factorial variable banadia hai jiski value 1 rakhdi hai taa k uski value loop k accordingly change ho kyun k hum factorial variable 
// value ko loop wali values se multiply karwa rahe hain