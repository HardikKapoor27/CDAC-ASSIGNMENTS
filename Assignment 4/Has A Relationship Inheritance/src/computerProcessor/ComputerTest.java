package computerProcessor;

class ComputerTest {

    public static void main(String[] args) {

        Processor p = new Processor("Intel i9", 8.9);

        Computer c = new Computer("ASUS", "VivoBook 9", p);

        c.displayComputer();
    }
}