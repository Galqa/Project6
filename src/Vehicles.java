/* Створіть проект за допомогою IntelliJ IDEA.
 Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
 який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(), який повертає рядок з кольором автомобіля,
 і містити перевантажений метод toString(), який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.
 */

public enum Vehicles {
    TRAIN(300,"grey"),
    CAR(400,"red"),
    TRUCK(500,"yellow"),
    SUBWAY(600,"green"),
    BALLOON(700,"pink");
    private final int cost;
    private final String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }
    public String toString() {
        return name() + " " + color + " " + cost;
    }
}
class NewVehicles {
    public static void main(String[] args) {
        System.out.println(Vehicles.TRAIN);
        System.out.println(Vehicles.CAR);
        System.out.println(Vehicles.TRUCK);
        System.out.println(Vehicles.SUBWAY);
        System.out.println(Vehicles.BALLOON);
    }
}