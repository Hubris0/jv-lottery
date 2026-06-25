package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int maxNumber = 100;
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxNumber + 1));
    }
}
