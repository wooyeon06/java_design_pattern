package state;

class DoorOpenState implements State {
    @Override
    public void handleState(DoorContext context) {
        System.out.println("The door is now open.");
        context.setState(this);
    }

    public String toString() {
        return "Open State";
    }
}
