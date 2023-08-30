import java.util.ArrayList;
import java.util.List;
public class ListFiltering {
    /*
    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
Example

Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)

     */
    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for(Object item : list){
            if(item instanceof Integer){
                result.add(item);
            }

        }return  result;
    }

    public static void main(String[] args) {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add("a");
        input.add("d");

        System.out.println("Nowa tablica: " + filterList(input));




    }
}
