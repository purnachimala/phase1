package Com.pack1;
import java.util.*;

public class QueueProgram 
{
   public static void main(String[] args) 
   {  
    Queue<String> str_queue = new LinkedList<>();
    str_queue.add("Bike");
    str_queue.add("Car");
    str_queue.add("Train");
    str_queue.add("Buses");
    System.out.println("The Queue Data:" + str_queue);
    }
}