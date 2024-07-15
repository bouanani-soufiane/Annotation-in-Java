# Annotation-in-Java


![java annotation diagram](images/JavaAnnotations.jpg)

##  <i> There are broadly 5 categories of annotations as listed: </i>

* Single value Annotations
* Marker Annotations
* Full Annotations
* Type Annotations
* Repeating Annotations

##  <i>  Predefined/ Standard Annotations </i>

Java popularly defines seven built-in annotations 

* Four are imported from java.lang.annotation: @Retention, @Documented, @Target, and @Inherited.
* Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings


## How Annotations Work

Annotations in Java are processed at compile time or runtime, depending on their retention policy. The retention policy is specified by the @Retention annotation, and it can be one of three values: SOURCE, CLASS, or RUNTIME.

<b> SOURCE </b>: Annotations are only available in the source code and are discarded during compilation. <br>
<b> CLASS </b>: Annotations are included in the class file but not accessible at runtime.<br>
<b> RUNTIME </b>: Annotations are retained at runtime and can be accessed programmatically through reflection.<br>
The @Target annotation specifies the types of program elements to which an annotation can be applied. For example, if an annotation is designed for methods, you would use @Target(ElementType.METHOD).