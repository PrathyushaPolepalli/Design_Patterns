package com.prathyusha;

//Server Side
public class Bird {

    private String Breed;
    private String colour;
    private float weight;
    private float height;
    private String gender;
    private boolean isScavenger;
    private boolean canFly;

    private Bird(BirdBuilder obj) {
        this.Breed = obj.Breed;
        this.colour = obj.colour;
        this.weight = obj.weight;
        this.height =  obj.height;
        this.gender = obj.gender;
        this.isScavenger = obj.isScavenger;
        this.canFly = obj.canFly;
    }

    public static class BirdBuilder{

        private String Breed;
        private String colour;
        private float weight;
        private float height;
        private String gender;
        private boolean isScavenger;
        private boolean canFly;

        public BirdBuilder setBreed(String Breed){
            this.Breed = Breed;
            return this;
        }

        public BirdBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public BirdBuilder setWeight(float weight) {
            this.weight = weight;
            return this;
        }

        public BirdBuilder setHeight(float height) {
            this.height = height;
            return this;
        }

        public BirdBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public BirdBuilder setScavenger(boolean scavenger) {
            isScavenger = scavenger;
            return this;
        }

        public BirdBuilder setCanFly(boolean canFly) {
            this.canFly = canFly;
            return this;
        }

        public Bird Build(){
            Bird b = new Bird(this);
            return b;
        }

        public static BirdBuilder newInstance(){
            return new BirdBuilder();
        }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Breed='" + Breed + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                ", isScavenger=" + isScavenger +
                ", canFly=" + canFly +
                '}';
    }
}
