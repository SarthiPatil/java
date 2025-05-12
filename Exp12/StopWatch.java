public class StopWatch implements Runnable {
    private Thread thread;
    private boolean running = false;
    private long startTime;
    private long elapsedTime;

    public StopWatch() {
        elapsedTime = 0;
    }

    public void start() {
        if (!running) {
            running = true;
            startTime = System.currentTimeMillis() - elapsedTime;
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stop() {
        if (running) {
            running = false;
            elapsedTime = System.currentTimeMillis() - startTime;
        }
    }

    public void reset() {
        running = false;
        elapsedTime = 0;
    }

    public long getElapsedTime() {
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return elapsedTime;
        }
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(100); // Update every 100 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            System.out.print("\rElapsed time: " + formatTime(getElapsedTime()));
        }
    }

    private String formatTime(long millis) {
        long seconds = (millis / 1000) % 60;
        long minutes = (millis / (1000 * 60)) % 60;
        long hours = (millis / (1000 * 60 * 60));
        long milliseconds = (millis % 1000) / 100;
        return String.format("%02d:%02d:%02d.%d", hours, minutes, seconds, milliseconds);
    }

    public static void main(String[] args) throws java.io.IOException {
        StopWatch stopwatch = new StopWatch();
        System.out.println("Stopwatch started. Press 's' to start/stop, 'r' to reset, 'q' to quit.");

        while (true) {
            int input = System.in.read();
            if (input == 's') {
                if (stopwatch.running) {
                    stopwatch.stop();
                    System.out.println("\nStopped at: " + stopwatch.formatTime(stopwatch.getElapsedTime()));
                } else {
                    stopwatch.start();
                    System.out.println("Started.");
                }
            } else if (input == 'r') {
                stopwatch.reset();
                System.out.println("\nReset.");
            } else if (input == 'q') {
                stopwatch.stop();
                System.out.println("\nQuitting.");
                break;
            }
            // Clear the input buffer
            while (System.in.available() > 0) {
                System.in.read();
            }
        }
    }
}
