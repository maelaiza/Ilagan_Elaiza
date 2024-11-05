package Ilagan_Lesson13_1;

public class Main {
    public static void main(String[] args) {
        // Initializing and displaying each dog size
        Dog smallDog = new Dog(Size.SMALL);
        smallDog.selectDogSize();

        Dog mediumDog = new Dog(Size.MEDIUM);
        mediumDog.selectDogSize();

        Dog largeDog = new Dog(Size.LARGE);
        largeDog.selectDogSize();

        Dog xLargeDog = new Dog(Size.XLARGE);
        xLargeDog.selectDogSize();

        Dog tinyDog = new Dog(Size.TINY);
        tinyDog.selectDogSize();
    }
}