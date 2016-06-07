package racing;

import racing.cars.Bluecar;
import racing.cars.Goldcar;
import racing.cars.Greencar;
import racing.cars.Redcar;

public class Racing {

	public static void main(String[] args) {
		
		System.out.println("Начинаем гонку");
		if (Redcar.scores > Goldcar.scores)
			//if (Redcar.scores !=0)
		{
			if (Redcar.scores > Greencar.scores)
			{
				if (Redcar.scores > Bluecar.scores)
				{
					System.out.println("Пилот красной машины выйграл");
				}
			}
			else {
				if (Greencar.scores > Bluecar.scores)
					//if (Greencar.scores !=0)
					{
						System.out.println("Пилот зеленой машины выйграл");
					}
					else {
						System.out.println("Пилот синей машины выйграл");
					}
			}
		}
			else {
				if (Goldcar.scores > Greencar.scores)
					//if (Goldcar.scores !=0)
					{
						if (Goldcar.scores > Bluecar.scores)
						{
							System.out.println("Пилот золотой машины выйграл");
						}
					}
					
			}
		

		//int[] i = {Redcar.scores, Goldcar.scores, Greencar.scores, Bluecar.scores};
		
	}

}
