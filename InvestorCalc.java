import java.util.Scanner;

public class InvestorCalc {

    static void space() {
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Variables for investment details
        int numInvestments = 0;
        double investmentAmt = 0;
        double sum = 0; 
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        String maxInvestmentName = "";
        String minInvestmentName = "";
        
        System.out.println("----------------------");
        System.out.println(" Fidelity Investments ");
        System.out.println("----------------------");

        space();
        
        // # of investments
        System.out.print("# of investments: ");
        numInvestments = scan.nextInt();
        
        for (int i = 1; i <= numInvestments; i++) {
            space();
            System.out.print("(" + i + ") Investment name: ");
            String investmentName = scan.next();
    
            System.out.print(investmentName + "'s current value: $");
            investmentAmt = scan.nextDouble();
            
            sum += investmentAmt;
            
            if (investmentAmt > max) {
                max = investmentAmt;
                maxInvestmentName = investmentName;
            }
            if (investmentAmt < min) {
                min = investmentAmt;
                minInvestmentName = investmentName;
            }
        }
                
        // summary report
        System.out.println();
        System.out.println("********************************");
        
        System.out.println();
        System.out.printf("Total Invested Amount: $%.2f%n", sum);
        
        System.out.println();
        System.out.printf("Daily Invested Amount (365 days): $%.2f%n", sum / 365);
        
        System.out.println();
        System.out.printf("Weekly Invested Amount (7 days): $%.2f%n", sum / 7);
        
        System.out.println();
        System.out.printf("Monthly Invested Amount (30 days): $%.2f%n", sum / 30);
        
        double growth = sum * 0.10;
        System.out.println();
        System.out.printf("Estimated 10%% Annual Growth: $%.2f%n", growth);
        
        System.out.println();
        String formattedMaxAmount = String.format("%.2f", max);
        System.out.printf("Highest investment: $%s (%s)%n", formattedMaxAmount, maxInvestmentName);
        
        System.out.println();
        String formattedMinAmount = String.format("%.2f", min);
        System.out.printf("Lowest investment: $%s (%s)%n", formattedMinAmount, minInvestmentName);
        
        scan.close();
    }
}
