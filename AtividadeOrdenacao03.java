/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeordenacao03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alison
 */
public class AtividadeOrdenacao03 {

   private static final List<Integer> listNumeros = new ArrayList<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        addAll("src/couting.txt");

        countingSort(listNumeros);
        //radixSort(listNumeros);

        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println(listNumeros.get(i));
        }
    }

    public static void addAll(String file) {
        System.out.println("LENDO ARQUIVO");
        try {
            FileReader arq = new FileReader(file);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                //String numeros[] = linha.split("-");
                listNumeros.add(Integer.parseInt(linha));

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        List<Integer> arr = listNumeros;
    }

    public static void countingSort(List<Integer> arr) {

    }

    public static void radixSort(List<Integer> arr) {

    }
    
}
