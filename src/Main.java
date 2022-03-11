public class Main {
    public static void main(String[] args)
    {
        Encryptor encryptor = new Encryptor(2, 3);
        String decryptedMsg = encryptor.decryptMessage("Mte eati dmnitgAhA");
        System.out.println(decryptedMsg);
    }
}
