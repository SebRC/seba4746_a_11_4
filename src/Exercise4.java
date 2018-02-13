import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise4
{
    public static void main(String[] args)
    {
        //initializes an arraylist and fills it with elements
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(20);
        list.add(17);
        list.add(15);
        list.add(12);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(22);

        //initializes the class as to be able to access methods in class
        Exercise4 exercise4 = new Exercise4();

        //call of method and simultaneuous print of new list
        System.out.println(exercise4.partition(list, 10));

    }

    //method to partition a list, takes integer as partition point
    public List<Integer> partition(List<Integer> list, int value)
    {
        //initializes list to be used as partitioned list and an iterator for the list as well
        List<Integer> partitionedList = new ArrayList<>();
        Iterator<Integer> itr = list.iterator();

        //loops while there are more elements in the list to be examined
        while(itr.hasNext())
        {
            //initializes integer used for adding the current value to partitioned list
            int current = itr.next();

            //runs and adds elements less than value to list before doing it with elements larger than value
            if(current < value)
            {
                partitionedList.add(current);
            }
        }

        //new iterator for the same list as before
        //used to restart process of looking through elements, as to not miss ones already looked at
        Iterator<Integer> itr2 = list.iterator();

        //loops while there are more elements in list to be examined
        while(itr2.hasNext())
        {
            //initializes integer used for adding the current value to partitioned list
            int current = itr2.next();

            //adds the bigger elements to the partitioned list
            if(current >= value)
            {
                partitionedList.add(current);
            }
        }

        //returns the partitioned list
        return partitionedList;
    }
}
