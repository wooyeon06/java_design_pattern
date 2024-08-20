package starategy;

public class SortContext {
    private SortStrategy strategy;

    // 전략 설정
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    // 정렬 수행
    public void sortArray(int[] numbers) {
        strategy.sort(numbers);
    }
}
