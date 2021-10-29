import java.util.Date;

public class RegistroVacinaProxy implements IRegistro {


    @Override
    public void vacinar(Object[] informacoes) {
        if(!comprovarData((Date)(informacoes[1]))){
            RegistroVacina registro = new RegistroVacina();
            registro.vacinar(informacoes);
        } else {
            System.out.println("Não pode vacinar");
        }
    }

    public boolean comprovarData(Date data) {
        return data.after(new Date());
    }
}
