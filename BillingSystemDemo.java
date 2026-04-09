// Superclass
class InvoiceProcessor {

    // Public method for generating invoice
    public void generateInvoice(String customerName, double amount) {
        System.out.println("Generating invoice for customer: " + customerName);
        double finalAmount = calculateTotal(amount);
        System.out.println("Invoice Amount: " + finalAmount);
    }

    // Private method for internal calculations (not inherited or overridden)
    private double calculateTotal(double amount) {
        // Example: add 10% service charge
        return amount + (amount * 0.10);
    }
}

// Subclass
class RetailInvoice extends InvoiceProcessor {

    // Override the public method to apply retail-specific logic
    @Override
    public void generateInvoice(String customerName, double amount) {
        System.out.println("Generating RETAIL invoice for customer: " + customerName);
        double discountedAmount = applyDiscount(amount);
        // Call superclass method to reuse its internal calculation logic
        super.generateInvoice(customerName, discountedAmount);
    }

    // Retail-specific discount logic
    private double applyDiscount(double amount) {
        // Example: 5% discount for retail customers
        return amount - (amount * 0.05);
    }
}

// Main class
public class BillingSystemDemo {
    public static void main(String[] args) {
        // Superclass reference pointing to subclass object
        InvoiceProcessor processor = new RetailInvoice();

        // Runtime polymorphism: method resolved at runtime
        processor.generateInvoice("Alice", 1000.0);

        // Direct superclass usage
        InvoiceProcessor baseProcessor = new InvoiceProcessor();
        baseProcessor.generateInvoice("Bob", 500.0);
    }
}
