package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int maxNumber = 100;
        return new Ball(this.colorSupplier.getRandomColor(), this.random.nextInt(maxNumber + 1));
    }
}
