package org.zad_1;

public class Kwadrat extends Prostokąt implements Kształt {

    public Kwadrat(double size) {
        super(size, size);
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4 * getLength();
    }
}
