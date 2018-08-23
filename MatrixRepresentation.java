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
public class MatrixRepresentation {
    int matrix[][]=new int[5][5];
    int edges,vertices;
    public void create(){
        int edge1,edge2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the total number of edges");
        edges=scanner.nextInt();
        vertices=edges;
        for(int i=0;i<vertices;i++){
            for(int j=0;j<edges;j++){
                matrix[i][j]=0;
            }
        }
        display();

        for(int i=edges;i>0;i--){
            System.out.print("enter the edges-");
            edge1=scanner.nextInt();
            edge2=scanner.nextInt();
            matrix[edge1][edge2]=1;
        }
        display();
         
    }
    public void display(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<edges;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        
        for(int i=0;i<vertices;i++){
            for(int j=0;j<edges;j++){
                if(matrix[i][j]==1){
                    System.out.print("i->"+i+"j->"+j);
                }
            }
            System.out.println("");
        }
    }
}
