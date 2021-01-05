package com.graps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.setNeighbour(b);
        a.setNeighbour(f);
        a.setNeighbour(g);

        b.setNeighbour(a);
        b.setNeighbour(c);
        b.setNeighbour(d);

        c.setNeighbour(b);

        d.setNeighbour(b);
        d.setNeighbour(e);

        f.setNeighbour(a);

        g.setNeighbour(a);
        g.setNeighbour(h);

        h.setNeighbour(g);

        breadthFirstSearch.traverse(a);
    }
}
