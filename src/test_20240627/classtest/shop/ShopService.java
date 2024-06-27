package test_20240627.classtest.shop;

public class ShopService {
    private static ShopService singleton = new ShopService();
    private ShopService(){}

    static ShopService getInstance() {
        return singleton;
    }
}