package creational.builder.example1.b;

public class Main {
    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .setSubject("SUBJECT for email")
                .setFromAddress("main.user@emai.com")
                .addToAddress("user1@email.com")
                .addToAddress("user2@email.com")
                .addCCAddress("user3@email.com")
                .addCCAddress("user4@email.com")
                .addBCCAddress("user5@email.com")
                .addBCCAddress("user6@email.com")
                .setContent("CONTENT TO SENT IN THE EMAIL")
                .build();

        System.out.println(email);
    }
}
