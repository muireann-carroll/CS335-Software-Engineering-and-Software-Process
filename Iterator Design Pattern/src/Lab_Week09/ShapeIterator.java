package Lab_Week09;
import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private Shape[] shapes;
    private int pos;

    ShapeIterator(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        return pos < shapes.length && shapes[pos] != null;
    }

    @Override
    public Shape next() {
        return shapes[pos++];
    }

    boolean hasPrev() {
        return pos > 0 && shapes[pos-1] != null;
    }

    public Shape prev() {
        return shapes[--pos];
    }

    @Override
    public void remove() {
        if (pos <= 0)
            throw new IllegalStateException("Illegal position");
        if (shapes[pos - 1] != null) {
            if (shapes.length - 1 - pos - 1 >= 0)
                System.arraycopy(shapes, pos -1 + 1, shapes, pos - 1, shapes.length - 1 - pos - 1);
            shapes[shapes.length - 1] = null;
        }
    }

    /*public boolean contains(String Shape) {
    	if(shape == null || shape.length() <= 0) return false;
        for (Shape s : shapes) {
            if (s.getName().equals(Shape)) return true;
        }
    }
        return false;
    }*/
    public boolean contains(String shape) {
        if (shape == null || shape.length() <= 0) return false;
        for (Shape s : shapes){
            if(s!=null){
                if(s.getName().equals(shape)) return true;
            }
        }
        return false;
    }
}
