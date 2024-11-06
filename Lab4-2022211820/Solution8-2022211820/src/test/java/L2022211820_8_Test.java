import edu.hit.Solution8;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211820_8_Test {
    // 测试用例设计的总体原则：等价类划分原则，即对于输入的每个可能值，都设计一个测试用例来验证其正确性。

    @Test
    public void testNumIslands_case1() {
        // 测试目的：验证给定示例1的正确性
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution8 solution = new Solution8();
        int result = solution.numIslands(grid);
        assertEquals(1, result); // 预期输出为1
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
        Solution8 solution = new Solution8();
        int result = solution.numIslands(grid);
        assertEquals(3, result); // 预期输出为3
    }

    @Test
    public void testNumIslands_case3() {
        // 测试目的：验证空网格的情况
        char[][] grid = {};
        Solution8 solution = new Solution8();
        int result = solution.numIslands(grid);
        assertEquals(0, result); // 预期输出为0
    }
}