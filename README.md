# MementoPattern
The Memento Pattern is a behavioral design pattern that provides a way to capture and externalize the internal state of an object without exposing its internal structure. This allows you to save the object's state at a specific point in time and restore it later, effectively providing the ability to undo or roll back changes made to the object.

![image](https://github.com/MarlonMontenegro/MementoPattern/assets/103525183/3be4e3cc-7a0e-4197-91f5-844a7b826ec3)

Originator: This is the object whose state needs to be saved. It creates a Memento object to store its internal state and can also restore its state from a Memento.

Memento: The Memento is an object that stores the internal state of the Originator. It does so without exposing the details of that state. It typically provides methods to get and set the state.

Caretaker: The Caretaker is responsible for keeping track of Memento objects. It doesn't operate on or modify the Mementos; instead, it stores them and can later provide them back to the Originator to restore its state.

Here's a basic sequence of actions in the Memento Pattern:

The Originator creates a Memento object to store its current state.
The Originator sets its state (possibly making changes).
The Originator can save the Memento to a Caretaker.
Later, if needed, the Originator can request the state to be restored from a specific Memento stored by the Caretaker.
