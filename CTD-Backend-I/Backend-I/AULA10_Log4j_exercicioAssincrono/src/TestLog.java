import org.apache.log4j.Logger;

public class TestLog {
    private static final Logger logger = Logger.getLogger(TestLog.class);
    public static void main(String[] args) {

        Tigre lulu = new Tigre("lulu", 16);
        Tigre vava = new Tigre("vava", -3);

        logger.info(lulu.correr());
        logger.info(vava.correr());

        try {
            lulu.eMaiorQue10();
            vava.eMaiorQue10();

        } catch (Exception e) {
            logger.error("A idade não pode ser negativa", e);
        }


        Leao mufasa = new Leao("mufasa", 30, true);
        Leao scar = new Leao("scar", 20, false);

        logger.info(mufasa.correr());
        logger.info(scar.correr());

        try {
            mufasa.eMaiorQue10();
            scar.eMaiorQue10();

        } catch (Exception e) {
            logger.error("A idade não pode ser negativa", e);
        }
    }

}
