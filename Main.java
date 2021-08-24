public class Main {
   public static void main(String[] args) {

       GuardaRoupa guardaRoupa = new GuardaRoupa();

        //adiciona chave do cliente e roupa e marca
        guardaRoupa.cliente.put(1,new Roupa("Renner","Camisa"));
        guardaRoupa.cliente.put(2,new Roupa("C&A","Cueca"));
        guardaRoupa.cliente.put(3,new Roupa("QuickSilver","Bermuda"));
        guardaRoupa.cliente.put(4,new Roupa("Lacoste","Camisa"));

        //procura o cliente
       int procuraCliente = 1;


       //verifica se esta tudo certo
        if (guardaRoupa.cliente.containsKey(procuraCliente)){
           System.out.println("Codigo do cliente "+ procuraCliente + ": " + guardaRoupa.cliente.get(procuraCliente));
            System.out.println("Seu codigo de retirada é " + procuraCliente);
       }else{
           System.out.println("Cliente nao encontrado");
       }
   }
}