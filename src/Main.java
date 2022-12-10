public class Main {
    public static void main(String[] args) {

        // Box деген generic класс тузунуз.
        // Ичинде Box деген объектти кайтарган статический generic метод болсун.

        Box<String, Double, Box> box = new Box("Refrigerator's box", 75.60, 75.30, 185.20);


        System.out.println(Box.method(box));
    }
}