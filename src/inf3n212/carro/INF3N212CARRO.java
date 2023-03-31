/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import controller.CCarro;
import controller.CPessoa;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author 631510300
 */
public class INF3N212CARRO {

    public static final String VERMELHO = "\u001B[31m";
    public static final String RESET = "\u001B[30m";
    public static final String VERDE = "\u001B[32m";

    public static CPessoa cadPessoa = new CPessoa();

    public static CCarro cadCarro = new CCarro();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        cadPessoa.mockPessoas();
        cadCarro.mockCarros();
        int opM = 212;
        int oopSM = 212;

        do {
            System.out.println("--Sistema de Cadastro--");
            menuP();
            opM = leiaNumInt();
            switch (opM) {
                case 1:
                case 2:
                    do {
                        subMenu(opM);
                        oopSM = leiaNumInt();
                        switch (oopSM) {
                            case 1:
                                System.out.println("Cadasto");
                                if (opM == 1) {
                                    cadastrarPessoa();
                                } else {
                                    cadastrarCarro();
                                }
                                break;
                            case 2:
                                System.out.println("Edita");
                                 if (opM == 1) {
                                    editarPessoa();
                                } else  {
                                    editarCarro();
                                }

                                break;
                            case 3:
                                System.out.println("Lista");
                                 if (opM == 1) {
                                    listarPessoa();
                                } else {
                                    listarCarro();
                                }

                                break;
                            case 4:
                                System.out.println("Deleta1");
                                 if (opM == 1) {
                                    deletarPessoa();
                                } else {
                                    deletarCarro();
                                }

                                break;
                            case 0:

                                break;
                            default:
                                System.out.println(VERMELHO + "opção Inválida, tente novamente" + RESET);
                        }//fim Switch SUBMENU
                    } while (oopSM != 0);
                    break;

                case 3:

                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo ananá");
                    break;
                default:
                    System.out.println(VERMELHO + "Opção inválida, tente novamente!" + RESET);
            }

        } while (opM != 0);
    }//fim do main

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();

        } catch (InputMismatchException i) {
            System.out.println(VERMELHO + "Erro: " + i.getMessage() + "\nTente novamente" + RESET);
            leiaNumInt();
        }
        return 69;
    }

    public static void menuP() {
        System.out.println(VERDE + "--Menu Principal--" + RESET);
        System.out.println("1- ger.Pessoa");
        System.out.println("2- ger. carro");
        System.out.println("0 - sair");
        System.out.print("Digite aqui:\t");
    }//fim menuP

    public static void subMenu(int opm) {
        String subM = null;
        if (opm == 1) {
            subM = "Pessoa";
        }
        if (opm == 2) {
            subM = "Carro";
        }

        System.out.println("--Ger. " + subM + "---");
        System.out.println("1 - Cadastrar" + subM);
        System.out.println("2- Editar" + subM);
        System.out.println("3- Listar" + subM + "s");
        System.out.println("4 - Deletar" + subM);
        System.out.println("0 - voltar");
        System.out.print("Digite aqui:\t");
    }//fim subMenu

    private static void cadastrarPessoa() {
        System.out.println("Pessoa");
    }

    private static void cadastrarCarro() {
        System.out.println("Carro1");}

    private static void editarPessoa() {
    }

    private static void editarCarro() {
    }

    private static void listarPessoa() {
    }

    private static void listarCarro() {
    }

    private static void deletarPessoa() {
    }

    private static void deletarCarro() {
    }

}//fim da classe
