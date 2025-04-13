package Week8;

public class EncryptionTest {

    // Interface: Encryptable
    interface Encryptable {
        void encrypt();
        String decrypt();
        String getEncryptedText();
        void setText(String text);
    }

    // Class: Secret (Caesar Cipher)
    static class Secret implements Encryptable {
        private String text;
        private String encryptedText;

        public void setText(String text) {
            this.text = text;
        }

        public void encrypt() {
            StringBuilder encrypted = new StringBuilder();
            for (char c : text.toCharArray()) {
                encrypted.append((char) (c + 3)); // Caesar cipher
            }
            encryptedText = encrypted.toString();
        }

        public String decrypt() {
            StringBuilder decrypted = new StringBuilder();
            for (char c : encryptedText.toCharArray()) {
                decrypted.append((char) (c - 3));
            }
            return decrypted.toString();
        }

        public String getEncryptedText() {
            return encryptedText;
        }
    }

    // Class: Password (String Reversal)
    static class Password implements Encryptable {
        private String text;
        private String encryptedText;

        public void setText(String text) {
            this.text = text;
        }

        public void encrypt() {
            encryptedText = new StringBuilder(text).reverse().toString();
        }

        public String decrypt() {
            return new StringBuilder(encryptedText).reverse().toString();
        }

        public String getEncryptedText() {
            return encryptedText;
        }
    }

    // Main Method
    public static void main(String[] args) {
        Encryptable secret;

        // Using polymorphism with Secret
        secret = new Secret();
        secret.setText("javaprogram");
        secret.encrypt();
        System.out.println("Encrypted from Secret: " + secret.getEncryptedText());
        System.out.println("Decrypted from Secret: " + secret.decrypt());

        // Using polymorphism with Password
        secret = new Password();
        secret.setText("javaprogram");
        secret.encrypt();
        System.out.println("Encrypted from Password: " + secret.getEncryptedText());
        System.out.println("Decrypted from Password: " + secret.decrypt());
    }
}