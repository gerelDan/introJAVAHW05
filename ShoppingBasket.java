import java.util.HashMap;

/*
Задача 3. Подсчет продуктов в корзине
Создайте программу для учета продуктов в корзине. Программа должна
позволять добавлять, удалять, обновлять количество продуктов, а также
проверять наличие продуктов в корзине. Используйте HashMap для хранения
продуктов и их количества.
Методы:
● addProduct(String product, Integer quantity): Добавляет
продукт с указанным количеством в корзину. Если продукт уже есть,
увеличивает его количество.
● removeProduct(String product): Удаляет продукт из корзины. Если
продукт отсутствует, ничего не делает.
● updateQuantity(String product, Integer quantity): Обновляет
количество продукта в корзине. Если продукта нет, ничего не делает.
● checkProduct(String product): Проверяет, есть ли продукт в
корзине и возвращает его количество. Если продукта нет, возвращает 0.
● showBasket(): Выводит все продукты и их количество в корзине.

 */
public class ShoppingBasket {
    private static HashMap<String, Integer> basket = new HashMap<>();

    public static void addProduct(String product, Integer quantity){
        if (basket.containsKey(product)){
            basket.put(product, basket.get(product) + quantity);
        } else basket.put(product, quantity);
    }
    public static void removeProduct(String product){
        if (basket.containsKey(product)){
            basket.remove(product);
        }
    }
    public static void updateQuantity(String product, Integer quantity){
        if (basket.containsKey(product)){
            basket.put(product, basket.get(product) + quantity);
        }
    }
    public static int checkProduct(String product){
        return basket.getOrDefault(product, 0);


    }
    public static void showBasket(){
        System.out.println(basket);
    }
}
