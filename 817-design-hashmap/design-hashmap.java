class MyHashMap {

    private static class Node{
        int key;
        int value;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private final Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];

        for(int i = 0; i < SIZE; i++){
            buckets[i] = new Node(-1, -1);
        }
    }

    private int hash(int key){
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        Node current = buckets[index];

        while(current.next != null){
            current = current.next;

            if(current.key == key){
                current.value = value;
                return;
            }
        }

        current.next = new Node(key, value);
    }
    
    public int get(int key) {

        int index = hash(key);
        Node current = buckets[index].next;

        while(current != null){
            if(current.key == key){
                return current.value;
            }

            current = current.next;
        } 

        return -1;        
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node previous = buckets[index];

        while(previous.next != null){
            if(previous.next.key == key){
                previous.next = previous.next.next;
                return;
            }

            previous = previous.next;
        }


    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */