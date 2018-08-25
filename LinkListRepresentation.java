/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Scanner;

/**
 *
 * @author shivam
 */


public class LinkListRepresentation {
    
Scanner scanner=new Scanner(System.in);
int vertex;
Node[] A=new Node[20];

    void graphUsingList(){

       System.out.print("\nVertex:-");
       vertex=scanner.nextInt();

       for(int i=0;i<vertex;i++){
           A[i] = new Node(i);
       }
       System.out.print("\nEdeges:-");
       int edges=scanner.nextInt();
       for(int i=0;i<edges;i++){
           System.out.print("\nEdge("+i+"):-");
           int vertex1=scanner.nextInt();
           int vertex2=scanner.nextInt();

           Node newnode= new Node(vertex2);
           if(A[vertex1].next==null)
               A[vertex1].next=newnode;
           else{
               Node temp=A[vertex1];
               while(temp.next!=null)
                   temp=temp.next;
               temp.next=newnode;
           }
       }
    }
    
    void displayListGraph(){
         for(int i=0;i<vertex;i++){
            System.out.print("\n"+i+")");
            Node temp=A[i].next;
            while(temp!=null){
                System.out.print("->"+temp.data);
                temp=temp.next;
            }
        }
        System.out.println("");
    }

}
