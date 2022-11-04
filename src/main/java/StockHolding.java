public class StockHolding {
    // Create private instance properties
    private String name;
    private String ticker;
    private double price;
    private int numShares = 0;

    // Create constructor

    public StockHolding(String name, String ticker, double price, int numShares) {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
        this.numShares = numShares;
    }

    // create getters
    public String getName() {
        return name;
    }

    public String getTicker() {
        return ticker;
    }

    public double getPrice() {
        return price;
    }

    public int getNumShares() {
        return numShares;
    }

    // create buy, sell, and getBalance methods
    public void buy(int numberShares) {

    }

    public double sell(int numberShares) {
        double amountSold = 0.0;
        if (numberShares > numShares) {

        }
        return amountSold;
    }
}


