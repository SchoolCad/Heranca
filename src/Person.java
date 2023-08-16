public class Person {
    private String name;
    private String sex;
    private Date date = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(int day, int month, int year) {
        this.date.setDay(day);
        this.date.setMonth(month);
        this.date.setYear(year);
    }

    public Person() {}

    public Person(String name, String sex, Date date) {
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSexo: " + sex + "\nData de Nascimento: " + date + "\n";
    }

}
