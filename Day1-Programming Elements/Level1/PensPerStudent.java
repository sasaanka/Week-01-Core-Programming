class PensPerStudent{
    public static void main(String[] args){
        int totalpens=14;
        int totalstu=3;
        int pensperstu=totalpens/totalstu;
        int restpens=totalpens%totalstu;
        System.out.println("The Pens per student is "+ pensperstu + " and the remaining pens not distributed is  " +restpens);
    }
}
