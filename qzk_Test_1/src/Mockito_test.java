import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
public class Mockito_test {
	
	private int getInput() {
		//qzk:����mock����
		Calculator_input input = mock(Calculator_input.class);
		//����׮
		when(input.get_input()).thenReturn((int)(Math.random()*10));
		
		return input.get_input();
	}
	
	private static Calculator calculator = new Calculator();
	@Test
	public void TestInput() {
		//qzk������׮ģ��
		int in_num=getInput();
		//qzk������׮ģ���ȡ������
		calculator.square(in_num);
		//qzk����֤
		assertEquals(in_num*in_num, calculator.getReuslt());
	}
}
