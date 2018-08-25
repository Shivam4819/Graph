/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author shivam
 */
public class Graph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatrixRepresentation m=new MatrixRepresentation();
        m.create();
      
        DepthFirstSearch d=new DepthFirstSearch();
        d.graphUsingList();
        d.displayListGraph();
        d.dfs();
       
        LinkListRepresentation l= new LinkListRepresentation();
        l.graphUsingList();
        l.displayListGraph();
       
        MotherVertex mother= new MotherVertex();
        mother.graphCreation();
        mother.displayGraph();
        mother.mothervertex();
    }
    
}
