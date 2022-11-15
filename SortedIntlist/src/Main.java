public class Main
{
    public static void main(String[] args)
    {
        SortedIntList myList = new SortedIntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        System.out.println(myList.toString());
    }
}