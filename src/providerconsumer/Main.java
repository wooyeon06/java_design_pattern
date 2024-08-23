package providerconsumer;

/**
 *
 프로바이더-컨슈머(Provider-Consumer) 패턴은 소프트웨어 디자인 패턴 중 하나로,
 프로바이더(Producer)와 컨슈머(Consumer) 간의 데이터를 생산하고 소비하는 구조를 정의합니다. 이

 패턴은 특히 멀티스레딩 환경에서 자주 사용되며, 하나 이상의 프로바이더가 데이터를 생성하고 이를 큐(queue)나 버퍼(buffer)에 저장하면,
 컨슈머가 큐나 버퍼에서 데이터를 꺼내 처리하는 방식으로 동작합니다.

 이 패턴은 프로바이더와 컨슈머 간의 비동기적 작업을 효율적으로 처리하는 데 매우 유용합니다.

 1. notify()
 동작 방식: notify()는 wait() 상태에 있는 스레드 중 하나를 임의로 깨웁니다. 어느 스레드가 깨어날지는 자바 가상 머신(JVM)이 결정합니다.
 사용 시기: notify()는 여러 스레드가 동일한 모니터(monitor)에서 대기하고 있지만, 그중 오직 하나의 스레드만이 작업을 수행할 수 있는 상황에서 유용합니다.
 문제점: notify()를 사용할 때, 깨어난 스레드가 실제로 필요한 작업을 수행할 수 있는 상태인지 확실하지 않기 때문에,
 나머지 스레드들은 여전히 wait() 상태에 머물러 있어야 할 경우가 있을 수 있습니다.

 2. notifyAll()
 동작 방식: notifyAll()은 wait() 상태에 있는 모든 스레드를 깨웁니다. 깨어난 모든 스레드는 다시 모니터를 얻기 위해 경쟁하게 됩니다.
 사용 시기: notifyAll()은 여러 스레드가 동일한 조건을 기다리고 있고,
 그중 일부 또는 모든 스레드가 작업을 수행할 수 있는 상황에서 유용합니다.
 예를 들어, 큐에서 데이터를 소비하는 여러 스레드가 있을 때,
 하나의 notify()로는 한 스레드만 깨워지기 때문에 나머지 스레드는 대기 상태로 남아 있을 수 있습니다.
 이때 notifyAll()을 사용하여 모든 스레드를 깨워야 합니다.

 */
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
