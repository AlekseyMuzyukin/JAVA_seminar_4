import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int size = 10;
        int max = 20;
        LinkedList<Integer> def = FillList(size, max);
        System.out.println("Исходный LinkedList: " + def);
        LinkedList<Integer> rev = NewRevertedList(def);
        System.out.println("Обратный LinkedList: " + rev);
    }

    public static LinkedList<Integer> FillList(int size, int max) {
        LinkedList<Integer> defList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            defList.add(rand.nextInt(max));
        }
        return defList;
    }

    public static LinkedList<Integer> NewRevertedList(LinkedList<Integer> listToRevert) {
        LinkedList<Integer> newList = new LinkedList<>();
        int size = listToRevert.size();
        for (int i = size - 1; i >= 0; i--) {
            newList.add(listToRevert.get(i));
        }
        return newList;
    }

    public static void RevertList(LinkedList<Integer> listToRevert) {
        int size = listToRevert.size();
        int distance = size;
        int i = 0;
        while (distance > 1) {
            int tmp = listToRevert.get(i);
            listToRevert.set(i, listToRevert.get(size - i - 1));
            listToRevert.set(size - i - 1, tmp);
            i++;
            distance = size - 2 * i;
        }
    }

    public static void RevertListColl(LinkedList<Integer> listToRevert) {
        Collections.reverse(listToRevert);
    }
}