/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class MotherVertex {
    Scanner scanner=new Scanner(System.in);
int vertex;
Node[] A=new Node[20];

    void graphCreation(){

       System.out.print("Vertex:-");
       vertex=scanner.nextInt();

       for(int i=0;i<vertex;i++){
           A[i] = new Node(i);
       }
       System.out.print("Edeges:-");
       int edges=scanner.nextInt();
       for(int i=0;i<edges;i++){
           System.out.print("Edge("+i+"):-");
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
    
    void displayGraph(){
         for(int i=0;i<vertex;i++){
            System.out.print(i+")");
            Node temp=A[i].next;
            while(temp!=null){
                System.out.print("->"+temp.data);
                temp=temp.next;
            }
        }
        System.out.println("");
    }

    void mothervertex(){
        
     Queue<Integer> queue= new LinkedList<>();
        System.out.println("in dfs-");
        int visit[]=new int[vertex];
        for(int i=0;i<vertex;i++){
            visit[i]=0;
        }
        int k=0,flag=0;
        do{
            queue.add(A[k].data);
            while(!queue.isEmpty()){
                int s=queue.poll();
                Node temp=A[s];
                visit[s]=1;
                while(temp!=null){
                    if(visit[temp.data]==0){
                        visit[temp.data]=1;
                        queue.add(temp.data);
                    }
                    temp=temp.next;
                }
            }
                        for(int i=0;i<vertex;i++){
                if(visit[i]==1){
                    flag=1;
                }
                else{
                    flag=0;
                    for(int j=0;j<vertex;j++)
                        visit[j]=0;
                    k++;
                    break;
                }
            }
            
        }while(flag!=1);
        System.out.println("Parent Vertex:-"+k);

    }
    
}
