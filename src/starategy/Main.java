package starategy;

/**
 * 1. 알고리즘 캡슐화: 전략 패턴에서는 특정 기능이나 알고리즘을 여러 개의 구체적인 전략 클래스(Concrete Strategy)로 분리하여 구현합니다.
 *  이 전략 클래스들은 동일한 인터페이스(Strategy Interface)를 구현하므로, 클라이언트는 인터페이스를 통해 알고리즘을 사용할 수 있습니다.
 *
 * 2. 동적 알고리즘 선택: 클라이언트는 런타임에 필요한 전략을 선택하거나 변경할 수 있습니다.
 * 이렇게 하면 특정 행동을 수행하는 방식이 유연하게 변경될 수 있습니다.
 *
 * 3. 클라이언트 코드의 단순화: 클라이언트는 전략 패턴을 사용함으로써,
 * 알고리즘의 구체적인 구현에 대해 신경 쓰지 않고, 전략 객체를 통해 필요한 작업을 수행할 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {

        SortContext context = new SortContext();

        int[] numbers = {5, 2, 9, 1, 5, 6};

        // 퀵 정렬 사용
        context.setStrategy(new QuickSort());
        context.sortArray(numbers);

        // 병합 정렬로 변경
        context.setStrategy(new MergeSort());
        context.sortArray(numbers);

    }


    public static class BubbleSort implements SortStrategy {
        @Override
        public void sort(int[] numbers) {
            // 버블 정렬 구현
            System.out.println("BubbleSort .. sort()");
        }
    }

    public static class QuickSort implements SortStrategy {
        @Override
        public void sort(int[] numbers) {
            // 퀵 정렬 구현
            System.out.println("QuickSort .. sort()");
        }
    }

    public static class MergeSort implements SortStrategy {
        @Override
        public void sort(int[] numbers) {
            // 병합 정렬 구현
            System.out.println("MergeSort .. sort()");
        }
    }

}
