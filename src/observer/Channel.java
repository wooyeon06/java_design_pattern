package observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject 클래스
class Channel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void upload(String message) {
        this.message = message;
        System.out.println("Channel uploaded: " + message);
        notifyObservers();
    }
}
