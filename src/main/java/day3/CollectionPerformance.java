package day3;
import java.util.*;
public class CollectionPerformance {

    public static void main(String[] args) {
        //4) Check performance for some List operations (get(i), insertAfter(i), ..)
        // for different collection implementations.
        List<String> arrayList = new ArrayList<>(Arrays.asList(("Check performance for some List operations (get(i), " +

                "insertAfter(i), ..) for different collection implementations.").split(" ")));
        List<String> linkedList = new LinkedList<>(arrayList);

        arrayList = generateAdditional(arrayList);
        linkedList = generateAdditional(linkedList);
        System.out.println("");
        System.out.println("arrayList:" + checkGet(arrayList));
        System.out.println("linkedList:" + checkGet(linkedList));
        System.out.println("");
        System.out.println("arrayList:" + checkIn(arrayList));
        System.out.println("linkedList:" + checkIn(linkedList));

    }
    private static List<String> generateAdditional(List<String> list) {
        for(int i = 0; i < 10; i++){
            list.addAll(list);
        }
        return list;
    }

    private static long checkGet(List<String> arrayList) {
        long start = new Date().getTime();
        int size = arrayList.size();
        for(int i = 0; i < 1000; i++) {
            int randIndex = new Random().nextInt(size);
            int wSize = arrayList.get(randIndex).length();

        }return new Date().getTime() - start;
    }

    private static long checkIn(List<String> list) {
        long start = new Date().getTime();
        int size = list.size();

        for(int i = 0; i < 1000; i++) {
            int randIndex = new Random().nextInt(size);
            list.set(randIndex, "hi");
        }
        return new Date().getTime() - start;
    }

}
