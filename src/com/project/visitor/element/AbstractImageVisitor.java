package com.project.visitor.element;

import com.project.visitor.ImageVisitor;
import com.project.gallery.GalleryImage;

public abstract class AbstractImageVisitor implements ImageVisitor {
    @Override
    public abstract void visit(GalleryImage image);

    // Optional: add shared helper methods
    protected void log(String message) {
        System.out.println("[Visitor] " + message);
    }
}