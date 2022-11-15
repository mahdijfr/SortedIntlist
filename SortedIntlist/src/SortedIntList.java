public class SortedIntList extends IntList {

    int temp=0;
    public SortedIntList(int size) {
        super(size);
    }

    public void add(int value) {
        if (numElements == list.length) System.out.println(
                "Can't add, list is full"
        ); else {
                for (int i = 0; i <numElements; i++) {
                    for (int j = 0; j < numElements - i - 1; j++) {
                        if (list[j + 1] < list[j]) {
                            temp = list[j + 1];
                            list[j + 1] = list[j];
                            list[j] = temp;
                        }
                    }
                }
            list[numElements] = value;
            numElements++;
        }
    }
}