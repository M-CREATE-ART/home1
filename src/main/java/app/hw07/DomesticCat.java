package app.hw07;

class DomesticCat extends Pet {

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        this.setSpecies(Species.DOMESTICCAT.name());
        this.setNickname(nickname);
        this.setAge(age);
        this.setTrickLevel(trickLevel);
        this.setHabits(habits);
    }

    @Override
    public String respond() {
        return String.format("Hello i am your lovely DomeCat, %s", getNickname());
    }

    @Override
    public String foul() {

         return  super.foul();
    }
}
