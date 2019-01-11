import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String data;
        int n;
        double time1, time2, time3;
        File fileRead = new File(
                "D:\\Documents\\Introduction to Computer System\\Gnuplot\\lcs_numa_perf.out");
        File fileWrite = new File(".\\lcs.data");
        PrintWriter output = new PrintWriter(fileWrite);
        Scanner input = new Scanner(fileRead);
        output.println("#n time(CO_(2-way)) time(PACO_data_flow) time(P_way_PACO)");
        while (input.hasNextLine()) {
            input.nextLine();
            data = input.nextLine();
            n = Integer.parseInt(data.split(",")[0].trim().split(" ")[2]);
            input.nextLine();
            input.nextLine();
            time1 = Double.parseDouble(input.nextLine().split(" ")[6]);
            time2 = Double.parseDouble(input.nextLine().split(" ")[5]);
            time3 = Double.parseDouble(input.nextLine().split(" ")[6]);
            input.nextLine();
            input.nextLine();
            output.println(n + " " + time1 + " " + time2 + " " + time3);
            output.flush();
        }
        output.close();
        input.close();
    }
}