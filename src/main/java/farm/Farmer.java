package farm;

public class Farmer {
    private Moo animal;
    private String surname;
    private int age;

    public Moo getAnimal() {
        return animal;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Farmer(){

    }

    public void sayMyAnimal(){
        System.out.println("I'm farmer and loved my animal!");
        animal.moo();
    }

    public void setAnimal(Moo animal) {
        System.out.println("Farmer setAnimal" + animal.getClass());
        this.animal=animal;
    }
}
