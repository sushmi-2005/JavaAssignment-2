package thirdsemjavalab;

import java.util.Scanner;

class Rectangle implements Resizable {
    private int height;
    private int width;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void ResizeHeight(int height) {
        this.height = height;
    }
    public void ResizeWidth(int width) {
        this.width = width;
    }
    public String toString() {
        return "height: " + this.height + " width: " + this.width;
    }
}

interface Resizable {
    void ResizeHeight(int height);
    void ResizeWidth(int width);
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height and width of rectangle:");
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println(rectangle);

        System.out.println("Enter the new height and width:");
        int newHeight = scanner.nextInt();
        int newWidth = scanner.nextInt();

        Resizable resizable = new Rectangle();
        resizable.ResizeHeight(newHeight);
        resizable.ResizeWidth(newWidth);

        System.out.println((Rectangle) resizable);
    }
}

