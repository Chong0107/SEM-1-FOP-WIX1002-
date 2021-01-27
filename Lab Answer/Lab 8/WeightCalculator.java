public class WeightCalculator {
    private int age, height;
    private double weight;

    public WeightCalculator(int age, int height) {
        this.age = age;
        this.height = height;
        this.weight = (height - 100 + age / 10) * 0.9;
    }

    public void displayAll(){
        System.out.println("Age: "+this.age);
        System.out.println("Height: "+this.height);
        System.out.println("Recommend Weight: "+this.weight);
    }
}
