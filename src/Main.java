public class Main {
    public static void main(String[] args) {
        int TotalCost = 0;
        int WinterCost = 100;
        int SpringCost = 100;
        int SummerCost = 100;
        int FallCost = 100;
        System.out.println("Enter maintenance cost for Winter: " + WinterCost);
        System.out.println("Enter maintenance cost for Spring: " + SpringCost);
        System.out.println("Enter maintenance cost for Summer: " + SummerCost);
        System.out.println("Enter maintenance cost for Fall:   " + FallCost);
        TotalCost += WinterCost + SpringCost + SummerCost + FallCost;
        System.out.println("Total yearly maintenance cost is: " + TotalCost);
    }
}
