public class XboxFactory implements AbstractFactory
{
    @Override
    public Console generateConsole()
    {
        return new Xbox();
    }
}
