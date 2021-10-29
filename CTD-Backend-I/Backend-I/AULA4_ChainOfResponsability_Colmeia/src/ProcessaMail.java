public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();
        processo.verificarEmails(new Mail("email@email.com", "tecnica@digitalhouse.com", "Reclamação"));
        processo.verificarEmails(new Mail("email@email.com", "cdcd@digitalhouse.com", "Gerencia"));

    }
}
