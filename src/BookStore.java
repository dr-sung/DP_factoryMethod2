
// participant: Creator

public abstract class BookStore {
    
    private Distributor distributor;
    
    public void newDistributor() {
        distributor = factoryMethod();
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public abstract Distributor factoryMethod();
     
}
