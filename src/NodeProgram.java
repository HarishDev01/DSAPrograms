public class NodeProgram {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(9);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(7);


        linkedList.addFirst(10);

        linkedList.delete(2);
       linkedList.printValues();
    }
}
