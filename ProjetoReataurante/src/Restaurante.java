import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Restaurante {

    public static void main(String[] args){
        Pizza p1= new Pizza();
        Hamburguer h1 = new Hamburguer();
        String opcao = JOptionPane.showInputDialog(" Informe o pedido \n 1.Hamburguer \n 2.Pizza \n3.Sair" );

        if (opcao.equals("1")) {
            p1.nome=JOptionPane.showInputDialog(" Informe o nome: ");
            p1.valor = parseDouble(JOptionPane.showInputDialog(" Informe o valor: " ));
            boolean possuiPorda = Boolean.parseBoolean(JOptionPane.showInputDialog(" Possui borda? "));



        }
        if (opcao.equals("2")){
            h1.nome = JOptionPane.showInputDialog(" Informe o nome");
            h1.valor= parseDouble(JOptionPane.showInputDialog(" Informe o valor: " ));
            boolean artesanal = Boolean.parseBoolean(JOptionPane.showInputDialog(" É artesanal ? "));


            }


            JOptionPane.showMessageDialog(null, " O seu pedido ficou no valor de: " + p1.valor + h1.valor);

        }




    }
