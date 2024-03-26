# Memento

When we want to have undo as a feature memento design pattern is used

we can save state of a object and collect it in a list and when undo is required we bring that object from list to current object

The Memento design pattern is a behavioral pattern that allows an object's state to be captured (encapsulated) externally so that it can be restored to that state later without violating encapsulation. It involves three main components:

Originator: The object whose state needs to be saved and restored. It creates a Memento object containing a snapshot of its current state and uses the Memento object to restore its state.

Memento: An object that stores the state of the Originator object. It provides a way to capture the state of the Originator and also a way to restore the Originator to that state.

Caretaker: The object that keeps track of multiple Memento objects. It is responsible for storing and retrieving Memento objects and does not modify or interpret their contents.

```
// Originator
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

// Memento
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Caretaker
class Caretaker {
    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retrieveMemento() {
        return memento;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Set state and save to memento
        originator.setState("State 1");
        caretaker.saveMemento(originator.saveStateToMemento());

        // Change state
        originator.setState("State 2");

        // Restore state from memento
        originator.getStateFromMemento(caretaker.retrieveMemento());

        System.out.println("Current state: " + originator.getState()); // Output: Current state: State 1
    }
}

```
