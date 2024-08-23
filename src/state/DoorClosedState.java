package state;

class DoorClosedState implements State {
    @Override
    public void handleState(DoorContext context) {
        System.out.println("The door is now closed.");
        context.setState(this);
    }

    public String toString() {
        return "Closed State";
    }
}
