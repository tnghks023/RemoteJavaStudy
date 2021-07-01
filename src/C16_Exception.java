import java.util.InputMismatchException;

public class C16_Exception {

	/*
		# ���� (Exception)
		 - �츮�� ������� �˰� �ִ� ���� �۾����� ��� ���ܶ�� �θ���.
		 - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ������� �θ���. (��Ÿ ��) 
		 - ���α׷��Ӱ� �߻� ������ ���ܸ� �̸� �����ϰ� ����صδ� ���� ����ó����� �θ���.
		 - ����ó���� �⺻ ������ ���α׷� �������������� ���α׷��Ӱ� �ٸ� ��ġ�� ���Ѵٸ� 
		   ���α׷��� ����ؼ� ������ �� �ִ�.
		   
		   
		# ���� ó�� ����
		 - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��.
		 - try�� ������ �ڵ忡�� ���ܰ� �߻����� ������ ��� ���� ����ȴ�.
		 - try�� ���ο��� ���ܰ� �߻��ϴ� ��� ������ �ߴ��ϰ� �߻��� ���ܸ� ����ϴ� catch������
		   �Ѿ�� �ȴ�.
		 - catch������ �߻��� ���ܿ� ���� ������ ����ִ� ���� �ν��Ͻ��� ���޵ȴ�.
		 - catch���� ��ø�ؼ� ������ ����� �� �ִ�.
		 - ���ܰ� �߻��ϵ� ���ϵ� ������ �����ϰ� ���� �ڵ�� finally���� �����Ѵ�.
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// ���ܰ� �߻��� ������ ���� ����� ����ϴ� �޼���
			e.printStackTrace();
			System.out.println("0���� ������ �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ����");
		} catch (InputMismatchException e) {
			System.out.println("�߸� �Է�");
		} finally {
			System.out.println("�䳢");
		}
		System.out.println("Hello");
	}
}
