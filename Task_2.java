import java.util.LinkedList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int size = 20;
        int max = 50;
        LinkedList<Integer> def = FillList(size, max);
        System.out.println(def);
        enqueue(def, 99);
        System.out.println("\n"+def);
        System.out.println("Первый элемент к удалению: " + dequeue(def) + "\n");
        System.out.println(def);
        System.out.println("Первый элемент: " + firstElem(def) + "\n");
    }

    public static LinkedList<Integer> FillList(int size, int max) {
        LinkedList<Integer> defList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            defList.add(rand.nextInt(max));
        }
        return defList;
    }

    public static void enqueue(LinkedList<Integer> list, int lastElem) {
        list.add(lastElem);
    }


    public static int dequeue(LinkedList<Integer> list) {
        int first = list.getFirst();
        list.removeFirst();
        return first;
    }

    public static int firstElem(LinkedList<Integer> list) {
        return list.get(0);
    }
}
