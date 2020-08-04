package finalExam;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * An Edge is represented as a tuple w, u, v
 * where w = weight, u = node_1 and v = node_2
 */
class Edge {
    private Integer _w, _u, _v;

    public Edge(Integer f, Integer s, Integer t) {
        _w = f;
        _u = s;
        _v = t;
    }

    Integer w() {
        return _w;
    }

    Integer u() {
        return _u;
    }

    Integer v() {
        return _v;
    }

    public String toString() {
        return w() + " " + u() + " " + v();
    }
}

/*
 * Union-Find Disjoint Sets Library,
 * using both path compression and union by rank heuristics
 * 
 * path-compression: flattens the tree to set all nodes with same parent
 * 
 * rank-heuristics: adds the smaller subset to the larger one to reduce
 * recursive parent lookup, i.e., keep tree short.
 */
class UnionFind {
    private ArrayList<Integer> parent, rank, setSize;
    private int numSets;

    public UnionFind(int N) {
        parent = new ArrayList<Integer>(N + 1);
        rank = new ArrayList<Integer>(N + 1);
        setSize = new ArrayList<Integer>(N + 1);
        numSets = N;
        for (int i = 0; i <= N; i++) {
            parent.add(i);
            rank.add(1);
            setSize.add(1);
        }
    }

    public int findSet(int i) {
        if (parent.get(i) == i)
            return i;
        else {
            int ret = findSet(parent.get(i));
            parent.set(i, ret);
            return ret;
        }
    }

    public Boolean isSameSet(int i, int j) {
        return findSet(i) == findSet(j);
    }

    public void unionSet(int i, int j) {
        if (!isSameSet(i, j)) {
            numSets--;
            int x = findSet(i), y = findSet(j);
            // rank is used to keep the tree short
            if (rank.get(x) > rank.get(y)) {
                parent.set(y, x);
                setSize.set(x, setSize.get(x) + setSize.get(y));
            } else {
                parent.set(x, y);
                setSize.set(y, setSize.get(y) + setSize.get(x));
                if (rank.get(x) == rank.get(y))
                    rank.set(y, rank.get(y) + 1);
            }
        }
    }

    public int numDisjointSets() {
        return numSets;
    }

    public int sizeOfSet(int i) {
        return setSize.get(findSet(i));
    }
}

public class E26Kruskal {
    public static void main(String[] args) throws Exception {
        /*
         * Graph from lecture with numbered nodes,
         * format: list of weighted edges
         * V = number of vertices; E = number of Edges
         * u v w ; u=node1, v=node2, w=weight
         * // This example shows another form of reading graph input
         * 9 15 => V E
         * 1 2 1 => 1 (CG, P)
         * 1 3 1 => 1 (CG, T)
         * 7 8 2 => 2 (LV, U)
         * 8 5 2 => 2 (U, SF)
         * 5 6 2 => 2 (SF, SD)
         * 4 8 3 => 3 (F, U)
         * 4 2 3 => 3 (F, P)
         * 4 9 3 => 3 (F, A)
         * 2 6 3 => 3 (P, SD)
         * 6 1 3 => 3 (SD, CG)
         * 4 7 4 => 4 (F, LV)
         * 2 9 4 => 4 (P, A)
         * 2 5 5 => 5 (P, SF)
         * 6 3 5 => 5 (SD, T)
         * 9 3 6 => 6 (A, T)
         */
        File f = new File("TestCases/mst_in_2.txt");
        Scanner sc = new Scanner(f);

        // Kruskal's algorithm
        int V = sc.nextInt(), E = sc.nextInt();
        PriorityQueue<Edge> pq = new PriorityQueue<>(E,
                Comparator.comparingInt(o -> o.w()));

        // O(E log E)
        // pq add is O(log E) for each E
        for (int i = 0; i < E; ++i) {
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            pq.add(new Edge(w, u, v)); // reorder as (w, u, v)
        }
        sc.close();

        // System.out.println(pq);

        int mst_cost = 0, num_taken = 0; // no edge has been taken
        UnionFind UF = new UnionFind(V); // all V are disjoint sets
        
        while (!pq.isEmpty()) {
            Edge front = pq.remove();
            if (UF.isSameSet(front.u(), front.v()))
                continue; // check
            System.out.println(front);
            mst_cost += front.w(); // add w of this edge
            UF.unionSet(front.u(), front.v());// link them
            ++num_taken; // 1 more edge is taken
            if (num_taken == V - 1)
                break; // optimization
        }

        // note: the number of disjoint sets
        // must eventually be 1 for a valid MST
        System.out.printf("MST cost = %d\n", mst_cost);
    }
}
