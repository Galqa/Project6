/* Створіть проект за допомогою IntelliJ IDEA.
 Створіть перерахунковий тип (enum) Animals, що містить конструктор,
 який повинен набувати цілого числа (вік тварини),
 і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.
 */

public enum Animals {
    DOG(3),
    CAT(5),
    PARROT(1);
    private final int age;

    Animals( int age) {
        this.age = age;
    }
   public String toString() {
        return name() + " " + age;
   }
}
 class NewAnimals {
     public static void main(String[] args) {
         System.out.println(Animals.DOG);
         System.out.println(Animals.CAT);
         System.out.println(Animals.PARROT);

     }

}
