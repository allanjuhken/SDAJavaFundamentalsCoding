package task19;
/*
c. Main class, with main method, inside which you will:
i. Create three instances of Poem class, fill them with data
(using constructor and/or setters) and store them in array
ii. Write the surname of an author that wrote the longest poem
(let your application calculate it!)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Raud", "Estonian");
        Author author2 = new Author("Bulgakov", "Russian");
        Author author3 = new Author("Poe", "American");

        //Poem[] poems = new Poem[3];
        List<Poem> poemList = new ArrayList<>();
        Poem poem1 = new Poem(author1,500);
        Poem poem2 = new Poem(author2, 350);
        Poem poem3 = new Poem(author3, 680);

        poemList.add(poem1);
        poemList.add(poem2);
        poemList.add(poem3);

        int longestPoem = 0;
        Author authorThatWroteLongestPoem = null;
        for (Poem poem : poemList) {
            if (longestPoem < poem.getStropheNumbers()){
                longestPoem = poem.getStropheNumbers();
                authorThatWroteLongestPoem = poem.getAuthor();
            }
        }
        System.out.println(authorThatWroteLongestPoem.getNationality() + " author, "
                + authorThatWroteLongestPoem.getSurname()
                + ", "
                + " wrote the longest poem. Pages: " + longestPoem);

    }
}
