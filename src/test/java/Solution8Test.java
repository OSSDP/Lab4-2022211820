import org.junit.Before;
import org.junit.Test;
import edu.hit.Solution8;
import static org.junit.Assert.assertEquals;

public class Solution8Test {

    private Solution8 solution;

    // 在每个测试方法之前初始化 Solution8 实例
    @Before
    public void setUp() {
        solution = new Solution8();
    }

    @Test
    public void testNumIslands_case1() {
        // 测试目的：验证给定示例1的正确性
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result = solution.numIslands(grid);
        assertEquals(2, result); // 预期输出为1
    }

    @Test
    public void testNumIslands_case2() {
        // 测试目的：验证给定示例2的正确性
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result = solution.numIslands(grid);
        assertEquals(1, result); // 预期输出为3
    }

    @Test
    public void testNumIslands_case3() {
        // 测试目的：验证只有水域的情况
        char[][] grid = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        int result = solution.numIslands(grid);
        assertEquals(2, result); // 预期输出为0，网格中没有陆地
    }

    @Test
    public void testNumIslands_case4() {
        // 测试目的：验证只有陆地的情况
        char[][] grid = {
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'}
        };
        int result = solution.numIslands(grid);
        assertEquals(1, result); // 预期输出为1，整个网格都是陆地，算作一个岛屿
    }

    @Test
    public void testNumIslands_case5() {
        // 测试目的：验证只有一个陆地块的情况
        char[][] grid = {
                {'1', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        int result = solution.numIslands(grid);
        assertEquals(1, result); // 预期输出为1，只有一个岛屿
    }
}
