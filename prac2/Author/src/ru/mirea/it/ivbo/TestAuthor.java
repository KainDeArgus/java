package ru.mirea.it.ivbo;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Kain", "kain_de_argus@mail.com", 'M');
        System.out.println(author);
        System.out.println("Author's name: " + author.getName());
        author.setEmail("avel_de_argus@mail.com");
        System.out.println("Author's email: " + author.getEmail());
        System.out.println("Author's gender: " + author.getGender());
        System.out.println(author);
    }
}