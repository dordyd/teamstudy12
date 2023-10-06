package chap10.exercise1007;

public class Traversal {
    public int[] traversal;
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

    public int length() {
        if (found) {
            return traversal.length;
        } else {
            throw new RuntimeException("Traversal: traversal dose not exist");
        }
    }

    public int step(int i) {
        if (found) {
            return traversal[i];
        } else {
            throw new RuntimeException("Traversal: traversal dose not exist");
        }
    }

    private boolean traverseMoor(Moor m, int[] path) {
        for (int row = 0; row < m.getNumRows(); row++) {
            if (searchTraversal(m, row, 0, path)) {
                return true;
            }
        }
        return false;
    }

    private boolean searchTraversal(Moor m, int r, int c, int[] path) {
        if (!m.land(r, c)) {
            return false;
        } else {
            path[c] = r;
            if (c == m.getNumColumns() - 1) {
                return true;
            } else {
                return
                        searchTraversal(m, r - 1, c + 1, path) ||
                                searchTraversal(m, r, c + 1, path) ||
                                searchTraversal(m, r + 1, c + 1, path);
            }
        }
    }

    public static void main(String[] args) {
        int numRows = 100;
        int numColumns = 100;
        double probLand = 0.6;
        Moor moor = new Moor(numRows, numColumns, probLand);

        // 모오어 출력
        System.out.println("Moor:");
        System.out.println(moor);

        // 수로 탐색
        Traversal traversal = new Traversal(moor);

        // 수로 탐색 결과 출력
        if (traversal.length() > 0) {
            System.out.println("Traversal:");
            for (int i = 0; i < traversal.length(); i++) {
                int step = traversal.step(i);
                System.out.printf("(%d, %d) ", step, i);
            }
            System.out.println();
        } else {
            System.out.println("No traversal found.");
        }
    }
}
