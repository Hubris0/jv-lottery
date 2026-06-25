package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        int randomIndex = this.random.nextInt(colors.length);
        return this.colors[randomIndex].name();
    }
}
