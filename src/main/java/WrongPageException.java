import static org.junit.Assert.*;

import org.junit.Test;

public class WrongPageException extends RuntimeException {

	public WrongPageException(String message) {
		super (message);
	}

}
