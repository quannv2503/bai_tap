import model.Product;
import service.ProductManager;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void disPlay(List<Product> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> products;
        System.out.println("====== add======");
        productManager.add(new Product("iphone12", 38000000, 9));
        products=productManager.findAll();
        disPlay(products);


        System.out.println("========update=======");
        productManager.update(2,new Product("iphone3", 2000000, 2));
        products=productManager.findAll();
        disPlay(products);

        System.out.println("======delete==========");
        productManager.delete(2);
        products=productManager.findAll();
        disPlay(products);


        System.out.println("======find by id========");
        System.out.println(productManager.findById(3));


        System.out.println("======find by name======");
        disPlay(productManager.findByName("iphone4"));


        System.out.println("=======sort by price=====");
        disPlay(productManager.sortByPrice());
    }
}
