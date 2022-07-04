public class DequeX {

    private LinkedList<Integer> list;

    public DequeX()
    {
        list = new LinkedList<>();
    }

    public void add(int value)
    {
        list.add(value);
    }
    public void insertFirst(int value)
    {
        list.insertFirst(value);
    }

    public int deleteFirst()
    {
        int f = list.getFirst();
        list.deleteFirst();
        return f;
    }

    public int delete()
    {
        list.delete();
        int l = list.getReturnedLast();
        return l;
    }
}
