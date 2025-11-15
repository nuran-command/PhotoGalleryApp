package com.project.gallery;

import com.project.controller.GalleryController;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Photo Gallery App ===");

        GalleryController controller = createController();
        setupDemo(controller);

        System.out.println("\n=== Demo Finished ===");
    }

    // Extracted method for creating the controller
    private static GalleryController createController() {
        return new GalleryController();
    }

    // Extracted method for running the full demo
    private static void setupDemo(GalleryController controller) {
        // ---------------------------
        // OBSERVER: Register users
        // ---------------------------
        controller.registerUser("User1");
        controller.registerUser("User2");

        // ---------------------------
        // FACADE + MANAGER + OBSERVER: Take photos
        // ---------------------------
        controller.takePhoto("Holiday");
        controller.takePhoto("Family");
        controller.takePhoto("Birthday");

        // Adjust dates and ratings for diversity
        controller.getAllImages().get(0).setDate(LocalDate.of(2025, 11, 9));
        controller.getAllImages().get(0).setRating(5);

        controller.getAllImages().get(1).setDate(LocalDate.of(2025, 10, 20));
        controller.getAllImages().get(1).setRating(4);

        controller.getAllImages().get(2).setDate(LocalDate.of(2025, 9, 15));
        controller.getAllImages().get(2).setRating(3);

        // ---------------------------
        // FILTER FACTORY + DECORATOR demo
        // ---------------------------
        controller.demoFilters();

        // ---------------------------
        // STRATEGY: Sort images
        // ---------------------------
        System.out.println("\n--- Sort by Date ---");
        controller.sortByDate();
        controller.getAllImages().forEach(GalleryImage::displayInfo);

        System.out.println("\n--- Sort by Rating ---");
        controller.sortByRating();
        controller.getAllImages().forEach(GalleryImage::displayInfo);

        System.out.println("\n--- Sort by Name ---");
        controller.sortByName();
        controller.getAllImages().forEach(GalleryImage::displayInfo);

        // ---------------------------
        // VISITOR PATTERN: Analyze / Export images
        // ---------------------------
        System.out.println("\n--- Visitor: Average Rating ---");
        controller.calculateAverageRating();

        System.out.println("\n--- Visitor: Export All Images ---");
        controller.exportAllImages();
    }

}