package JavaCollectionsFrameworks;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 10);
        empIds.put("Tom", 20); //this is a mapping of keys to values, employee name to employee id
        empIds.put("Peter", 30);

        System.out.println(empIds); //prints all the mappings

        System.out.println(empIds.get("Tom")); //gets and prints the value of the key "Tom"

        System.out.println(empIds.containsKey("Peter")); //checks and prints if a certain key exists in the map
    }
}

/* 

1. names to be string and empIds to be integer
2. <String, Integer> means this is going to be a map of Strings to Integers
3. the keys are gonna be String and the values are gonna be Integer
4. we will map employee names to their ids, so this map will hold that information for us
5. HashMap is an implementation of Map interface
6. For key John it has a value of 10

*/