package com.faleite.estruturadados.vetor.labs;

import com.faleite.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06{

    public static void main(String[] args) {
        // ciraçao das variaves
        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<Contato>(20);

        // criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        // cria um menu para que o usuario escola a opção
        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scan);

            switch (opcao){
                case 1:
                    adicionarContato(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContaoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContao(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado");
    }

    public static void  imprimirVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }

    public static void  limparVetor(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluidos");
    }

    public static void  imprimeTamanhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    private static  void excluirContato(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformaçãoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = lista.get(pos);
            lista.remove(contato);

            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static  void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformaçãoInt("Entre com a posição a ser removida", scan);

        try {

            lista.remove(pos);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static  void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformaçãoInt("Entre com a posição pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

            if (existe){
                System.out.println("Contato exste, seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static  void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformaçãoInt("Entre com a posição pesquisada", scan);

        try {

            Contato contato = lista.get(pos);
            System.out.println("Contato exste, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado no indice " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static  void obtemContao(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformaçãoInt("Entre com a posição pesquisada", scan);

        try {

            Contato contato = lista.get(pos);
            System.out.println("Contato exste, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static  void obtemContaoPosicao(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformaçãoInt("Entre com a posição pesquisada", scan);

        try {

            Contato contato = lista.get(pos);
            System.out.println("Contato exste, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void adicionarContato(Scanner scan, ArrayList<Contato> lista){

        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformação("Entre com o nome", scan);
        String telefone = leInformação("Entre com o telefone", scan);
        String email = leInformação("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista){

        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformação("Entre com o nome", scan);
        String telefone = leInformação("Entre com o telefone", scan);
        String email = leInformação("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformaçãoInt("Entre com a posição a adicionar o contato", scan);

        try{
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inávlida, contato não adicionado");
        }


    }

    private static void criarContatosDinamicamente(int quantiodade, ArrayList<Contato> lista){

        Contato contato = new Contato();

        for (int i = 1; i <= quantiodade; i++){

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}

