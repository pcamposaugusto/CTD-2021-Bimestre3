public class ApiCartao {
    //Api sem método construtor - apenas os métodos que o api vai utilizar

    public int desconto(Cartao cartao){
        if(cartao.getBanco().compareTo("Star Bank")==0){
            return 20;
        } else {
            return 0;
        }
    }

}
