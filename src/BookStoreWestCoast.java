/**
 * participant: ConcreteCreator
 */
public class BookStoreWestCoast extends BookStore {

    @Override
    public Distributor factoryMethod() {
        return new WestCoastDistributor();
    }
    
}
