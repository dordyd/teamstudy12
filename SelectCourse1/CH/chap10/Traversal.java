package SelectCourse1.CH.chap10;

public class Traversal {

    private int[] traversal;
    private Moor moor;
    private boolean found;

    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        found = traverseMoor(moor, traversal);
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

        return sb.toString();
    }

    // auxiliary methods

    private static boolean traverseMoor(Moor m, int[] path) {
        for (int row = 0; row < m.getNumRows(); row++)
            if (searchTraversal(m, row, 0, path))
                return true;
        return false;
    }

    private static boolean searchTraversal(Moor m, int r, int c, int[] path) {
        if (!m.land(r, c))
            return false;
        else {
            path[c] = r;
            if (c == m.getNumColumns() - 1)
                return true;
            else
                return searchTraversal(m, r - 1, c + 1, path) ||
                        searchTraversal(m, r, c + 1, path) ||
                        searchTraversal(m, r + 1, c + 1, path);
        }
    }
}