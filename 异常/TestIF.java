import java.util.Scanner;


public class TestIF {

	/**
	 * �����е��쳣
	 * @param args
	 */
	public static void main(String[] args) {
		//�����쳣�ķ�ʽ1��if ..�߼��ж�
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ��������");
		if(input.hasNextInt()==true){
			
			int num1=input.nextInt();//1�����벻����������  2������ ���� 0
			System.out.print("������ڶ���������");
			int num2=input.nextInt();
			if(num2==0){
				System.err.println("��������Ϊ0�������˳�");
				System.exit(1);// �˳�����
			}
			else
			{
				int jg=num1/num2;//����num2��������  0
				System.out.println(jg);
			}
		}else
		{
			System.err.println("����Ĳ��������������˳�");
			System.exit(1);
		}
		
		

	}

}
