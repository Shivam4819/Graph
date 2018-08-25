/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author shivam
 */

public class DepthFirstSearch {
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
           Node newnode1=new Node(vertex1);
           if(A[vertex1].next==null)
               A[vertex1].next=newnode;
           else{
               Node temp=A[vertex1];
               while(temp.next!=null)
                   temp=temp.next;
               temp.next=newnode;
           }
           if(A[vertex2].next==null)
               A[vertex2].next=newnode1;
           else{
               Node temp=A[vertex2];
               while(temp.next!=null)
                   temp=temp.next;
               temp.next=newnode1;
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
    
    void dfs(){
        
     Queue<Integer> queue= new LinkedList<>();
        System.out.println("in dfs-");
        int dfs[]=new int[vertex];
        for(int i=0;i<vertex;i++){
            dfs[i]=0;
        }
        for(int i=0;i<vertex;i++){
            Node temp=A[i].next;
            while(temp!=null){
                int j=temp.data;
                if(dfs[j]==0){
                    dfs[j]=1;
                    queue.add(temp.data);
                }
                
                temp=temp.next;
            }
        }
        System.out.println("queue->"+queue);
    }
}
