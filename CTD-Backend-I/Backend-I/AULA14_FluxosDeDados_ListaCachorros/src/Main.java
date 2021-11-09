import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Rex");
        cachorro1.setIdade(3);

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Lady");
        cachorro2.setIdade(1);

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);

        //Método responsável por fazer o armazenamento
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream object = new ObjectOutputStream(fo);

            object.writeObject(cachorros);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Erro de arquivo não encontrado!");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        List<Cachorro> cachorros2 = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            cachorros2 = (ArrayList) oi.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Erro de arquivo não encontrado!");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for(Cachorro cachorro : cachorros2)
            System.out.println(cachorro.getNome() + ": " + cachorro.getIdade());

    }
}
