package lambda_exeption;

public class EmptyArrayException extends Exception {
	public EmptyArrayException() {
		super("Массив пуст");
	}
}
