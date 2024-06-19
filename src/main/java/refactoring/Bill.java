package refactoring;

import java.util.ArrayList;

public class Bill {

    private Customer customer;
    private ArrayList<Article> articles;

    public Bill(Customer customer, ArrayList<Article> articles) {
        this.customer = customer;
        this.articles = new ArrayList<Article>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean addArticle(Article a) {
        return articles.add(a);
    }

    public boolean removeArticle(Article a) {
        return articles.remove(a);
    }

    public String getDetails() {
        double total = 0;

        String result = "Details for \"" + customer.getName() + "\"\n";
        result += customer.getAdress() + "\n";
        result += "Geburtstag: " + customer.getBirthday() + "\n";
        result += "Email: " + customer.getEmail() + "\n\n";
        result += "refactoring.Article: \n";

        for (Article article : articles) {
            double new_price = calcNewPrice(article);

            result +=
                    "\t"
                            + article.getName()
                            + "\tx\t"
                            + article.getPurchaseAmount()
                            + "\t=\t"
                            + new_price
                            + "\n";
            total += new_price;
        }

        result += "\nTotal price:\t" + total + "\n";

        return result;
    }

    private double calcNewPrice(Article article) {
        double new_price = 0;
        if (article.getBike() instanceof Brompton) {
            if (article.getPurchaseAmount() > 1) {
                new_price += (article.getPurchaseAmount() - 1) * article.getPrice() / 2;
            }
            new_price += article.getPrice() * article.getPurchaseAmount();
        } else if (article.getBike() instanceof Mountainbike && article.getPurchaseAmount() > 2) {
            new_price += article.getPurchaseAmount() * article.getPrice() * 9 / 10;
        } else {
            new_price += article.getPrice() * article.getPurchaseAmount();
        }

        if (new_price >= 1000f) {
            new_price = new_price * 0.8;
        }
        return new_price;
    }
}
