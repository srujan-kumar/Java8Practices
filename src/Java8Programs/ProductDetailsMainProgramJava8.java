package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Our requirement is to read through Product class
// and fetch the basic Product details of the Product like name, prize, availability
public class ProductDetailsMainProgramJava8 {
    public static void main(String[] args) {


        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(123, "APPLE Tab", 2500.00, true, 4.5));
        productList.add(new Product(145, "Motorola EDGE 50 Fusion", 22000.00, true, 4.4));
        productList.add(new Product(256, "Iphone 15", 60500.00, true, 4.0));
        productList.add(new Product(371, "SAMSUNG Tab", 2000.00, false, 4.6));
        productList.add(new Product(484, "Dell Laptop", 55000.00, true, 4.5));
        productList.add(new Product(555, "HP Laptop", 40200.00, true, 4.2));
        productList.add(new Product(676, "Lenovo Thinkpad", 39000.00, false, 3.9));

        List<ProductBasicDetails> prdBasicdetList=
                productList.stream().map(pr->{
            ProductBasicDetails prdDetails=new ProductBasicDetails(pr.getProductName(),pr.getProductPrize(),pr.isProductAvailability());
            return prdDetails;
        }).collect(Collectors.toList());

        prdBasicdetList.forEach(pr->{
            System.out.println("Product Name"+pr.getProductName());
            System.out.println("Product Name"+pr.getProductPrize());
            System.out.println("Product Name"+pr.isProductAvailability());
            System.out.println("=================");
        });

        productList.stream().filter(p->p.isProductAvailability()==false).collect(Collectors.toList()).forEach(System.out::println);
    }
}
