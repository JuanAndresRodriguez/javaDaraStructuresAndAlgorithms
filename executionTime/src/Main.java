public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();

        // --- program ----
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // ----------------

        long duration = (System.nanoTime() - start)/1000000;
        // divide by one million to erase nanoseconds
        // to have seconds divide by one billion.
        System.out.println(duration + "ms");
        // returns milliseconds
    }
}