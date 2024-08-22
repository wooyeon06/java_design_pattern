package memento;

// Originator 클래스
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("현재 상태: " + state);
    }

    public Memento saveStateToMemento() {
        System.out.println("상태 저장: " + state);
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("상태 복원: " + state);
    }
}
