package samples;

import java.util.Arrays;

public class MinimizeCashFlow {
    public static void main(String[] args) {
        int[][] graph1 = {{0, 1000, 2000},
                {0, 0, 5000},
                {0, 0, 0},};

        int[][] graph2 = {{0, 1000, 2000, 3000},
                {0, 0, 5000, 2000},
                {0, 0, 0, 1000},
                {0, 0, 0, 0}};

        validate(graph2);

    }

    static void validate(int[][] graph) {
        minimize(graph);
        String output = "";
        for (int[] i : graph) {
            output = output.concat("{");
            for (int j : i) {
                output = output.concat(Integer.toString(j));
                output = output.concat(",");
            }
            output = output.concat("}");
        }
        output = output.replaceAll(",}", "}");
        System.out.println(output);
    }


    static int[][] minimize(int[][] graph) {
        int[] net = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            int credit = 0;
            int debit = 0;
            for (int j = 0; j < graph.length; j++) {
                credit += graph[j][i];
            }
            for (int k : graph[i]) {
                debit += k;
            }
            net[i] = credit - debit;
        }
        System.out.println(Arrays.toString(net));


        for (int outerLoopRow = 0; outerLoopRow < graph.length; outerLoopRow++) {

            for (int j = 0; j < graph[outerLoopRow].length; j++) {
                if (graph[outerLoopRow][j] != 0) {
                    for (int innerLoopRow = 0; innerLoopRow < graph.length; innerLoopRow++) {
                        if (innerLoopRow != outerLoopRow && graph[innerLoopRow][j] != 0) {
                            if (graph[outerLoopRow][innerLoopRow] > graph[innerLoopRow][outerLoopRow]) {
                                graph[innerLoopRow][j] = graph[innerLoopRow][j] - (graph[outerLoopRow][innerLoopRow] - graph[innerLoopRow][outerLoopRow]);
                                graph[outerLoopRow][j] = graph[outerLoopRow][j] + (graph[outerLoopRow][innerLoopRow] - graph[innerLoopRow][outerLoopRow]);
                                graph[outerLoopRow][innerLoopRow] = graph[outerLoopRow][innerLoopRow] - (graph[outerLoopRow][innerLoopRow] - graph[innerLoopRow][outerLoopRow]);
                                graph[innerLoopRow][outerLoopRow] = 0;

                            }
                        }
                    }
                }
            }
        }


        return graph;
    }
}
