# PhotoGalleryApp – Filters Module (Student 1 Work)

## Introduction
This part of the project implements image filters using two design patterns:
1. **Decorator Pattern** – Allows applying image filters dynamically at runtime without modifying the original image class.
2. **Factory Method Pattern** – Provides a centralized way to create filter objects based on user selection.

This ensures the system is extendable, flexible, and easy to maintain if new filters are added in the future.

---

## Body

### Pattern 1: Decorator Pattern

**Purpose:**  
Decorator allows adding additional behavior (filters) to an image object without changing its original class.  
Each filter is wrapped around the `Image` object and enhances the `display()` action.

#### UML Diagram
Decorator UML
        <<interface>>
        Image
           ^
           |
      BasicImage
           ^
           |
   -------------------------
   |       ImageFilterDecorator (abstract)
   |                ^
   |                |
   |     -------------------------
   |     |                       |
GrayscaleFilter           SepiaFilter

Factory Method UML
        FilterFactory
              |
              |  creates (based on type)
              v
   -------------------------
   |                       |
GrayscaleFilter       SepiaFilter
        ^                 ^
        |                 |
       both decorate → Image (interface)
