class ProfitPercent{
    public static void main(String[] args){
        int costprice=129;
        int sellingprice=191;
        int profit= sellingprice-costprice;
        double profitper= ((double)profit/costprice)*100;
        System.out.println("The Cost Price is INR"+ costprice +" and Selling Price is INR "+sellingprice);
        System.out.println("The Profit is INR "+ profit+" and Profit percentage is INR "+profitper);
    }
}
