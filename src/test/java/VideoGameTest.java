import org.junit.jupiter.api.Test;

import javax.naming.event.NamingExceptionEvent;

import static org.junit.jupiter.api.Assertions.*;

public class VideoGameTest
{
    @Test
    void mustGenerateConsoleName()
    {
        AbstractFactory factory = new PlayStationFactory();
        VideoGame console = new VideoGame(factory);

        assertEquals("PlayStation", console.generateConsoleName());
    }

    @Test
    void mustGenerateConsoleBrand()
    {
        AbstractFactory factory = new XboxFactory();
        VideoGame console = new VideoGame(factory);

        assertEquals("MicroSoft", console.generateConsoleBrand());
    }
}
