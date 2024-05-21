package it.aman;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {

    /*
    1. add filter by size (use copy and paste)
    2. refactor to remove duplication
    3. add filter by free quantity (free = available - sold - reserved)
    4. refactor if needed
    5. add support for multiple filters (e.g. size and color)
    */

    public List<Product> byColor(List<Product> products, ProductColor productColor) {
        List<Product> results = new ArrayList<>();
        for(Product product : products) {
            if (product.color.sameOf(productColor))
                results.add(product);
        }
        return results;
    }

    public static class Product {
        ProductColor color;
        //ProductSize size;
        //boolean isAvailable;
        //int availableQuantity;
        //int soldQuantity;
        //int reservedQuantity;
    }

    public static class ProductColor {
        private String value;

        public boolean sameOf(ProductColor productColor) {
            return this.value.equals(productColor.value);
        }
    }
}