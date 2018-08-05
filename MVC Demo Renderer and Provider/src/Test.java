
import com.cg.factory.MessageFactory;

/**
 * @author Pooja Karnik
 * 
 *         MVC Application - Renderer and Provider
 *
 */
public class Test {

	// as per context.provider, provider contains HWMessageProvider and renderer
	// contains
	// ConsoleRenderer so Hello World message gets printed on the console
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		MessageFactory.getMessageRenderer().render();
	}
}
