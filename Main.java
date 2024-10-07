import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        directory.addStudent(alice, 90);
        directory.addStudent(bob, 85);
        directory.addStudent(alice, 95);

        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");

        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());

        System.out.println(directory);
        String product1 = "apple";
        int quantity1 = 3;
        String product2 = "banana";
        int quantity2 = 2;
        String  product3 = "apple";
        int quantity3 = 5;
        ShoppingBasket basket = new ShoppingBasket();
        basket.addProduct(product1, quantity1);
        basket.addProduct(product2, quantity2);
        basket.addProduct(product3, quantity3);
        System.out.println("Basket after adding products:");
        basket.showBasket();
        basket.removeProduct("banana");
        System.out.println("Basket after removing 'banana':");
        basket.showBasket();
        basket.updateQuantity("apple", 10);
        System.out.println("Basket after updating quantity of 'apple':");
        basket.showBasket();
        System.out.println("Quantity of 'apple': " +
                basket.checkProduct("apple"));
        System.out.println("Quantity of 'banana': " +
                basket.checkProduct("banana"));
        int[] initArray = new int[]{38, 27, 43, 3, 9, 82, 10};
        System.out.println(Arrays.toString(initArray));
        MergeSort.mergeSort(initArray);
        System.out.println(Arrays.toString(initArray));

    }
}