package creational.builder.computer;

public class Computer {
    private String cpu, ram, storage, screen;

    private Computer(Builder b){
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() { // bấm tổ hợp phím ALT+INSERT
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static class Builder{
        private String cpu, ram, storage, screen;
        public Builder buildCPU( String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder builderRam(String ram){
            this.ram = ram;
            return this;
        }

        public Builder builderStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder builderScreen(String screen){
            this.screen = screen;
            return this;
        }

        public  Computer build(){
            return new Computer(this);
        }
    }

}
