import java.util.*;

public class hash {
    public static void main(String[] args) {
    LinkedHashMap <Integer,String> studentHashMap= new LinkedHashMap<>();
        studentHashMap.put(1,"aman");
        studentHashMap.put(2,"harsh");
        studentHashMap.put(3,"goyal");
        studentHashMap.put(4,"raj");
        studentHashMap.put(5,"rr");
        studentHashMap.put(5,"rssr");

        System.out.println(studentHashMap);
    }
}