public class Person {
    private String firstNAme;
    private String lastName;
    private int age;

    public String getFirstNAme() {
        return firstNAme;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age < 0 || age > 100) age = 0;
        this.age = age;
    }

    public boolean isTeen(){
        if (age > 12 && age < 20) return true;
        return false;
    }
    public String getFullName(){
        String holder = " ";
        if (firstNAme.isEmpty()) holder = " ";
        else if (lastName.isEmpty()) {
            holder = " ";
        }
        else {
            holder = firstNAme + lastName;
        }
        if (lastName.isEmpty()){
            holder = firstNAme;
        }
        if (firstNAme.isEmpty()){
            holder = lastName;
        }
        return holder;
    }
}
