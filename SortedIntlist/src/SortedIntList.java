public class SortedIntList extends IntList {
    public SortedIntList(int size) {
        super(size);
    }

    @Override
    public void add(int value) {
        if (numElements == list.length) {
            System.out.println("Can't add, list is full");
            return;
        }
        for (int i = 0; i < numElements; i++) {
            if (list[i] > value) {
                int temp = list[i];
                list[i] = value;
                value = temp;
            }
        }
        list[numElements] = value;
        numElements++;
    }
}