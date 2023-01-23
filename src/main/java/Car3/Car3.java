package Car3;

public class Car3 {
    private String color;
    private String type;
    private Integer year;

    public void getColor() {
        System.out.println(color);
    }

    public void getType() {
        System.out.println(type);
    }


    public void getYear() {
        System.out.println(year);
    }

    public Car3() {

    }

    //  Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
    public void startCar() {
        System.out.println("Автомобиль заведен");
    }

    // Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
    public void stopCar() {
        System.out.println("Автомобиль заглушен");
    }

    //  Третий — присвоение автомобилю года выпуска.
    public void setYear(Integer year) {
        this.year = year;
    }

    // Четвертый метод — присвоение автомобилю типа.
    public void setType(String type) {
        this.type = type;
    }

    //  Пятый — присвоение автомобилю цвета.
    public void setColor(String color) {
        this.color = color;
    }

}


