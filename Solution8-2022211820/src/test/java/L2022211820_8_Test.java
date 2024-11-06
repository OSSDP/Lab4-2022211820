import edu.hit.Solution8;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211820_8_Test {
    // 测试用例设计的总体原则：等价类划分原则，即对于输入的每个可能值，都设计一个测试用例来验证其正确性。
    @Test
public void testNumIslands_case1() {
    // 修改期望输出为错误的值
    char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };
    Solution8 solution = new Solution8();
    int result = solution.numIslands(grid);
    assertEquals(2, result); // 错误的预期值，实际输出为1
}

@Test
public void testNumIslands_case2() {
    // 修改期望输出为错误的值
    char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    };
    Solution8 solution = new Solution8();
    int result = solution.numIslands(grid);
    assertEquals(2, result); // 错误的预期值，实际输出为3
}
}
