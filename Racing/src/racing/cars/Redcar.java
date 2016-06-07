package racing.cars;

import java.util.Random;

public class Redcar {
	public static int racer; //мастерство пилота
	public static int speed = 260; //скорость машинки
	public int wheels; //состояние колес
	public int boost; //ускорение
	public static int scores; //очки гонки
	
	

	public static void main(String[] args) {

		Random r = new Random();
		racer = r.nextInt(11) + 1;
		System.out.println(""+scores);
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
