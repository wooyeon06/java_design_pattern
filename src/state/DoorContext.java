package state;

class DoorContext {
    private State currentState;

    public DoorContext() {
        this.currentState = null;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getState() {
        return currentState;
    }

    public void applyState() {
        this.currentState.handleState(this);
    }
}
