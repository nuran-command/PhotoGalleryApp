package com.project.gallery;

import com.project.camera.facade.CameraFacade;
import com.project.filters.base.BasicImage;
import com.project.filters.factory.FilterFactory;
import com.project.manager.AppManager;
import com.project.observer.observer.Observer;
import com.project.observer.subject.ImageGallery;
import com.project.sorting.context.ImageSorter;
import com.project.sorting.strategy.SortByDate;
import com.project.sorting.strategy.SortByRating;

import java.time.LocalDate;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // --- Observer Demo ---
        ImageGallery gallerySubject = new ImageGallery();
        Observer user1 = message -> System.out.println("User1 notified: " + message);
        Observer user2 = message -> System.out.println("User2 notified: " + message);

        gallerySubject.addObserver(user1);
        gallerySubject.addObserver(user2);

        gallerySubject.addNewImage("photo1.jpg");

        // --- Facade Demo ---
        CameraFacade camera = new CameraFacade();
        camera.takePhoto();
        camera.recordMovie();

        // --- Decorator Demo ---
        BasicImage originalImage = new BasicImage();
        var grayImage = FilterFactory.applyFilter("grayscale", originalImage);
        var sepiaImage = FilterFactory.applyFilter("sepia", originalImage);

        System.out.println("\n--- Display Images with Filters ---");
        grayImage.display();
        sepiaImage.display();

        // --- Singleton Demo ---
        AppManager manager = AppManager.getInstance();
        manager.addImage(new Image("Holiday", LocalDate.of(2025, 11, 9), 5));
        manager.addImage(new Image("Birthday", LocalDate.of(2025, 10, 20), 4));

        // --- Strategy Demo ---
        ImageSorter sorter = new ImageSorter();
        List<Image> images = manager.getImages();

        System.out.println("\n--- Sort by Date ---");
        sorter.setStrategy(new SortByDate());
        sorter.sortImages(images);
        images.forEach(Image::displayInfo);

        System.out.println("\n--- Sort by Rating ---");
        sorter.setStrategy(new SortByRating());
        sorter.sortImages(images);
        images.forEach(Image::displayInfo);
    }
}