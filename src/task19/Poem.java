package task19;
/*
b. Poem class, representing poem, which consists of fields creator (type Author)
and stropheNumbers (type int – numbers of strophes in poem)
 */

public class Poem {
    private Author author;
    private int stropheNumbers;

    // constructor
    public Poem(Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    //setters / getters
    public Author getAuthor() {return author;}

    public void setAuthor(Author author) {this.author = author;}

    public int getStropheNumbers() {return stropheNumbers;}

    public void setStropheNumbers(int stropheNumbers) {this.stropheNumbers = stropheNumbers;}
}
