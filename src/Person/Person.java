package Person;

import java.util.Date;

public class Person {
    protected String nume;
    protected String prenume;
    protected String email;
    protected String telefon;
    protected Gender gender;
    private final DateOfBirth birthday; //has-A

    public Person(){
        nume= "";
        prenume = "";
        email = "";
        telefon = "";
        gender = Gender.NOTASSIGNED;
        birthday = null;

    }

    public Person(String nume,String prenume,String email, String telefon,Gender gender,DateOfBirth birthday){
        this.nume = nume;
        this.prenume = prenume;
        this.email =email;
        this.telefon = telefon;
        this.gender= gender;
        this.birthday = birthday;

    }

    public Person(String nume,String prenume,String email, String telefon,Gender gender,int day,int month,int year){
        this.birthday= new DateOfBirth(day,month,year);
        this.nume = nume;
        this.prenume = prenume;
        this.email =email;
        this.telefon = telefon;
        this.gender= gender;

    }



    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public Gender getGender() {
        return gender;
    }

    public DateOfBirth getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }


    @Override


    public boolean equals(Object o){
        if( o == null){
            return false;
        }
        if (o instanceof Person)
        {
            Person person = (Person) o;
            if((nume.equals(person.nume)) && (prenume.equals(person.prenume)) && (email.equals(person.email)) && (telefon.equals(person.telefon)) && (birthday.equals(person.birthday)))
            {
                return true;
            }
            else {
                return false;
            }

        }
        else {
            return false;
        }
    }






}
