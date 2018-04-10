public class BubbleSortByStep {
    private boolean needNextPass = true;

    public BubbleSortByStep() {
    }

    public void bubbleSortByStep(int[] list){
        needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]){
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false){
                System.out.println("array sorted and next pass not need");
                break;
            }
            System.out.println("List after the " + i + " sort");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }
    }
}
