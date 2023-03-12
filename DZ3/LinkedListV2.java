public class LinkedListV2<T> {

    public NodeV2 head;
    public NodeV2 tail;
    public int count;

    public class NodeV2{
        public T value;
        public NodeV2 next;
        public NodeV2 prev;
    }

    public NodeV2 addFirst(T value){
        NodeV2 node = new NodeV2();
        node.value = value;
        if (head == null)
            tail = node;
        else{
            node.next = head;
            head.prev = node;
        }
        head = node;
        count++;
        return node;
    }

    public void RemoveFirst(){
        if (head != null && head.next != null){
            NodeV2 node = head;
            node.next.prev = null;
            head = head.next;
            count--;
        }
        else{
            head = null;
            tail = null;
            count = 0;
        }
    }



}