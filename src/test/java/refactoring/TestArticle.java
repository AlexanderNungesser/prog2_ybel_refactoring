package refactoring;

import org.junit.jupiter.api.BeforeEach;

public class TestArticle {

    private Article article;
    private Bike bike;

    @BeforeEach
    public void setUp() {
        article = new Article(bike, 5);
    }
}
