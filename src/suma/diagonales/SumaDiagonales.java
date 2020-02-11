/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.diagonales;

/**
 *
 * @author Jonathan
 */
public class SumaDiagonales 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int matriz[][]={{10,1,34},{9,5,4},{2,7,23}},suma1=0,suma2=0;
        System.out.println("");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    suma1+=matriz[i][j];
                }
                if((i==0 && j==2)||(i==1 && j==1)||(i==2 && j==0))
                {
                    suma2+=matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+suma1);
        System.out.println("La suma de la diagonal secundaria es: "+suma2);
    }

}
