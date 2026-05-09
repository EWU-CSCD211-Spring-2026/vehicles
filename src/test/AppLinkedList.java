
package test;
import list.*;

public class AppLinkedList {

    public static void main(String[] args) {

        //Type name = new Implementation();

        List<String> list = new LinkedList<>();

        System.out.println(list.toString());

        list.addLast("A");
        System.out.println(list.toString());

        list.addLast("B");
        System.out.println(list.toString());


        list.addLast("C");
        System.out.println(list.toString());

        System.out.println("Test Pass/Fail: " + list.toString().equals("[A,B,C,]"));

        List<String> list = new LinkedList<>();

        System.out.println(list.toString());

        list.addLast("A");
        System.out.println(list.toString());


        System.out.println("Test Pass/Fail: " + list.toString().equals("[A,]"));

        // then test size() 
        //

        // ...

    }

}
