package providerconsumer;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // 큐가 가득 차면 대기
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // 컨슈머에게 알림
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // 큐가 비어 있으면 대기
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);

        notifyAll(); // 프로바이더에게 알림
        return value;
    }
}
