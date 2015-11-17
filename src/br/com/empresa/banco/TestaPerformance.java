package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        
    	System.out.println("Iniciando...");
       // Collection<Integer> teste = new ArrayList<>();
    	Collection<Integer> teste2 = new HashSet<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        for (int i = 0; i < total; i++) {
            //teste.add(i);
            teste2.add(i);
        }

        for (int i = 0; i < total; i++) {
            //teste.contains(i);
            teste2.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        
        System.out.println("Tempo gasto: " + tempo);
    }
}