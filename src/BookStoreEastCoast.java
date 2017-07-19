/**
 * participant: ConcreteCreator
 */
public class BookStoreEastCoast extends BookStore {

    @Override
    public Distributor factoryMethod() {
        return new EastCoastDistributor();
    }
    
}
