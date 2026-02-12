package test;

import domain.Ecommerce;

public class EcommerceTest01 {
    public static void main(String[] args) {
        Ecommerce ecommerce = new Ecommerce();
        ecommerce.boleto();
        ecommerce.debito();
        ecommerce.credito();
        ecommerce.pix();
    }
}
