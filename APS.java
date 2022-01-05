package APS;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;
/**
 *
 * @author Gabriel Vieira 
 */
public class APS {
    public static void main(String[]args){
        
        int qtd = 10000;
        int[] vetor = new int[qtd];
        
        
        //Setando a Janela principal do aplicativo e os paineis de cada
        //tipo de algoritimo pedido.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("APS - Quarto Semestre");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        
        //Declarando os objetos do primeiro Painel de Binary Search
        JLabel question1 = new JLabel("Ordenar os numeros?");
        question1.setBounds(10, 10, 250, 25);
        question1.setFont(new Font("Arial", Font.BOLD, 20));
        p1.add(question1);
        
        JTextArea sub = new JTextArea();
        sub.setEditable(false);
        sub.setFont(new Font("Arial", Font.BOLD, 15));
        sub.setMargin(new Insets(3,3,0,0));
        JScrollPane subArea = new JScrollPane(sub);
        subArea.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        subArea.setBounds(10, 100, 230, 25);
        sub.append("DESORDENADO:");
        p1.add(subArea);
        
        JTextArea sub1 = new JTextArea();
        sub1.setEditable(false);
        sub1.setFont(new Font("Arial", Font.BOLD, 15));
        sub1.setMargin(new Insets(3,3,0,0));
        JScrollPane subArea1 = new JScrollPane(sub1);
        subArea1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        subArea1.setBounds(245, 100, 230, 25);
        sub1.append("ORDENADO:");
        p1.add(subArea1);
        
        JTextArea screen = new JTextArea();
        screen.setEditable(false);
        screen.setFont(new Font("Arial", Font.BOLD, 13));
        screen.setMargin(new Insets(5,10,5,5));
        JScrollPane scrollArea = new JScrollPane(screen);
        scrollArea.setBounds(10, 125, 230, 300);
        p1.add(scrollArea);
        
        JTextArea screen1 = new JTextArea();
        screen1.setEditable(false);
        screen1.setFont(new Font("Arial", Font.BOLD, 13));
        screen1.setMargin(new Insets(5,10,5,5));
        JScrollPane scrollArea1 = new JScrollPane(screen1);
        scrollArea1.setBounds(245, 125, 230, 300);
        p1.add(scrollArea1);
        
        JTextField timer1 = new JTextField();
        timer1.setEditable(false);
        timer1.setBounds(10, 75, 150, 20);
        p1.add(timer1);
        
        //Binary Insertion Sort
        JButton btnSearch = new JButton("Ordenar");
        btnSearch.setBounds(10, 45, 100, 25);
        btnSearch.addActionListener((ActionEvent e) -> {
            long startTime = System.currentTimeMillis();
            for(int i=0; i < vetor.length; i++){
                vetor[i] = (int) (Math.random() * qtd);
            }
            for (int i = 1; i < vetor.length; i++) {
                screen.append(String.valueOf(vetor[i]) + "\n");
		int x = vetor[i];
		int j = Math.abs(
			Arrays.binarySearch(vetor, 0, i, x) + 1);
		System.arraycopy(vetor, j, vetor, j + 1, i - j);
		vetor[j] = x;
            }
            for(int i=0; i < vetor.length; i++){
                screen1.append(String.valueOf(vetor[i]) + "\n");
            }
            long finalTime = System.currentTimeMillis();
            timer1.setText("  Executado em = " + (finalTime - startTime) + "ms"); 
        });
        p1.add(btnSearch);
        
        
        //Declarando os objetos do segundo Painel de Selection Sort
        JLabel question2 = new JLabel("Ordenar os numeros?");
        question2.setBounds(10, 10, 250, 25);
        question2.setFont(new Font("Arial", Font.BOLD, 20));
        p2.add(question2);
        
        JTextArea sub2 = new JTextArea();
        sub2.setEditable(false);
        sub2.setFont(new Font("Arial", Font.BOLD, 15));
        sub2.setMargin(new Insets(3,3,0,0));
        JScrollPane subArea2 = new JScrollPane(sub2);
        subArea2.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        subArea2.setBounds(10, 100, 230, 25);
        sub2.append("DESORDENADO:");
        p2.add(subArea2);
        
        JTextArea sub3 = new JTextArea();
        sub3.setEditable(false);
        sub3.setFont(new Font("Arial", Font.BOLD, 15));
        sub3.setMargin(new Insets(3,3,0,0));
        JScrollPane subArea3 = new JScrollPane(sub3);
        subArea3.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        subArea3.setBounds(245, 100, 230, 25);
        sub3.append("ORDENADO:");
        p2.add(subArea3);
        
        JTextArea screen2 = new JTextArea();
        screen2.setEditable(false);
        screen2.setFont(new Font("Arial", Font.BOLD, 13));
        screen2.setMargin(new Insets(5,10,5,5));
        JScrollPane scrollArea2 = new JScrollPane(screen2);
        scrollArea2.setBounds(10, 125, 230, 300);
        p2.add(scrollArea2);
        
        JTextArea screen3 = new JTextArea();
        screen3.setEditable(false);
        screen3.setFont(new Font("Arial", Font.BOLD, 13));
        screen3.setMargin(new Insets(5,10,5,5));
        JScrollPane scrollArea3 = new JScrollPane(screen3);
        scrollArea3.setBounds(245, 125, 230, 300);
        p2.add(scrollArea3);
        
        JTextField timer2 = new JTextField();
        timer2.setEditable(false);
        timer2.setBounds(10, 75, 150, 20);
        p2.add(timer2);
        
        //Selection Sort
        JButton btnOrder1 = new JButton("Ordenar");
        btnOrder1.setBounds(10, 45, 100, 25);
        btnOrder1.addActionListener((ActionEvent f) -> {
            long startTime = System.currentTimeMillis();
            for(int i=0; i < vetor.length; i++){
                vetor[i] = (int) (Math.random() * qtd);
            }
            for(int i=0; i < vetor.length;i++){
                screen2.append(String.valueOf(vetor[i]) + "\n");
            }
            int posicao_menor, aux;
            for(int i=0; i < vetor.length; i++){
                posicao_menor = i;
                for(int j = i+1; j < vetor.length; j++){
                    if (vetor[j] < vetor[posicao_menor]){
                        posicao_menor = j;
                    }
                }
                aux = vetor[posicao_menor];
                vetor[posicao_menor] = vetor[i];
                vetor[i] = aux;
            }       
            
            for(int i=0; i < vetor.length; i++){
                screen3.append(String.valueOf(vetor[i]) + "\n");
            }
            long finalTime = System.currentTimeMillis();
            timer2.setText("  Executado em = " + (finalTime - startTime) + "ms"); 
        });
        p2.add(btnOrder1);
        
        
        //Declarando os objetos do terceiro Painel de Quick Sort
        JLabel question3 = new JLabel("Ordenar os numeros?");
        question3.setBounds(10, 10, 250, 25);
        question3.setFont(new Font("Arial", Font.BOLD, 20));
        p3.add(question3);
        
        JTextArea sub4 = new JTextArea();
        sub4.setEditable(false);
        sub4.setFont(new Font("Arial", Font.BOLD, 15));
        sub4.setMargin(new Insets(3,3,0,0));
        JScrollPane subArea4 = new JScrollPane(sub4);
        subArea4.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        subArea4.setBounds(10, 100, 230, 25);
        sub4.append("DESORDENADO:");
        p3.add(subArea4);
        
        JTextArea sub5 = new JTextArea();
        sub5.setEditable(false);
        sub5.setFont(new Font("Arial", Font.BOLD, 15));
        sub5.setMargin(new Insets(3,3,0,0));
        JScrollPane subArea5 = new JScrollPane(sub5);
        subArea5.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        subArea5.setBounds(245, 100, 230, 25);
        sub5.append("ORDENADO:");
        p3.add(subArea5);
        
        JTextArea screen4 = new JTextArea();
        screen4.setEditable(false);
        screen4.setFont(new Font("Arial", Font.BOLD, 13));
        screen4.setMargin(new Insets(5,10,5,5));
        JScrollPane scrollArea4 = new JScrollPane(screen4);
        scrollArea4.setBounds(10, 125, 230, 300);
        p3.add(scrollArea4);
        
        JTextArea screen5 = new JTextArea();
        screen5.setEditable(false);
        screen5.setFont(new Font("Arial", Font.BOLD, 13));
        screen5.setMargin(new Insets(5,10,5,5));
        JScrollPane scrollArea5 = new JScrollPane(screen5);
        scrollArea5.setBounds(245, 125, 230, 300);
        p3.add(scrollArea5);
        
        JTextField timer3 = new JTextField();
        timer3.setEditable(false);
        timer3.setBounds(10, 75, 150, 20);
        p3.add(timer3);
        
        //Quick Sort
        JButton btnOrder2 = new JButton("Ordenar");
        btnOrder2.setBounds(10, 45, 100, 25);
        btnOrder2.addActionListener((ActionEvent f) -> {
            long startTime = System.currentTimeMillis();
            for(int i = 0; i < vetor.length; i++){
                vetor[i] = (int) Math.floor(Math.random() * qtd);
            }
            for(int i = 0; i < vetor.length; i++){
                screen4.append(vetor[i]+ "\n");
            }
            quicksort(vetor,0,vetor.length - 1);
            for(int i = 0; i < vetor.length;i++){
                screen5.append(vetor[i] + "\n");
            }
            long finalTime = System.currentTimeMillis();
            timer3.setText("  Executado em = " + (finalTime - startTime) + "ms"); 
        });
        p3.add(btnOrder2);
        
        
        //Aplicando o Layout e Nomeando os mesmos
        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());
        p3.setLayout(new BorderLayout());
        JTabbedPane tabs = new JTabbedPane();
        tabs.setBounds(0,0,500,500);  
        tabs.add("Binary Insertion Sort",p1);
        tabs.add("Selection Sort", p2);
        tabs.add("Quick Sort", p3);
        frame.add(tabs);
        
        frame.setVisible(true);
    }
    
    
    private static void quicksort(int[] vetor, int esquerda,int direita){
        if (esquerda < direita){
            int p = particao(vetor,esquerda,direita);
            quicksort(vetor,esquerda,p);
            quicksort(vetor,p +1,direita);
        }
    }
    
    private static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int)(esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
