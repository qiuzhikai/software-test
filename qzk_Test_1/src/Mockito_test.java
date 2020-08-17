import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
public class Mockito_test {
	
	private int getInput() {
		//qzk:创建mock对象
		Calculator_input input = mock(Calculator_input.class);
		//测试桩
		when(input.get_input()).thenReturn((int)(Math.random()*10));
		
		return input.get_input();
	}
	
	private static Calculator calculator = new Calculator();
	@Test
	public void TestInput() {
		//qzk：调用桩模块
		int in_num=getInput();
		//qzk：计算桩模块获取的数据
		calculator.square(in_num);
		//qzk：验证
		assertEquals(in_num*in_num, calculator.getReuslt());
	}
}
