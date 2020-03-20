package app.hw07;

class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        this.setSpecies(Species.FISH.name());
        this.setNickname(nickname);
        this.setAge(age);
        this.setTrickLevel(trickLevel);
        this.setHabits(habits);

    }

    @Override
    public String respond() {
        return String.format("Hello i am your lovely fish, %s", getNickname());
    }


}
