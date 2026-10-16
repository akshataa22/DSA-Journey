package Day04;

public class Generics {
    public static void main(String[] args) {
        class Box<T> {
            private T value;

            Box(T value) {
                this.value = value;
            }

            T getValue() {
                return value;
            }
        }

        Box<Integer> numberBox = new Box<>(100);
        Box<String> textBox = new Box<>("Hello");

        System.out.println(numberBox.getValue());
        System.out.println(textBox.getValue());
    }
}
