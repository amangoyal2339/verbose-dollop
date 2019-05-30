import java.util.*;
public class driver {

    public void display(fruit[] fruits) { // static shoould be used public static void .....
        for(int i=0;i<3;i++) 
            System.out.println(fruits[i].shape + " "+ fruits[i].color +" " +fruits[i].name );
            //System.out.println(fruits[i]); will also work
    }
    public static void main(String[] args) {
        fruit[] fruits = new fruit[3];
        fruits[0]=new fruit("long","yellow","banana");
        fruits[1]=new fruit("round","green","watermelon");
        fruits[2]=new fruit("round","red","apple");
        driver Driver=new driver();
        Driver.display(fruits); // to avoid static at the top
        // new driver().display(fruits); willl also work 

        ArrayList<fruit> fruitList = new ArrayList<>();
        fruitList.add(new fruit("long","yellow","banana"));
        fruitList.add(new fruit("round","green","watermelon"));
        fruitList.add(new fruit("round","red","apple"));
        System.out.println(fruitList);

        fruitList.remove(2);
        System.out.println(fruitList);

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        System.out.println(integerList);
     }
     
}