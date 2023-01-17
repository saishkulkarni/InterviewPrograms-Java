package infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RPG_Game {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int exp = s.nextInt();

		int monst[] = new int[n];
		int bonus[] = new int[n];

		for (int i = 0; i < n; i++) {
			monst[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			bonus[i] = s.nextInt();
		}

		class Monster {
			private final int power, bonus;

			public Monster(int power, int bonus) {
				this.power = power;
				this.bonus = bonus;
			}
		}

		Monster[] monsters = new Monster[n];

		for (int i = 0; i < n; i++)
			monsters[i] = new Monster(monst[i], bonus[i]);

		Arrays.sort(monsters, Comparator.comparingInt(m -> m.power));

		int count = 0;

		for (Monster m : monsters) {
			if (exp < m.power)
				break;
			exp += m.bonus;
			++count;
		}
		System.out.println(count);
		s.close();
	}
}
