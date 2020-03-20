package app.hw07;

public final class Man extends Human {

 public String repairCar(){
     return "I can repair your car.";
 }

    @Override
    public String greetPet() {
        return String.format("Hello %s, it is your daddy", this.family.getPet().getNickname());
    }
}
