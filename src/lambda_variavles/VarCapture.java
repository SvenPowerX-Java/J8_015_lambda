package lambda_variavles;
//Захват локальной переменной из объемлющей области действия
public class VarCapture {
	public static void main(String[] args) {
		int num = 10;
		//num++; //Ошика
		MyFunc myLambda = (n)->{
			int v = num + n;
		//	num++;//Ошибка
			return v;
		};
		//num = 9;
	}
}
