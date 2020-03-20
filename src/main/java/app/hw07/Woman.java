package app.hw07;

public final class Woman extends  Human{
 public String makeUp(){
  return "I finished my make up.";
 }

 @Override
 public String greetPet() {
  return String.format("Hello %s, it is your mom", this.family.getPet().getNickname());
 }
}
