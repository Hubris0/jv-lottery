package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int maxValue = 101;
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(maxValue);
        return new Ball(randomColor, randomNumber);
    }
}
