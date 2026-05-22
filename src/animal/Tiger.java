package animal;
import edible.Edible;

public class Tiger extends Animal implements Edible  {
    @Override
    public String makeSound() {
        return "Tiger: gruu gruuu";
    }

    @Override
    public String howToEat() {
        return "rop rop rop";
    }
}
