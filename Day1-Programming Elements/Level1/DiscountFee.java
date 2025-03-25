class DiscountFee{
    public static void main(String[] args){
        int fee=125000;
        int discountper=10;
        double discount = (fee*discountper)/100;
        double discountamt= fee-discount;
        System.out.println("The discount amount is INR "+ discount + " and the discounted fee is INR "+ discountamt);
         }
}
