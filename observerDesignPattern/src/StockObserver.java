public class StockObserver implements Observer{
    private double ibmPrice;
    private double aaplePrice;
    private double googPrice;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer: "+observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplePrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplePrice = aaplePrice;
        this.googPrice = googPrice;
        printPrice();
    }

    public void printPrice(){
        System.out.println("observer"+observerID);
        System.out.println("IBM Price: "+ibmPrice);
        System.out.println("Apple Price: "+aaplePrice);
        System.out.println("Google Price: "+googPrice+"\n");
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
    }

    public double getAaplePrice() {
        return aaplePrice;
    }

    public void setAaplePrice(double aaplePrice) {
        this.aaplePrice = aaplePrice;
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
    }

    public Subject getStockGrabber() {
        return stockGrabber;
    }

    public void setStockGrabber(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
    }
}
