class SamsAvgMarks{
    public static void main(String[] args){
        int mathsmarks=94;
        int physics=95;
        int chemistry=96;
        double totalMarks=300;
        double averagePercentage = ((mathsmarks + physics + chemistry) / (double)totalMarks) * 100;
        System.out.println("Sam's average marks in PCM is: " + averagePercentage);
    }
}
