public class BubbleSortByStepTest {
    public static void main(String[] args) {
        BubbleSortByStep listSort = new BubbleSortByStep();
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        System.out.println("list befor sort");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();

        listSort.bubbleSortByStep(list);
    }
}
