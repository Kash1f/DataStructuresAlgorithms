//Q1. Search in String

package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Ronaldo";
        char target = 'o';
        System.out.println(search(name, target));
        
    }


    static boolean search(String str char target){
        if(str.length()==0){
            return false;
        }
       

    
    for(char ch : str.toCharArray()){
        if(ch == target){
            return true;
        }
    }

    return false;
}