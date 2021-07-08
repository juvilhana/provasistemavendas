package programas;
import java.util.Scanner;
import java.time.LocalDate;
import classes.Produtos;
import classes.Vendas;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int opcao;
    List<Produtos> listaitens = new ArrayList<>();
    List<Vendas> listavendas = new ArrayList<>();

    do {
      System.out.println("\n");
      System.out.println("**************************************");
      System.out.println("**************MENU PRINCINPAL*********");
      System.out.println("**************************************");
      System.out.println("1 - Incluir produto");
      System.out.println("2 - Consultar Produto");
      System.out.println("3 - Listagem de Produtos");
      System.out.println("4 - Realizar venda ");
      System.out.println("5 -  Vendas por período - detalhado");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");
      opcao = in.nextInt();
      in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior
    
      switch (opcao) {
        case 1:
        //Cadastro de produto
        Produtos pr = new Produtos();
        System.out.print("Digite o codigo do produto: ");
        pr.setCodigoProduto(in.nextLine());

        System.out.print("Digite o nome do produto: ");
        pr.setNomeProduto(in.nextLine());

        System.out.print("Digite a quantidade: ");
        pr.setEstoqueProduto(in.nextInt());

        System.out.print("Digite o valor do produto: ");
        pr.setValorProduto(in.nextDouble());
        
        //objProdutos = new Produtos(produ.setCodigoProduto(codigo),nomep, estoque,valor );
        listaitens.add(pr);
       

        System.out.println("Produto Cadastrado com sucesso.");

        break;


          case 2:
          
          System.out.print("Digite o nome do produto: ");
          String nome =  (in.nextLine());



          //for (Produtos produtos :listaprodutos ) {
         //if (produtos.getNomeProduto().toString().equals(nome)){
          //for(int i = 0; i < listaprodutos.size(); i ++)  
         // if(listaprodutos..getNomeProduto().equals(nome)){
          boolean produtoencontrado = false;
          for(int i = 0; i < listaitens.size(); i ++) {
            Produtos produtos = listaitens.get(i);  
            
            if(nome.equals(produtos.getNomeProduto())){
            System.out.println();
            System.out.println("Codigo: " + produtos.getCodigoProduto());
            System.out.println("Nome : " + produtos.getNomeProduto());
            System.out.println("Valor: " + produtos.getValorProduto());
            System.out.println("Quantidade: " + produtos.getEstoqueProduto());
            produtoencontrado = true;
            break;
            }
        
          }    
        if(produtoencontrado == false   ){
             
              System.out.println("Produto não encontrado.");
            }
        // voltarMenu(sc);
        break;

          case 3:
          if (listaitens.isEmpty()) {
            System.out.println("Nenhum contato a exibir.");
            continue;
            //voltarMenu(sc);
          }

            for (Produtos produtos :listaitens ) {
              System.out.println();
              System.out.println("Codigo: " + produtos.getCodigoProduto());
              System.out.println("Nome : " + produtos.getNomeProduto());
              System.out.println("Valor: " + produtos.getValorProduto());
              System.out.println("Quantidade: " + produtos.getEstoqueProduto());
            }         
        
          break;
          
        case 4:// :new Relatorio(vend).run(); break;
        System.out.println("***************************************");
        System.out.println("*********** REALIZAR VENDA ***********");
        System.out.println("***************************************");
        
        Vendas vend = new Vendas();
        
        System.out.print("Digite o nome do produto: ");
        String codigoitem = in.nextLine();
        //vend.setCodigo(in.nextInt());

        boolean produtoencontradovenda = false;
          for(int i = 0; i < listaitens.size(); i ++) {
            Produtos produtos = listaitens.get(i);  
            
            if(codigoitem.equals(produtos.getNomeProduto())){
              vend.setProduto(produtos.getNomeProduto());
              //vend.setValorVenda(produtos.getValorProduto());
             
            System.out.println();
            produtoencontradovenda = true;
                   

            System.out.print("Data da venda: " );
            vend.setDataVenda(in.nextLine());

           System.out.print("Digite a quantidade do produto: ");
           vend.setProdutoEstoque(in.nextInt());
          
           double calculo = (vend.getProdutoEstoque() * produtos.getValorProduto());
           int calculoestoque = ( produtos.getEstoqueProduto() - vend.getProdutoEstoque());  
          
           vend.setValorVenda(calculo);
           produtos.setEstoqueProduto(calculoestoque);
           
           listavendas.add(vend);

        System.out.println("Venda realizada com sucesso.");

      }
    }

         
    if(produtoencontradovenda == false   ){
             
      System.out.println("Produto não encontrado.");
    }
    
    break;
        
         case 5:

         System.out.print("Digite o periodo 1:  ");
         String data1 =  (in.nextLine());

         System.out.print("Digite o periodo 2:  ");
         String data2 =  (in.nextLine());



         //for (Produtos produtos :listaprodutos ) {
        //if (produtos.getNomeProduto().toString().equals(nome)){
         //for(int i = 0; i < listaprodutos.size(); i ++)  
        // if(listaprodutos..getNomeProduto().equals(nome)){
         boolean vendaencontrada = false;
         for(int i = 0; i < listavendas.size(); i ++) {
           Vendas vendas = listavendas.get(i);  
           
           if(data1.equals(vendas.getDataVenda()) ||( data2.equals(vendas.getDataVenda()))){

           System.out.println();
           System.out.println("Data\n " + data1);
           System.out.println("Decrição do Produto: " + vendas.getProduto());
           System.out.println("Quantidade: " + vendas.getProdutoEstoque());
           System.out.println("Valor: " + vendas.getValorVenda());
           vendaencontrada = true;
           break;
           }
           
          
           if(vendaencontrada == false   ){
             
            System.out.println("Produto não encontrado.");
          }
        }
       //  }       



       // if(nome.equals(produtos.getNomeProduto())){

       // }

        
       // break;

        
        case 0:
          System.out.println("Fim do programa.");
          break;
        default:
          System.out.println("opção inválida!");
          break;
      }
    } while (opcao != -1);

    in.close();

  


 
    
/*  private static void voltarMenu(Scanner in) {
    System.out.println("\nPressione ENTER para voltar ao menu.");
    in.nextLine();

    // Limpa toda a tela, deixando novamente apenas o menu
    if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
        System.out.print("\033[H\033[2J");
    
    System.out.flush();
}*/

  
}
}