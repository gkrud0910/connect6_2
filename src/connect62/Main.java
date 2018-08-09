package connect62;
import java.util.Scanner;
public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//ó������ �Ұ�
		//���� ������
		System.out.println("�� ũ�⸦ �˷��ּ���");
		int mapSize = scan.nextInt();
		//���� ������ ���� ���� �迭�� �������.
		int[][] map = new int[mapSize][mapSize];
		//�׸��� �� �ȿ� ���� 0�� �־��ٰž�. �Լ��� �̿��ؼ�!
		makeClean(map);
		
		//�״��� ���� ���������� �������� �Է¹޾ƾ���.
		System.out.println("�������̸� -1 �Է�, ���̸� 1 �Է� ���ּ���.");
		int myColor = scan.nextInt();
		
		//�������̸� �� �߾ӿ� ǥ���ؾ����ڳ�?? �׷��� ����� �������� ���������ٰ� -1 ǥ�ø� �Ұ�
		if(myColor == -1)	map[map.length/2][map[0].length/2] = -1;
		//������ ��Ÿ��!
		//�ݺ���������
		Compute compute = new Compute(map,myColor);
		while(true) {
		//������� ������ ������:) (x1,y1)�̶� (x2,y2)�� �Է� �޾ƾ����� �Լ��� �Ұ�
		enemyInput(map,myColor);
		//���⼭ ���� ���⸦ ����ϴ°���.
		//print(Compute.result);
		printMap(map);
		compute.execute();
		
		}
		
		
		
		
		

	}
	
	static void makeClean(int[][]map) {
		int i,j;
		for(i=0;i<map.length;i++) {
			for(j=0;j<map[i].length;j++) {
				map[i][j]=0;
			}
		}
	}
	
	static void printMap(int[][]map) {
		for(int i=0;i<map.length;i++) {
			System.out.println(" ");
			for(int j=0;j<map.length;j++) {
				System.out.print(map[i][j]);
			}
		}
		System.out.println(" ");
	}
	
	static void enemyInput(int[][]map, int myColor) {
		int x1,y1,x2,y2;
		//����� ���� ģ�� ��ǻ��ģ��:)
		
		System.out.println("������ x1�� �Է��ϼ���");
		x1 = scan.nextInt();
		
		System.out.println("������ y1�� �Է��ϼ���");
		y1 = scan.nextInt();
		
		System.out.println("������ x2�� �Է��ϼ���");
		x2 = scan.nextInt();
		
		System.out.println("������ y2�� �Է��ϼ���");
		y2 = scan.nextInt();
		
		//���� �Է¹����Ÿ� �ʿ� ���������
		map[x1][y1] = myColor*-1;//�� �÷����� -1�����ָ� ���� ���� ��, �ʹ� �������� �ƴϴ�?! ������ ¯¯
		map[x2][y2] = myColor*-1;
		//�ΰ� �� ����� �ߴ� ¯¯��~~ �ٵ� �Ǽ��� �߸��Է��ϸ� �����ڳ�? �׷��� ���߿� �� �Է��ϼ̾��? ����°� ������ �ϴ� �װ� ���߿� ��������.
		
		
	}
	
	

}