package racing.cars;

import java.util.Random;

public class Bluecar {
	public static int racer; //���������� ������
	public static int speed = 250; //�������� �������
	public int wheels; //��������� �����
	public int boost; //���������
	public static int scores; //���������� �������
	
	

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
