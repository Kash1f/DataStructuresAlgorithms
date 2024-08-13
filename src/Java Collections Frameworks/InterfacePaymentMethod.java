
interface PaymentMethod{
    void pay();
}

class DebitCard implements PaymentMethod{
    public void pay(){
        System.out.println("Payed Via Debit Card");
    }
}

class CreditCard implements PaymentMethod{
    public void pay(){
        System.out.println("Payed Via Credit Card");
    }
}
public class InterfacePaymentMethod {

    public static void makePayment(PaymentMethod pm){
        pm.pay();
    }
    public static void main(String[] args) {
        PaymentMethod pm = new CreditCard();
        makePayment(pm);
    }
}
