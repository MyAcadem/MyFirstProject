package january13.example;

public abstract class Shape {


    private boolean isFilled;

    private String color;


    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;


    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();


    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "Shape{" +
                "isFilled=" + isFilled +
                ", color='" + color + '\'' +
                '}';
    }
}






