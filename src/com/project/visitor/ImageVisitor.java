package com.project.visitor;

import com.project.gallery.GalleryImage;

public interface ImageVisitor {
    void visit(GalleryImage image);
}