package racing.cars;

import java.util.Random;

public class Greencar {
	public static int racer; //мастерство пилота
	public static int speed = 245; //скорость машинки
	public int wheels; //состояние колес
	public int boost; //ускорение
	public static int scores; //количество передач
	
	

	public static void main(String[] args) {

		Random r = new Random();
		racer = r.nextInt(11) + 1;
		System.out.println(""+racer);
		if ( racer > 5 )
		{
			speed = speed+10;
		}
		else {
			if ( racer == 0)
			{
				scores = 0;
			}
			else {
				speed = speed - 5;
			}
		}
		scores = speed;
	}
}
