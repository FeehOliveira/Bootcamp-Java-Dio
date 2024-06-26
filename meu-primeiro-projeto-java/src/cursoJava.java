public class cursoJava {
    public static void main(String[] args) {
        String primeiroNome = "Felipe";
        String segundoNome = "Verçosa";
        
        // Chamando o método e armazenando o resultado em uma variável
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Exibindo o nome completo
        System.out.println("Nome completo: " + nomeCompleto);
    }

    // Método para retornar o nome completo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
