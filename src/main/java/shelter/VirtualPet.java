package shelter;

public class VirtualPet {

     String petName;
     String petType;

     int hunger = 50;
     int thirst = 50;
     int boredom = 25;



    public VirtualPet(String petName, String petType){
        this.petName = petName;
        this.petType = petType;


    }
    public String getPetName(){
        return petName;
    }
    public String getPetType(){
        return petType;
    }
    public int getHunger(){
        return hunger;
    }
    public int getThirst(){
        return thirst;
    }
    public int getBoredom(){
        return boredom;
    }


     public void eat() {
        hunger = hunger - 10;
        thirst = +4;
    }
    public void drink() {
        thirst = thirst - 10;
    }
    public void play(){
        boredom = boredom - 5;
        hunger = hunger + 4;
    }
    public void remove(){}


    void petTick(){
        hunger = hunger + 6;
        thirst = thirst + 6;
        boredom = boredom + 4;
    }
}
