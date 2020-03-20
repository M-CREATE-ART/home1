package app.hw07;

class RoboCat extends Pet {

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        this.setSpecies(Species.ROBOCAT.name());
        this.setNickname(nickname);
        this.setAge(age);
        this.setTrickLevel(trickLevel);
        this.setHabits(habits);
    }

    @Override
    public String respond() {
        return String.format("Hello i am your lovely RoboCat, %s", getNickname());
    }

}
