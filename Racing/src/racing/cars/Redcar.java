package racing.cars;

import java.util.Random;

public class Redcar {
	public static int racer; //���������� ������
	public static int speed = 260; //�������� �������
	public int wheels; //��������� �����
	public int boost; //���������
	public static int scores; //���� �����
	
	

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
