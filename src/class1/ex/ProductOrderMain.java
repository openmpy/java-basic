package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.next();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);

        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
