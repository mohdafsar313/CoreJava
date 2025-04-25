package com.xworkz.jdbc.runner;



import com.xworkz.jdbc.external.*;
import com.xworkz.jdbc.internal.*;

public class runner {
    public static void main(String[] args) {
        JDBC jdbc =new MySqlJDBC();
        Sql sql=new Sql(jdbc);
        sql.sqlInfo();
        ShippingService standardShipping = new StandardShipping();
        ShippingOrder shippingOrder1 = new ShippingOrder(standardShipping);
        shippingOrder1.processOrder();
        ShippingService expressShipping = new ExpressShipping();
        ShippingOrder shippingOrder2 = new ShippingOrder(expressShipping);
        shippingOrder2.processOrder();
        NotificationService emailNotification = new EmailNotification();
        NotificationManager emailManager = new NotificationManager(emailNotification);
        emailManager.notifyUser();
        NotificationService smsNotification = new SMSNotification();
        NotificationManager smsManager = new NotificationManager(smsNotification);
        smsManager.notifyUser();
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentService creditCardService = new PaymentService(creditCardPayment);
        creditCardService.executePayment();
        PaymentMethod debitCardPayment = new DebitCardPayment();
        PaymentService debitCardService = new PaymentService(debitCardPayment);
        debitCardService.executePayment();
        Shape circle = new Circle();
        ShapeManager shapeManager1 = new ShapeManager(circle);
        shapeManager1.displayShape();
        Shape rectangle = new Rectangle();
        ShapeManager shapeManager2 = new ShapeManager(rectangle);
        shapeManager2.displayShape();
        Animal dog = new Dog();
        AnimalTrainer dogTrainer = new AnimalTrainer(dog);
        dogTrainer.makeSound();
        Animal cat = new Cat();
        AnimalTrainer catTrainer = new AnimalTrainer(cat);
        catTrainer.makeSound();
    }
}
