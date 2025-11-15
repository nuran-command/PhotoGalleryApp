package com.project.visitor.concrete;

import com.project.gallery.GalleryImage;
import com.project.visitor.element.AbstractImageVisitor;

public class BatchExportVisitor extends AbstractImageVisitor {
    @Override
    public void visit(GalleryImage image) {
        System.out.println("Exporting image info: " + image.getName() + " | Rating: " + image.getRating());
    }
}