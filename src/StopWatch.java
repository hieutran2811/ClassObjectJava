import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    private long getStartTime(){
        return this.startTime;
    }
    private long getEndTime(){
        return this.endTime;
    }
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        final int n = 100000;
        int[] a = new int[n];
        Random rd = new Random();
        System.out.println("Tạo mảng có 100,000 ngẫu nhiên số và sắp xếp");
        for(int i = 0; i < n; i++) {
            a[i] = rd.nextInt(1000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++ ) {
                if(a[i] > a[j]) {
                    int min = a[i];
                    a[i] = a[j];
                    a[j] = min;
                }
            }
        }
        stopWatch.stop();

        System.out.println("Thời gian thực hiện thuật toán sắp xếp chọn (selection sort): " + stopWatch.getElapsedTime() +"ms");
    }
}
