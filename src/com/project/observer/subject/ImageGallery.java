package com.project.observer.subject;

import com.project.observer.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class ImageGallery implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) { observers.add(observer); }

    @Override
    public void removeObserver(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addNewImage(String imageName) {
        System.out.println("ImageGallery: New image added: " + imageName);
        notifyObservers("New image added: " + imageName);
    }
}