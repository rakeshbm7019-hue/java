import java.util.*;

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}

interface Observer {
    void update(String state);
}

class ConsoleObserver implements Observer {
    public void update(String state) {
        System.out.println("Console received update: " + state);
    }
}

class LogObserver implements Observer {
    public void update(String state) {
        System.out.println("Log entry created: " + state);
    }
}


class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.attach(new ConsoleObserver());
        subject.attach(new LogObserver());

        subject.setState("Event #1 occurred");
        subject.setState("Event #2 occurred");
    }
}
