import edu.hit.Solution8;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211820_8_Test {
    // 测试用例设计的总体原则：等价类划分原则，即对于输入的每个可能值，都设计一个测试用例来验证其正确性。

    @Test
    public void testNumIslands_case1() {
        Solution8 solution = new Solution8();

        // 错误的输入：二维网格全是水 (只有 0)
        char[][] grid1 = {
            {'0', '0', '0'},
            {'0', '0', '0'},
            {'0', '0', '0'}
        };

        // 在这种情况下，岛屿的数量应该是 0，但如果程序有 bug 可能会导致错误输出。
        System.out.println(solution.numIslands(grid1)); // 预期输出: 0

        // 错误的输入：边界条件检查失败
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '1', '0', '0'},
            {'0', '1', '1', '1', '0'},
            {'0', '0', '0', '0', '0'}
        };

        // 在这种情况下，应该返回 1，但程序可能因边界检查不完全而出错。
        System.out.println(solution.numIslands(grid2)); // 预期输出: 1
    }
}
