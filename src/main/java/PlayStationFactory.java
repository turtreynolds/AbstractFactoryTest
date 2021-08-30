public class PlayStationFactory implements AbstractFactory
{
    @Override
    public Console generateConsole()
    {
        return new PlayStation();
    }
}
