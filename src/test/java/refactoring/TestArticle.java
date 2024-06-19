package refactoring;

import org.junit.jupiter.api.BeforeEach;

public class TestArticle {

    private Article article;
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike(30, 7, 3);
        article = new Article("Race", bike, 1500.00, 1);
    }
}
