public class ApiProduto {
    //Apis diferentes podem ter métodos com o mesmo nome

    public int desconto(Produto prod){
        if(prod.getTipo().compareTo("Latas")==0){
            return 10;
        } else {
            return 0;
        }
    }

}
