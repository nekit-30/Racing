package racing;

import racing.cars.Bluecar;
import racing.cars.Goldcar;
import racing.cars.Greencar;
import racing.cars.Redcar;

public class Racing {

	public static void main(String[] args) {
		
		System.out.println("�������� �����");
		if (Redcar.scores > Goldcar.scores)
			//if (Redcar.scores !=0)
		{
			if (Redcar.scores > Greencar.scores)
			{
				if (Redcar.scores > Bluecar.scores)
				{
					System.out.println("����� ������� ������ �������");
				}
			}
			else {
				if (Greencar.scores > Bluecar.scores)
					//if (Greencar.scores !=0)
					{
						System.out.println("����� ������� ������ �������");
					}
					else {
						System.out.println("����� ����� ������ �������");
					}
			}
		}
			else {
				if (Goldcar.scores > Greencar.scores)
					//if (Goldcar.scores !=0)
					{
						if (Goldcar.scores > Bluecar.scores)
						{
							System.out.println("����� ������� ������ �������");
						}
					}
					
			}
		

		//int[] i = {Redcar.scores, Goldcar.scores, Greencar.scores, Bluecar.scores};
		
	}

}
