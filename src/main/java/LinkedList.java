public class LinkedList<T> {

    private Link<T> first;

    private Link<T> returnedLast;
    public LinkedList()
    {
        first = null;
    }

    public T getReturnedLast() {
        return returnedLast.value;
    }

    public T getFirst()
    {
        return first.value;
    }

       public void insertFirst(T value)
       {
           Link<T> link = new Link<>(value);

           if (first != null)
           {
               link.next = first;
               first.previous = link;
           }
           first = link;
       }

       //the same with inserting at the end
       public void  add(T value)
       {
           Link<T> current = first;
           if (first == null)
           {
               this.insertFirst(value);
           }
           else {
               Link<T> link = new Link<>(value);
               while (current.next != null) {
                   current = current.next;
               }
               current.next = link;
               link.previous = current;
           }
       }

       public boolean deleteFirst()
       {
           if (first == null)
           {
               return false;
           }
           first = first.next;
           return true;
       }


       //the same that deleting from end of list
     public boolean delete()
     {
         if (first == null)
         {
             return false;
         }
         Link<T> current = first;
         Link<T> previous = null;

         while (current.next!=null)
         {
             previous = current;
             current = current.next;
         }
         returnedLast = current;
         if (previous != null) {
             previous.next = null;
         }
         else {
             deleteFirst();
         }
         current.previous = null;

         return true;
     }

       public void displayList()
       {
           Link<T> current = first;
           while (current!=null)
           {
               System.out.println(current.value);
               current = current.next;
           }
       }
    class Link<T>
    {
        public T value;
        public Link<T> previous;
        public Link<T> next;

        public Link(T value) {
            this.value = value;
        }
    }
}
