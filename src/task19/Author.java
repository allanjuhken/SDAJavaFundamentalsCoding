package task19;
//a. Author class, representing an author – poem writer, which consists of fields
//        surname and nationality (both of type String)

public class Author {
    private String surname;
    private String nationality;

    //constructor
    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }
    //setters / getters
    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getNationality() {return nationality;}

    public void setNationality(String nationality) {this.nationality = nationality;}
}
