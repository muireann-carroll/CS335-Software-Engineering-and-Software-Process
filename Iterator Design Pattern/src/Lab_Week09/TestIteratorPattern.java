package Lab_Week09;

public class TestIteratorPattern {

    public static void main(String[] args) {
        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Circle");
        storage.addShape("Rectangle");
        storage.addShape("Square");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());
        System.out.println("\nNext");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nContains 'Square': " + iterator.contains("Square"));
        System.out.println("\nPrev");
        while (iterator.hasPrev()){
            System.out.println(iterator.prev());
        }

    }

}
