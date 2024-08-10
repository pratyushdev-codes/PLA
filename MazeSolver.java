public class MazeSolver {
    private static final int N = 4;

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int[][] solution = new int[N][N];

        if (solveMaze(maze, 0, 0, solution)) {
            printSolution(solution);
        } else {
            System.out.println("No solution exists");
        }
    }

    private static boolean solveMaze(int[][] maze, int x, int y, int[][] solution) {
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            if (solution[x][y] == 1) {
                return false;
            }

            solution[x][y] = 1;

            if (solveMaze(maze, x + 1, y, solution)) {
                return true;
            }

            if (solveMaze(maze, x, y + 1, solution)) {
                return true;
            }

            solution[x][y] = 0;
            return false;
        }

        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    private static void printSolution(int[][] solution) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}
