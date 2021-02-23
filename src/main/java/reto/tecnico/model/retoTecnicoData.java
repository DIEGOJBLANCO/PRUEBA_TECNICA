package reto.tecnico.model;

public class retoTecnicoData {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String year;
    private String language;
    private String Postal_Code;
    private String Country;

    public String getConfirmRegistration() {
        return confirmRegistration;
    }

    public void setConfirmRegistration(String confirmRegistration) {
        this.confirmRegistration = confirmRegistration;
    }

    private String confirmRegistration;

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    private String City;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        Postal_Code = postal_Code;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
