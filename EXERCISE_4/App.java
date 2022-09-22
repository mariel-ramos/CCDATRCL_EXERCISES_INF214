import java.util.LinkedList;
import java.util.Queue;

public class App {
     public static void main(String[] args) {
        Queue<String> INF214Class = new LinkedList<>();

        //Add elements from the INF214 Class to the Queue
        INF214Class.add("James");
        INF214Class.add("John Paul");
        INF214Class.add("Victoria");
        INF214Class.add("Idel");
        INF214Class.add("Lawrence");


        //Display the size of the queue
        System.out.println(INF214Class.size());

        //Display the element at the front of the queue
        System.out.println(INF214Class.peek());

        //Remove the element at the front of the Queue
        System.out.println(INF214Class.remove());

        // //Remove the element at the front of the Queue
        System.out.println(INF214Class.remove());

         //Remove the element at the front of the Queue
         System.out.println(INF214Class.remove());

          //Remove the element at the front of the Queue
        System.out.println(INF214Class.remove());

         //Remove the element at the front of the Queue
         System.out.println(INF214Class.remove());

         //Add another 5 people of the Class INF214
         INF214Class.add("Wina");
         INF214Class.add("Jonnah");
         INF214Class.add("Angelo");
         INF214Class.add("Seth");
         INF214Class.add("Clariz");

         //Display the size of the queue
         System.out.println(INF214Class.size()); 

        //Display the element at the front of the queue
        System.out.println(INF214Class.peek());
        

        
    }
}

