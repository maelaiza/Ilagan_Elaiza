package Ilagan_Lesson13_1;

enum Size {
    SMALL, MEDIUM, LARGE, XLARGE, TINY;
}
class Dog {
    private Size dogSize;

   
    public Dog(Size dogSize) {
        this.dogSize = dogSize;
    }

   
    public void selectDogSize() {
        System.out.println("Initialized dogSize: " + dogSize);
    }
}


