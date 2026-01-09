package org.example;

import org.example.customer.Customer;
import org.example.order.Order;
import org.example.product.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", "Fruits", new BigDecimal("30.0"));
        Product banana = new Product("Banana", "Fruits", new BigDecimal("25.0"));
        Product carrot = new Product("Carrot", "Vegetables", new BigDecimal("20.0"));
        Product broccoli = new Product("Broccoli", "Vegetables", new BigDecimal("35.0"));
        Product chickenBreast = new Product("Chicken Breast", "Meat", new BigDecimal("250.0"));
        Product salmon = new Product("Salmon", "Fish", new BigDecimal("500.0"));
        Product milk = new Product("Milk", "Dairy", new BigDecimal("60.0"));
        Product cheese = new Product("Cheese", "Dairy", new BigDecimal("150.0"));
        Product eggs = new Product("Eggs", "Dairy", new BigDecimal("100.0"));
        Product bread = new Product("Bread", "Bakery", new BigDecimal("40.0"));
        Product croissant = new Product("Croissant", "Bakery", new BigDecimal("70.0"));
        Product rice = new Product("Rice", "Grains", new BigDecimal("80.0"));
        Product pasta = new Product("Pasta", "Grains", new BigDecimal("90.0"));
        Product orangeJuice = new Product("Orange Juice", "Beverages", new BigDecimal("120.0"));
        Product coffee = new Product("Coffee", "Beverages", new BigDecimal("350.0"));
        Product theHobbit = new Product("The Hobbit", "Books", new BigDecimal("400.0"));
        Product nineteenEightyFour = new Product("1984", "Books", new BigDecimal("350.0"));
        Product cleanCode = new Product("Clean Code", "Books", new BigDecimal("1200.0"));
        Product laptop = new Product("Laptop", "Electronics", new BigDecimal("75000.0"));
        Product headphones = new Product("Headphones", "Electronics", new BigDecimal("5500.0"));
        Product toyCar = new Product("Toy Car", "Children's products", new BigDecimal("450.0"));
        Product teddyBear = new Product("Teddy Bear", "Children's products", new BigDecimal("800.0"));
        Product buildingBlocks = new Product("Building Blocks", "Children's products", new BigDecimal("1200.0"));
        Product coloringBook = new Product("Coloring Book", "Children's products", new BigDecimal("300.0"));
        Product kidsBackpack = new Product("Kids Backpack", "Children's products", new BigDecimal("2500.0"));
        Product legoSet = new Product("LEGO City Set", "Toys", new BigDecimal("3500.0"));
        Product doll = new Product("Fashion Doll", "Toys", new BigDecimal("1800.0"));
        Product puzzle = new Product("Puzzle 1000 Pieces", "Toys", new BigDecimal("1200.0"));
        Product remoteControlCar = new Product("Remote Control Car", "Toys", new BigDecimal("4200.0"));
        Product boardGame = new Product("Board Game", "Toys", new BigDecimal("2500.0"));

        List<Product> products = List.of(
                apple, banana, carrot, broccoli, chickenBreast, salmon,
                milk, cheese, eggs, bread, croissant, rice, pasta,
                orangeJuice, coffee, theHobbit, nineteenEightyFour, cleanCode,
                laptop, headphones, toyCar, teddyBear, buildingBlocks, coloringBook, kidsBackpack, legoSet, doll,
                puzzle, remoteControlCar, boardGame
        );

        Order order1 = new Order(
                LocalDate.of(2026, 1, 5),
                LocalDate.of(2026, 1, 10),
                "В ожидании",
                Set.of(banana, bread, pasta, teddyBear)
        );

        Order order2 = new Order(
                LocalDate.of(2026, 1, 3),
                LocalDate.of(2026, 1, 8),
                "Доставлено",
                Set.of(apple, milk, theHobbit)
        );

        Order order3 = new Order(
                LocalDate.of(2025, 12, 29),
                LocalDate.of(2026, 1, 4),
                "Отправлено",
                Set.of(laptop, cleanCode, cheese)
        );
        Order order4 = new Order(
                LocalDate.of(2021, 2, 12),
                LocalDate.of(2021, 2, 15),
                "В ожидании",
                Set.of(apple, banana, bread, milk, theHobbit)
        );

        Order order5 = new Order(
                LocalDate.of(2021, 1, 20),
                LocalDate.of(2021, 1, 23),
                "Отправлено",
                Set.of(laptop, headphones, coffee, cleanCode, puzzle)
        );

        Order order6 = new Order(
                LocalDate.of(2021, 3, 1),
                LocalDate.of(2021, 3, 4),
                "Новый",
                Set.of(apple, milk, bread, buildingBlocks)
        );

        Order order7 = new Order(
                LocalDate.of(2026, 1, 2),
                LocalDate.of(2026, 1, 6),
                "В обработке",
                Set.of(banana, cheese, eggs, remoteControlCar)
        );

        Order order8 = new Order(
                LocalDate.of(2026, 1, 3),
                LocalDate.of(2026, 1, 7),
                "Отправлен",
                Set.of(chickenBreast, rice, pasta, legoSet)
        );

        Order order9 = new Order(
                LocalDate.of(2026, 1, 4),
                LocalDate.of(2026, 1, 8),
                "Доставлен",
                Set.of(salmon, broccoli, carrot)
        );

        Order order10 = new Order(
                LocalDate.of(2026, 1, 5),
                LocalDate.of(2026, 1, 9),
                "Отменён",
                Set.of(theHobbit, coffee, toyCar)
        );

        Order order11 = new Order(
                LocalDate.of(2026, 1, 6),
                LocalDate.of(2026, 1, 10),
                "Новый",
                Set.of(bread, croissant, milk, kidsBackpack)
        );

        Order order12 = new Order(
                LocalDate.of(2026, 1, 7),
                LocalDate.of(2026, 1, 11),
                "В обработке",
                Set.of(orangeJuice, eggs, cheese, doll)
        );

        Order order13 = new Order(
                LocalDate.of(2026, 1, 8),
                LocalDate.of(2026, 1, 12),
                "Отправлен",
                Set.of(laptop)
        );

        Order order14 = new Order(
                LocalDate.of(2026, 1, 9),
                LocalDate.of(2026, 1, 13),
                "Доставлен",
                Set.of(headphones, coffee)
        );

        Order order15 = new Order(
                LocalDate.of(2026, 1, 10),
                LocalDate.of(2026, 1, 14),
                "Отменён",
                Set.of(nineteenEightyFour, cleanCode)
        );

        Order order16 = new Order(
                LocalDate.of(2021, 3, 14),
                LocalDate.of(2021, 3, 18),
                "Новый",
                Set.of(apple, banana, orangeJuice)
        );

        Order order17 = new Order(
                LocalDate.of(2021, 3, 12),
                LocalDate.of(2021, 3, 16),
                "В обработке",
                Set.of(chickenBreast, eggs)
        );

        Order order18 = new Order(
                LocalDate.of(2021, 4, 15),
                LocalDate.of(2021, 4, 17),
                "Отправлен",
                Set.of(salmon, rice)
        );

        Order order19 = new Order(
                LocalDate.of(2026, 1, 14),
                LocalDate.of(2026, 1, 18),
                "Доставлен",
                Set.of(bread, milk, cheese, boardGame)
        );

        Order order20 = new Order(
                LocalDate.of(2021, 4, 15),
                LocalDate.of(2026, 1, 19),
                "Отменён",
                Set.of(croissant, coffee)
        );

        Order order21 = new Order(
                LocalDate.of(2021, 2, 1),
                LocalDate.of(2021, 2, 20),
                "Новый",
                Set.of(theHobbit, apple, buildingBlocks)
        );

        Order order22 = new Order(
                LocalDate.of(2021, 4, 2),
                LocalDate.of(2026, 4, 11),
                "В обработке",
                Set.of(cleanCode, laptop)
        );

        Order order23 = new Order(
                LocalDate.of(2026, 4, 18),
                LocalDate.of(2021, 4, 20),
                "Отправлен",
                Set.of(headphones, orangeJuice)
        );

        Order order24 = new Order(
                LocalDate.of(2026, 1, 19),
                LocalDate.of(2026, 1, 23),
                "Доставлен",
                Set.of(rice, pasta, eggs)
        );

        Order order25 = new Order(
                LocalDate.of(2026, 1, 20),
                LocalDate.of(2026, 1, 24),
                "Отменён",
                Set.of(banana, carrot, coloringBook)
        );


        List<Customer> customers = List.of(
                new Customer("Alice", 2L, Set.of(order1, order2, order3, order4, order5)),
                new Customer("Omar", 4L, Set.of(order6, order7, order8, order9, order10)),
                new Customer("Bob", 1L, Set.of(order11, order12, order13, order14, order15)),
                new Customer("Denis", 3L, Set.of(order16, order17, order18, order19, order20)),
                new Customer("Anton", 10L, Set.of(order21, order22, order23, order24, order25))
        );

        //1 Задание
        System.out.println();
        System.out.println("1 Задание: ");

        BigDecimal price = new BigDecimal(100);
        List<Product> books = products.stream()
                .filter(n -> n.getCategory().equals("Books") &&
                        (n.getPrice().compareTo(new BigDecimal("100")) > 0))

                .collect(Collectors.toList());
        books.forEach(System.out::println);

        // 2 Задание
        System.out.println();
        System.out.println("2 Задание: ");

        List<Order> childrenOrder = customers.stream()
                .flatMap(n -> n.getOrders().stream())
                .filter(order -> order.getProducts().stream().anyMatch(p -> p.getCategory().equals("Children's products")))
                .toList();
        childrenOrder.forEach(System.out::println);

        // 3 Задание
        System.out.println();
        System.out.println("3 Задание: ");

        List<Integer> sumToysPrice = Collections.singletonList(products.stream()
                .filter(p -> p.getCategory().equals("Toys"))
                .mapToInt(p -> p.getPrice().intValue())
                .reduce(0, Integer::sum));

        sumToysPrice.forEach(System.out::println);

        // 4 Задание
        System.out.println();
        System.out.println("4 Задание: ");

        LocalDate start = LocalDate.of(2021, 2, 1);
        LocalDate end = LocalDate.of(2021, 4, 1);

        List<Product> dateList = customers.stream()
                .filter(c -> c.getLevel().equals(2L))
                .flatMap(c -> c.getOrders().stream()
                        .filter(o -> o.getOrderDate().isAfter(start) &&
                                o.getOrderDate().isBefore(end)))
                .flatMap(o -> o.getProducts().stream())
                .toList();
        dateList.forEach(System.out::println);

        // 5 Задание
        System.out.println();
        System.out.println("5 Задание: ");

        List<Product> cheapProducts = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(2)
                .toList();
        cheapProducts.forEach(System.out::println);

        // 6 Задание
        System.out.println();
        System.out.println("6 Задание: ");

        List<Order> lastOrders = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .toList();

        lastOrders.forEach(System.out::println);

        // 7 Задание
        System.out.println();
        System.out.println("7 Задание: ");

        LocalDate marchDate = LocalDate.of(2021, 4, 15);

        List<Order> marchOrders = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().equals(marchDate))
                .peek(o -> System.out.println("id: " + o.getId()))
                .toList();
        marchOrders.forEach(System.out::println);

        // 8 Задание
        System.out.println();
        System.out.println("8 Задание: ");

        LocalDate febStart = LocalDate.of(2021, 2, 1);
        LocalDate febEnd = LocalDate.of(2021, 2, 28);

        BigDecimal ordersSum = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().isAfter(febStart) &&
                        o.getOrderDate().isBefore(febEnd))
                .flatMap(o -> o.getProducts().stream())
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(ordersSum);

        // 9 Задание
        System.out.println();
        System.out.println("9 Задание: ");

        OptionalDouble averagePayment = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .filter(o -> o.getOrderDate().equals(LocalDate.of(2021, 3, 14)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(p -> p.getPrice().doubleValue())
                .average();

        System.out.println(averagePayment.orElse(0.0));

        //10 Задание
        System.out.println();
        System.out.println("10 Задание: ");

        System.out.println("Статистика из категории Books: ");

        Double booksSum = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .filter(p -> p.getCategory().equals("Books"))
                .mapToDouble(p -> p.getPrice().doubleValue())
                .sum();
        System.out.println("Сумма: " + booksSum);

        OptionalDouble booksAvr = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .filter(p -> p.getCategory().equals("Books"))
                .mapToDouble(p -> p.getPrice().doubleValue())
                .average();
        System.out.println("Cредний платеж: " + booksAvr.orElse(0.0));

        OptionalDouble booksMax = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .filter(p -> p.getCategory().equals("Books"))
                .mapToDouble(p -> p.getPrice().doubleValue())
                .max();
        System.out.println("Цена самого дорогого товара: " + booksMax.orElse(0.0));

        OptionalDouble booksMin = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .filter(p -> p.getCategory().equals("Books"))
                .mapToDouble(p -> p.getPrice().doubleValue())
                .min();
        System.out.println("Цена самого дешевого товара: " + booksMin.orElse(0.0));

        long booksCount = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .filter(p -> p.getCategory().equals("Books"))
                .count();
        System.out.println("Кол-во товаров: " + booksCount);

        // 11 Задание
        System.out.println();
        System.out.println("11 Задание: ");

        Map<Long, Integer> orderIdCount = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .collect(Collectors.toMap(
                        Order::getId,
                        o -> o.getProducts().size()
                ));
        for (Map.Entry<Long, Integer> i : orderIdCount.entrySet()) {
            System.out.println(i);
        }

        // 12 Задание
        System.out.println();
        System.out.println("12 Задание: ");

        Map<Customer, List<Order>> customersOrders = customers.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> new ArrayList<>(c.getOrders())
                ));
        for (Map.Entry<Customer, List<Order>> i : customersOrders.entrySet()) {
            System.out.println(i.getKey().getInfo() + " : " + i.getValue());
        }

        // 13 Задание
        System.out.println();
        System.out.println("13 Задание: ");

        Map<Order, Double> orderSumProducts = customers.stream()
                .flatMap(c -> c.getOrders().stream())
                .collect(Collectors.toMap(
                        o -> o,
                        o -> o.getProducts().stream()
                                .mapToDouble(p -> p.getPrice().doubleValue())
                                .sum()
                ));
        for (Map.Entry<Order, Double> i : orderSumProducts.entrySet()) {
            System.out.println(i.getKey().getInfo() + " : " + i.getValue());
        }

        // 14 Задание
        System.out.println();
        System.out.println("14 Задание: ");

        Map<String, List<String>> categoryListNames = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toList())
                ));
        for (Map.Entry<String, List<String>> i : categoryListNames.entrySet()) {
            System.out.println(i);
        }

        // 15 Задание
        System.out.println();
        System.out.println("15 Задание: ");

        Map<String, Product> expensiveProducts = customers.stream()
                .flatMap(c -> c.getOrders().stream()
                        .flatMap(o -> o.getProducts().stream()))
                .collect(Collectors.toMap(
                        Product::getCategory,
                        p -> p,
                        (p1, p2) -> p1.getPrice().compareTo(p2.getPrice()) >= 0 ? p1 : p2
                ));
        for (Map.Entry<String, Product> i : expensiveProducts.entrySet()) {
            System.out.println(i);
        }
        expensiveProducts.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}