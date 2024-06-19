package refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBike {

    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike(30, 7, 3);
    }

    @Test
    public void testBike() {}
}
