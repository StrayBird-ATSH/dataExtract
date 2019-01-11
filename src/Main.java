import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String data;
        long n;
        int dilute;
        double time1, time2;
        File fileRead = new File(
                "D:\\Documents\\Introduction to Computer System\\Gnuplot\\sort_numa_perf.out");
        File fileWrite = new File(".\\sort.data");
        PrintWriter output = new PrintWriter(fileWrite);
        Scanner input = new Scanner(fileRead);
        output.println("#n dilute time(PBBS) time(PACO)");
        while (input.hasNextLine()) {
            data = input.nextLine();
            n = Long.parseLong(data.split(",")[0].trim().split(" ")[1]);
            dilute = Integer.parseInt(data.split(",")[1].trim().split(" ")[3]);
            time1 = Double.parseDouble(input.nextLine().split(" ")[2]);
            input.nextLine();
            time2 = Double.parseDouble(input.nextLine().split(" ")[2]);
            input.nextLine();
            output.println(n + " " + dilute + " " + time1 + " " + time2);
            output.flush();
        }
        output.close();
        input.close();
    }
}