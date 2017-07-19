/**
 * participant: ConcreteCreator
 */
public class BookStoreMidWest extends BookStore {

    @Override
    public Distributor factoryMethod() {
        return new MidWestDistributor();
    }
    
}
