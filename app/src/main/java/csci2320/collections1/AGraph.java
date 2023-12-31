package csci2320.collections1;

import java.util.List;

public class AGraph {
    int[][] matrix = {{1,0,1,1},{0,0,1,0},{0,0,0,1},{0,1,0,0}};
    
    List<List<Integer>> adjList = List.of(
        List.of(0,2,3),
        List.of(2),
        List.of(3),
        List.of(1)
    );

    int[][] maze = {
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0}
    };
}
