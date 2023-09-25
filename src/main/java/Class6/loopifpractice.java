package Class6;

public class loopifpractice {
    public static void main(String[] args) {

            double discountPercentage = 0.1; // 10% discount
            double [] prices = { 100.0, 50.0 };

            System.out.println("Original Prices:");
            for (double price : prices) {
                System.out.println("$" + price);
            }

            System.out.println("\nPrices after " + (discountPercentage * 100) + "% discount:");
            for (int i = 0; i < prices.length; i++) {
                double discountedPrice = prices[i] * (1 - discountPercentage);
                System.out.println("$" + discountedPrice);
                prices[i] = discountedPrice; // Update the prices array with discounted values
            }
        }
    }


