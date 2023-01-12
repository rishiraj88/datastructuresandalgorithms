public class Islands {
    /*
    Count the islands only of 1s in the sea of 0s
     */
    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callBfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void callBfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        callBfs(grid, i + 1, j);
        callBfs(grid, i - 1, j);
        callBfs(grid, i, j + 1);
        callBfs(grid, i, j - 1);

    }

    /* to test
    11110
    11010
    11000
    00000

    11000
    11000
    00100
    00011
     */
    public static void main(String[] args) {
        char[][] arr = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(arr)); //1

        arr = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(arr)); //3
    }
}
