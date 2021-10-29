import java.util.ArrayList;
import java.util.List;

public class Ip {

    private List<Integer> numeroIp;

    public Ip(int num1, int num2, int num3, int num4) {
        this.numeroIp = new ArrayList<>();
        numeroIp.add(num1);
        numeroIp.add(num2);
        numeroIp.add(num3);
        numeroIp.add(num4);
    }

    public List<Integer> getNumeroIp() {
        return numeroIp;
    }

    public void setNumeroIp(List<Integer> numeroIp) {
        this.numeroIp = numeroIp;
    }

    @Override
    public String toString() {
        return "Ip{" +
                "numeroIp=" +
                numeroIp.indexOf(0) + "." +
                numeroIp.indexOf(1) + "." +
                numeroIp.indexOf(2) + "." +
                numeroIp.indexOf(3) +
                '}';
    }
}
