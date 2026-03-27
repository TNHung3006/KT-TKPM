package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildCPU("Intel ultra i7 155h")
                .builderRam("32GB DDR5 8200 MHz")
                .builderStorage("1TB NvMe")
                .builderScreen("24 inches 8k")
                .build();
        System.out.println(computer.toString());
    }
}
