package com.project.controller;

import com.project.camera.facade.CameraFacade;
import com.project.filters.base.BasicImage;
import com.project.filters.base.DisplayableImage;
import com.project.filters.factory.FilterFactory;
import com.project.filters.factory.FilterType;
import com.project.gallery.GalleryImage;
import com.project.manager.AppManager;
import com.project.observer.observer.UserObserver;
import com.project.observer.subject.ImageGallery;
import com.project.sorting.context.ImageSorter;
import com.project.sorting.concrete.SortByDate;
import com.project.sorting.concrete.SortByName;
import com.project.sorting.concrete.SortByRating;
import com.project.util.Log;
import com.project.visitor.concrete.AverageRatingVisitor;
import com.project.visitor.concrete.BatchExportVisitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class GalleryController {
    private final CameraFacade camera;
    private final AppManager manager;
    private final ImageGallery gallerySubject;
    private final ImageSorter sorter;

    public GalleryController() {
        this.camera = new CameraFacade();
        this.manager = AppManager.getInstance();
        this.gallerySubject = new ImageGallery();
        this.sorter = new ImageSorter();
    }

    // -----------------------------------------------------
// OBSERVER
// -----------------------------------------------------
    public void registerUser(String username) {
        gallerySubject.addObserver(new UserObserver(username));
        Log.info(username + " subscribed to gallery updates.");
    }

    // -----------------------------------------------------
// FACADE + MANAGER + OBSERVER
// -----------------------------------------------------
    public void takePhoto(String name) {
        camera.takePhoto(name);

        GalleryImage img = new GalleryImage(name, LocalDate.now(), 0);
        manager.addImage(img);

        gallerySubject.addNewImage(name);
    }

    public void recordVideo() {
        camera.recordMovie();
    }

    // -----------------------------------------------------
// FILTER FACTORY + DECORATOR
// -----------------------------------------------------
    public DisplayableImage applyFilter(DisplayableImage original, FilterType type) {
        return FilterFactory.create(type, original);
    }

    // -----------------------------------------------------
// SHOW ALL IMAGES
// -----------------------------------------------------
    public List<GalleryImage> getAllImages() {
        return new ArrayList<>(manager.getImages());
    }

    // -----------------------------------------------------
// STRATEGY
// -----------------------------------------------------
    public void sortByDate() {
        sorter.setStrategy(new SortByDate());
        sorter.sortImages(new ArrayList<>(manager.getImages()));
    }

    public void sortByRating() {
        sorter.setStrategy(new SortByRating());
        sorter.sortImages(new ArrayList<>(manager.getImages()));
    }

    public void sortByName() {
        sorter.setStrategy(new SortByName());
        sorter.sortImages(new ArrayList<>(manager.getImages()));
    }

    // -----------------------------------------------------
// FILTER DEMO FOR UI
// -----------------------------------------------------
    public void demoFilters() {
        DisplayableImage img = new BasicImage();

        Log.info("Applying Grayscale:");
        DisplayableImage g = applyFilter(img, FilterType.GRAYSCALE);
        g.display();

        Log.info("Applying Sepia on top of grayscale:");
        DisplayableImage s = applyFilter(g, FilterType.SEPIA);
        s.display();
    }
    // -------------------- VISITOR PATTERN METHODS --------------------
    public void calculateAverageRating() {
        AverageRatingVisitor avgVisitor = new AverageRatingVisitor();
        for (GalleryImage img : manager.getImages()) {
            img.accept(avgVisitor);
        }
        System.out.println("Average Rating: " + avgVisitor.getAverage());
    }

    public void exportAllImages() {
        BatchExportVisitor exportVisitor = new BatchExportVisitor();
        for (GalleryImage img : manager.getImages()) {
            img.accept(exportVisitor);
        }
    }
}