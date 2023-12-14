package com.br.cfarias;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas pessoas você deseja adicionar? \n");
        int resposta = s.nextInt();
        System.out.println((resposta));

        if(resposta != 0){
            for (int i = 0; i < resposta; i++) {
                System.out.println("Digite o nome e sexo separado por vírgulas, ex: Caio,Masculino ; Ana, Feminino");
                String respostaUser = s.next();
                String[] partes = respostaUser.split(",");
                String nome = partes[0];
                String genero = partes[1];
                pessoa.listaGeral.add(new Pessoa(nome,genero));

            }
        } else{
            System.out.println("Reinicie e o programa...");


        }

        pessoa.listaGeral.forEach(p -> System.out.print("Lista Geral: " + p +"\n"));
        pessoa.listaFeminina.forEach(p -> System.out.print("Lista feminina: " + p + "\n"));








    }







}