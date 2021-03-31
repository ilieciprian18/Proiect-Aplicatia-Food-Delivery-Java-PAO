package UserStuff;

import Person.Person;
import Person.Gender;
import Person.DateOfBirth;

public class User extends Person {
    protected String username;
    //String adress


    public User(String username) {
        this.username = username;
    }

    public User(String nume, String prenume, String email, String telefon, Gender gender, DateOfBirth birthday, String username) {
        super(nume, prenume, email, telefon, gender, birthday);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return
                "nume: " + nume + '\'' +
                ", prenume: " + prenume + '\'' +
                ", email: " + email + '\'' +
                ", telefon: " + telefon + '\'' +
                ", gender: " + gender +
                ", username: " + username + '\'' +", birthday:" + getBirthday() +'\n'
                ;
    }


}
