import java.util.Scanner;


public class TestIF {

	/**
	 * 程序中的异常
	 * @param args
	 */
	public static void main(String[] args) {
		//处理异常的方式1：if ..逻辑判断
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		if(input.hasNextInt()==true){
			
			int num1=input.nextInt();//1）输入不是整数类型  2）除法 输入 0
			System.out.print("请输入第二个整数：");
			int num2=input.nextInt();
			if(num2==0){
				System.err.println("除数不能为0，程序退出");
				System.exit(1);// 退出程序
			}
			else
			{
				int jg=num1/num2;//输入num2可能输入  0
				System.out.println(jg);
			}
		}else
		{
			System.err.println("输入的不是整数，程序退出");
			System.exit(1);
		}
		
		

	}

}
