public class VideoGame
{
    private Console console;

    public VideoGame(AbstractFactory factory)
    {
        this.console = factory.generateConsole();
    }

    public String generateConsoleName()
    {
        return this.console.getConsole();
    }

    public String generateConsoleBrand()
    {
        return this.console.getBrand();
    }
}
