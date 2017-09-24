import java.util.Random;
import java.lang.Integer;

public class SlimeFinder {

	public static final long seed = 2813223590900495563L;

	public static void main(String args[]) {
		if (args.length < 2)
			System.err.println("Enter X and Y pos");
		int xPosition = Integer.parseInt(args[0]);
		int zPosition = Integer.parseInt(args[1]);
		Random rnd = new Random(seed +
                        (long) (xPosition * xPosition * 0x4c1906) +
                        (long) (xPosition * 0x5ac0db) +
                        (long) (zPosition * zPosition) * 0x4307a7L +
                        (long) (zPosition * 0x5f24f) ^ 0x3ad8025f);
		int result = rnd.nextInt(10);
		if (result == 0)
			System.out.println("Tady je to " + result);
		else
			System.out.println("Hledej dal " + result);
	}
}
