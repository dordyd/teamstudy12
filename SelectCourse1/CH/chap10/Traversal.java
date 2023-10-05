package SelectCourse1.CH.chap10;

import java.util.Arrays;

public class Traversal {

    private int[] traversal;
    private Moor moor;
    private boolean found;
    private boolean[][] isTraveled;

    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        isTraveled = new boolean[moor.getNumRows()][moor.getNumColumns()];
        found = traverseMoor(moor, isTraveled);

    }

    public Moor moor() {
        return moor;
    }

    public boolean existsTraversal() {
        return found;
    }

    public int length() {
        if (found)
            return traversal.length;
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    public int step(int i) {
        if (found)
            return traversal[i];
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < moor.getNumRows(); i++) {
            for (int j = 0; j < moor.getNumColumns(); j++) {
                // if (traversal[j] == i) {
                if (isTraveled[i][j]) {
                    sb.append("# ");
                } else {
                    if (moor.land(i, j)) {
                        sb.append("* ");
                    } else {
                        sb.append("o ");
                    }
                }

            }

            sb.append("\n");
        }
        return sb.toString();

    }

    private static boolean traverseMoor(Moor m, boolean[][] path) {
        for (int row = 0; row < m.getNumRows(); row++)
            if (searchTraversal(m, row, 0, path, new int[1]))
                return true;
        return false;
    }

    public static boolean isRightRange(int r, int c, Moor m) {
        return (r >= 0) && (r < m.getNumRows()) &&
                (c >= 0) && (c < m.getNumColumns());
    }

    private static boolean searchTraversal(Moor m, int r, int c, boolean[][] istraveled, int[] count) {
        if (isRightRange(r, c, m) && istraveled[r][c]) {
            return false;
        } // 해당 구현부분을 지우고 테스트하면 count가 colum의 숫자에 비례해서 증가하는걸 볼 수 있음.
        if (!m.land(r, c))
            return false;
        else {
            count[0]++;
            istraveled[r][c] = true;
            if (c == m.getNumColumns() - 1) {
                return true;
            } else {
                boolean ret = searchTraversal(m, r - 1, c + 1, istraveled, count) ||
                        searchTraversal(m, r, c + 1, istraveled, count) ||
                        searchTraversal(m, r + 1, c + 1, istraveled, count) ||
                        searchTraversal(m, r - 1, c, istraveled, count) ||
                        searchTraversal(m, r + 1, c, istraveled, count) ||
                        searchTraversal(m, r - 1, c - 1, istraveled, count) ||
                        searchTraversal(m, r, c - 1, istraveled, count) ||
                        searchTraversal(m, r + 1, c - 1, istraveled, count);
                if (!ret) {
                    istraveled[r][c] = false;
                }
                return ret;
            }

        }
    }

    public static void main(String[] args) {
        Traversal test = new Traversal(new Moor(20, 20, 0.5));
        System.out.println(test);

    }
}