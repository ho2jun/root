package day3;

public class java_20231019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���׿�����_��ȣ������
		// x ��� ������ 100�̰� ���� �ϳ��� ����� �������
		int x = 100;
		int resultplus = +x;
		int resultminus = -x;
		System.out.println(resultplus);
		System.out.println(resultminus);
		
		
		// ���׿�����_����������(--/++)
		// ��������ڸ� �����ϰ� ó���Ҷ� ����Ѵ�.
		// �� ���� �� ���� : (num++);
		// �� ���� �� ���� : (++num);
		// ��°�� : 10 / 11
		
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		// ���� : int�� x��� ������ �����մϴ�. -> 1;
		// ��°�� :
		//1 - �� ���� �� ����
		//2
		//3 - �� ���� �� ����
		
		int num1 = 1; // ������ ������ ���� ��Ƴ���
		
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(++num1);
		
		
		// �ƽ�Ű�ڵ� 'A' = 65 / 'B' = 66
		
		char alphabet = 'x';
		// ������ : ���������ڸ� �ѹ� ����ؼ� X Y ���
		// x
		// y
		
		System.out.println(alphabet);
		System.out.println(++alphabet);
		
		// ���� ������ (�ǿ�����+�ǿ�����)
		// ��� ������ : ����+���� -> ó���� ���
		int numx = 100;
		int numy = 200;
		// ��°��
		System.out.println(numx + numy);
		// ��°�� : 20000
		System.out.println(numx * numy);
		// ��� ��� : 0
		System.out.println(numx / numy); // 100/200 -> 0.5 int�� ������
		// ��� ��� : 100 
		System.out.println(numx % numy);
		
		// 2) ���� ������_���մ��Կ����� y = y + 1
		
		System.out.println("");
		
		int numy1 = 5;
		//numy1 = numy1 + 1;
		//numy1 += 1;
		
		//numy1 = numy1 * 2;
		//numy1 *= 2;
		
		//numy1 = numy1 - 2;
		//numy1 -= 2;
		
		System.out.println(numy1);
		
		System.out.println("");
		// ���� ������ : ũ��> / �۴�< / ����= / ���ų��۴�<= / ���ų� ũ��>=
		// ������� ������ �Ǵ��̴� (true / false)
		
		int a = 10;
		int b = 20;

		//a�� b���� ũ��		
		System.out.println(a > b);
		//a�� b���� �۰ų� ����
		System.out.println(a <= b);
		//a�� b�� ����
		System.out.println(a == b);
		//a�� b�� ���� �ʴ�
		System.out.println(a != b);
		
		
		System.out.println("");
		// 4) ���׿�����_��������(��Ʈ������)
		//1. (&&&) and = ���� = A(1) && B(1) : true
		//2. (|,||) OR = ���� = A(1) && B(0) : true
		//3. (^) XOR = (��Ÿ�� ����) = A(1) ^ B(0) : true
		//4. (!) NOT = NOT(����)=~A(0) = 1 : true
		
		//boolean : 1byte : 8bit ���ǥ��: true(1) / false(0)
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("##����(AND) : �Ѵ� true =1 ##");
		//false (0==0/ 1==0 / 0==1) b1�� b2�� �̿��ؼ� false
		System.out.println(b1 && b2);
		//true (1==1)
		System.out.println(b1 && b3);
		//false (0==0/ 1==0 / 0==1) b2�� b4�� �̿��ؼ� false
		System.out.println(b2 && b4);
		
		System.out.println("##����(OR) : ���� �ϳ��� true =1 ##");
		//true
		System.out.println(b1 || b2); // true(1) || false(0) = true (1)
		//true
		System.out.println(b1 || b3); // true(1) || true(1) = true (1)
		//false
		System.out.println(b2 || b4); // false(0) || false(0) = false(0) 
		
		System.out.println("##��Ÿ�� ����(XOR): �ٸ��� true(1) / ������ fasle(0)##");
		//true
		System.out.println(b1 ^ b2);
		//false
		System.out.println(b2 ^ b4);
		
		
		System.out.println("");
		//4)���׿�����_������������(NOT)
		System.out.println("##������ ������##");
		boolean not_ = false;
		System.out.print(!not_);
		
		System.out.println("");
		// 3. ���� ������ : �ǿ����ڰ� 3���� ���� ������̴�.
		System.out.println("##���� ������##");
		// ���ǽ�(�ǿ�����1)?��(�ǿ�����2):����(�ǿ�����3)
		int num_1 = (7>1)?1:0;
		System.out.println(num_1);
		
	}

}
