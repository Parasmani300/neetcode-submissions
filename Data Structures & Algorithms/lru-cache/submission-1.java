class LRUCache {
    class Node{
        int key;
        int val;
        Node prev,next;
        Node(int key,int val)
        {
            this.key = key;
            this.val = val;
        }
    }

    private final int capacity;
    private final Map<Integer,Node> map;
    private final Node head,tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        
        Node res = map.get(key);
        remove(res);
        insertAtHead(res);
        return res.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node res = map.get(key);
            res.val = value;
            remove(res);
            insertAtHead(res);
            return;
        }

        if(map.size() == capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        Node node = new Node(key,value);
        map.put(key,node);
        insertAtHead(node);
    }

    public void remove(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertAtHead(Node node)
    {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
