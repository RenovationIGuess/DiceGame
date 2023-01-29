public class Test {
    public static void main(String[] args) {
        try
        {
            System.out.print("Rolling");
            for (int i = 0; i < 3; ++i) {
                // Delay for 7 seonds
                Thread.sleep(1000);
                System.out.print(".");
            }
            Thread.sleep(1000);
            System.out.println("\nResult: 5");
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
