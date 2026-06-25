package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    Colors[] colors = Colors.values();

    public String getRandomColor() {
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].name();
    }
}
