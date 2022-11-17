public class Human {
    int yearOfBirth;
    String name;
    String town;

    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        if (this.yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null || name == "") {
            name = "Информация не указана";
        }
        this.name = name;
        if (town == null || town == "") {
            town = "Информация не указана";
        }
        this.town = town;
        if (jobTitle == null || jobTitle == "") {
            jobTitle = "Информация не указана";
        }
        this.jobTitle = jobTitle;
    }
    public void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
