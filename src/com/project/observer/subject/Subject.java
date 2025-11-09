package com.project.observer.subject;

import com.project.observer.observer.*;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}