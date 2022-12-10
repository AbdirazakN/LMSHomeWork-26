public class Box<T, E, T2> {

    private T whoseBox;
    private E width;
    private E length;
    private E height;

    public Box(T whoseBox, E width, E length, E height) {
        this.whoseBox = whoseBox;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public T getWhoseBox() {
        return whoseBox;
    }

    public void setWhoseBox(T whoseBox) {
        this.whoseBox = whoseBox;
    }

    public E getWidth() {
        return width;
    }

    public void setWidth(E width) {
        this.width = width;
    }

    public E getLength() {
        return length;
    }

    public void setLength(E length) {
        this.length = length;
    }

    public E getHeight() {
        return height;
    }

    public void setHeight(E height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\n>>>>>>>>>>>  Box  <<<<<<<<<<<" +
                "\nWhose box: " + whoseBox +
                "\nWidth:     " + width + " sm" +
                "\nLength:    " + length + " sm" +
                "\nHeight:    " + height + " sm" +
                "\n";
    }

    public static <T2> T2 method(T2 box) {
        return box;
    }
}
