//双链表+哈希表

class LRUCache {

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        this.head.next = tail;
        this.tail.prev = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) return -1;

        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = this.head.next;
        node.prev = this.head;
        this.head.next.prev = node;
        this.head.next = node;
        cache.put(key, node);

        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode(key, value);
            
            newNode.next = this.head.next;
            newNode.prev = this.head;
            this.head.next.prev = newNode;
            this.head.next = newNode;
            
            cache.put(key, newNode);
            this.size++;
            if (size > capacity) {
                cache.remove(tail.prev.key);

                this.tail.prev.prev.next = this.tail;
                this.tail.prev = this.tail.prev.prev;
                
                this.size--;
            }
        } else {
            if (size > capacity) {
                cache.remove(tail.prev.key);

                this.tail.prev.prev.next = this.tail;
                this.tail.prev = this.tail.prev.prev;

                this.size--;
            }
            node.value = value;

            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.next = this.head.next;
            node.prev = this.head;
            this.head.next.prev = node;
            this.head.next = node;
            cache.put(key, node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */