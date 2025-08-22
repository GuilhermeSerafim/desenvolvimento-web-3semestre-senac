package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = "", email = "", formatoMensagem = "";
        System.out.print("Digite o seu nome: ");
        nome = in.nextLine();
        System.out.print("Digite o seu e-mail: ");
        email = in.nextLine();
        System.out.print("Digite a opção de saída (HTML ou JSON): ");
        formatoMensagem = in.nextLine();
        while (!(formatoMensagem.equalsIgnoreCase("HTML") || formatoMensagem.equalsIgnoreCase("JSON"))) {
            System.out.println("Digite uma opção de saída válida, JSON ou HTML: ");
            formatoMensagem = in.nextLine();
        }
        in.close();
        String mensagem = retornaMensagemComFormatoEscolhido(nome, email, formatoMensagem);
        System.out.println(mensagem);
    }

    private static String retornaMensagemComFormatoEscolhido(String nome, String email, String formatoMensagem) {
        if (formatoMensagem.equalsIgnoreCase("JSON")) {
            return "{\n  \"nome\": \"" + nome + "\",\n  \"email\": \"" + email + "\"\n}";
        } else {
            return "<html>\n  <body>\n    <p>Nome: " + nome + "</p>\n    <p>Email: " + email
                    + "</p>\n  </body>\n</html>";
        }
    }
}